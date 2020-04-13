package com.cxloyalty.gce.actor;

import akka.persistence.*;
import com.cxloyalty.gce.workflow.choreography.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.dozer.DozerBeanMapper;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.support.Repositories;
import scala.jdk.CollectionConverters;

import java.io.ByteArrayInputStream;
import java.util.Map;
import java.util.UUID;

@Slf4j
public class EntityActor<T> extends AbstractPersistentActor {

  private final String aggregateType;
  private final DozerBeanMapper aggregateMapper;
  private T entity;
  private CrudRepository<T, UUID> repository;

  @SuppressWarnings("unchecked")
  public EntityActor(String aggregateType, byte[] mapping, CrudRepository<T, UUID> repository) {
    assert mapping != null;
    this.aggregateType = aggregateType;
    this.repository = repository;
    this.aggregateMapper = new DozerBeanMapper();
    aggregateMapper.addMapping(new ByteArrayInputStream(mapping));
  }

  @SuppressWarnings("unchecked")
  @Override
  public Receive createReceiveRecover() {
    return receiveBuilder()
        .match(Message.class, this::applyEvent)
        .match(
            RecoveryCompleted.class,
            r -> {
              log.info("Recovery Completed for {}} Actor {}", aggregateType, persistenceId());
            })
        .match(
            SnapshotOffer.class,
            ss -> {
              log.info(
                  "Snapshot offer completed for Actor {} last Sq number {}",
                  ss.metadata().persistenceId(),
                  ss.metadata().sequenceNr());
              entity = (T) ss.snapshot();
            })
        .matchAny((s) -> log.info("Message replay {} ", s))
        .build();
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Message.class,
            (m) -> "Replay".equalsIgnoreCase(m.getType()),
            r -> {
              log.info(
                  "Starting loading entities to Destination for {} Actor {}",
                  aggregateType,
                  persistenceId());
              if (entity != null) {
                  saveSnapshot(entity);
                  repository.save(entity);
              }
            })
        .match(
            SaveSnapshotSuccess.class,
            s -> {
              log.info(
                  "Snapshot saved successfully for {} Actor {} with sq number {}",
                  aggregateType,
                  s.metadata().persistenceId(),
                  s.metadata().sequenceNr());
            })
        .match(
            SaveSnapshotFailure.class,
            s -> {
              log.info(
                  "Failure while saving snapshot for {} Actor {} with sq number {}",
                  aggregateType,
                  s.metadata().persistenceId(),
                  s.metadata().sequenceNr());
              s.cause().printStackTrace();
            })
        .matchAny(
            e -> {
              log.info("Current state is {}", entity);
              log.info("Message received {} with data {}", e.getClass().getSimpleName(), e);
            })
        .build();
  }

  @Override
  public String persistenceId() {
    return this.aggregateType + "-" + self().path().name();
  }

  @Override
  public Recovery recovery() {
    return Recovery.create(SnapshotSelectionCriteria.latest());
  }

  @SuppressWarnings("unchecked")
  private void applyEvent(Message<?> event) {
    Map<String, Object> payload =
        event.getSourcePayload() instanceof scala.collection.immutable.Map
            ? CollectionConverters.MapHasAsJava(
                    (scala.collection.immutable.Map<String, Object>) event.getSourcePayload())
                .asJava()
            : (Map<String, Object>) event.getSourcePayload();

    if (entity == null) {
      aggregateMapper.getMappingMetadata().getClassMappings().stream()
          .filter(
              c ->
                  c.getMapId() != null
                      && c.getMapId().trim().equalsIgnoreCase(event.getType().trim()))
          .peek(c -> log.info("Found metadata with {}", c.getMapId()))
          .findFirst()
          .ifPresentOrElse(
              (c) ->
                  entity = (T) aggregateMapper.map(payload, c.getDestinationClass(), event.getType()),
              () -> {
                throw new IllegalArgumentException("No mapping found for type " + event.getType());
              });
      // TODO: set ID for every entity, if necessary
    } else {
      aggregateMapper.map(payload, entity, event.getType());
    }
  }
}

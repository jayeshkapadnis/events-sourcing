package com.cxloyalty.gce.service;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.cluster.sharding.ClusterSharding;
import akka.cluster.sharding.ClusterShardingSettings;
import akka.cluster.sharding.ShardRegion;
import akka.japi.function.Procedure;
import akka.routing.MurmurHash;
import akka.stream.alpakka.slick.javadsl.Slick;
import akka.stream.alpakka.slick.javadsl.SlickRow;
import akka.stream.alpakka.slick.javadsl.SlickSession;
import akka.stream.alpakka.slick.javadsl.SlickSession$;
import com.cxloyalty.gce.actor.EntityActor;
import com.cxloyalty.gce.config.ActorConfig;
import com.cxloyalty.gce.entity.MappingEntity;
import com.cxloyalty.gce.workflow.choreography.model.Message;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.transaction.Transactional;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Slf4j
@Component
public class ActorService implements ApplicationContextAware {

  private final ActorSystem system;
  private final SlickSession session;
  private final ActorConfig config;
  private Map<String, ActorRef> entityActors;
  private ApplicationContext context;

  public ActorService(ActorConfig actorConfig) {
    Config config =
        ConfigFactory.parseResources(actorConfig.getConf())
            .withFallback(ConfigFactory.load())
            .resolve();
    this.system = ActorSystem.create(actorConfig.getClusterName(), config);
    this.session = SlickSession$.MODULE$.forConfig("slick", config);
    this.config = actorConfig;
    this.entityActors = new HashMap<>();
  }

  @PostConstruct
  @Transactional
  public void init() {
    Repositories rp = new Repositories(context);
    ClusterShardingSettings settings = ClusterShardingSettings.create(system);
    Slick.source(
            session,
            "select id, entity_type, xml, source_system from mappings",
            (r) -> {
              try {
                return new MappingEntity(
                    UUID.fromString(r.nextString()),
                    r.nextString(),
                    r.nextBlob().getBinaryStream().readAllBytes(),
                    r.nextString());
              } catch (SQLException | IOException e) {
                throw new IllegalArgumentException("Error while loading bytes", e);
              }
            })
        .runForeach(
            (Procedure<MappingEntity>)
                m -> {
                  entityActors.putIfAbsent(
                      m.getEntityType(),
                      ClusterSharding.get(system)
                          .start(
                              m.getEntityType(),
                              Props.create(
                                  EntityActor.class,
                                  m.getEntityType(),
                                  m.getXml(),
                                  rp.getRepositoryFor(config.entityClassFor(m.getEntityType()))
                                      .orElseThrow()),
                              settings,
                              messageExtractor()));
                },
            system)
        .handle(
            (r, e) -> {
              if (e != null) throw new RuntimeException(e);
              else return r;
            });
  }

  @PreDestroy
  public void destroy() {
    if (session != null) session.close();
  }

  public void loadAllEntities() {
    Slick.source(
            session,
            "select distinct(persistence_id) from journal",
            (SlickRow r) -> {
              String persistenceId = r.nextString();
              String[] split = persistenceId.split("-", 2);
              return Pair.of(split[0], split[1]);
            })
        .runForeach(
            (Procedure<Pair<String, String>>)
                param -> {
                  String entityType = param.getLeft();
                  String entityId = param.getRight();
                  entityActors
                      .get(param.getLeft())
                      .tell(
                          Message.builder()
                              .entityType(entityType)
                              .entityId(entityId)
                              .type("Replay")
                              .build(),
                          ActorRef.noSender());
                },
            system);
  }

  private ShardRegion.MessageExtractor messageExtractor() {
    return new ShardRegion.MessageExtractor() {

      @Override
      public String entityId(Object message) {
        if (message instanceof Message) return ((Message) message).getEntityId();
        else return null;
      }

      @Override
      public Object entityMessage(Object message) {
        return message;
      }

      @Override
      public String shardId(Object message) {
        int numberOfShards = 100;
        if (message instanceof Message) {
          int id = MurmurHash.stringHash(((Message) message).getEntityId());
          return String.valueOf(id % numberOfShards);
        }
        return null;
      }
    };
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.context = applicationContext;
  }
}

package com.cxloyalty.gce.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.InputStream;
import java.util.UUID;

@AllArgsConstructor
@Getter@Setter
@ToString
public class MappingEntity {
    private UUID id;
    private String entityType;
    private byte[] xml;
    private String sourceSystem;
}

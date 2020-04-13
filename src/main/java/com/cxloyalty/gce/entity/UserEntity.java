package com.cxloyalty.gce.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.time.Instant;
import java.util.Map;
import java.util.UUID;

@Entity
@Table(name = "users")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
@Data
public class UserEntity {
    @Id
    @Column(length = 36)
    private UUID id;

    @Embedded
    private AddressValueObject address;

    private Instant joinedDate;

    @Type(type = "jsonb")
    private Map<String, Object> attributes;
}

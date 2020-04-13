package com.cxloyalty.gce.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;

@Embeddable
@Getter@Setter@ToString@EqualsAndHashCode
public class AddressValueObject {
    private String city;
    private String state;
    private String country;
}

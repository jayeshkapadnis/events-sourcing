package com.cxloyalty.gce.converter;

import org.apache.commons.lang3.StringUtils;
import org.dozer.DozerConverter;

import java.util.UUID;

public class UUIDConverter extends DozerConverter<UUID, String> {

    public UUIDConverter() {
        super(UUID.class, String.class);
    }

    public UUIDConverter(Class<UUID> prototypeA, Class<String> prototypeB) {
        super(prototypeA, prototypeB);
    }

    @Override
    public String convertTo(UUID source, String dest) {
        if(source == null){
            return null;
        }
        return source.toString();
    }

    @Override
    public UUID convertFrom(String source, UUID dest) {
        if(StringUtils.isBlank(source)){
            return null;
        }
        return UUID.fromString(source);
    }
}

package com.cxloyalty.gce.converter;

import org.dozer.DozerConverter;

public class BooleanConverter extends DozerConverter<Boolean, Integer> {

    public BooleanConverter() {
        super(Boolean.class, Integer.class);
    }

    public BooleanConverter(Class<Boolean> prototypeA, Class<Integer> prototypeB) {
        super(prototypeA, prototypeB);
    }

    @Override
    public Integer convertTo(Boolean source, Integer dest) {
        if(Boolean.TRUE.equals(source)){
            return 1;
        }
        return 0;
    }

    @Override
    public Boolean convertFrom(Integer source, Boolean dest) {
        if(source == null){
            return null;
        }
        return source.equals(1);
    }
}

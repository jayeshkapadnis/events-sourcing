package com.cxloyalty.gce.converter;

import org.apache.commons.lang3.StringUtils;
import org.dozer.DozerConverter;

import java.time.Instant;

public class InstantConverter extends DozerConverter<String, Instant> {

  public InstantConverter() {
    super(String.class, Instant.class);
  }

  /**
   * Defines two types, which will take part transformation. As Dozer supports bi-directional
   * mapping it is not known which of the classes is source and which is destination. It will be
   * decided in runtime.
   *
   * @param prototypeA type one
   * @param prototypeB type two
   */
  public InstantConverter(Class<String> prototypeA, Class<Instant> prototypeB) {
    super(prototypeA, prototypeB);
  }

  @Override
  public Instant convertTo(String source, Instant destination) {
    if(StringUtils.isBlank(source)){
      return null;
    }
    return Instant.parse(source);
  }

  @Override
  public String convertFrom(Instant source, String destination) {
    if(source == null){
      return null;
    }
    return source.toString();
  }
}

package com.cxloyalty.gce.dozer;

import com.cxloyalty.gce.entity.AddressValueObject;
import com.cxloyalty.gce.entity.UserEntity;
import org.apache.commons.lang3.ArrayUtils;
import org.dozer.DozerBeanMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserMapperTest {

  private DozerBeanMapper mapper;

  @BeforeEach
  public void setup() throws IOException {
    ClassPathResource mapping = new ClassPathResource("user-mapping.xml");
    Byte[] bytes = ArrayUtils.toObject(mapping.getInputStream().readAllBytes());
    this.mapper = new DozerBeanMapper();
    this.mapper.addMapping(new ByteArrayInputStream(ArrayUtils.toPrimitive(bytes)));
  }

  @Test
  public void testUserMapping() {
    Map<String, Object> uSource = new HashMap<>();
    uSource.put("id", "d7dc7240-9517-4fa0-80fc-75f702848ec2");
    uSource.put("city", "Pune");
    uSource.put("country", "India");
    uSource.put("joinedDate", "2020-04-07T10:42:50.046951Z");
    UserEntity uCreated = mapper.map(uSource, UserEntity.class, "USER_CREATED");

    assertEquals(uCreated, expected());
  }

  @Test
  public void testDateFormat() {
    Map<String, Object> uSource = new HashMap<>();
    uSource.put("joinedDate", "2020-04-07T10:42:50.046951Z");
    UserEntity uCreated = mapper.map(uSource, UserEntity.class, "USER_CREATED");
    UserEntity expected = new UserEntity();
    expected.setJoinedDate(Instant.parse("2020-04-07T10:42:50.046951Z"));
    assertEquals(uCreated, expected);
  }

  @Test
  public void testCollectionMapping() {
    UUID userId = UUID.randomUUID();
    UserEntity e = new UserEntity();
    e.setJoinedDate(Instant.parse("2020-04-07T10:42:50.046951Z"));
    Map<String, Object> sa = new HashMap<>();
    sa.put("att1", "value1");
    sa.put("suprv", e);
    Map<String, Object> uSource = new HashMap<>();
    uSource.put("id", userId.toString());
    uSource.put("extraAttributes", sa);
    UserEntity uCreated = mapper.map(uSource, UserEntity.class, "USER_CREATED");
    System.out.println(uCreated);
  }

  private UserEntity expected() {
    UserEntity e = new UserEntity();
    e.setId(UUID.fromString("d7dc7240-9517-4fa0-80fc-75f702848ec2"));
    e.setJoinedDate(Instant.parse("2020-04-07T10:42:50.046951Z"));
    AddressValueObject a = new AddressValueObject();
    a.setCity("Pune");
    a.setCountry("India");
    e.setAddress(a);
    return e;
  }
}

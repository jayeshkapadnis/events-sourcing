package com.cxloyalty.gce.dozer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
  public static void main(String[] args) throws ParseException {
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.s'Z'");
      Date parsed = dateFormat.parse("2020-04-07T10:42:50.046951Z");
      System.out.println(parsed);
  }
}

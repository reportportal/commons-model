package com.epam.ta.reportportal.ws.reporting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IssueSubTypeResource {

  @JsonProperty(value = "id")
  private Long id;

  @JsonProperty(value = "locator")
  private String locator;

  @JsonProperty(value = "typeRef")
  private String typeRef;

  @JsonProperty(value = "longName")
  private String longName;

  @JsonProperty(value = "shortName")
  private String shortName;

  @JsonProperty(value = "color")
  private String color;

  public IssueSubTypeResource() {

  }

  public IssueSubTypeResource(Long id, String locator, String typeRef, String longName,
      String shortName, String color) {
    this.id = id;
    this.locator = locator;
    this.typeRef = typeRef;
    this.longName = longName;
    this.shortName = shortName;
    this.color = color;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getLocator() {
    return locator;
  }

  public void setLocator(String locator) {
    this.locator = locator;
  }

  public String getTypeRef() {
    return typeRef;
  }

  public void setTypeRef(String typeRef) {
    this.typeRef = typeRef;
  }

  public String getLongName() {
    return longName;
  }

  public void setLongName(String longName) {
    this.longName = longName;
  }

  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}

package com.epam.ta.reportportal.ws.model.activity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PluginActivityResource {
  @JsonProperty(value = "id", required = true)
  private Long id;
  @JsonProperty(value = "name")
  private String name;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("PluginActivityResource{");
    sb.append("id=").append(id);
    sb.append(", name='").append(name).append('\'');
    sb.append('}');
    return sb.toString();
  }
}

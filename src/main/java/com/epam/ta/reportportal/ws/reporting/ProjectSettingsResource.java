package com.epam.ta.reportportal.ws.reporting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectSettingsResource {

  @JsonProperty(value = "project", required = true)
  private Long projectId;

  @JsonProperty(value = "subTypes", required = true)
  private Map<String, List<IssueSubTypeResource>> subTypes;

  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public Map<String, List<IssueSubTypeResource>> getSubTypes() {
    return subTypes;
  }

  public void setSubTypes(Map<String, List<IssueSubTypeResource>> types) {
    this.subTypes = types;
  }
}

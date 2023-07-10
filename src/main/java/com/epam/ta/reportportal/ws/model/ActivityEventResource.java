/*
 * Copyright 2023 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.epam.ta.reportportal.ws.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * JSON Representation of Report Portal's Activity domain object.
 *
 * @author Ryhor_Kukharenka
 */
@JsonInclude(Include.NON_NULL)
public class ActivityEventResource {

  @NotNull
  @JsonProperty(value = "id", required = true)
  @ApiModelProperty(required = true)
  private Long id;

  @NotNull
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
  @JsonProperty(value = "created_at")
  private Date createdAt;

  @NotNull
  @JsonProperty(value = "event_name", required = true)
  @ApiModelProperty(required = true)
  private String eventName;

  @JsonProperty(value = "object_id")
  @ApiModelProperty(required = true)
  private Long objectId;

  @NotNull
  @JsonProperty(value = "object_name", required = true)
  @ApiModelProperty(required = true)
  private String objectName;

  @NotNull
  @JsonProperty(value = "object_type", required = true)
  @ApiModelProperty(required = true)
  private String objectType;

  @JsonProperty(value = "project_id")
  @ApiModelProperty(required = true)
  private Long projectId;

  @JsonProperty(value = "project_name")
  @ApiModelProperty(required = true)
  private String projectName;

  @NotNull
  @JsonProperty(value = "subject_name", required = true)
  @ApiModelProperty(required = true)
  private String subjectName;

  @NotNull
  @JsonProperty(value = "subject_type", required = true)
  @ApiModelProperty(required = true)
  private String subjectType;

  @JsonProperty(value = "details")
  private Object details;

  private ActivityEventResource() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public Long getObjectId() {
    return objectId;
  }

  public void setObjectId(Long objectId) {
    this.objectId = objectId;
  }

  public String getObjectName() {
    return objectName;
  }

  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }

  public String getObjectType() {
    return objectType;
  }

  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }

  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  public String getSubjectType() {
    return subjectType;
  }

  public void setSubjectType(String subjectType) {
    this.subjectType = subjectType;
  }

  public Object getDetails() {
    return details;
  }

  public void setDetails(Object details) {
    this.details = details;
  }

  @Override
  public String toString() {
    return "ActivityEventResource{" + "id=" + id
        + ", createdAt=" + createdAt + ", eventName='" + eventName
        + '\'' + ", objectId=" + objectId + ", objectName='"
        + objectName + '\'' + ", objectType='" + objectType + '\''
        + ", projectId=" + projectId + ", projectName='" + projectName
        + '\'' + ", subjectName='" + subjectName + '\''
        + ", subjectType='" + subjectType + '\'' + ", details="
        + details + '}';
  }

  public static ActivityEventResourceBuilder builder() {
    return new ActivityEventResourceBuilder();
  }

  /**
   * Activity Event Resource builder.
   *
   * @author Ryhor_Kukharenka
   */
  public static class ActivityEventResourceBuilder {

    private final ActivityEventResource activityEventResource;

    private ActivityEventResourceBuilder() {
      activityEventResource = new ActivityEventResource();
    }

    public ActivityEventResourceBuilder id(Long id) {
      activityEventResource.id = id;
      return this;
    }

    public ActivityEventResourceBuilder createdAt(Date createdAt) {
      activityEventResource.createdAt = createdAt;
      return this;
    }

    public ActivityEventResourceBuilder eventName(String eventName) {
      activityEventResource.eventName = eventName;
      return this;
    }

    public ActivityEventResourceBuilder objectId(Long objectId) {
      activityEventResource.objectId = objectId;
      return this;
    }

    public ActivityEventResourceBuilder objectName(String objectName) {
      activityEventResource.objectName = objectName;
      return this;
    }

    public ActivityEventResourceBuilder objectType(String objectType) {
      activityEventResource.objectType = objectType;
      return this;
    }

    public ActivityEventResourceBuilder projectId(Long projectId) {
      activityEventResource.projectId = projectId;
      return this;
    }

    public ActivityEventResourceBuilder projectName(String projectName) {
      activityEventResource.projectName = projectName;
      return this;
    }

    public ActivityEventResourceBuilder subjectName(String subjectName) {
      activityEventResource.subjectName = subjectName;
      return this;
    }

    public ActivityEventResourceBuilder subjectType(String subjectType) {
      activityEventResource.subjectType = subjectType;
      return this;
    }

    public ActivityEventResourceBuilder details(Object details) {
      activityEventResource.details = details;
      return this;
    }

    public ActivityEventResource build() {
      return activityEventResource;
    }
  }

}

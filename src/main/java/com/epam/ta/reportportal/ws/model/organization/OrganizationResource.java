/*
 *
 *  * Copyright 2023 EPAM Systems
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.epam.ta.reportportal.ws.model.organization;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

/**
 * Basic JSON representation of Organization
 *
 * @author Andrei Piankouski
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrganizationResource {

  @NotNull
  @JsonProperty(value = "organizationId", required = true)
  private Long organizationId;

  @NotNull
  @JsonProperty(value = "organizationName", required = true)
  private String organizationName;

  @NotNull
  @JsonProperty(value = "organizationSlug", required = true)
  private String organizationSlug;

  public Long getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }

  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public String getOrganizationSlug() {
    return organizationSlug;
  }

  public void setOrganizationSlug(String organizationSlug) {
    this.organizationSlug = organizationSlug;
  }

  @Override
  public String toString() {
    return "OrganizationResource{" + "organizationId=" + organizationId + ", organizationName='"
        + organizationName + '\'' + ", organizationSlug='" + organizationSlug + '\'' + '}';
  }
}

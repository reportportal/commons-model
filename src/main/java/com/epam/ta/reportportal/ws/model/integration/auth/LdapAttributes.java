/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.ws.model.integration.auth;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LdapAttributes implements Serializable {

  @NotNull
  @JsonProperty(value = "enabled")
  private Boolean enabled;

  @NotBlank
  @Pattern(regexp = "^ldaps?://.*")
  @JsonProperty(value = "url")
  private String url;

  @NotBlank
  @JsonProperty(value = "baseDn")
  private String baseDn;

  @NotNull
  @Valid
  @JsonProperty("synchronizationAttributes")
  private SynchronizationAttributesResource synchronizationAttributes;

  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getBaseDn() {
    return baseDn;
  }

  public void setBaseDn(String baseDn) {
    this.baseDn = baseDn;
  }

  public SynchronizationAttributesResource getSynchronizationAttributes() {
    return synchronizationAttributes;
  }

  public void setSynchronizationAttributes(
      SynchronizationAttributesResource synchronizationAttributes) {
    this.synchronizationAttributes = synchronizationAttributes;
  }

  @Override
  public String toString() {
    return "LdapAttributes{" + "enabled=" + enabled + ", url='" + url + '\'' + ", baseDn='" + baseDn
        + '\''
        + ", synchronizationAttributes=" + synchronizationAttributes + '}';
  }
}
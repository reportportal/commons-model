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

package com.epam.ta.reportportal.ws.model.launch;

import com.epam.ta.reportportal.ws.model.OwnedResource;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.epam.ta.reportportal.ws.model.attribute.ItemAttributeResource;
import com.epam.ta.reportportal.ws.model.statistics.StatisticsResource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * JSON Representation of Report Portal's Launch domain object
 *
 * @author Andrei Varabyeu
 */
@JsonInclude(Include.NON_NULL)
@Data
@EqualsAndHashCode(callSuper = true)
public class LaunchResource extends OwnedResource {

  @NotNull
  @JsonProperty(value = "id", required = true)
  private Long launchId;

  @NotBlank
  @JsonProperty(value = "uuid", required = true)
  private String uuid;

  @NotBlank
  @Size(min = ValidationConstraints.MIN_NAME_LENGTH, max = ValidationConstraints.MAX_NAME_LENGTH)
  @JsonProperty(value = "name", required = true)
  private String name;

  @NotNull
  @JsonProperty(value = "number", required = true)
  private Long number;

  @JsonProperty(value = "description")
  @Size(max = ValidationConstraints.MAX_LAUNCH_DESCRIPTION_LENGTH)
  private String description;

  @NotNull
  @JsonProperty(value = "startTime", required = true)
  private LocalDateTime startTime;

  @JsonProperty(value = "endTime")
  private LocalDateTime endTime;

  @JsonProperty(value = "lastModified")
  private LocalDateTime lastModified;

  @NotNull
  @JsonProperty(value = "status", required = true)
  private String status;

  @JsonProperty(value = "statistics")
  @Valid
  private StatisticsResource statisticsResource;

  @JsonProperty(value = "attributes")
  private Set<ItemAttributeResource> attributes;

  @JsonProperty(value = "mode")
  private Mode mode;

  @JsonProperty(value = "analysing")
  private Set<String> analyzers = new LinkedHashSet<>();

  @JsonProperty(value = "approximateDuration")
  private double approximateDuration;

  @JsonProperty(value = "hasRetries")
  private boolean hasRetries;

  @JsonProperty(value = "rerun")
  private boolean rerun;

  @JsonProperty(value = "metadata")
  private Map<String, Object> metadata;

}

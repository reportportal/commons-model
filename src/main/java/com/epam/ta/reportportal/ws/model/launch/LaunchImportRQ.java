/*
 * Copyright 2023 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.ws.model.launch;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MAX_PARAMETERS_LENGTH;

import com.epam.ta.reportportal.ws.model.attribute.ItemAttributesRQ;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class LaunchImportRQ {

  @JsonProperty(value = "name")
  @ApiModelProperty
  protected String name;

  @JsonProperty(value = "description")
  private String description;

  @Size(max = MAX_PARAMETERS_LENGTH)
  @Valid
  @JsonProperty("attributes")
  @JsonAlias({"attributes", "tags"})
  private Set<ItemAttributesRQ> attributes;

  @NotNull
  @JsonProperty
  @JsonAlias({"startTime", "start_time"})
  @ApiModelProperty
  private Date startTime;

  @JsonProperty("mode")
  private Mode mode;
}

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

package com.epam.ta.reportportal.ws.model.log;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Henadzi_Vrubleuski
 * @author Andrei Varabyeu
 */
@JsonInclude(Include.NON_NULL)
@Data
public class SaveLogRQ {

  @JsonProperty("uuid")
  private String uuid;

  @JsonAlias({"itemUuid", "item_id"})
  @Schema(description = "UUID of test item owned this log")
  private String itemUuid;

  @JsonProperty(value = "launchUuid")
  @Schema(requiredMode = RequiredMode.REQUIRED)
  private String launchUuid;

  @NotNull
  @JsonProperty(value = "time", required = true)
  @Schema(requiredMode = RequiredMode.REQUIRED)
  private LocalDateTime logTime;

  @JsonProperty(value = "message")
  private String message;

  @JsonProperty(value = "level")
  @Schema(allowableValues = "error, warn, info, debug, trace, fatal, unknown")
  private String level;

  @JsonProperty(value = "file")
  private File file;

  @JsonInclude(Include.NON_NULL)
  @Getter
  @Setter
  @ToString
  public static class File {

    @JsonProperty(value = "name")
    private String name;

    @JsonIgnore
    private byte[] content;

    @JsonIgnore
    private String contentType;

  }

}

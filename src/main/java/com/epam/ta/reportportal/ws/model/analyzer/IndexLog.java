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

package com.epam.ta.reportportal.ws.model.analyzer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents log container in index/analysis request/response.
 *
 * @author Ivan Sharamet
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@ToString
public class IndexLog {

  @JsonProperty("logId")
  private Long logId;

  @JsonProperty("logLevel")
  private int logLevel;

  @JsonProperty("logTime")
  private LocalDateTime logTime;

  @JsonProperty("message")
  private String message;

  @JsonProperty("clusterId")
  private Long clusterId;


	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		IndexLog indexLog = (IndexLog) o;
		return logLevel == indexLog.logLevel && Objects.equals(message, indexLog.message) && Objects.equals(clusterId, indexLog.clusterId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(logLevel, message, clusterId);
	}

}

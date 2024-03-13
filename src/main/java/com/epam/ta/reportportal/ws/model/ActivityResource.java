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

package com.epam.ta.reportportal.ws.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.time.Instant;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * JSON Representation of Report Portal's Activity domain object.
 *
 * @see <a href="http://en.wikipedia.org/wiki/HATEOAS">HATEOAS Description</a>
 */
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ActivityResource {

	@NotNull
	@JsonProperty(value = "id", required = true)
	@Schema(requiredMode = RequiredMode.REQUIRED)
	private Long id;

	@NotNull
	@JsonProperty(value = "user", required = true)
	@Schema(requiredMode = RequiredMode.REQUIRED)
	private String user;

	@NotNull
	@JsonProperty(value = "loggedObjectId", required = true)
	@Schema(requiredMode = RequiredMode.REQUIRED)
	private Long loggedObjectId;

	@NotNull
	@JsonProperty(value = "lastModified", required = true)
	@Schema(requiredMode = RequiredMode.REQUIRED)
	private Instant lastModified;

	@NotNull
	@JsonProperty(value = "actionType", required = true)
	@Schema(requiredMode = RequiredMode.REQUIRED)
	private String actionType;

	@NotNull
	@JsonProperty(value = "objectType", required = true)
	@Schema(requiredMode = RequiredMode.REQUIRED)
	private String objectType;

	@NotNull
	@JsonProperty(value = "projectId", required = true)
	@Schema(requiredMode = RequiredMode.REQUIRED)
	private Long projectId;

	@JsonProperty(value = "projectName")
	private String projectName;

	@JsonProperty(value = "details")
	private Object details;

	@JsonProperty(value = "objectName")
	private String objectName;

}

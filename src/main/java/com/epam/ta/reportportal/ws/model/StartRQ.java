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

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MAX_PARAMETERS_LENGTH;

import com.epam.ta.reportportal.ws.model.attribute.ItemAttributesRQ;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.time.LocalDateTime;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

/**
 * Base entity for start requests
 *
 * @author Andrei Varabyeu
 */
@JsonInclude(Include.NON_NULL)
@Data
public class StartRQ {

	@JsonProperty(value = "name", required = true)
	@Schema(requiredMode = RequiredMode.REQUIRED)
	protected String name;

	@JsonProperty(value = "description")
	private String description;

	@Size(max = MAX_PARAMETERS_LENGTH)
	@Valid
	@JsonProperty("attributes")
	@JsonAlias({ "attributes", "tags" })
	private Set<ItemAttributesRQ> attributes;

	@NotNull
	@JsonProperty(required = true)
	@JsonAlias({ "startTime", "start_time" })
	@Schema(requiredMode = RequiredMode.REQUIRED)
	private LocalDateTime startTime;

	@Schema(hidden = true)
	@JsonProperty(value = "uuid")
	private String uuid;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		StartRQ startRQ = (StartRQ) o;

		if (name != null ? !name.equals(startRQ.name) : startRQ.name != null) {
			return false;
		}
		if (description != null ? !description.equals(startRQ.description) : startRQ.description != null) {
			return false;
		}
		if (attributes != null ? !attributes.equals(startRQ.attributes) : startRQ.attributes != null) {
			return false;
		}
		return startTime != null ? startTime.equals(startRQ.startTime) : startRQ.startTime == null;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (attributes != null ? attributes.hashCode() : 0);
		result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
		return result;
	}
}

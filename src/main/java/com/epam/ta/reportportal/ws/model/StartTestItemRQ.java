/*
 * Copyright 2019 EPAM Systems
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

package com.epam.ta.reportportal.ws.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.List;

@JsonInclude(Include.NON_NULL)
public class StartTestItemRQ extends StartRQ {

	@Valid
	@JsonProperty(value = "parameters")
	private List<ParameterResource> parameters;

	@JsonProperty(value = "uniqueId")
	private String uniqueId;

	@NotBlank
	@JsonProperty(value = "launchId", required = true)
	@ApiModelProperty(required = true)
	private String launchId;

	@NotNull
	@JsonProperty(value = "type", required = true)
	@JsonSerialize(using = UpperCaseTypeSerializer.class)
	@JsonDeserialize(using = UpperCaseTypeDeserializer.class)
	@ApiModelProperty(required = true, allowableValues = "SUITE, STORY, TEST, SCENARIO, STEP, BEFORE_CLASS, BEFORE_GROUPS,"
			+ "BEFORE_METHOD, BEFORE_SUITE, BEFORE_TEST, AFTER_CLASS, AFTER_GROUPS, AFTER_METHOD, AFTER_SUITE, AFTER_TEST")
	private String type;

	@JsonProperty(value = "retry")
	private Boolean retry;

	public Boolean isRetry() {
		return retry;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}

	public String getLaunchId() {
		return launchId;
	}

	public void setLaunchId(String launchId) {
		this.launchId = launchId;
	}

	public List<ParameterResource> getParameters() {
		return parameters;
	}

	public void setParameters(List<ParameterResource> parameters) {
		this.parameters = parameters;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private static class UpperCaseTypeDeserializer extends JsonDeserializer<String> {

		@Override
		public String deserialize(JsonParser parser, DeserializationContext context) throws IOException {
			ObjectCodec oc = parser.getCodec();
			JsonNode node = oc.readTree(parser);
			return node.asText().toUpperCase();
		}

	}

	private static class UpperCaseTypeSerializer extends JsonSerializer<String> {

		@Override
		public void serialize(String type, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
			if (type != null) {
				jsonGenerator.writeString(type.toUpperCase());
			}
		}

	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("StartTestItemRQ{");
		sb.append("parameters=").append(parameters);
		sb.append(", uniqueId='").append(uniqueId).append('\'');
		sb.append(", launchId='").append(launchId).append('\'');
		sb.append(", type='").append(type).append('\'');
		sb.append(", retry=").append(retry);
		sb.append('}');
		return sb.toString();
	}
}
/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/commons-model
 * 
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
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

	@NotNull
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
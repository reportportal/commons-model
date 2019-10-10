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

import com.epam.ta.reportportal.ws.annotations.In;
import com.epam.ta.reportportal.ws.annotations.NotBlankWithSize;
import com.fasterxml.jackson.annotation.JsonAlias;
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
import javax.validation.constraints.Size;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MAX_TEST_ITEM_LOCATION_LENGTH;

@JsonInclude(Include.NON_NULL)
public class StartTestItemRQ extends StartRQ {

	@Size(max = MAX_TEST_ITEM_LOCATION_LENGTH)
	@JsonProperty(value = "codeRef")
	private String codeRef;

	@Valid
	@JsonProperty(value = "parameters")
	private List<ParameterResource> parameters;

	@JsonProperty(value = "uniqueId")
	private String uniqueId;

	@JsonProperty(value = "testCaseId")
	private Integer testCaseId;

	@JsonAlias({ "launchUuid", "launch_id" })
	@ApiModelProperty(value = "UUID of parent launch", required = true)
	private String launchUuid;

	@NotNull
	@JsonProperty(value = "type", required = true)
	@JsonSerialize(using = UpperCaseTypeSerializer.class)
	@JsonDeserialize(using = UpperCaseTypeDeserializer.class)
	@In(allowedValues = { "suite", "story", "test", "scenario", "step", "before_class", "before_groups", "before_method", "before_suite",
			"before_test", "after_class", "after_groups", "after_method", "after_suite", "after_test" })
	@ApiModelProperty(required = true, allowableValues = "SUITE, STORY, TEST, SCENARIO, STEP, BEFORE_CLASS, BEFORE_GROUPS,"
			+ "BEFORE_METHOD, BEFORE_SUITE, BEFORE_TEST, AFTER_CLASS, AFTER_GROUPS, AFTER_METHOD, AFTER_SUITE, AFTER_TEST")
	private String type;

	@JsonProperty(value = "retry")
	private Boolean retry;

	@JsonProperty(value = "hasStats")
	private boolean hasStats = true;

	@Override
	@NotBlankWithSize(min = ValidationConstraints.MIN_TEST_ITEM_NAME_LENGTH, max = ValidationConstraints.MAX_TEST_ITEM_NAME_LENGTH)
	public String getName() {
		return name;
	}

	public String getCodeRef() {
		return codeRef;
	}

	public void setCodeRef(String codeRef) {
		this.codeRef = codeRef;
	}

	public Boolean isRetry() {
		return retry;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}

	public boolean isHasStats() {
		return hasStats;
	}

	public void setHasStats(boolean hasStats) {
		this.hasStats = hasStats;
	}

	public String getLaunchUuid() {
		return launchUuid;
	}

	public void setLaunchUuid(String launchUuid) {
		this.launchUuid = launchUuid;
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

	public Integer getTestCaseId() {
		return testCaseId;
	}

	public void setTestCaseId(Integer testCaseId) {
		this.testCaseId = testCaseId;
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
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		if (!super.equals(o)) {
			return false;
		}
		StartTestItemRQ that = (StartTestItemRQ) o;
		return hasStats == that.hasStats && Objects.equals(codeRef, that.codeRef) && Objects.equals(parameters, that.parameters)
				&& Objects.equals(uniqueId, that.uniqueId) && Objects.equals(testCaseId, that.testCaseId) && Objects.equals(launchUuid,
				that.launchUuid
		) && Objects.equals(type, that.type) && Objects.equals(retry, that.retry);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), codeRef, parameters, uniqueId, testCaseId, launchUuid, type, retry, hasStats);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("StartTestItemRQ{");
		sb.append("codeRef='").append(codeRef).append('\'');
		sb.append(", parameters=").append(parameters);
		sb.append(", uniqueId='").append(uniqueId).append('\'');
		sb.append(", testCaseId='").append(testCaseId).append('\'');
		sb.append(", launchUuid='").append(launchUuid).append('\'');
		sb.append(", type='").append(type).append('\'');
		sb.append(", retry=").append(retry);
		sb.append(", hasStats=").append(hasStats);
		sb.append(", name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
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

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MAX_TEST_ITEM_UNIQUE_ID_LENGTH;

import com.epam.ta.reportportal.ws.annotations.In;
import com.epam.ta.reportportal.ws.annotations.NotBlankWithSize;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@JsonInclude(Include.NON_NULL)
public class StartTestItemRQ extends StartRQ {

	@JsonProperty(value = "codeRef")
	private String codeRef;

	@Valid
	@JsonProperty(value = "parameters")
	private List<ParameterResource> parameters;

	@Size(max = MAX_TEST_ITEM_UNIQUE_ID_LENGTH)
	@JsonProperty(value = "uniqueId")
	private String uniqueId;

	@JsonProperty(value = "testCaseId")
	private String testCaseId;

	@NotNull
	@JsonAlias({ "launchUuid", "launch_id" })
	@Schema(description  = "UUID of parent launch", required = true)
	private String launchUuid;

	@NotNull
	@JsonProperty(value = "type", required = true)
	@JsonSerialize(using = UpperCaseTypeSerializer.class)
	@JsonDeserialize(using = UpperCaseTypeDeserializer.class)
	@In(allowedValues = { "suite", "story", "test", "scenario", "step", "before_class", "before_groups", "before_method", "before_suite",
			"before_test", "after_class", "after_groups", "after_method", "after_suite", "after_test" })
	@Schema(required = true, allowableValues = "SUITE, STORY, TEST, SCENARIO, STEP, BEFORE_CLASS, BEFORE_GROUPS,"
			+ "BEFORE_METHOD, BEFORE_SUITE, BEFORE_TEST, AFTER_CLASS, AFTER_GROUPS, AFTER_METHOD, AFTER_SUITE, AFTER_TEST")
	private String type;

	@JsonProperty(value = "retry")
	private Boolean retry;

	@JsonProperty(value = "hasStats")
	private boolean hasStats = true;

	@JsonProperty(value = "retryOf")
	private String retryOf;

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

	public String getRetryOf() {
		return retryOf;
	}

	public void setRetryOf(String retryOf) {
		this.retryOf = retryOf;
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

	public String getTestCaseId() {
		return testCaseId;
	}

	public void setTestCaseId(String testCaseId) {
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
		return hasStats == that.hasStats && Objects.equals(retryOf, that.retryOf) && Objects.equals(codeRef, that.codeRef)
				&& Objects.equals(parameters, that.parameters) && Objects.equals(uniqueId, that.uniqueId) && Objects.equals(testCaseId,
				that.testCaseId
		) && Objects.equals(launchUuid, that.launchUuid) && Objects.equals(type, that.type) && Objects.equals(retry, that.retry);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), codeRef, parameters, uniqueId, testCaseId, launchUuid, type, retry, hasStats, retryOf);
	}

	@Override
	public String toString() {
		return "StartTestItemRQ{" + "codeRef='" + codeRef + '\'' + ", parameters=" + parameters + ", uniqueId='" + uniqueId + '\''
				+ ", testCaseId='" + testCaseId + '\'' + ", launchUuid='" + launchUuid + '\'' + ", type='" + type + '\'' + ", retry="
				+ retry + ", hasStats=" + hasStats + ", retryOf=" + retryOf + ", name='" + name + '\'' + '}';
	}
}
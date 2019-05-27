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

import com.epam.ta.reportportal.ws.model.attribute.ItemAttributesRQ;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MAX_PARAMETERS_LENGTH;

/**
 * Finishes some entity execution in Report Portal<br>
 * May be Launch, TestSuite, Test, TestStep
 *
 * @author Andrei Varabyeu
 */
@JsonInclude(Include.NON_NULL)
public class FinishExecutionRQ {

	@NotNull
	@JsonProperty(value = "endTime", required = true)
	@ApiModelProperty(required = true)
	private Date endTime;

	@JsonProperty(value = "status")
	@ApiModelProperty(allowableValues = "PASSED, FAILED, STOPPED, SKIPPED, RESETED, CANCELLED")
	private String status;

	@JsonProperty(value = "description")
	private String description;

	@Size(max = MAX_PARAMETERS_LENGTH)
	@Valid
	@JsonProperty
	private Set<ItemAttributesRQ> attributes;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<ItemAttributesRQ> getAttributes() {
		return attributes;
	}

	public void setAttributes(Set<ItemAttributesRQ> attributes) {
		this.attributes = attributes;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("FinishExecutionRQ{");
		sb.append("endTime=").append(endTime);
		sb.append(", description=").append(description).append("\'");
		sb.append(", attributes").append(attributes).append("\'");
		sb.append(", status='").append(status).append('\'');
		sb.append('}');
		return sb.toString();
	}

}
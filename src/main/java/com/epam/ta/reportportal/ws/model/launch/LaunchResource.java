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

package com.epam.ta.reportportal.ws.model.launch;

import com.epam.ta.reportportal.ws.model.OwnedResource;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.epam.ta.reportportal.ws.model.attribute.ItemAttributeResource;
import com.epam.ta.reportportal.ws.model.statistics.StatisticsResource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

/**
 * JSON Representation of Report Portal's Launch domain object
 *
 * @author Andrei Varabyeu
 */
@JsonInclude(Include.NON_NULL)
public class LaunchResource extends OwnedResource {

	@NotNull
	@JsonProperty(value = "id", required = true)
	private Long launchId;

	@NotBlank
	@JsonProperty(value = "uuid", required = true)
	private String uuid;

	@NotBlank
	@Size(min = ValidationConstraints.MIN_NAME_LENGTH, max = ValidationConstraints.MAX_NAME_LENGTH)
	@JsonProperty(value = "name", required = true)
	private String name;

	@NotNull
	@JsonProperty(value = "number", required = true)
	private Long number;

	@JsonProperty(value = "description")
	@Size(max = ValidationConstraints.MAX_LAUNCH_DESCRIPTION_LENGTH)
	private String description;

	@NotNull
	@JsonProperty(value = "startTime", required = true)
	private Date startTime;

	@JsonProperty(value = "endTime")
	private Date endTime;

	@JsonProperty(value = "lastModified")
	private Date lastModified;

	@NotNull
	@JsonProperty(value = "status", required = true)
	private String status;

	@JsonProperty(value = "statistics")
	@Valid
	private StatisticsResource statisticsResource;

	@JsonProperty(value = "attributes")
	private Set<ItemAttributeResource> attributes;

	@JsonProperty(value = "mode")
	private Mode mode;

	@JsonProperty(value = "isProcessing")
	private boolean isProcessing;

	@JsonProperty(value = "approximateDuration")
	private double approximateDuration;

	@JsonProperty(value = "hasRetries")
	private boolean hasRetries;

	public double getApproximateDuration() {
		return approximateDuration;
	}

	public void setApproximateDuration(double approximateDuration) {
		this.approximateDuration = approximateDuration;
	}

	public Long getLaunchId() {
		return launchId;
	}

	public void setLaunchId(Long launchId) {
		this.launchId = launchId;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public StatisticsResource getStatisticsResource() {
		return statisticsResource;
	}

	public void setStatisticsResource(StatisticsResource statisticsResource) {
		this.statisticsResource = statisticsResource;
	}

	public Set<ItemAttributeResource> getAttributes() {
		return attributes;
	}

	public void setAttributes(Set<ItemAttributeResource> attributes) {
		this.attributes = attributes;
	}

	public Mode getMode() {
		return mode;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}

	public void setIsProcessing(boolean is) {
		this.isProcessing = is;
	}

	public boolean getIsProcessing() {
		return isProcessing;
	}

	public boolean getHasRetries() {
		return hasRetries;
	}

	public void setHasRetries(boolean hasRetries) {
		this.hasRetries = hasRetries;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("LaunchResource{");
		sb.append("launchId=").append(launchId);
		sb.append(", uuid='").append(uuid).append('\'');
		sb.append(", name='").append(name).append('\'');
		sb.append(", number=").append(number);
		sb.append(", description='").append(description).append('\'');
		sb.append(", startTime=").append(startTime);
		sb.append(", endTime=").append(endTime);
		sb.append(", lastModified=").append(lastModified);
		sb.append(", status='").append(status).append('\'');
		sb.append(", statisticsResource=").append(statisticsResource);
		sb.append(", attributes=").append(attributes);
		sb.append(", mode=").append(mode);
		sb.append(", isProcessing=").append(isProcessing);
		sb.append(", approximateDuration=").append(approximateDuration);
		sb.append(", hasRetries=").append(hasRetries);
		sb.append('}');
		return sb.toString();
	}
}

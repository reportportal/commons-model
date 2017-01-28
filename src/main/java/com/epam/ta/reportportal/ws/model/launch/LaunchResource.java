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

package com.epam.ta.reportportal.ws.model.launch;

import java.util.Date;
import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.epam.ta.reportportal.ws.model.OwnedResource;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.epam.ta.reportportal.ws.model.statistics.Statistics;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JSON Representation of Report Portal's Launch domain object
 * 
 * @author Andrei Varabyeu
 * 
 */
@JsonInclude(Include.NON_NULL)
public class LaunchResource extends OwnedResource {

	@NotNull
	@JsonProperty(value = "id", required = true)
	private String launchId;

	@NotNull
	@NotEmpty
	@Size(min = ValidationConstraints.MIN_NAME_LENGTH, max = ValidationConstraints.MAX_NAME_LENGTH)
	@JsonProperty(value = "name", required = true)
	private String name;

	@NotNull
	@JsonProperty(value = "number", required = true)
	private Long number;

	@JsonProperty("description")
	@Size(min = ValidationConstraints.MIN_DESCRIPTION_LENGTH, max = ValidationConstraints.MAX_LAUNCH_DESCRIPTION_LENGTH)
	private String description;

	@NotNull
	@JsonProperty(value = "start_time", required = true)
	private Date startTime;

	@JsonProperty("end_time")
	private Date endTime;

	@NotNull
	@JsonProperty(value = "status", required = true)
	private String status;

	@JsonProperty("statistics")
	@Valid
	private Statistics statistics;

	@JsonProperty("tags")
	private Set<String> tags;

	@JsonProperty("mode")
	private Mode mode;

	@JsonProperty("isProcessing")
	private boolean isProcessing;

	@JsonProperty("approximateDuration")
	private double approximateDuration;

	public double getApproximateDuration() {
		return approximateDuration;
	}

	public void setApproximateDuration(double approximateDuration) {
		this.approximateDuration = approximateDuration;
	}

	public String getLaunchId() {
		return launchId;
	}

	public void setLaunchId(String launchId) {
		this.launchId = launchId;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Statistics getStatistics() {
		return statistics;
	}

	public void setStatistics(Statistics statistics) {
		this.statistics = statistics;
	}

	public Set<String> getTags() {
		return tags;
	}

	public void setTags(Set<String> tags) {
		this.tags = tags;
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

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("LaunchResource{");
		sb.append("launchId='").append(launchId).append('\'');
		sb.append(", name='").append(name).append('\'');
		sb.append(", number=").append(number);
		sb.append(", description='").append(description).append('\'');
		sb.append(", startTime=").append(startTime);
		sb.append(", endTime=").append(endTime);
		sb.append(", status='").append(status).append('\'');
		sb.append(", statistics=").append(statistics);
		sb.append(", tags=").append(tags);
		sb.append(", mode=").append(mode);
		sb.append('}');
		return sb.toString();
	}
}

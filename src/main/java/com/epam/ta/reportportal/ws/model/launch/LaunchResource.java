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

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.epam.ta.reportportal.ws.model.ItemAttributeResource;
import com.epam.ta.reportportal.ws.model.OwnedResource;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.epam.ta.reportportal.ws.model.statistics.StatisticsResource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
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

	@NotNull
	@NotEmpty
	@Size(min = ValidationConstraints.MIN_NAME_LENGTH, max = ValidationConstraints.MAX_NAME_LENGTH)
	@JsonProperty(value = "name", required = true)
	private String name;

	@NotNull
	@JsonProperty(value = "number", required = true)
	private Long number;

	@JsonProperty("description")
	@Size(max = ValidationConstraints.MAX_LAUNCH_DESCRIPTION_LENGTH)
	private String description;

	@NotNull
	@JsonProperty(value = "startTime", required = true)
	private Date startTime;

	@JsonProperty("endTime")
	private Date endTime;

	@NotNull
	@JsonProperty(value = "status", required = true)
	private String status;

	@JsonProperty("statistics")
	@Valid
	private StatisticsResource statisticsResource;

	@JsonProperty("tags")
	private Set<ItemAttributeResource> tags;

	@JsonProperty("mode")
	private Mode mode;

	@JsonProperty("isProcessing")
	private boolean isProcessing;

	@JsonProperty("approximateDuration")
	private double approximateDuration;

	@JsonProperty("hasRetries")
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

	public StatisticsResource getStatisticsResource() {
		return statisticsResource;
	}

	public void setStatisticsResource(StatisticsResource statisticsResource) {
		this.statisticsResource = statisticsResource;
	}

	public Set<ItemAttributeResource> getTags() {
		return tags;
	}

	public void setTags(Set<ItemAttributeResource> tags) {
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

	public boolean getHasRetries() {
		return hasRetries;
	}

	public void setHasRetries(boolean hasRetries) {
		this.hasRetries = hasRetries;
	}

	@Override
	public String toString() {
		return "LaunchResource{" + "launchId='" + launchId + '\'' + ", name='" + name + '\'' + ", number=" + number + ", description='"
				+ description + '\'' + ", startTime=" + startTime + ", endTime=" + endTime + ", status='" + status + '\'' + ", statisticsResource="
				+ statisticsResource + ", tags=" + tags + ", mode=" + mode + ", isProcessing=" + isProcessing + ", approximateDuration="
				+ approximateDuration + ", hasRetries=" + hasRetries + '}';
	}
}

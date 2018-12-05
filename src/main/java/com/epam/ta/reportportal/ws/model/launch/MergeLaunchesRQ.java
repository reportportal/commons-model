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

import com.epam.ta.reportportal.ws.annotations.ElementLength;
import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.epam.ta.reportportal.ws.model.ItemAttributeResource;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MAX_NAME_LENGTH;

@JsonInclude(Include.NON_NULL)
public class MergeLaunchesRQ {

	@NotNull
	@JsonProperty(value = "launches", required = true)
	@ApiModelProperty(required = true)
	private Set<Long> launches;

	@NotNull
	@NotEmpty
	@Size(min = ValidationConstraints.MIN_LAUNCH_NAME_LENGTH, max = ValidationConstraints.MAX_NAME_LENGTH)
	@JsonProperty(value = "name", required = true)
	@ApiModelProperty(required = true)
	private String name;

	@JsonProperty("mode")
	private Mode mode;

	@JsonProperty(value = "startTime")
	@ApiModelProperty
	private Date startTime;

	@JsonProperty(value = "endTime")
	@ApiModelProperty
	private Date endTime;

	@NotNull
	@JsonProperty("mergeType")
	@ApiModelProperty(allowableValues = "BASIC, DEEP")
	private String mergeStrategyType;

	@ElementLength(max = MAX_NAME_LENGTH)
	@JsonProperty("attributes")
	private Set<ItemAttributeResource> attributes;

	@JsonProperty(value = "extendSuitesDescription", required = true)
	private boolean extendSuitesDescription;

	@JsonProperty(value = "description")
	private String description;

	@NotNull
	public Set<Long> getLaunches() {
		return launches;
	}

	public void setLaunches(@NotNull Set<Long> launches) {
		this.launches = launches;
	}

	@NotNull
	public String getName() {
		return name;
	}

	public void setName(@NotNull String name) {
		this.name = name;
	}

	public Mode getMode() {
		return mode;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
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

	@NotNull
	public String getMergeStrategyType() {
		return mergeStrategyType;
	}

	public void setMergeStrategyType(@NotNull String mergeStrategyType) {
		this.mergeStrategyType = mergeStrategyType;
	}

	public Set<ItemAttributeResource> getAttributes() {
		return attributes;
	}

	public void setAttributes(Set<ItemAttributeResource> attributes) {
		this.attributes = attributes;
	}

	public boolean isExtendSuitesDescription() {
		return extendSuitesDescription;
	}

	public void setExtendSuitesDescription(boolean extendSuitesDescription) {
		this.extendSuitesDescription = extendSuitesDescription;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MergeLaunchesRQ that = (MergeLaunchesRQ) o;
		return extendSuitesDescription == that.extendSuitesDescription && Objects.equals(launches, that.launches) && Objects.equals(name,
				that.name
		) && mode == that.mode && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime) && Objects.equals(mergeStrategyType,
				that.mergeStrategyType
		) && Objects.equals(attributes, that.attributes) && Objects.equals(
				description,
				that.description
		);
	}

	@Override
	public int hashCode() {
		return Objects.hash(launches, name, mode, startTime, endTime, mergeStrategyType, attributes, extendSuitesDescription, description);
	}

	@Override
	public String toString() {
		return "MergeLaunchesRQ{" + "launches=" + launches + ", name='" + name + '\'' + ", mode=" + mode + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", mergeStrategyType='" + mergeStrategyType + '\'' + ", attributes=" + attributes
				+ ", extendSuitesDescription=" + extendSuitesDescription + ", description='" + description + '\'' + '}';
	}
}
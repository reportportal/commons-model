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

import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

@JsonInclude(Include.NON_NULL)
public class MergeLaunchesRQ {

	@NotNull
	@JsonProperty(value = "launches", required = true)
	@ApiModelProperty(required = true)
	private Set<String> launches;

	@Size(min = ValidationConstraints.MIN_LAUNCH_NAME_LENGTH, max = ValidationConstraints.MAX_NAME_LENGTH)
	@JsonProperty(value = "name")
	@ApiModelProperty
	private String name;

	@JsonProperty("mode")
	private Mode mode;

	@JsonProperty(value = "start_time")
	@ApiModelProperty
	private Date startTime;

	@JsonProperty(value = "end_time")
	@ApiModelProperty
	private Date endTime;

	@NotNull
	@JsonProperty("merge_type")
	@ApiModelProperty(allowableValues = "BASIC, DEEP")
	private String mergeStrategyType;

	@JsonProperty(value = "extendSuitesDescription", required = true)
	private boolean extendSuitesDescription;

	@JsonProperty(value = "description")
	private String description;

	@JsonProperty("tags")
	private Set<String> tags;

	public Mode getMode() {
		return mode;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<String> getTags() {
		return tags;
	}

	public void setTags(Set<String> tags) {
		this.tags = tags;
	}

	public boolean isExtendSuitesDescription() {
		return extendSuitesDescription;
	}

	public void setExtendSuitesDescription(boolean extendSuitesDescription) {
		this.extendSuitesDescription = extendSuitesDescription;
	}

	public void setLaunches(Set<String> values) {
		this.launches = values;
	}

	public Set<String> getLaunches() {
		return launches;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getMergeStrategyType() {
		return mergeStrategyType;
	}

	public void setMergeStrategyType(String mergeStrategyType) {
		this.mergeStrategyType = mergeStrategyType;
	}

	@Override
	public String toString() {
		return "MergeLaunchesRQ{" + "launches=" + launches + ", name='" + name + '\'' + ", mode=" + mode + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", mergeStrategyType='" + mergeStrategyType + '\'' + ", extendSuitesDescription="
				+ extendSuitesDescription + ", description='" + description + '\'' + ", tags=" + tags + '}';
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

		if (extendSuitesDescription != that.extendSuitesDescription) {
			return false;
		}
		if (launches != null ? !launches.equals(that.launches) : that.launches != null) {
			return false;
		}
		if (name != null ? !name.equals(that.name) : that.name != null) {
			return false;
		}
		if (mode != that.mode) {
			return false;
		}
		if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) {
			return false;
		}
		if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) {
			return false;
		}
		if (mergeStrategyType != null ? !mergeStrategyType.equals(that.mergeStrategyType) : that.mergeStrategyType != null) {
			return false;
		}
		if (description != null ? !description.equals(that.description) : that.description != null) {
			return false;
		}
		return tags != null ? tags.equals(that.tags) : that.tags == null;
	}

	@Override
	public int hashCode() {
		int result = launches != null ? launches.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (mode != null ? mode.hashCode() : 0);
		result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
		result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
		result = 31 * result + (mergeStrategyType != null ? mergeStrategyType.hashCode() : 0);
		result = 31 * result + (extendSuitesDescription ? 1 : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (tags != null ? tags.hashCode() : 0);
		return result;
	}
}
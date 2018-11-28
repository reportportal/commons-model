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

import com.epam.ta.reportportal.ws.annotations.ElementLength;
import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MAX_NAME_LENGTH;

/**
 * Base entity for start requests
 *
 * @author Andrei Varabyeu
 */
@JsonInclude(Include.NON_NULL)
public class StartRQ {

	@NotNull
	@NotEmpty
	@Size(min = ValidationConstraints.MIN_LAUNCH_NAME_LENGTH, max = ValidationConstraints.MAX_NAME_LENGTH)
	@JsonProperty(value = "name", required = true)
	@ApiModelProperty(required = true)
	private String name;

	@JsonProperty(value = "description")
	private String description;

	@ElementLength(max = MAX_NAME_LENGTH)
	@JsonProperty("attributes")
	private Set<ItemAttributeResource> attributes;

	@NotNull
	@JsonProperty(value = "startTime", required = true)
	@ApiModelProperty(required = true)
	private Date startTime;

	@JsonProperty(value = "uuid")
	private String uuid;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<ItemAttributeResource> getAttributes() {
		return attributes;
	}

	public void setAttributes(Set<ItemAttributeResource> attributes) {
		this.attributes = attributes;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("StartRQ{");
		sb.append("name='").append(name).append('\'');
		sb.append(", description='").append(description).append('\'');
		sb.append(", attributes=").append(attributes);
		sb.append(", startTime=").append(startTime);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		StartRQ startRQ = (StartRQ) o;

		if (name != null ? !name.equals(startRQ.name) : startRQ.name != null) {
			return false;
		}
		if (description != null ? !description.equals(startRQ.description) : startRQ.description != null) {
			return false;
		}
		if (attributes != null ? !attributes.equals(startRQ.attributes) : startRQ.attributes != null) {
			return false;
		}
		return startTime != null ? startTime.equals(startRQ.startTime) : startRQ.startTime == null;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (attributes != null ? attributes.hashCode() : 0);
		result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
		return result;
	}
}
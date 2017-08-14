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
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

/**
 * Finishes some entity execution in Report Portal<br>
 * May be Launch, TestSuite, Test, TestStep
 * 
 * @author Andrei Varabyeu
 * 
 */
@JsonInclude(Include.NON_NULL)
public class FinishExecutionRQ {
	
	@NotNull
	@JsonProperty(value = "end_time", required = true)
	@ApiModelProperty(required = true)
	private Date endTime;

	@JsonProperty(value = "status")
	@ApiModelProperty(allowableValues = "PASSED, FAILED, STOPPED, SKIPPED, RESETED, CANCELLED")
	private String status;

	@JsonProperty(value = "description")
	private String description;

	@JsonProperty
	private Set<String> tags;

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
		sb.append(", tags").append(tags).append("\'");
		sb.append(", status='").append(status).append('\'');
		sb.append('}');
		return sb.toString();
	}

}
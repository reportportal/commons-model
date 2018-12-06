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

package com.epam.ta.reportportal.ws.model.project;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Create project request initial model
 *
 * @author Hanna_Sukhadolava
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class CreateProjectRQ {

	@NotNull
	@NotEmpty
	@JsonProperty(value = "projectName", required = true)
	@Pattern(regexp = "[a-zA-Z0-9-_]+")
	@Size(min = ValidationConstraints.MIN_NAME_LENGTH, max = ValidationConstraints.MAX_NAME_LENGTH)
	@ApiModelProperty(required = true)
	private String projectName;

	@NotNull
	@NotEmpty
	@JsonProperty(value = "entryType", required = true)
	@ApiModelProperty(required = true, allowableValues = "INTERNAL")
	private String entryType;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getEntryType() {
		return entryType;
	}

	public void setEntryType(String value) {
		this.entryType = value;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("CreateProjectRQ{");
		sb.append("projectName='").append(projectName).append('\'');
		sb.append(", entryType='").append(entryType).append('\'');
		sb.append('}');
		return sb.toString();
	}
}

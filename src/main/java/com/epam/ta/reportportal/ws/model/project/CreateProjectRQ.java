/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/epam/ReportPortal
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

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import io.swagger.annotations.ApiModelProperty;

import static com.google.common.base.MoreObjects.toStringHelper;

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
	@ApiModelProperty(required = true, allowableValues = "INTERNAL, UPSA")
	private String entryType;

	@JsonProperty(value = "customer")
	@Size(max = ValidationConstraints.MAX_CUSTOMER_LENGTH)
	private String customer;

	@JsonProperty(value = "addInfo")
	private String addInfo;

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

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getAddInfo() {
		return addInfo;
	}

	public void setAddInfo(String addInfo) {
		this.addInfo = addInfo;
	}

	@Override
	public String toString() {
		return toStringHelper(this)
				.add("projectName", projectName)
				.add("entryType", entryType)
				.add("customer", customer)
				.add("addInfo", addInfo)
				.toString();
	}
}

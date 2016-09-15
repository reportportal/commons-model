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

import java.util.Map;

import javax.validation.constraints.Size;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Update project request model
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class UpdateProjectRQ {

	@JsonProperty(value = "addInfo")
	private String addInfo;

	@NotEmpty
	@JsonProperty(value = "customer")
	@Size(max = ValidationConstraints.MAX_CUSTOMER_LENGTH)
	private String customer;

	@JsonProperty(value = "users")
	private Map<String, String> userRoles;

	@JsonProperty(value = "configuration")
	private ProjectConfiguration configuration;

	/**
	 * @return the addInfo
	 */
	public String getAddInfo() {
		return addInfo;
	}

	/**
	 * @param addInfo
	 *            the addInfo to set
	 */
	public void setAddInfo(String addInfo) {
		this.addInfo = addInfo;
	}

	/**
	 * @return the customer
	 */
	public String getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	/**
	 * @return the userRoles
	 */
	public Map<String, String> getUserRoles() {
		return userRoles;
	}

	/**
	 * @param userRoles
	 *            the userRoles to set
	 */
	public void setUserRoles(Map<String, String> userRoles) {
		this.userRoles = userRoles;
	}

	public void setConfiguration(ProjectConfiguration value) {
		this.configuration = value;
	}

	public ProjectConfiguration getConfiguration() {
		return configuration;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("UpdateProjectRQ{");
		sb.append("addInfo='").append(addInfo).append('\'');
		sb.append(", customer='").append(customer).append('\'');
		sb.append(", userRoles=").append(userRoles);
		sb.append(", configuration=").append(configuration);
		sb.append('}');
		return sb.toString();
	}
}
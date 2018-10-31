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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Update project request model
 *
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class UpdateProjectRQ {

	@JsonProperty(value = "users")
	private Map<String, String> userRoles;

	@JsonProperty(value = "configuration")
	private ProjectConfiguration configuration;

	/**
	 * @return the userRoles
	 */
	public Map<String, String> getUserRoles() {
		return userRoles;
	}

	/**
	 * @param userRoles the userRoles to set
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
		sb.append(", userRoles=").append(userRoles);
		sb.append(", configuration=").append(configuration);
		sb.append('}');
		return sb.toString();
	}
}
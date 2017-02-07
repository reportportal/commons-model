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
 
package com.epam.ta.reportportal.ws.model.preference;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JSON representation of report portal domain object
 * 
 * @author Dzmitry_Kavalets
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PreferenceResource {

	@JsonProperty(value = "userRef")
	private String userRef;

	@JsonProperty(value = "projectRef", required = true)
	private String projectRef;

	@JsonProperty(value = "active")
	private String active;

	@JsonProperty(value = "filters")
	private List<String> filters;

	public String getUserRef() {
		return userRef;
	}

	public void setUserRef(String userRef) {
		this.userRef = userRef;
	}

	public String getProjectRef() {
		return projectRef;
	}

	public void setProjectRef(String projectRef) {
		this.projectRef = projectRef;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public List<String> getFilters() {
		return filters;
	}

	public void setFilters(List<String> filters) {
		this.filters = filters;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("PreferenceResource{");
		sb.append("userRef='").append(userRef).append('\'');
		sb.append(", projectRef='").append(projectRef).append('\'');
		sb.append(", active='").append(active).append('\'');
		sb.append(", filters=").append(filters);
		sb.append('}');
		return sb.toString();
	}
}

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

import com.epam.ta.reportportal.ws.model.filter.UserFilterResource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * JSON representation of report portal domain object
 *
 * @author Dzmitry_Kavalets
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PreferenceResource {

	@JsonProperty(value = "user_id")
	private Long userId;

	@JsonProperty(value = "project_id", required = true)
	private Long projectId;

	@JsonProperty(value = "filters")
	private List<UserFilterResource> filters;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public List<UserFilterResource> getFilters() {
		return filters;
	}

	public void setFilters(List<UserFilterResource> filters) {
		this.filters = filters;
	}

	@Override
	public String toString() {
		return "PreferenceResource{" + "userId=" + userId + ", projectId=" + projectId + ", filters=" + filters + '}';
	}
}

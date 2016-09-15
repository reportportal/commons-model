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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Basic representation of launches information per user for specified project<br>
 * Current view is:<br>
 * String:user_id : {String:fullname, Integer:launchesCount}<br>
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LaunchesPerUser {
	@JsonProperty(value = "fullName")
	private String fullUsername;

	@JsonProperty(value = "count")
	private Integer launchCount;

	public LaunchesPerUser() {
	}

	public LaunchesPerUser(String fullname, Integer count) {
		this.fullUsername = fullname;
		this.launchCount = count;
	}

	public void setFullUsername(String value) {
		this.fullUsername = value;
	}

	public String getFullUsername() {
		return fullUsername;
	}

	public void setLaunchCount(Integer value) {
		this.launchCount = value;
	}

	public Integer getLaunchCount() {
		return launchCount;
	}
}
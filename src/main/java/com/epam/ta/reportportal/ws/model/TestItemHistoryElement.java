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

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TestItemHistoryElement {

	@JsonProperty(value = "launchNumber")
	private String launchNumber;

	@JsonProperty(value = "startTime")
	private String startTime;

	@JsonProperty(value = "launchId")
	private String launchId;

	@JsonProperty(value = "resources")
	private List<TestItemResource> resources;

	@JsonProperty(value = "launchStatus")
	public String launchStatus;

	public String getLaunchStatus() {
		return launchStatus;
	}

	public void setLaunchStatus(String launchStatus) {
		this.launchStatus = launchStatus;
	}

	public String getLaunchNumber() {
		return launchNumber;
	}

	public void setLaunchNumber(String launchNumber) {
		this.launchNumber = launchNumber;
	}

	public List<TestItemResource> getResources() {
		return resources;
	}

	public void setResources(List<TestItemResource> resources) {
		this.resources = resources;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getLaunchId() {
		return launchId;
	}

	public void setLaunchId(String launchId) {
		this.launchId = launchId;
	}

	@Override
	public String toString() {
		return "TestItemHistoryElement{" + "launchNumber='" + launchNumber + '\'' + ", startTime='" + startTime + '\'' + ", launchId='"
				+ launchId + '\'' + ", resources=" + resources + ", launchStatus='" + launchStatus + '\'' + '}';
	}
}
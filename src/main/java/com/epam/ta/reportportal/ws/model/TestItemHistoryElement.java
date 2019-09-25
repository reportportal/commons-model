/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 

package com.epam.ta.reportportal.ws.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(Include.NON_NULL)
public class TestItemHistoryElement {

	@JsonProperty(value = "launchNumber")
	private String launchNumber;

	@JsonProperty(value = "startTime")
	private String startTime;

	@JsonProperty(value = "launchId")
	private Long launchId;

	@JsonProperty(value = "resources")
	private List<TestItemHistoryResource> resources;

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

	public List<TestItemHistoryResource> getResources() {
		return resources;
	}

	public void setResources(List<TestItemHistoryResource> resources) {
		this.resources = resources;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Long getLaunchId() {
		return launchId;
	}

	public void setLaunchId(Long launchId) {
		this.launchId = launchId;
	}

	@Override
	public String toString() {
		return "TestItemHistoryElement{" + "launchNumber='" + launchNumber + '\'' + ", startTime='" + startTime + '\'' + ", launchId='"
				+ launchId + '\'' + ", resources=" + resources + ", launchStatus='" + launchStatus + '\'' + '}';
	}
}
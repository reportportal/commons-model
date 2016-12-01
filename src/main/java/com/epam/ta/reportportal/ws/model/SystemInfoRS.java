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

/**
 * System information response
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class SystemInfoRS {

	@JsonProperty("os")
	private String osVersion;

	@JsonProperty("cpuUsage")
	private float cpuUsage;

	@JsonProperty("memUsage")
	private float memUsage;

	public void setOsVersion(String value) {
		this.osVersion = value;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setCpuUsage(float value) {
		this.cpuUsage = value;
	}

	public float getCpuUsage() {
		return cpuUsage;
	}

	public void setMemUsage(float value) {
		this.memUsage = value;
	}

	public float getMemUsage() {
		return memUsage;
	}
}
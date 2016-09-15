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

package com.epam.ta.reportportal.ws.model.widget;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Basic representation for chart object with info for UI
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class ChartObject {

	@JsonProperty(value = "values")
	private Map<String, String> values;

	@JsonProperty(value = "name")
	private String name;

	@JsonProperty(value = "startTime")
	private String startTime;

	@JsonProperty(value = "number")
	private String number;

	@JsonProperty(value = "id")
	private String id;

	public ChartObject() {
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setValues(Map<String, String> values) {
		this.values = values;
	}

	public Map<String, String> getValues() {
		return values;
	}

	public void setName(String value) {
		this.name = value;
	}

	public String getName() {
		return name;
	}

	public void setStartTime(String value) {
		this.startTime = value;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setNumber(String value) {
		this.number = value;
	}

	public String getNumber() {
		return number;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ChartObject{");
		sb.append("values='").append(values).append('\'');
		sb.append(", name='").append(name).append('\'');
		sb.append(", startTime='").append(startTime).append('\'');
		sb.append(", number='").append(number).append('\'');
		sb.append(", id='").append(id).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
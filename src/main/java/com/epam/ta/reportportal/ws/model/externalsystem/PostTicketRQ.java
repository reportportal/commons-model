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

package com.epam.ta.reportportal.ws.model.externalsystem;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain object for creating ticket in bug tracking system.
 * 
 * @author Aliaksei_Makayed
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class PostTicketRQ extends Authentic {

	@JsonProperty(value = "fields", required = true)
	private List<PostFormField> fields;

	@JsonProperty(value = "include_logs")
	private boolean isIncludeLogs;

	@JsonProperty(value = "include_data")
	private boolean isIncludeScreenshots;

	@JsonProperty(value = "include_comments")
	private boolean isIncludeComments;

	@Min(value = ValidationConstraints.TICKET_MIN_LOG_SIZE)
	@Max(value = ValidationConstraints.TICKET_MAX_LOG_SIZE)
	@JsonProperty(value = "log_quantity")
	private int numberOfLogs;

	@JsonProperty(value = "item", required = true)
	private String testItemId;

	@JsonProperty(value = "backLinks", required = true)
	private Map<String, String> backLinks;

	public Map<String, String> getBackLinks() {
		return backLinks;
	}

	public void setBackLinks(Map<String, String> backLinks) {
		this.backLinks = backLinks;
	}

	public void setFields(List<PostFormField> data) {
		this.fields = data;
	}

	public List<PostFormField> getFields() {
		return fields;
	}

	public boolean getIsIncludeLogs() {
		return isIncludeLogs;
	}

	public void setIsIncludeLogs(boolean isIncludeLogs) {
		this.isIncludeLogs = isIncludeLogs;
	}

	public boolean getIsIncludeScreenshots() {
		return isIncludeScreenshots;
	}

	public void setIsIncludeScreenshots(boolean isIncludeScreenshots) {
		this.isIncludeScreenshots = isIncludeScreenshots;
	}

	public boolean getIsIncludeComments() {
		return isIncludeComments;
	}

	public void setIsIncludeComments(boolean value) {
		this.isIncludeComments = value;
	}

	public int getNumberOfLogs() {
		return numberOfLogs;
	}

	public void setNumberOfLogs(int numberOfLogs) {
		this.numberOfLogs = numberOfLogs;
	}

	public String getTestItemId() {
		return testItemId;
	}

	public void setTestItemId(String testItemId) {
		this.testItemId = testItemId;
	}

	@Override
	public String toString() {
		return "PostTicketRQ [fields=" + fields + ", isIncludeLogs=" + isIncludeLogs + ", isIncludeScreenshots=" + isIncludeScreenshots
				+ ", isIncludeComments=" + isIncludeComments + ", numberOfLogs=" + numberOfLogs + ", testItemId=" + testItemId
				+ ", backLinks=" + backLinks + "]";
	}
}
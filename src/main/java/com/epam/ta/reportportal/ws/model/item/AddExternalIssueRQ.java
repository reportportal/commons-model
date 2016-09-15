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

package com.epam.ta.reportportal.ws.model.item;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.epam.ta.reportportal.ws.model.issue.Issue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request model for add link to external system issue
 * 
 * @author Dzmitry_Kavalets
 * @author Andrei_Ramanchuk
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddExternalIssueRQ {

	@NotNull
	@JsonProperty(value = "systemId")
	private String externalSystemId;

	@NotNull
	@JsonProperty(value = "testItemIds")
	private List<String> testItemIds;

	@NotNull
	@JsonProperty(value = "issues")
	@ApiModelProperty(reference = "Issue.ExternalSystemIssue")
	private List<Issue.ExternalSystemIssue> issues;

	public void setExternalSystemId(String id) {
		this.externalSystemId = id;
	}

	public String getExternalSystemId() {
		return externalSystemId;
	}

	public void setTestItemIds(List<String> values) {
		this.testItemIds = values;
	}

	public List<String> getTestItemIds() {
		return testItemIds;
	}

	public void setIssues(List<Issue.ExternalSystemIssue> values) {
		this.issues = values;
	}

	public List<Issue.ExternalSystemIssue> getIssues() {
		return issues;
	}

	@Override
	public String toString() {
		return "AddExternalIssueRQ [externalSystemId=" + externalSystemId + ", testItemIds=" + testItemIds + ", issues=" + issues + "]";
	}
}
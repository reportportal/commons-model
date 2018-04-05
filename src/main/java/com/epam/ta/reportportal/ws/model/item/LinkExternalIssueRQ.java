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

package com.epam.ta.reportportal.ws.model.item;

import com.epam.ta.reportportal.ws.model.issue.Issue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Request model for add link to external system issue
 *
 * @author Dzmitry_Kavalets
 * @author Andrei_Ramanchuk
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LinkExternalIssueRQ {

	@NotNull
	@JsonProperty(value = "systemId")
	private Long externalSystemId;

	@NotNull
	@JsonProperty(value = "testItemIds")
	private List<Long> testItemIds;

	@NotNull
	@JsonProperty(value = "issues")
	@ApiModelProperty(reference = "Issue.ExternalSystemIssue")
	private List<Issue.ExternalSystemIssue> issues;

	public Long getExternalSystemId() {
		return externalSystemId;
	}

	public void setExternalSystemId(Long externalSystemId) {
		this.externalSystemId = externalSystemId;
	}

	public List<Long> getTestItemIds() {
		return testItemIds;
	}

	public void setTestItemIds(List<Long> testItemIds) {
		this.testItemIds = testItemIds;
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
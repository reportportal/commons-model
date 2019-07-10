/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.epam.ta.reportportal.ws.model.item;

import com.epam.ta.reportportal.ws.model.issue.Issue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * Request model for add link to external system issue
 *
 * @author Dzmitry_Kavalets
 * @author Andrei_Ramanchuk
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LinkExternalIssueRQ {

	@NotEmpty
	@JsonProperty(value = "testItemIds")
	private List<Long> testItemIds;

	@NotEmpty
	@Valid
	@JsonProperty(value = "issues")
	@ApiModelProperty(reference = "Issue.ExternalSystemIssue")
	private List<Issue.ExternalSystemIssue> issues;

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
		return "LinkExternalIssueRQ{" + "testItemIds=" + testItemIds + ", issues=" + issues + '}';
	}
}
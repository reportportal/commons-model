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

import com.epam.ta.reportportal.ws.model.issue.Issue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@JsonInclude(Include.NON_NULL)
public class FinishTestItemRQ extends FinishExecutionRQ {

	@Valid
	@JsonProperty(value = "issue")
	private Issue issue;

	@JsonProperty(value = "retry")
	private Boolean retry;

	@NotBlank
	@JsonProperty(value = "launchUuid", required = true)
	@ApiModelProperty(required = true)
	private String launchUuid;

	public Boolean isRetry() {
		return retry;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}

	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}

	public String getLaunchUuid() {
		return launchUuid;
	}

	public void setLaunchUuid(String launchUuid) {
		this.launchUuid = launchUuid;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("FinishTestItemRQ{");
		sb.append("issue=").append(issue);
		sb.append(", retry=").append(retry);
		sb.append(", launchUuid='").append(launchUuid).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
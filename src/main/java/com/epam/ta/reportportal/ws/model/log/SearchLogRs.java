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

package com.epam.ta.reportportal.ws.model.log;

import com.epam.ta.reportportal.ws.model.issue.Issue;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchLogRs {

	private Long launchId;

	private Long itemId;

	private String itemName;

	private String path;

	private double duration;

	private String status;

	private Issue issue;

	private List<String> logMessages;

	public Long getLaunchId() {
		return launchId;
	}

	public void setLaunchId(Long launchId) {
		this.launchId = launchId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}

	public List<String> getLogMessages() {
		return logMessages;
	}

	public void setLogMessages(List<String> logMessages) {
		this.logMessages = logMessages;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("SearchLogRs{");
		sb.append("launchId=").append(launchId);
		sb.append(", itemId=").append(itemId);
		sb.append(", itemName='").append(itemName).append('\'');
		sb.append(", path='").append(path).append('\'');
		sb.append(", duration=").append(duration);
		sb.append(", status='").append(status).append('\'');
		sb.append(", issue=").append(issue);
		sb.append(", logMessages=").append(logMessages);
		sb.append('}');
		return sb.toString();
	}
}

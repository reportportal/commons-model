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

package com.epam.ta.reportportal.ws.model.issue;

import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

/**
 * Test item issue
 *
 * @author Dzianis Shlychkou
 */
@JsonInclude(Include.NON_NULL)
public class Issue {

	@NotBlank
	@JsonProperty(value = "issueType", required = true)
	@JsonAlias({ "issueType", "issue_type" })
	private String issueType;

	@JsonProperty(value = "comment")
	@Size(max = ValidationConstraints.MAX_DESCRIPTION_LENGTH)
	private String comment;

	@JsonProperty(value = "autoAnalyzed")
	private boolean autoAnalyzed;

	@JsonProperty(value = "ignoreAnalyzer")
	private boolean ignoreAnalyzer;

	@JsonProperty(value = "externalSystemIssues")
	private Set<ExternalSystemIssue> externalSystemIssues;

	@JsonInclude(Include.NON_NULL)
	public static class ExternalSystemIssue {

		@NotNull
		@JsonProperty(value = "ticketId")
		private String ticketId;

		@JsonProperty(value = "submitDate")
		private Long submitDate;

		@NotNull
		@JsonProperty(value = "btsUrl")
		private String btsUrl;

		@NotNull
		@JsonProperty(value = "btsProject")
		private String btsProject;

		@NotNull
		@JsonProperty(value = "url")
		private String url;

		public void setTicketId(String ticketId) {
			this.ticketId = ticketId;
		}

		public String getTicketId() {
			return ticketId;
		}

		public Long getSubmitDate() {
			return submitDate;
		}

		public void setSubmitDate(Long submitDate) {
			this.submitDate = submitDate;
		}

		public String getBtsUrl() {
			return btsUrl;
		}

		public void setBtsUrl(String btsUrl) {
			this.btsUrl = btsUrl;
		}

		public String getBtsProject() {
			return btsProject;
		}

		public void setBtsProject(String btsProject) {
			this.btsProject = btsProject;
		}

		public void setUrl(String value) {
			this.url = value;
		}

		public String getUrl() {
			return url;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}

			ExternalSystemIssue that = (ExternalSystemIssue) o;

			if (ticketId != null ? !ticketId.equals(that.ticketId) : that.ticketId != null) {
				return false;
			}
			if (btsUrl != null ? !btsUrl.equals(that.btsUrl) : that.btsUrl != null) {
				return false;
			}
			if (btsProject != null ? !btsProject.equals(that.btsProject) : that.btsProject != null) {
				return false;
			}
			return url != null ? url.equals(that.url) : that.url == null;
		}

		@Override
		public int hashCode() {
			int result = ticketId != null ? ticketId.hashCode() : 0;
			result = 31 * result + (btsUrl != null ? btsUrl.hashCode() : 0);
			result = 31 * result + (btsProject != null ? btsProject.hashCode() : 0);
			result = 31 * result + (url != null ? url.hashCode() : 0);
			return result;
		}

		@Override
		public String toString() {
			return "ExternalSystemIssue{" + "ticketId='" + ticketId + '\'' + ", btsUrl='" + btsUrl + '\'' + ", btsProject='" + btsProject
					+ '\'' + ", url='" + url + '\'' + '}';
		}
	}

	public void setExternalSystemIssues(Set<ExternalSystemIssue> externalSystemIssues) {
		this.externalSystemIssues = externalSystemIssues;
	}

	public Set<ExternalSystemIssue> getExternalSystemIssues() {
		return externalSystemIssues;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean getAutoAnalyzed() {
		return autoAnalyzed;
	}

	public void setAutoAnalyzed(boolean autoAnalyzed) {
		this.autoAnalyzed = autoAnalyzed;
	}

	public boolean getIgnoreAnalyzer() {
		return ignoreAnalyzer;
	}

	public void setIgnoreAnalyzer(boolean ignoreAnalyzer) {
		this.ignoreAnalyzer = ignoreAnalyzer;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Issue{");
		sb.append("issueType='").append(issueType).append('\'');
		sb.append(", comment='").append(comment).append('\'');
		sb.append(", autoAnalyzed='").append(autoAnalyzed).append("\'");
		sb.append(", externalSystemIssues=").append(externalSystemIssues);
		sb.append('}');
		return sb.toString();
	}
}
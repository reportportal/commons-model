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

package com.epam.ta.reportportal.ws.model.issue;

import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

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

	@NotNull
	@JsonProperty(value = "issueType", required = true)
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

		@JsonProperty(value = "submitter")
		private Long submitter;

		@JsonProperty(value = "submitDate")
		private Long submitDate;

		@NotNull
		@JsonProperty(value = "systemId")
		private Long externalSystemId;

		@NotNull
		@JsonProperty(value = "url")
		private String url;

		public void setTicketId(String ticketId) {
			this.ticketId = ticketId;
		}

		public String getTicketId() {
			return ticketId;
		}

		public Long getExternalSystemId() {
			return externalSystemId;
		}

		public Long getSubmitter() {
			return submitter;
		}

		public void setSubmitter(Long submitter) {
			this.submitter = submitter;
		}

		public Long getSubmitDate() {
			return submitDate;
		}

		public void setSubmitDate(Long submitDate) {
			this.submitDate = submitDate;
		}

		public void setExternalSystemId(Long externalSystemId) {
			this.externalSystemId = externalSystemId;
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
			if (externalSystemId != null ? !externalSystemId.equals(that.externalSystemId) : that.externalSystemId != null) {
				return false;
			}
			return url != null ? url.equals(that.url) : that.url == null;
		}

		@Override
		public int hashCode() {
			int result = ticketId != null ? ticketId.hashCode() : 0;
			result = 31 * result + (externalSystemId != null ? externalSystemId.hashCode() : 0);
			result = 31 * result + (url != null ? url.hashCode() : 0);
			return result;
		}

		@Override
		public String toString() {
			return "ExternalSystemIssue{" + "ticketId='" + ticketId + '\'' + ", externalSystemId=" + externalSystemId + ", url='" + url
					+ '\'' + '}';
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
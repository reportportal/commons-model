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
 * 
 */
@JsonInclude(Include.NON_NULL)
public class Issue {

	@NotNull
	@JsonProperty(value = "issue_type", required = true)
	private String issueType;

	@JsonProperty(value = "comment")
	@Size(min = ValidationConstraints.MIN_DESCRIPTION_LENGTH, max = ValidationConstraints.MAX_DESCRIPTION_LENGTH)
	private String comment;

	@JsonProperty(value = "autoAnalyzed")
	private String autoAnalyzed;

	@JsonProperty(value = "externalSystemIssues")
	private Set<ExternalSystemIssue> externalSystemIssues;

	@JsonInclude(Include.NON_NULL)
	public static class ExternalSystemIssue {

		@JsonProperty(value = "ticketId")
		private String ticketId;

		@JsonProperty(value = "submitter")
		private String submitter;

		@JsonProperty(value = "submitDate")
		private Long submitDate;

		@JsonProperty(value = "systemId")
		private String externalSystemId;
		
		@JsonProperty(value = "url")
		private String url;

		public Long getSubmitDate() {
			return submitDate;
		}

		public void setSubmitDate(Long submitDate) {
			this.submitDate = submitDate;
		}

		public void setSubmitter(String submitter) {
			this.submitter = submitter;
		}

		public String getSubmitter() {
			return submitter;
		}

		public void setTicketId(String ticketId) {
			this.ticketId = ticketId;
		}

		public String getTicketId() {
			return ticketId;
		}

		public void setExternalSystemId(String id) {
			this.externalSystemId = id;
		}

		public String getExternalSystemId() {
			return externalSystemId;
		}
		
		public void setUrl(String value) {
			this.url = value;
		}
		
		public String getUrl() {
			return url;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (!(o instanceof ExternalSystemIssue))
				return false;

			ExternalSystemIssue that = (ExternalSystemIssue) o;

			if (!ticketId.equals(that.ticketId))
				return false;

			return true;
		}

		@Override
		public int hashCode() {
			return ticketId.hashCode();
		}

		@Override
		public String toString() {
			final StringBuilder sb = new StringBuilder("ExternalSystemIssue{");
			sb.append("ticketId='").append(ticketId).append('\'');
			sb.append(", submitter='").append(submitter).append('\'');
			sb.append(", submitDate=").append(submitDate).append('\'');
			sb.append(", externalSystemId=").append(externalSystemId).append('\'');
			sb.append(", url=").append(url);
			sb.append('}');
			return sb.toString();
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

	public String getAutoAnalyzed() {
		return autoAnalyzed;
	}

	public void setAutoAnalyzed(String autoAnalyzed) {
		this.autoAnalyzed = autoAnalyzed;
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
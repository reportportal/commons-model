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
 
package com.epam.ta.reportportal.ws.model.issue;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Test item issue with provided it
 * 
 * @author Dzianis Shlychkou
 * 
 */
@JsonInclude(Include.NON_NULL)
public class IssueDefinition {

	@NotNull
	@JsonProperty(value = "test_item_id", required = true)
	@ApiModelProperty(required = true)
	private String id;

	@NotNull
	@Valid
	@JsonProperty(value = "issue", required = true)
	private Issue issue;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("IssueDefinition{");
		sb.append("id='").append(id).append('\'');
		sb.append(", issue=").append(issue);
		sb.append('}');
		return sb.toString();
	}
}
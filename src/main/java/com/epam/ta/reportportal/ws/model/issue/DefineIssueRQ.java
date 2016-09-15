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

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request for test items issue types definition (defect block)
 * 
 * @author Dzianis Shlychkou
 * 
 */
@JsonInclude(Include.NON_NULL)
public class DefineIssueRQ {

	@NotNull
	@Valid
	@JsonProperty(value = "issues", required = true)
	private List<IssueDefinition> issues;

	public List<IssueDefinition> getIssues() {
		return issues;
	}

	public void setIssues(List<IssueDefinition> issues) {
		this.issues = issues;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("DefineIssueRQ{");
		sb.append("issues=").append(issues);
		sb.append('}');
		return sb.toString();
	}
}
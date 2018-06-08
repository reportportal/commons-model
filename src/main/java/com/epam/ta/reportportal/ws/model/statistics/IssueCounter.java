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

package com.epam.ta.reportportal.ws.model.statistics;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * IssueCounter model representation.<br>
 * Using for resources construction.
 *
 * @author Pavel Bortnik
 */
@JsonInclude(Include.NON_NULL)
public class IssueCounter {

	@JsonProperty(value = "issue_group")
	private String issueGroup;

	@JsonProperty(value = "defects")
	private Map<String, Integer> defects;

	@JsonProperty(value = "total")
	private Integer total;

	public String getIssueGroup() {
		return issueGroup;
	}

	public void setIssueGroup(String issueGroup) {
		this.issueGroup = issueGroup;
	}

	public Map<String, Integer> getDefects() {
		return defects;
	}

	public void setDefects(Map<String, Integer> defects) {
		this.defects = defects;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}
}
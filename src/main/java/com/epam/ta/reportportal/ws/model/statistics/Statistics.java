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

@JsonInclude(Include.NON_NULL)
public class Statistics {

	@JsonProperty(value = "executions")
	private Map<String, Integer> executions;

	@JsonProperty(value = "defects")
	private Map<String, Map<String, Integer>> defects;

	public Map<String, Integer> getExecutions() {
		return executions;
	}

	public void setExecutions(Map<String, Integer> executions) {
		this.executions = executions;
	}

	public Map<String, Map<String, Integer>> getDefects() {
		return defects;
	}

	public void setDefects(Map<String, Map<String, Integer>> defects) {
		this.defects = defects;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Statistics{");
		sb.append("executions=").append(executions);
		sb.append(", defects=").append(defects);
		sb.append('}');
		return sb.toString();
	}
}
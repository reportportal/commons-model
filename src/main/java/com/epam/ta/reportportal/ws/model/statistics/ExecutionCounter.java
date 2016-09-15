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
 
package com.epam.ta.reportportal.ws.model.statistics;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class ExecutionCounter {

	@NotNull
	@JsonProperty(value = "total", required = true)
	private String total;

	@JsonProperty(value = "passed")
	private String passed;

	@JsonProperty(value = "failed")
	private String failed;

	@JsonProperty(value = "skipped")
	private String skipped;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getPassed() {
		return passed;
	}

	public void setPassed(String passed) {
		this.passed = passed;
	}

	public String getFailed() {
		return failed;
	}

	public void setFailed(String failed) {
		this.failed = failed;
	}

	public String getSkipped() {
		return skipped;
	}

	public void setSkipped(String skipped) {
		this.skipped = skipped;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ExecutionCounter{");
		sb.append("total='").append(total).append('\'');
		sb.append(", passed='").append(passed).append('\'');
		sb.append(", failed='").append(failed).append('\'');
		sb.append(", skipped='").append(skipped).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
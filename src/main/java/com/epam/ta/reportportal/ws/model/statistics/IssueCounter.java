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

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueCounter model representation.<br>
 * Using for resources construction.
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class IssueCounter {

	@JsonProperty(value = "product_bug")
	private Map<String, Integer> productBug;

	@JsonProperty(value = "automation_bug")
	private Map<String, Integer> automationBug;

	@JsonProperty(value = "system_issue")
	private Map<String, Integer> systemIssue;

	@JsonProperty(value = "to_investigate")
	private Map<String, Integer> toInvestigate;

	@JsonProperty(value = "no_defect")
	private Map<String, Integer> noDefect;

	public Map<String, Integer> getProductBug() {
		return productBug;
	}

	public void setProductBug(Map<String, Integer> productBug) {
		this.productBug = productBug;
	}

	public Map<String, Integer> getAutomationBug() {
		return automationBug;
	}

	public void setAutomationBug(Map<String, Integer> automationBug) {
		this.automationBug = automationBug;
	}

	public Map<String, Integer> getSystemIssue() {
		return systemIssue;
	}

	public void setSystemIssue(Map<String, Integer> systemIssue) {
		this.systemIssue = systemIssue;
	}

	public Map<String, Integer> getToInvestigate() {
		return toInvestigate;
	}

	public void setToInvestigate(Map<String, Integer> toInvestigate) {
		this.toInvestigate = toInvestigate;
	}

	public Map<String, Integer> getNoDefect() {
		return noDefect;
	}

	public void setNoDefect(Map<String, Integer> value) {
		this.noDefect = value;
	}

	@Override
	public String toString() {
		return "IssueCounter [productBugs=" + productBug + ", automationBug=" + automationBug + ", systemIssue=" + systemIssue
				+ ", toInvestigate=" + toInvestigate + ", noDefect=" + noDefect + "]";
	}
}
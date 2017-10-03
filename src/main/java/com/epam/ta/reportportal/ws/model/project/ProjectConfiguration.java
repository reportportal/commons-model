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

package com.epam.ta.reportportal.ws.model.project;

import com.epam.ta.reportportal.ws.model.externalsystem.ExternalSystemResource;
import com.epam.ta.reportportal.ws.model.project.config.IssueSubTypeResource;
import com.epam.ta.reportportal.ws.model.project.email.ProjectEmailConfigDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

/**
 * Project configuration model
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class ProjectConfiguration {
	@JsonProperty(value = "externalSystem")
	private List<ExternalSystemResource> externalSystem;

	@NotNull
	@JsonProperty(value = "entryType")
	private String entry;

	@NotNull
	@JsonProperty(value = "statisticCalculationStrategy")
	@ApiModelProperty(allowableValues = "STEP_BASED, TEST_BASED")
	private String statisticCalculationStrategy;

	@NotNull
	@JsonProperty(value = "projectSpecific")
	private String projectSpecific;

	@JsonProperty(value = "interruptedJob")
	@ApiModelProperty(allowableValues = "ONE_HOUR, THREE_HOURS, SIX_HOURS, TWELVE_HOURS, ONE_DAY, ONE_WEEK")
	private String interruptJobTime;

	@JsonProperty(value = "keepLogs")
	@ApiModelProperty(allowableValues = "TWO_WEEKS, ONE_MONTH, THREE_MONTHS, SIX_MONTHS")
	private String keepLogs;

	@JsonProperty(value = "keepScreenshots")
	@ApiModelProperty(allowableValues = "ONE_WEEK, TWO_WEEKS, THREE_WEEKS, ONE_MONTH, THREE_MONTHS")
	private String keepScreenshots;

	@JsonProperty(value = "isAutoAnalyzerEnabled")
	private Boolean isAAEnabled;

	@JsonProperty(value = "analyzeOnTheFly")
	private Boolean analyzeOnTheFly;

	@JsonProperty(value = "emailConfiguration")
	private ProjectEmailConfigDTO emailConfig;

	@JsonProperty(value = "subTypes")
	private Map<String, List<IssueSubTypeResource>> subTypes;

	public void setExternalSystem(List<ExternalSystemResource> value) {
		this.externalSystem = value;
	}

	public List<ExternalSystemResource> getExternalSystem() {
		return externalSystem;
	}

	public void setEntry(String value) {
		this.entry = value;
	}

	public String getEntry() {
		return entry;
	}

	public void setStatisticCalculationStrategy(String value) {
		this.statisticCalculationStrategy = value;
	}

	public String getStatisticCalculationStrategy() {
		return statisticCalculationStrategy;
	}

	public void setProjectSpecific(String value) {
		this.projectSpecific = value;
	}

	public String getProjectSpecific() {
		return projectSpecific;
	}

	public void setInterruptJobTime(String value) {
		this.interruptJobTime = value;
	}

	public String getInterruptJobTime() {
		return interruptJobTime;
	}

	public void setKeepLogs(String value) {
		this.keepLogs = value;
	}

	public String getKeepLogs() {
		return keepLogs;
	}

	public void setKeepScreenshots(String value) {
		this.keepScreenshots = value;
	}

	public String getKeepScreenshots() {
		return keepScreenshots;
	}

	public void setIsAAEnabled(boolean value) {
		this.isAAEnabled = value;
	}

	public Boolean getIsAAEnabled() {
		return isAAEnabled;
	}

	public Boolean getAnalyzeOnTheFly() {
		return analyzeOnTheFly;
	}

	public void setAnalyzeOnTheFly(Boolean analyzeOnTheFly) {
		this.analyzeOnTheFly = analyzeOnTheFly;
	}

	public void setEmailConfig(ProjectEmailConfigDTO config) {
		this.emailConfig = config;
	}

	public ProjectEmailConfigDTO getEmailConfig() {
		return emailConfig;
	}

	public void setSubTypes(Map<String, List<IssueSubTypeResource>> types) {
		this.subTypes = types;
	}

	public Map<String, List<IssueSubTypeResource>> getSubTypes() {
		return subTypes;
	}
}

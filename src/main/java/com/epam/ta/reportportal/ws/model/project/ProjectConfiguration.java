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

	@JsonProperty(value = "attributes", required = true)
	private Map<String, String> projectAttributes;

	@JsonProperty(value = "emailConfiguration")
	private ProjectEmailConfigDTO emailConfig;

	@JsonProperty(value = "subTypes")
	private Map<String, List<IssueSubTypeResource>> subTypes;

	public List<ExternalSystemResource> getExternalSystem() {
		return externalSystem;
	}

	public void setExternalSystem(List<ExternalSystemResource> externalSystem) {
		this.externalSystem = externalSystem;
	}

	public Map<String, String> getProjectAttributes() {
		return projectAttributes;
	}

	public void setProjectAttributes(Map<String, String> projectAttributes) {
		this.projectAttributes = projectAttributes;
	}

	public ProjectEmailConfigDTO getEmailConfig() {
		return emailConfig;
	}

	public void setEmailConfig(ProjectEmailConfigDTO emailConfig) {
		this.emailConfig = emailConfig;
	}

	public Map<String, List<IssueSubTypeResource>> getSubTypes() {
		return subTypes;
	}

	public void setSubTypes(Map<String, List<IssueSubTypeResource>> subTypes) {
		this.subTypes = subTypes;
	}
}

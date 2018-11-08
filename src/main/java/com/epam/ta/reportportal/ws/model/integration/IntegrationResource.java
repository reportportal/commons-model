/*
 * Copyright 2018 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.epam.ta.reportportal.ws.model.integration;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * @author Pavel Bortnik
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IntegrationResource implements Serializable {

	@JsonProperty("id")
	private Long id;

	@JsonProperty("project_id")
	private Long projectId;

	@JsonProperty("integration_type")
	private IntegrationTypeResource integrationType;

	@JsonProperty("integration_parameters")
	private Map<String, Object> integrationParams;

	@JsonProperty("enabled")
	private Boolean enabled;

	@JsonProperty("creation_date")
	private Date creationDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public IntegrationTypeResource getIntegrationType() {
		return integrationType;
	}

	public void setIntegrationType(IntegrationTypeResource integrationType) {
		this.integrationType = integrationType;
	}

	public Map<String, Object> getIntegrationParams() {
		return integrationParams;
	}

	public void setIntegrationParams(Map<String, Object> integrationParams) {
		this.integrationParams = integrationParams;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
}

/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.ws.model.project.email;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

/**
 * Project notifications configuration object
 *
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class ProjectNotificationConfigDTO implements Serializable {
	/**
	 * Generated SVUID
	 */
	private static final long serialVersionUID = -961365872944240700L;

	@JsonProperty(value = "enabled")
	private boolean enabled;

	@Valid
	@JsonProperty(value = "cases")
	private List<SenderCaseDTO> senderCases;

	public ProjectNotificationConfigDTO() {
	}

	public ProjectNotificationConfigDTO(boolean enabled, List<SenderCaseDTO> senderCases) {
		this.enabled = enabled;
		this.senderCases = senderCases;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public List<SenderCaseDTO> getSenderCases() {
		return senderCases;
	}

	public void setSenderCases(List<SenderCaseDTO> senderCases) {
		this.senderCases = senderCases;
	}

	@Override
	public String toString() {
		return "ProjectNotificationConfigDTO{" + "enabled=" + enabled + ", senderCases=" + senderCases + '}';
	}
}
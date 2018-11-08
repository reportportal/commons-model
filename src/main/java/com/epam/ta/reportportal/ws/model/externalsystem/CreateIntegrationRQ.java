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

package com.epam.ta.reportportal.ws.model.externalsystem;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * Create request for ExternalSystem entity
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class CreateIntegrationRQ {

	@NotEmpty
//	@NotNull
	@JsonProperty(value = "url")
	@ApiModelProperty(required = true)
	private String url;

	@NotEmpty
	@NotNull
	@JsonProperty(value = "systemType")
	@ApiModelProperty(required = true, allowableValues = "JIRA, TFS, RALLY")
	private String externalSystemType;

	@NotEmpty
	@NotNull
	@JsonProperty(value = "systemAuth")
	@ApiModelProperty(required = true, allowableValues = "OAUTH, NTLM, APIKEY, BASIC")
	private String externalSystemAuth;

	@JsonProperty(value = "username")
	private String username;

	@JsonProperty(value = "password")
	private String password;

	@JsonProperty(value = "accessKey")
	private String accessKey;

	@JsonProperty(value = "project")
	private String project;

	public void setExternalSystemType(String type) {
		this.externalSystemType = type;
	}

	public String getExternalSystemType() {
		return externalSystemType;
	}

	public void setExternalSystemAuth(String type) {
		this.externalSystemAuth = type;
	}

	public String getExternalSystemAuth() {
		return externalSystemAuth;
	}

	public void setUrl(String value) {
		this.url = value;
	}

	public String getUrl() {
		return url;
	}

	public void setUsername(String name) {
		this.username = name;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String pass) {
		this.password = pass;
	}

	public String getPassword() {
		return password;
	}

	public void setAccessKey(String key) {
		this.accessKey = key;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setProject(String extProject) {
		this.project = extProject;
	}

	public String getProject() {
		return project;
	}
}
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

package com.epam.ta.reportportal.ws.model.externalsystem;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MAX_DOMAIN_SIZE;
import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MIN_DOMAIN_SIZE;

/**
 * Create request for ExternalSystem entity
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class CreateExternalSystemRQ {

	@NotEmpty
//	@NotNull
	@JsonProperty(value = "url")
	@ApiModelProperty(required = true)
	private String url;

	@NotEmpty
//	@NotNull
	@JsonProperty(value = "systemType")
	@ApiModelProperty(required = true, allowableValues = "JIRA, TFS, RALLY")
	private String externalSystemType;

	@NotEmpty
//	@NotNull
	@JsonProperty(value = "systemAuth")
	@ApiModelProperty(required = true, allowableValues = "OAUTH, NTLM, APIKEY, BASIC")
	private String externalSystemAuth;

	@JsonProperty(value = "username")
	private String username;

	@JsonProperty(value = "password")
	private String password;

	@NotEmpty
	@JsonProperty(value = "domain")
	@Size(min = MIN_DOMAIN_SIZE, max = MAX_DOMAIN_SIZE)
	private String domain;

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

	public void setDomain(String value) {
		this.domain = value;
	}

	public String getDomain() {
		return domain;
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
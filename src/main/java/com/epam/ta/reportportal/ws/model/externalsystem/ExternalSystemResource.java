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

import java.util.List;

import javax.validation.constraints.NotNull;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource model object of ExternalSystem entity
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class ExternalSystemResource {

	@NotNull
	@JsonProperty(value = "id", required = true)
	private String systemId;

	@NotEmpty
	@JsonProperty(value = "url", required = true)
	private String url;

	@NotEmpty
	@JsonProperty(value = "projectRef", required = true)
	private String projectRef;

	@NotEmpty
	@JsonProperty(value = "systemType", required = true)
	private String externalSystemType;

	@NotEmpty
	@JsonProperty(value = "systemAuth", required = true)
	private String externalSystemAuth;

	@JsonProperty(value = "username")
	private String username;

	@JsonProperty(value = "domain")
	private String domain;

	@JsonProperty(value = "accessKey")
	private String accessKey;

	@JsonProperty(value = "project")
	private String project;

	@JsonProperty(value = "fields")
	private List<PostFormField> fields;

	public String getSystemId() {
		return systemId;
	}

	public void setSystemId(String id) {
		this.systemId = id;
	}

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

	public void setProjectRef(String reference) {
		this.projectRef = reference;
	}

	public String getProjectRef() {
		return projectRef;
	}

	public void setUsername(String name) {
		this.username = name;
	}

	public String getUsername() {
		return username;
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

	public void setFields(List<PostFormField> form) {
		this.fields = form;
	}

	public List<PostFormField> getFields() {
		return fields;
	}
}

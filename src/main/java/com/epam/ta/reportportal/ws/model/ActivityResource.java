/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.ws.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * JSON Representation of Report Portal's Activity domain object.
 *
 * @see <a href="http://en.wikipedia.org/wiki/HATEOAS">HATEOAS Description</a>
 */
@JsonInclude(Include.NON_NULL)
public class ActivityResource {

	@NotNull
	@JsonProperty(value = "id", required = true)
	@Schema(required = true)
	private Long id;

	@NotNull
	@JsonProperty(value = "user", required = true)
	@Schema(required = true)
	private String user;

	@NotNull
	@JsonProperty(value = "loggedObjectId", required = true)
	@Schema(required = true)
	private Long loggedObjectId;

	@NotNull
	@JsonProperty(value = "lastModified", required = true)
	@Schema(required = true)
	private Date lastModified;

	@NotNull
	@JsonProperty(value = "actionType", required = true)
	@Schema(required = true)
	private String actionType;

	@NotNull
	@JsonProperty(value = "objectType", required = true)
	@Schema(required = true)
	private String objectType;

	@NotNull
	@JsonProperty(value = "projectId", required = true)
	@Schema(required = true)
	private Long projectId;

	@JsonProperty(value = "projectName")
	private String projectName;

	@JsonProperty(value = "details")
	private Object details;

	@JsonProperty(value = "objectName")
	private String objectName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Long getLoggedObjectId() {
		return loggedObjectId;
	}

	public void setLoggedObjectId(Long loggedObjectId) {
		this.loggedObjectId = loggedObjectId;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Object getDetails() {
		return details;
	}

	public void setDetails(Object details) {
		this.details = details;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	@Override
	public String toString() {
		return "ActivityResource{" + "id=" + id
				+ ", user='" + user + '\''
				+ ", loggedObjectId='" + loggedObjectId + '\''
				+ ", lastModified=" + lastModified
				+ ", actionType='" + actionType + '\''
				+ ", objectType='" + objectType + '\''
				+ ", projectId=" + projectId
				+ ", projectName='" + projectName + '\''
				+ ", objectName='" + objectName + '\''
				+ ", details=" + details
				+ '}';
	}
}

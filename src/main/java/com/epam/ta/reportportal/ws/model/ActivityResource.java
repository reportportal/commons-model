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

package com.epam.ta.reportportal.ws.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * JSON Representation of Report Portal's Activity domain object.
 *
 * @see <a href="http://en.wikipedia.org/wiki/HATEOAS">HATEOAS Description</a>
 */
@JsonInclude(Include.NON_NULL)
public class ActivityResource {

	@NotNull
	@JsonProperty(value = "id", required = true)
	@ApiModelProperty(required = true)
	private Long id;

	@NotNull
	@JsonProperty(value = "user", required = true)
	@ApiModelProperty(required = true)
	private String user;

	@NotNull
	@JsonProperty(value = "loggedObjectId", required = true)
	@ApiModelProperty(required = true)
	private Long loggedObjectId;

	@NotNull
	@JsonProperty(value = "lastModified", required = true)
	@ApiModelProperty(required = true)
	private Date lastModified;

	@NotNull
	@JsonProperty(value = "actionType", required = true)
	@ApiModelProperty(required = true)
	private String actionType;

	@NotNull
	@JsonProperty(value = "objectType", required = true)
	@ApiModelProperty(required = true)
	private String objectType;

	@NotNull
	@JsonProperty(value = "projectId", required = true)
	@ApiModelProperty(required = true)
	private Long projectId;

	@JsonProperty(value = "projectName")
	private String projectName;

	@JsonProperty(value = "details")
	private Object details;

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

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ActivityResource{");
		sb.append("id=").append(id);
		sb.append(", user='").append(user).append('\'');
		sb.append(", loggedObjectId='").append(loggedObjectId).append('\'');
		sb.append(", lastModified=").append(lastModified);
		sb.append(", actionType='").append(actionType).append('\'');
		sb.append(", objectType='").append(objectType).append('\'');
		sb.append(", projectId=").append(projectId);
		sb.append(", projectName='").append(projectName).append('\'');
		sb.append(", details=").append(details);
		sb.append('}');
		return sb.toString();
	}
}

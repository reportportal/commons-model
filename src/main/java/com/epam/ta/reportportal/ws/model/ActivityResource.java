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
	@JsonProperty(value = "loggedObjectRef", required = true)
	@ApiModelProperty(required = true)
	private String loggedObjectRef;

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

	public String getLoggedObjectRef() {
		return loggedObjectRef;
	}

	public void setLoggedObjectRef(String loggedObjectRef) {
		this.loggedObjectRef = loggedObjectRef;
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
		sb.append(", loggedObjectRef='").append(loggedObjectRef).append('\'');
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

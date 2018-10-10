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
	@JsonProperty(value = "activityId", required = true)
	@ApiModelProperty(required = true)
	private String activityId;

	@NotNull
	@JsonProperty(value = "userRef", required = true)
	@ApiModelProperty(required = true)
	private String userRef;

	@NotNull
	@JsonProperty(value = "loggedObjectRef", required = true)
	@ApiModelProperty(required = true)
	private String loggedObjectRef;

	@NotNull
	@JsonProperty(value = "lastModifiedDate", required = true)
	@ApiModelProperty(required = true)
	private Date lastModifiedDate;

	@NotNull
	@JsonProperty(value = "actionType", required = true)
	@ApiModelProperty(required = true)
	private String actionType;

	@NotNull
	@JsonProperty(value = "objectType", required = true)
	@ApiModelProperty(required = true)
	private String objectType;

	@NotNull
	@JsonProperty(value = "projectRef", required = true)
	@ApiModelProperty(required = true)
	private String projectRef;

	@JsonProperty(value = "details")
	private Object details;

    public String getProjectRef() {
		return projectRef;
	}

	public void setProjectRef(String projectRef) {
		this.projectRef = projectRef;
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

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getUserRef() {
		return userRef;
	}

	public void setUserRef(String userRef) {
		this.userRef = userRef;
	}

	public String getLoggedObjectRef() {
		return loggedObjectRef;
	}

	public void setLoggedObjectRef(String loggedObjectRef) {
		this.loggedObjectRef = loggedObjectRef;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
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
		sb.append("activityId='").append(activityId).append('\'');
		sb.append(", userRef='").append(userRef).append('\'');
		sb.append(", loggedObjectRef='").append(loggedObjectRef).append('\'');
		sb.append(", lastModifiedDate=").append(lastModifiedDate);
		sb.append(", actionType='").append(actionType).append('\'');
		sb.append(", objectType='").append(objectType).append('\'');
		sb.append(", projectRef='").append(projectRef).append('\'');
		sb.append(", details=").append(details);
		sb.append('}');
		return sb.toString();
	}
}

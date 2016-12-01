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

package com.epam.ta.reportportal.ws.model.user;

import java.util.Date;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.springframework.hateoas.ResourceSupport;

import com.epam.ta.reportportal.ws.model.ModelViews;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;

/**
 * User resource representation for responses
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class UserResource extends ResourceSupport {

	@NotNull
	@JsonProperty(value = "userId", required = true)
	private String userId;

	@JsonProperty(value = "email", required = true)
	private String email;

	@JsonProperty(value = "photoId")
	private String photoId;

	@JsonProperty(value = "full_name")
	private String fullName;

	@JsonProperty(value = "account_type")
	private String accountType;

	@JsonProperty(value = "userRole")
	private String userRole;

	@JsonProperty(value = "last_login")
	private Date lastLogin;

	@JsonProperty(value = "photo_loaded")
	private boolean isLoaded;

	@JsonProperty(value = "default_project", required = true)
	@JsonView(ModelViews.FullUserView.class)
	private String defaultProject;

	@JsonProperty(value = "assigned_projects")
	private Map<String, AssignedProject> assignedProjects;

	public void setUserId(String value) {
		this.userId = value;
	}

	public String getUserId() {
		return userId;
	}

	public void setEmail(String value) {
		this.email = value;
	}

	public String getEmail() {
		return email;
	}

	public void setPhotoId(String value) {
		this.photoId = value;
	}

	public String getPhotoId() {
		return photoId;
	}

	public void setFullName(String value) {
		this.fullName = value;
	}

	public String getFullName() {
		return fullName;
	}

	public void setAccountType(String value) {
		this.accountType = value;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String value) {
		this.userRole = value;
	}

	public void setLastlogin(Date value) {
		this.lastLogin = value;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setDefaultProject(String value) {
		this.defaultProject = value;
	}

	public String getDefaultProject() {
		return defaultProject;
	}

	public void setIsLoaded(boolean value) {
		this.isLoaded = value;
	}

	public boolean getIsLoaded() {
		return isLoaded;
	}

	public Map<String, AssignedProject> getAssignedProjects() {
		return assignedProjects;
	}

	public void setAssignedProjects(Map<String, AssignedProject> assignedProjects) {
		this.assignedProjects = assignedProjects;
	}

	public static class AssignedProject {

		private String projectRole;
		private String proposedRole;
		private String entryType;

		public String getEntryType() {
			return entryType;
		}

		public void setEntryType(String entryType) {
			this.entryType = entryType;
		}

		public void setProjectRole(String projectRole) {
			this.projectRole = projectRole;
		}

		public void setProposedRole(String proposedRole) {
			this.proposedRole = proposedRole;
		}

		public String getProjectRole() {
			return projectRole;
		}

		public String getProposedRole() {
			return proposedRole;
		}

		@Override
		public String toString() {
			final StringBuilder sb = new StringBuilder("AssignedProject{");
			sb.append("projectRole='").append(projectRole).append('\'');
			sb.append(", proposedRole='").append(proposedRole).append('\'');
			sb.append('}');
			return sb.toString();
		}
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("UserResource{");
		sb.append("userId='").append(userId).append('\'');
		sb.append(", email='").append(email).append('\'');
		sb.append(", photoId='").append(photoId).append('\'');
		sb.append(", fullName='").append(fullName).append('\'');
		sb.append(", accountType='").append(accountType).append('\'');
		sb.append(", userRole='").append(userRole).append('\'');
		sb.append(", lastLogin=").append(lastLogin);
		sb.append(", defaultProject='").append(defaultProject).append('\'');
		sb.append(", assignedProjects=").append(assignedProjects);
		sb.append('}');
		return sb.toString();
	}
}
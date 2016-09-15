/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/epam/ReportPortal
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

package com.epam.ta.reportportal.ws.model.project;

import java.util.Date;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.hateoas.ResourceSupport;

import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Project resource representation for responses
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class ProjectResource extends ResourceSupport {

	@NotNull
	@JsonProperty(value = "projectId", required = true)
	private String projectId;

	@NotNull
	@JsonProperty(value = "customer")
	@Size(max = ValidationConstraints.MAX_CUSTOMER_LENGTH)
	private String customer;

	@JsonProperty(value = "addInfo")
	private String addInfo;

	@NotNull
	@JsonProperty(value = "configuration", required = true)
	private ProjectConfiguration configuration;

	@JsonProperty(value = "users")
	private Map<String, ProjectUser> users;

	@NotNull
	@JsonProperty(value = "creationDate")
	private Date creationDate;

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public void setProjectId(String id) {
		this.projectId = id;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCustomer() {
		return customer;
	}

	public void setAddInfo(String additional) {
		this.addInfo = additional;
	}

	public String getAddInfo() {
		return addInfo;
	}

	public void setConfiguration(ProjectConfiguration configuration) {
		this.configuration = configuration;
	}

	public ProjectConfiguration getConfiguration() {
		return configuration;
	}

	public void setUsers(Map<String, ProjectUser> users) {
		this.users = users;
	}

	public Map<String, ProjectUser> getUsers() {
		return users;
	}

	public static class ProjectUser {
		@JsonProperty(value = "projectRole")
		private String projectRole;

		@JsonProperty(value = "proposedRole")
		private String proposedRole;

		public void setProjectRole(String value) {
			this.projectRole = value;
		}

		public String getProjectRole() {
			return projectRole;
		}

		public void setProposedRole(String value) {
			this.proposedRole = value;
		}

		public String getProposedRole() {
			return proposedRole;
		}

		@Override
		public String toString() {
			final StringBuilder sb = new StringBuilder("ProjectUser{");
			sb.append("projectRole='").append(projectRole).append('\'');
			sb.append(", proposedRole='").append(proposedRole).append('\'');
			sb.append('}');
			return sb.toString();
		}
	}
}
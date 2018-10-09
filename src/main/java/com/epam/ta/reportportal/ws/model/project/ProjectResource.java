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

package com.epam.ta.reportportal.ws.model.project;

import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Project resource representation for responses
 *
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class ProjectResource {

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
	private Map<String, String> projectAttributes;

	@JsonProperty(value = "users")
	private List<ProjectUser> users;

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

	public List<ProjectUser> getUsers() {
		return users;
	}

	public void setUsers(List<ProjectUser> users) {
		this.users = users;
	}

	public static class ProjectUser {

		@JsonProperty(value = "login")
		private String login;

		@JsonProperty(value = "projectRole")
		private String projectRole;

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public void setProjectRole(String value) {
			this.projectRole = value;
		}

		public String getProjectRole() {
			return projectRole;
		}

		@Override
		public String toString() {
			String sb = "ProjectUser{" + "projectRole='" + projectRole + '\'' + '}';
			return sb;
		}
	}
}

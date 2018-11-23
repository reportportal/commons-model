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

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * Request model for user creation (confirmation will be send on email)
 * 
 * @author Andrei_Ramanchuk
 *
 */
@JsonInclude(Include.NON_NULL)
public class CreateUserRQ {

	@NotNull
	@NotEmpty
	@JsonProperty(value = "email", required = true)
	@ApiModelProperty(required = true)
	private String email;

	@NotNull
	@NotEmpty
	@JsonProperty(value = "role", required = true)
	@ApiModelProperty(required = true)
	private String role;

	@NotNull
	@NotEmpty
	@JsonProperty(value = "defaultProject", required = true)
	@ApiModelProperty(required = true)
	private String defaultProject;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDefaultProject() {
		return defaultProject;
	}

	public void setDefaultProject(String value) {
		this.defaultProject = value;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("CreateUserRQ{");
		sb.append("email='").append(email).append('\'');
		sb.append(", role='").append(role).append('\'');
		sb.append(", defaultProject='").append(defaultProject).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
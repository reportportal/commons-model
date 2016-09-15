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

package com.epam.ta.reportportal.ws.model.user;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Confirmation resource of user creation with user-data
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class CreateUserRQConfirm {

	@NotNull
	@NotEmpty
	@Pattern(regexp = "[a-zA-Z0-9-_]+")
	@Size(min = ValidationConstraints.MIN_LOGIN_LENGTH, max = ValidationConstraints.MAX_LOGIN_LENGTH)
	@JsonProperty(value = "login", required = true)
	@ApiModelProperty(required = true)
	private String login;

	@NotNull
	@NotEmpty
	@Size(min = ValidationConstraints.MIN_PASSWORD_LENGTH, max = ValidationConstraints.MAX_PASSWORD_LENGTH)
	@JsonProperty(value = "password", required = true)
	@ApiModelProperty(required = true)
	private String password;

	@NotNull
	@NotEmpty
	@Pattern(regexp = "[\\pL0-9-_ \\.]+")
	@Size(min = ValidationConstraints.MIN_USER_NAME_LENGTH, max = ValidationConstraints.MAX_USER_NAME_LENGTH)
	@JsonProperty(value = "full_name", required = true)
	@ApiModelProperty(required = true)
	private String fullName;

	@NotNull
	@NotEmpty
	@JsonProperty(value = "email", required = true)
	@ApiModelProperty(required = true)
	private String email;

	// Field will be populated by handler cause be stored in bid
	private String defaultProject;

	public void setLogin(String value) {
		this.login = value;
	}

	public String getLogin() {
		return login;
	}

	public void setPassword(String value) {
		this.password = value;
	}

	public String getPassword() {
		return password;
	}

	public void setFullName(String value) {
		this.fullName = value;
	}

	public String getFullName() {
		return fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDefaultProject() {
		return defaultProject;
	}

	public void setDefaultProject(String value) {
		this.defaultProject = value;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("CreateUserRQConfirm{");
		sb.append("login='").append(login).append('\'');
		sb.append(", password='").append(password).append('\''); //NOSONAR
		sb.append(", fullName='").append(fullName).append('\'');
		sb.append(", email='").append(email).append('\'');
		sb.append(", defaultProject='").append(defaultProject).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
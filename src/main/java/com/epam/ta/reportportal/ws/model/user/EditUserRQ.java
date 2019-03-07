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
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Edit User request model
 *
 * @author Aliaksandr_Kazantsau
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class EditUserRQ {

	@NotEmpty
	@JsonProperty(value = "email")
	private String email;

	@JsonProperty(value = "role")
	private String role;

	@NotEmpty
	@Size(min = ValidationConstraints.MIN_USER_NAME_LENGTH, max = ValidationConstraints.MAX_USER_NAME_LENGTH)
	@Pattern(regexp = "[\\pL0-9-_ \\.]+")
	@JsonProperty(value = "fullName")
	private String fullName;

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

	public void setFullName(String value) {
		this.fullName = value;
	}

	public String getFullName() {
		return fullName;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("EditUserRQ{");
		sb.append("email='").append(email).append('\'');
		sb.append(", role='").append(role).append('\'');
		sb.append(", fullName='").append(fullName).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
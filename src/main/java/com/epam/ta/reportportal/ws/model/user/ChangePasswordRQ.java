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

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Dzmitry_Kavalets
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChangePasswordRQ {

	@NotNull
	@NotEmpty
	@Size(min = ValidationConstraints.MIN_PASSWORD_LENGTH, max = ValidationConstraints.MAX_PASSWORD_LENGTH)
	private String newPassword;

	@NotNull
	@NotEmpty
	@Size(min = ValidationConstraints.MIN_PASSWORD_LENGTH, max = ValidationConstraints.MAX_PASSWORD_LENGTH)
	private String oldPassword;

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		ChangePasswordRQ that = (ChangePasswordRQ) o;

		if (newPassword != null ? !newPassword.equals(that.newPassword) : that.newPassword != null)
			return false;
		return !(oldPassword != null ? !oldPassword.equals(that.oldPassword) : that.oldPassword != null);

	}

	@Override
	public int hashCode() {
		int result = newPassword != null ? newPassword.hashCode() : 0;
		result = 31 * result + (oldPassword != null ? oldPassword.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ChangePasswordRQ{");
		sb.append("newPassword='").append(newPassword).append('\''); //NOSONAR
		sb.append(", oldPassword='").append(oldPassword).append('\''); //NOSONAR
		sb.append('}');
		return sb.toString();
	}
}
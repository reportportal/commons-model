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

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Un-assign users request template
 * 
 * @author Andrei_Ramanchuk
 *
 */
@JsonInclude(Include.NON_NULL)
public class UnassignUsersRQ {
	@NotNull
	@Valid
	@JsonProperty(value = "userNames", required = true)
	@ApiModelProperty(required = true)
	private List<String> usernames;

	public void setUsernames(List<String> value) {
		this.usernames = value;
	}

	public List<String> getUsernames() {
		return usernames;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("UnassignUsersRQ{");
		sb.append("usernames=").append(usernames);
		sb.append('}');
		return sb.toString();
	}
}
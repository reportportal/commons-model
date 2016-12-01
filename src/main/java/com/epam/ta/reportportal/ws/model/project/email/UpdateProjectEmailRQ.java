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

package com.epam.ta.reportportal.ws.model.project.email;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Update project email configuration request model
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class UpdateProjectEmailRQ {

	@JsonProperty(value = "configuration")
	private ProjectEmailConfig configuration;

	public void setConfiguration(ProjectEmailConfig value) {
		this.configuration = value;
	}

	public ProjectEmailConfig getConfiguration() {
		return configuration;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("UpdateProjectEmailRQ{");
		sb.append("configuration=").append(configuration);
		sb.append('}');
		return sb.toString();
	}
}
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

package com.epam.ta.reportportal.ws.model.settings;

import javax.validation.constraints.NotNull;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Create server settings object with specified profile name
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class CreateServerSettingsRQ {

	@NotNull
	@NotEmpty
	@JsonProperty(value = "profile")
	@ApiModelProperty(required = true)
	private String profile;

	@JsonProperty(value = "active")
	private boolean active;

	@JsonProperty(value = "emailConfig")
	private ServerEmailConfig emailConfig;

	public void setProfile(String name) {
		this.profile = name;
	}

	public String getProfile() {
		return profile;
	}

	public void setActive(boolean is) {
		this.active = is;
	}

	public boolean getActive() {
		return active;
	}

	public void setServerEmailConfig(ServerEmailConfig config) {
		this.emailConfig = config;
	}

	public ServerEmailConfig getServerEmailConfig() {
		return emailConfig;
	}
}
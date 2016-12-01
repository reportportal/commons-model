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
 
package com.epam.ta.reportportal.ws.model.externalsystem;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Basic class for accessible data
 * //TODO: AV - refactor to support polymorphism
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class Authentic {
	
	@JsonProperty(value = "username")
	private String username;
	
	@JsonProperty(value = "password")
	private String password;

	@JsonProperty(value = "domain")
	private String domain;

	@JsonProperty(value = "token")
	private String token;

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String pass) {
		this.password = pass;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setToken(String value) {
		this.token = value;
	}
	
	public String getToken() {
		return token;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Authentic{");
		sb.append("username='").append(username).append('\'');
		sb.append(", password='").append(password).append('\''); //NOSONAR
		sb.append(", token='").append(token).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
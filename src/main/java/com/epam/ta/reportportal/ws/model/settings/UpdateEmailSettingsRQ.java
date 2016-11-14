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

package com.epam.ta.reportportal.ws.model.settings;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

/**
 * Update project EMail Configuration request model
 * 
 * Used for project settings update and for Report Portal Server configuration.
 * 
 * @author Andrei_Ramanchuk
 *
 */
@JsonInclude(Include.NON_NULL)
//[avarabyeu]TODO remove this. Change to ServerEmailConfig
public class UpdateEmailSettingsRQ {

	@NotNull
	@JsonProperty(value = "host")
	private String host;

	@JsonProperty(value = "port")
	private String port;

	@JsonProperty(value = "protocol")
	private String protocol;

	@JsonProperty(value = "authEnabled")
	private boolean authEnabled;

	@JsonProperty(value = "username")
	private String username;

	@JsonProperty(value = "password")
	private String password;

	@JsonProperty(value = "debug")
	private boolean debug;

	@JsonProperty
	private Boolean starTlsEnabled;

	@JsonProperty
	private Boolean sslEnabled;

	/* Setters and getters */
	public void setHost(String host) {
		this.host = host;
	}

	public String getHost() {
		return host;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getPort() {
		return port;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol.toLowerCase();
	}

	public String getProtocol() {
		return protocol;
	}

	public void setAuthEnabled(boolean enable) {
		this.authEnabled = enable;
	}

	public boolean getAuthEnabled() {
		return authEnabled;
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

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public boolean getDebug() {
		return debug;
	}

	public Boolean getStarTlsEnabled() {
		return starTlsEnabled;
	}

	public void setStarTlsEnabled(Boolean starTlsEnabled) {
		this.starTlsEnabled = starTlsEnabled;
	}

	public Boolean getSslEnabled() {
		return sslEnabled;
	}

	public void setSslEnabled(Boolean sslEnabled) {
		this.sslEnabled = sslEnabled;
	}

	/* Password field excluded from toString() method */

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("host", host).add("port", port).add("protocol", protocol)
				.add("authEnabled", authEnabled).add("username", username).add("debug", debug).add("starTlsEnabled", starTlsEnabled)
				.add("sslEnabled", sslEnabled).toString();
	}
}

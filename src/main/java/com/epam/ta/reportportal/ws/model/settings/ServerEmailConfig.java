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

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

/**
 * Configurable email setting for project object
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class ServerEmailConfig implements Serializable {
	/**
	 * Generated SVUID
	 */
	private static final long serialVersionUID = 2573744596368345366L;

	@NotNull
	@JsonProperty(value = "host")
	private String host;

	@JsonProperty(value = "port")
	private int port = 25;

	@JsonProperty(value = "protocol")
	private String protocol = "smtp";

	@JsonProperty(value = "authEnabled")
	private Boolean authEnabled = false;

	@JsonProperty
	private boolean starTlsEnabled;

	@JsonProperty
	private boolean sslEnabled;

	@JsonProperty(value = "username")
	private String username;

	@JsonProperty(value = "password")
	private String password;

	@JsonProperty(value = "debug")
	@JsonIgnore
	private boolean debug;

	public ServerEmailConfig() {
	}

	public ServerEmailConfig(String host, int port, String protocol, Boolean authEnabled, boolean starTlsEnabled, boolean sslEnabled,
			String username, String password, boolean debug) {
		this.host = host;
		this.port = port;
		this.protocol = protocol;
		this.authEnabled = authEnabled;
		this.starTlsEnabled = starTlsEnabled;
		this.sslEnabled = sslEnabled;
		this.username = username;
		this.password = password;
		this.debug = debug;
	}

	/* Setters and getters */
	public void setHost(String host) {
		this.host = host;
	}

	public String getHost() {
		return host;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getPort() {
		return port;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol.toLowerCase();
	}

	public String getProtocol() {
		return protocol;
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

	public void setAuthEnabled(Boolean authEnabled) {
		this.authEnabled = authEnabled;
	}

	public boolean isStarTlsEnabled() {
		return starTlsEnabled;
	}

	public void setStarTlsEnabled(boolean starTlsEnabled) {
		this.starTlsEnabled = starTlsEnabled;
	}

	public Boolean getAuthEnabled() {
		return authEnabled;
	}

	public boolean isDebug() {
		return debug;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public boolean isSslEnabled() {
		return sslEnabled;
	}

	public void setSslEnabled(boolean sslEnabled) {
		this.sslEnabled = sslEnabled;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("host", host).add("port", port).add("protocol", protocol)
				.add("authEnabled", authEnabled).add("starTlsEnabled", starTlsEnabled).add("sslEnabled", sslEnabled)
				.add("username", username).add("debug", debug).toString();
	}
}

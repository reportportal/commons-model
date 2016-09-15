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

package com.epam.ta.reportportal.ws.model.project.email;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Project email configuration object
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class ProjectEmailConfig implements Serializable {
	/**
	 * Generated SVUID
	 */
	private static final long serialVersionUID = -961365872944240700L;

	@JsonProperty(value = "emailEnabled")
	private Boolean emailEnabled;

	@JsonProperty(value = "fromAddress")
	private String from;

	@JsonProperty(value = "emailCases")
	private List<EmailSenderCase> emailCases;

	public ProjectEmailConfig() {
	}

	public ProjectEmailConfig(boolean isEnabled, String from, List<EmailSenderCase> cases) {
		this.emailEnabled = isEnabled;
		this.from = from;
		this.emailCases = cases;
	}

	/* Getters and setters block */
	public void setEmailEnabled(boolean is) {
		this.emailEnabled = is;
	}

	public Boolean getEmailEnabled() {
		return emailEnabled;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getFrom() {
		return from;
	}

	public void setEmailCases(List<EmailSenderCase> cases) {
		this.emailCases = cases;
	}

	public List<EmailSenderCase> getEmailCases() {
		return emailCases;
	}

	@Override
	public String toString() {
		return "ProjectEmailConfig [emailEnabled=" + emailEnabled + ", from=" + from + ", emailCases=" + emailCases + "]";
	}
}
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
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Cases object for email sending declarations
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class EmailSenderCaseDTO implements Serializable {
	/**
	 * Generated SVUID
	 */
	private static final long serialVersionUID = -3546546654348861010L;

	@JsonProperty(value = "recipients")
	private List<String> recipients;

	@JsonProperty(value = "sendCase")
	@ApiModelProperty(allowableValues = "ALWAYS, FAILED, MORE_10, MORE_20, MORE_50")
	private String sendCase;

	@JsonProperty(value = "launchNames")
	private List<String> launchNames;

	@JsonProperty(value = "tags")
	private List<String> tags;

	public EmailSenderCaseDTO() {
	}

	public EmailSenderCaseDTO(List<String> recs, String sendMode, List<String> laNames, List<String> laTags) {
		this.recipients = recs;
		this.sendCase = sendMode;
		this.launchNames = laNames;
		this.tags = laTags;
	}

	/* Getters and setters block */
	public void setRecipients(List<String> recipients) {
		this.recipients = recipients;
	}

	public List<String> getRecipients() {
		return recipients;
	}

	public void setSendCase(String value) {
		this.sendCase = value;
	}

	public String getSendCase() {
		return sendCase;
	}

	public void setLaunchNames(List<String> value) {
		this.launchNames = value;
	}

	public List<String> getLaunchNames() {
		return launchNames;
	}

	public void setTags(List<String> value) {
		this.tags = value;
	}

	public List<String> getTags() {
		return tags;
	}

	/* Auto generated methods */
	@Override
	public String toString() {
		return "EmailSenderCaseDTO [recipients=" + recipients + ", sendCase=" + sendCase + ", launchNames=" + launchNames + ", tags=" + tags
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((launchNames == null) ? 0 : launchNames.hashCode());
		result = prime * result + ((recipients == null) ? 0 : recipients.hashCode());
		result = prime * result + ((sendCase == null) ? 0 : sendCase.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmailSenderCaseDTO other = (EmailSenderCaseDTO) obj;
		if (launchNames == null) {
			if (other.launchNames != null)
				return false;
		} else if (!launchNames.equals(other.launchNames))
			return false;
		if (recipients == null) {
			if (other.recipients != null)
				return false;
		} else if (!recipients.equals(other.recipients))
			return false;
		if (sendCase == null) {
			if (other.sendCase != null)
				return false;
		} else if (!sendCase.equals(other.sendCase))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		return true;
	}
}
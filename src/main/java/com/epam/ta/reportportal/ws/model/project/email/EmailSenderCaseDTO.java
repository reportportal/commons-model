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

	@JsonProperty(value = "attributes")
	private List<String> attributes;

	public EmailSenderCaseDTO() {
	}

	public EmailSenderCaseDTO(List<String> recs, String sendMode, List<String> laNames, List<String> attributes) {
		this.recipients = recs;
		this.sendCase = sendMode;
		this.launchNames = laNames;
		this.attributes = attributes;
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

	public List<String> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<String> attributes) {
		this.attributes = attributes;
	}

	/* Auto generated methods */
	@Override
	public String toString() {
		return "EmailSenderCaseDTO [recipients=" + recipients + ", sendCase=" + sendCase + ", launchNames=" + launchNames + ", attributes="
				+ attributes + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((launchNames == null) ? 0 : launchNames.hashCode());
		result = prime * result + ((recipients == null) ? 0 : recipients.hashCode());
		result = prime * result + ((sendCase == null) ? 0 : sendCase.hashCode());
		result = prime * result + ((attributes == null) ? 0 : attributes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		EmailSenderCaseDTO other = (EmailSenderCaseDTO) obj;
		if (launchNames == null) {
			if (other.launchNames != null) {
				return false;
			}
		} else if (!launchNames.equals(other.launchNames)) {
			return false;
		}
		if (recipients == null) {
			if (other.recipients != null) {
				return false;
			}
		} else if (!recipients.equals(other.recipients)) {
			return false;
		}
		if (sendCase == null) {
			if (other.sendCase != null) {
				return false;
			}
		} else if (!sendCase.equals(other.sendCase)) {
			return false;
		}
		if (attributes == null) {
			if (other.attributes != null) {
				return false;
			}
		} else if (!attributes.equals(other.attributes)) {
			return false;
		}
		return true;
	}
}
package com.epam.ta.reportportal.ws.model.project.email;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Project email configuration object
 *
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class ProjectEmailConfigDTO implements Serializable {
	/**
	 * Generated SVUID
	 */
	private static final long serialVersionUID = -961365872944240700L;

	@JsonProperty(value = "emailEnabled")
	private Boolean emailEnabled;

	@JsonProperty(value = "fromAddress")
	private String from;

	@JsonProperty(value = "emailCases")
	private List<EmailSenderCaseDTO> emailCases;

	public ProjectEmailConfigDTO() {
	}

	public ProjectEmailConfigDTO(boolean isEnabled, String from, List<EmailSenderCaseDTO> cases) {
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

	public void setEmailCases(List<EmailSenderCaseDTO> cases) {
		this.emailCases = cases;
	}

	public List<EmailSenderCaseDTO> getEmailCases() {
		return emailCases;
	}

	@Override
	public String toString() {
		return "ProjectEmailConfigDTO [emailEnabled=" + emailEnabled + ", from=" + from + ", emailCases=" + emailCases + "]";
	}
}
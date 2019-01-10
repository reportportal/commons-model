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

	@JsonProperty(value = "emailCases")
	private List<EmailSenderCaseDTO> emailCases;

	public ProjectEmailConfigDTO() {
	}

	public ProjectEmailConfigDTO(List<EmailSenderCaseDTO> emailCases) {
		this.emailCases = emailCases;
	}

	public void setEmailCases(List<EmailSenderCaseDTO> cases) {
		this.emailCases = cases;
	}

	public List<EmailSenderCaseDTO> getEmailCases() {
		return emailCases;
	}

	@Override
	public String toString() {
		return "ProjectEmailConfigDTO{" + "emailCases=" + emailCases + '}';
	}
}
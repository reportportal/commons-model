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
public class ProjectConfigDTO implements Serializable {
	/**
	 * Generated SVUID
	 */
	private static final long serialVersionUID = -961365872944240700L;

	@JsonProperty(value = "cases")
	private List<SenderCaseDTO> senderCases;

	public ProjectConfigDTO() {
	}

	public ProjectConfigDTO(List<SenderCaseDTO> senderCases) {
		this.senderCases = senderCases;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public List<SenderCaseDTO> getSenderCases() {
		return senderCases;
	}

	public void setSenderCases(List<SenderCaseDTO> senderCases) {
		this.senderCases = senderCases;
	}

	@Override
	public String toString() {
		return "ProjectConfigDTO{" + "senderCases=" + senderCases + '}';
	}
}
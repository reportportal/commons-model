package com.epam.ta.reportportal.ws.model.integration;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * @author Pavel Bortnik
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IntegrationTypeResource implements Serializable {

	@JsonProperty("type")
	private Long id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("authFlow")
	private AuthFlowEnum authFlow;

	@JsonProperty("creationDate")
	private Date creationDate;

	@JsonProperty("groupType")
	private String groupType;

	@JsonProperty("details")
	private Map<String, Object> details;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AuthFlowEnum getAuthFlow() {
		return authFlow;
	}

	public void setAuthFlow(AuthFlowEnum authFlow) {
		this.authFlow = authFlow;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getGroupType() {
		return groupType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public Map<String, Object> getDetails() {
		return details;
	}

	public void setDetails(Map<String, Object> details) {
		this.details = details;
	}
}

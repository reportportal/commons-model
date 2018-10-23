package com.epam.ta.reportportal.ws.model.integration;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Map;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateIntegrationTypeRQ implements Serializable {

	@JsonProperty("name")
	private String name;

	@JsonProperty("auth_flow")
	private String authFlow;

	@JsonProperty("group_type")
	private String groupType;

	@JsonProperty("details")
	private Map<String, Object> details;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthFlow() {
		return authFlow;
	}

	public void setAuthFlow(String authFlow) {
		this.authFlow = authFlow;
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

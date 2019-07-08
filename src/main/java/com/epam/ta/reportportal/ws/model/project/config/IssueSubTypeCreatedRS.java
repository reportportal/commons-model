package com.epam.ta.reportportal.ws.model.project.config;

import com.epam.ta.reportportal.ws.model.EntryCreatedRS;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IssueSubTypeCreatedRS extends EntryCreatedRS {

	@JsonProperty(value = "locator")
	private String locator;

	public IssueSubTypeCreatedRS() {
	}

	public IssueSubTypeCreatedRS(Long id, String locator) {
		super(id);
		this.locator = locator;
	}

	public String getLocator() {
		return locator;
	}

	public void setLocator(String locator) {
		this.locator = locator;
	}
}

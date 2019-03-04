package com.epam.ta.reportportal.ws.model.externalsystem;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotNull;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BtsConnectionTestRQ {

	@NotNull
	@NotEmpty
	private String url;

	@NotNull
	@NotEmpty
	private String btsProject;

	public BtsConnectionTestRQ() {
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBtsProject() {
		return btsProject;
	}

	public void setBtsProject(String btsProject) {
		this.btsProject = btsProject;
	}
}

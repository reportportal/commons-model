package com.epam.ta.reportportal.ws.model.activity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
public class PatternTemplateActivityResource {

	@JsonProperty(value = "id", required = true)
	private Long id;

	@JsonProperty(value = "projectId", required = true)
	private Long projectId;

	@JsonProperty(value = "name", required = true)
	private String name;

	public PatternTemplateActivityResource() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PatternTemplateActivityResource{" + "id=" + id + ", projectId=" + projectId + ", name='" + name + '\'' + '}';
	}
}

package com.epam.ta.reportportal.ws.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * @author Pavel Bortnik
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BasicReportingRq {

	@JsonProperty("projectName")
	private String projectName;

	@JsonProperty("username")
	private String username;

	@JsonProperty("role")
	private String role;

	@JsonProperty("projectDetails")
	private Map<String, ProjectDetails> projectDetails;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Map<String, ProjectDetails> getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(Map<String, ProjectDetails> projectDetails) {
		this.projectDetails = projectDetails;
	}

	public static class ProjectDetails {

		@JsonProperty("projectId")
		private Long projectId;

		@JsonProperty("projectRole")
		private String projectRole;

		public Long getProjectId() {
			return projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getProjectRole() {
			return projectRole;
		}

		public void setProjectRole(String projectRole) {
			this.projectRole = projectRole;
		}
	}
}

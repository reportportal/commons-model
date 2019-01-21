package com.epam.ta.reportportal.ws.model.project;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteProjectRQ {

	@NotNull
	@NotEmpty
	@JsonProperty(value = "projectName", required = true)
	@Pattern(regexp = "[a-zA-Z0-9-_]+")
	@Size(min = ValidationConstraints.MIN_NAME_LENGTH, max = ValidationConstraints.MAX_NAME_LENGTH)
	@ApiModelProperty(required = true)
	private String projectName;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		DeleteProjectRQ that = (DeleteProjectRQ) o;

		return projectName.equals(that.projectName);
	}

	@Override
	public int hashCode() {
		return projectName.hashCode();
	}

	@Override
	public String toString() {
		return "DeleteProjectRQ{" + "projectName='" + projectName + '\'' + '}';
	}
}

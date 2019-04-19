package com.epam.ta.reportportal.ws.model.project.config;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MAX_ANALYSIS_PATTERN_NAME_LENGTH;
import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MIN_ANALYSIS_PATTERN_NAME_LENGTH;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAnalysisPatternRQ {

	@NotNull
	@NotEmpty
	@Size(min = MIN_ANALYSIS_PATTERN_NAME_LENGTH, max = MAX_ANALYSIS_PATTERN_NAME_LENGTH)
	private String name;

	@NotNull
	@NotEmpty
	private String template;

	@NotNull
	@NotEmpty
	private String type;

	public CreateAnalysisPatternRQ() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CreateAnalysisPatternRQ{" + "name='" + name + '\'' + ", template='" + template + '\'' + ", type='" + type + '\'' + '}';
	}
}

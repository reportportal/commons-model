package com.epam.ta.reportportal.ws.model.project.config.pattern;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MAX_ANALYSIS_PATTERN_NAME_LENGTH;
import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MIN_ANALYSIS_PATTERN_NAME_LENGTH;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePatternTemplateRQ {

	@NotNull
	@NotEmpty
	@Size(min = MIN_ANALYSIS_PATTERN_NAME_LENGTH, max = MAX_ANALYSIS_PATTERN_NAME_LENGTH)
	@JsonProperty(value = "name")
	private String name;

	@NotNull
	@JsonProperty(value = "enabled")
	private Boolean enabled;

	public UpdatePatternTemplateRQ() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "UpdatePatternTemplateRQ{" + "name='" + name + '\'' + ", enabled=" + enabled + '}';
	}
}

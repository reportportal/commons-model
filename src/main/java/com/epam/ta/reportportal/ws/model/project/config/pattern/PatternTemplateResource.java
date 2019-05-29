package com.epam.ta.reportportal.ws.model.project.config.pattern;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatternTemplateResource {

	@JsonProperty(value = "id")
	private Long id;

	@JsonProperty(value = "name")
	private String name;

	@JsonProperty(value = "value")
	private String value;

	@JsonProperty(value = "type")
	private String type;

	@JsonProperty(value = "enabled")
	private Boolean enabled;

	public PatternTemplateResource() {
	}

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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "UpdatePatternTemplateRQ{" + "name='" + name + '\'' + ", value='" + value + '\'' + ", type='" + type + '\'' + ", enabled="
				+ enabled + '}';
	}
}

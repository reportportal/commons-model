package com.epam.ta.reportportal.ws.model.integration;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.Map;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateIntegrationRQ {

	@NotNull
	@NotEmpty
	@JsonProperty("pluginName")
	private String pluginName;

	@JsonProperty("name")
	private String name;

	@JsonProperty("integrationParameters")
	private Map<String, Object> integrationParams;

	@NotNull
	@JsonProperty("enabled")
	private Boolean enabled;

	public String getPluginName() {
		return pluginName;
	}

	public void setPluginName(String pluginName) {
		this.pluginName = pluginName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Object> getIntegrationParams() {
		return integrationParams;
	}

	public void setIntegrationParams(Map<String, Object> integrationParams) {
		this.integrationParams = integrationParams;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

}

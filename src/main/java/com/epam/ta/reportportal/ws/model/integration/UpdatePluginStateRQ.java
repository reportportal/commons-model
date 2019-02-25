package com.epam.ta.reportportal.ws.model.integration;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePluginStateRQ implements Serializable {

	@NotNull
	@NotEmpty
	private String name;

	@NotNull
	private Boolean isEnabled;

	public UpdatePluginStateRQ() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getEnabled() {
		return isEnabled;
	}

	public void setEnabled(Boolean enabled) {
		isEnabled = enabled;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		UpdatePluginStateRQ that = (UpdatePluginStateRQ) o;

		if (name != null ? !name.equals(that.name) : that.name != null) {
			return false;
		}
		return isEnabled != null ? isEnabled.equals(that.isEnabled) : that.isEnabled == null;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (isEnabled != null ? isEnabled.hashCode() : 0);
		return result;
	}
}

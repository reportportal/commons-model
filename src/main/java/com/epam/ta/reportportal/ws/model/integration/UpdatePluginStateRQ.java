package com.epam.ta.reportportal.ws.model.integration;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePluginStateRQ implements Serializable {

	@NotNull
	private Boolean isEnabled;

	public UpdatePluginStateRQ() {
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

		return isEnabled != null ? isEnabled.equals(that.isEnabled) : that.isEnabled == null;
	}

	@Override
	public int hashCode() {
		return isEnabled != null ? isEnabled.hashCode() : 0;
	}
}

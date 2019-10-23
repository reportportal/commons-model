package com.epam.ta.reportportal.ws.model.integration.auth;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Map;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
public class UpdateAuthRQ {

	@NotNull
	private Boolean enabled;

	@NotEmpty
	private Map<String, String> authParams;

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Map<String, String> getAuthParams() {
		return authParams;
	}

	public void setAuthParams(Map<String, String> authParams) {
		this.authParams = authParams;
	}

	@Override
	public String toString() {
		return "UpdateAuthRQ{" + "enabled=" + enabled + ", authParams=" + authParams + '}';
	}
}

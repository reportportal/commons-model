/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
	private Map<String, Object> authParams;

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Map<String, Object> getAuthParams() {
		return authParams;
	}

	public void setAuthParams(Map<String, Object> authParams) {
		this.authParams = authParams;
	}

	@Override
	public String toString() {
		return "UpdateAuthRQ{" + "enabled=" + enabled + ", authParams=" + authParams + '}';
	}
}

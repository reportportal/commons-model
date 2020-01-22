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

package com.epam.ta.reportportal.ws.model.launch;

import com.epam.ta.reportportal.ws.annotations.NotBlankWithSize;
import com.epam.ta.reportportal.ws.model.StartRQ;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(Include.NON_NULL)
public class StartLaunchRQ extends StartRQ {

	@JsonProperty("mode")
	private Mode mode;

	@JsonProperty("rerun")
	private boolean rerun;

	@JsonProperty("rerunOf")
	@ApiModelProperty(value = "UUID of desired launch to rerun")
	private String rerunOf;

	@Override
	@NotBlankWithSize(min = ValidationConstraints.MIN_LAUNCH_NAME_LENGTH, max = ValidationConstraints.MAX_NAME_LENGTH)
	public String getName() {
		return name;
	}

	public Mode getMode() {
		return mode;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}

	public boolean isRerun() {
		return rerun;
	}

	public void setRerun(boolean rerun) {
		this.rerun = rerun;
	}

	public String getRerunOf() {
		return rerunOf;
	}

	public void setRerunOf(String rerunOf) {
		this.rerunOf = rerunOf;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("StartLaunchRQ{");
		sb.append("mode=").append(mode);
		sb.append(", rerun=").append(rerun);
		sb.append(", rerunOf='").append(rerunOf).append('\'');
		sb.append('}');
		return sb.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		if (!super.equals(o)) {
			return false;
		}

		StartLaunchRQ that = (StartLaunchRQ) o;

		if (rerun != that.rerun) {
			return false;
		}
		if (mode != that.mode) {
			return false;
		}
		return rerunOf != null ? rerunOf.equals(that.rerunOf) : that.rerunOf == null;
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (mode != null ? mode.hashCode() : 0);
		result = 31 * result + (rerun ? 1 : 0);
		result = 31 * result + (rerunOf != null ? rerunOf.hashCode() : 0);
		return result;
	}
}
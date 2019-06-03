/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/commons-model
 * 
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 */ 
 
package com.epam.ta.reportportal.ws.model.launch;

import com.epam.ta.reportportal.ws.model.StartRQ;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.epam.ta.reportportal.ws.model.validation.LaunchNameValidationGroup;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Size;

@JsonInclude(Include.NON_NULL)
public class StartLaunchRQ extends StartRQ {
	
	@JsonProperty("mode")
	private Mode mode;

	@Override
	@Size(min = ValidationConstraints.MIN_LAUNCH_NAME_LENGTH, max = ValidationConstraints.MAX_NAME_LENGTH, groups = LaunchNameValidationGroup.class)
	public String getName() {
		return super.getName();
	}

	public Mode getMode() {
		return mode;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("StartLaunchRQ{");
		sb.append("mode=").append(mode);
		sb.append('}');
		return sb.toString();
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        StartLaunchRQ that = (StartLaunchRQ) o;

        return mode == that.mode;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (mode != null ? mode.hashCode() : 0);
        return result;
    }
}
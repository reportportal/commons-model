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

package com.epam.ta.reportportal.ws.model;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MAX_FILTER_DESCRIPTION;
import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MIN_FILTER_DESCRIPTION;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Base entity for manipulating sharable resources
 *
 * @author Aliaksei_Makayed
 *
 */
@JsonInclude(Include.NON_NULL)
public class SharableEntityRQ {

	@JsonProperty(value = "share")
	private Boolean share;

	@Size(min = MIN_FILTER_DESCRIPTION, max = MAX_FILTER_DESCRIPTION)
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getShare() {
		return share;
	}

	public void setShare(Boolean share) {
		this.share = share;
	}

}
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

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Base entity for sharable resources. This resource should contains owner in
 * response.
 * 
 * @author Aliaksei_Makayed
 * 
 */
@JsonInclude(Include.NON_NULL)
public class OwnedResource extends ResourceSupport {

	@JsonProperty(value = "owner")
	private String owner;

	@JsonProperty(value = "isShared")
	private boolean isShared;

	@Size(min = MIN_FILTER_DESCRIPTION, max = MAX_FILTER_DESCRIPTION)
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setIsShared(boolean value) {
		this.isShared = value;
	}

	public boolean getIsShared() {
		return isShared;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("OwnedResource{");
		sb.append("owner='").append(owner).append('\'');
		sb.append(", isShared=").append(isShared);
		sb.append('}');
		return sb.toString();
	}
}
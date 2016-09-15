/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/epam/ReportPortal
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
 
package com.epam.ta.reportportal.ws.model.filter;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.epam.ta.reportportal.ws.model.SharableEntityRQ;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Domain object for updating user filters
 * 
 * @author Aliaksei_Makayed
 * 
 */

@JsonInclude(Include.NON_NULL)
public class UpdateUserFilterRQ extends SharableEntityRQ {

	@NotEmpty
	@Size(min = ValidationConstraints.MIN_NAME_LENGTH, max = ValidationConstraints.MAX_USER_FILTER_NAME_LENGTH)
	@JsonProperty(value = "name")
	public String name;

	@JsonProperty(value = "type")
	public String objectType;

	@Valid
	@Size(min = ValidationConstraints.MIN_COLLECTION_SIZE, max = ValidationConstraints.MAX_NUMBER_OF_FILTER_ENTITIES)
	@JsonProperty(value = "entities", required = true)
	@JsonDeserialize(as = LinkedHashSet.class)
	private Set<UserFilterEntity> entities;

	@Valid
	@JsonProperty(value = "selection_parameters")
	private SelectionParameters selectionParameters;

	@JsonProperty(value = "is_link")
	private boolean isLink;

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public Set<UserFilterEntity> getEntities() {
		return entities;
	}

	public void setEntities(Set<UserFilterEntity> entities) {
		this.entities = entities;
	}

	public SelectionParameters getSelectionParameters() {
		return selectionParameters;
	}

	public void setSelectionParameters(SelectionParameters selectionParameters) {
		this.selectionParameters = selectionParameters;
	}

	public boolean getIsLink() {
		return isLink;
	}

	public void setIsLink(boolean isLink) {
		this.isLink = isLink;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("UpdateUserFilterRQ{");
		sb.append("name='").append(name).append('\'');
		sb.append(", objectType='").append(objectType).append('\'');
		sb.append(", entities=").append(entities);
		sb.append(", selectionParameters=").append(selectionParameters);
		sb.append(", isLink=").append(isLink);
		sb.append('}');
		return sb.toString();
	}
}
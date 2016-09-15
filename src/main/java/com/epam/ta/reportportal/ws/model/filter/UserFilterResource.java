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

import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.epam.ta.reportportal.ws.model.OwnedResource;
import org.springframework.hateoas.ResourceSupport;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JSON Representation of Report Portal domain object. Extends Spring's
 * {@link ResourceSupport} class which contains several fields related to
 * HATEAOS constraint
 * 
 * @see <a href="http://en.wikipedia.org/wiki/HATEOAS">HATEOAS Description</a>
 * 
 * @author Aliaksei_Makayed
 * 
 */

@JsonInclude(Include.NON_NULL)
public class UserFilterResource extends OwnedResource {

	@NotNull
	@JsonProperty(value = "id", required = true)
	private String filterId;

	@NotNull
	@NotEmpty
	@Size(min = ValidationConstraints.MIN_NAME_LENGTH, 
	max = ValidationConstraints.MAX_USER_FILTER_NAME_LENGTH)
	@JsonProperty(value = "name", required = true)
	private String name;

	@NotNull
	@Valid
	@Size(min = ValidationConstraints.MIN_COLLECTION_SIZE)
	@JsonProperty(value = "entities", required = true)
	private Set<UserFilterEntity> entities;

	@JsonProperty(value = "selection_parameters")
	private SelectionParameters selectionParameters;
	
	// possible object types: launch; testItem; log
	@NotNull
	@JsonProperty(value = "type", required = true)
	private String objectType;
	
	@NotNull
	@JsonProperty(value = "owner", required = true)
	private String owner;
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEntities(Set<UserFilterEntity> Entities) {
		this.entities = Entities;
	}

	public Set<UserFilterEntity> getEntities() {
		return entities;
	}

	public String getFilterId() {
		return filterId;
	}

	public void setFilterId(String filterId) {
		this.filterId = filterId;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public SelectionParameters getSelectionParameters() {
		return selectionParameters;
	}

	public void setSelectionParameters(SelectionParameters selectionParameters) {
		this.selectionParameters = selectionParameters;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("UserFilterResource{");
		sb.append("filterId='").append(filterId).append('\'');
		sb.append(", name='").append(name).append('\'');
		sb.append(", entities=").append(entities);
		sb.append(", selectionParameters=").append(selectionParameters);
		sb.append(", objectType='").append(objectType).append('\'');
		sb.append(", owner='").append(owner).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
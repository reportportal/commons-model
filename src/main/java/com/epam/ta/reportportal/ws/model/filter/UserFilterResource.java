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

package com.epam.ta.reportportal.ws.model.filter;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.*;

import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.epam.ta.reportportal.ws.model.OwnedResource;
import com.epam.ta.reportportal.ws.model.SharedEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JSON Representation of Report Portal's UserFilter domain object
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
	@Size(min = MIN_NAME_LENGTH, max = MAX_USER_FILTER_NAME_LENGTH)
	@JsonProperty(value = "name", required = true)
	private String name;

	@NotNull
	@Valid
	@Size(min = MIN_COLLECTION_SIZE)
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
		return "UserFilterResource{" + "filterId='" + filterId + '\'' + ", name='" + name + '\'' + ", entities=" + entities
				+ ", selectionParameters=" + selectionParameters + ", objectType='" + objectType + '\'' + ", owner='" + owner + '\'' + '}';
	}
}

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

import java.util.LinkedHashSet;
import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.epam.ta.reportportal.ws.model.SharableEntityRQ;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.swagger.annotations.ApiModelProperty;

/**
 * Domain object for create filter action
 * 
 * @author Aliaksei_Makayed
 * 
 */
@JsonInclude(Include.NON_NULL)
public class CreateUserFilterRQ extends SharableEntityRQ {

	@NotNull
	@NotEmpty
	@Size(min = MIN_NAME_LENGTH, max = MAX_USER_FILTER_NAME_LENGTH)
	@JsonProperty(value = "name", required = true)
	@ApiModelProperty(required = true)
	private String name;

	@NotNull
	// possible object types: launch; testItem; log
	@JsonProperty(value = "type", required = true)
	@ApiModelProperty(required = true, allowableValues = "launch, testitem, log")
	private String objectType;

	@NotNull
	@Valid
	@Size(min = MIN_COLLECTION_SIZE, max = MAX_NUMBER_OF_FILTER_ENTITIES)
	@JsonProperty(value = "entities", required = true)
	@JsonDeserialize(as = LinkedHashSet.class)
	@ApiModelProperty(required = true)
	private Set<UserFilterEntity> entities;

	@NotNull
	@Valid
	@JsonProperty(value = "selection_parameters", required = true)
	@ApiModelProperty(required = true)
	private SelectionParameters selectionParameters;

	@NotNull
	@JsonProperty(value = "is_link", required = true)
	private boolean isLink;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<UserFilterEntity> getEntities() {
		return entities;
	}

	public void setEntities(Set<UserFilterEntity> entities) {
		this.entities = entities;
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

	public boolean getIsLink() {
		return isLink;
	}

	public void setIsLink(boolean isLink) {
		this.isLink = isLink;
	}

	@Override
	public String toString() {
		return "CreateUserFilterRQ{" + "name='" + name + '\'' + ", objectType='" + objectType + '\'' + ", entities=" + entities
				+ ", selectionParameters=" + selectionParameters + ", isLink=" + isLink + '}';
	}
}
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

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.epam.ta.reportportal.ws.model.SharableEntityRQ;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.*;

/**
 * Domain object for updating user filters
 *
 * @author Aliaksei_Makayed
 */

@JsonInclude(Include.NON_NULL)
public class UpdateUserFilterRQ extends SharableEntityRQ {

	@NotEmpty
	@Size(min = MIN_NAME_LENGTH, max = MAX_USER_FILTER_NAME_LENGTH)
	@JsonProperty(value = "name")
	public String name;

	@JsonProperty(value = "type")
	public String objectType;

	@Valid
	@Size(min = MIN_COLLECTION_SIZE, max = MAX_NUMBER_OF_FILTER_ENTITIES)
	@JsonProperty(value = "entities", required = true)
	@JsonDeserialize(as = LinkedHashSet.class)
	private Set<UserFilterEntity> entities;

	@Size(min = MIN_COLLECTION_SIZE)
	@JsonProperty(value = "orders", required = true)
	private List<Order> orders;

	@JsonProperty(value = "is_link")
	private boolean isLink;

	@Size(min = MIN_FILTER_DESCRIPTION, max = MAX_FILTER_DESCRIPTION)
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

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

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
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
		return "UpdateUserFilterRQ{" + "name='" + name + '\'' + ", objectType='" + objectType + '\'' + ", entities=" + entities
				+ ", orders=" + orders + ", isLink=" + isLink + ", description='" + description + '\'' + "} " + super.toString();
	}
}
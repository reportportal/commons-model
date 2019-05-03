/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.ws.model.filter;

import com.epam.ta.reportportal.ws.model.SharableEntityRQ;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.*;

/**
 * Domain object for filter actions
 *
 * @author Aliaksei_Makayed
 */
@JsonInclude(Include.NON_NULL)
public class UpdateUserFilterRQ extends SharableEntityRQ {

	@NotBlank
	@Size(min = MIN_NAME_LENGTH, max = MAX_USER_FILTER_NAME_LENGTH)
	@JsonProperty(value = "name", required = true)
	@ApiModelProperty(required = true)
	private String name;

	@NotBlank
	// possible object types: launch; testItem; log
	@JsonProperty(value = "type", required = true)
	@ApiModelProperty(required = true, allowableValues = "launch, testitem, log")
	private String objectType;

	@Valid
	@NotNull
	@Size(min = MIN_COLLECTION_SIZE, max = MAX_NUMBER_OF_FILTER_ENTITIES)
	@JsonProperty(value = "conditions", required = true)
	@JsonDeserialize(as = LinkedHashSet.class)
	@ApiModelProperty(required = true)
	private Set<UserFilterCondition> conditions;

	@Valid
	@NotNull
	@Size(min = MIN_COLLECTION_SIZE)
	@JsonProperty(value = "orders", required = true)
	@ApiModelProperty(required = true)
	private List<Order> orders;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@NotNull
	public Set<UserFilterCondition> getConditions() {
		return conditions;
	}

	public void setConditions(@NotNull Set<UserFilterCondition> conditions) {
		this.conditions = conditions;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "UpdateUserFilterRQ{" + "name='" + name + '\'' + ", objectType='" + objectType + '\'' + ", conditions=" + conditions
				+ ", orders=" + orders + '}';
	}
}
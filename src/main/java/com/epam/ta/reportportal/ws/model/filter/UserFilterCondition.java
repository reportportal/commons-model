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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

/**
 * Filter entity domain model object.
 * 
 * @author Aliaksei_Makayed
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class UserFilterCondition {

	@NotNull
	@NotEmpty
	@JsonProperty(value = "filteringField", required = true)
	private String filteringField;

	@NotNull
	@NotEmpty
	@JsonProperty(value = "condition", required = true)
	private String condition;

	@NotNull
	@NotEmpty
	@JsonProperty(value = "value", required = true)
	private String value;


	public UserFilterCondition() {
	}

	public UserFilterCondition(String field, String condition, String value) {
		this.filteringField = field;
		this.condition = condition;
		this.value = value;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getFilteringField() {
		return filteringField;
	}

	public void setFilteringField(String filteringField) {
		this.filteringField = filteringField;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((condition == null) ? 0 : condition.hashCode());
		result = prime * result + ((filteringField == null) ? 0 : filteringField.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserFilterCondition other = (UserFilterCondition) obj;
		if (condition == null) {
			if (other.condition != null)
				return false;
		} else if (!condition.equals(other.condition))
			return false;
		if (filteringField == null) {
			if (other.filteringField != null)
				return false;
		} else if (!filteringField.equals(other.filteringField))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("UserFilterEntity{");
		sb.append("filteringField='").append(filteringField).append('\'');
		sb.append(", condition='").append(condition).append('\'');
		sb.append(", value='").append(value).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
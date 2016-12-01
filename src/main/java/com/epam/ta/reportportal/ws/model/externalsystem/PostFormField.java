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

package com.epam.ta.reportportal.ws.model.externalsystem;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;

/**
 * Basic representation of single post ticket form field<br>
 * 
 * NOTE: representation based on JIRA post ticket form
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class PostFormField implements Comparable<PostFormField>, Serializable {

	/**
	 * Field name on JIRA form
	 */
	@JsonProperty(value = "fieldName")
	private String fieldName;

	/**
	 * Field ID for post ticket request in JIRA
	 */
	@JsonProperty(value = "id", required = true)
	private String id;

	/**
	 * Field type for UI representation for user
	 */
	@JsonProperty(value = "fieldType")
	private String fieldType;

	/**
	 * Is field required for ticket post
	 */
	@JsonProperty(value = "required", required = true)
	private boolean isRequired;

	/**
	 * Field value(s)
	 */
	@JsonProperty(value = "value", required = true)
	private List<String> value;

	/**
	 * Values for fields with pre-defined set
	 */
	@JsonProperty(value = "definedValues")
	private List<AllowedValue> definedValues;

	public PostFormField() {
	}

	public PostFormField(String id, String name, String type, boolean isReq, List<String> values, List<AllowedValue> defValues) {
		this.id = id;
		this.fieldName = name;
		this.fieldType = type;
		this.isRequired = isReq;
		this.value = values;
		this.definedValues = defValues;
	}

	public void setFieldName(String name) {
		this.fieldName = name;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setId(String value) {
		this.id = value;
	}

	public String getId() {
		return id;
	}

	public void setFieldType(String type) {
		this.fieldType = type;
	}

	public String getFieldType() {
		return fieldType;
	}

	public void setIsRequired(boolean value) {
		this.isRequired = value;
	}

	public boolean getIsRequired() {
		return isRequired;
	}

	public void setValue(List<String> value) {
		this.value = value;
	}

	public List<String> getValue() {
		return value;
	}

	public List<AllowedValue> getDefinedValues() {
		return definedValues;
	}

	public void setDefinedValues(List<AllowedValue> values) {
		this.definedValues = values;
	}

	@Override
	public String toString() {
		return "PostFormField{" + "fieldName='" + fieldName + '\'' + ", id='" + id + '\'' + ", fieldType='" + fieldType + '\''
				+ ", isRequired=" + isRequired + ", value=" + value + ", definedValues=" + definedValues + '}';
	}

	@Override
	public int compareTo(PostFormField field) {
		Boolean current = this.isRequired;
		Boolean byField = field.isRequired;
		return byField.compareTo(current);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		PostFormField that = (PostFormField) o;
		return isRequired == that.isRequired &&
				Objects.equal(fieldName, that.fieldName) &&
				Objects.equal(id, that.id) &&
				Objects.equal(fieldType, that.fieldType) &&
				Objects.equal(value, that.value) &&
				Objects.equal(definedValues, that.definedValues);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(fieldName, id, fieldType, isRequired, value, definedValues);
	}
}
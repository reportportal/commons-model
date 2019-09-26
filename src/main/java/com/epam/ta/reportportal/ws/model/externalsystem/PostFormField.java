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

package com.epam.ta.reportportal.ws.model.externalsystem;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

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

		if (isRequired != that.isRequired)
			return false;
		if (fieldName != null ? !fieldName.equals(that.fieldName) : that.fieldName != null)
			return false;
		if (id != null ? !id.equals(that.id) : that.id != null)
			return false;
		if (fieldType != null ? !fieldType.equals(that.fieldType) : that.fieldType != null)
			return false;
		if (value != null ? !value.equals(that.value) : that.value != null)
			return false;
		return definedValues != null ? definedValues.equals(that.definedValues) : that.definedValues == null;
	}

	@Override
	public int hashCode() {
		int result = fieldName != null ? fieldName.hashCode() : 0;
		result = 31 * result + (id != null ? id.hashCode() : 0);
		result = 31 * result + (fieldType != null ? fieldType.hashCode() : 0);
		result = 31 * result + (isRequired ? 1 : 0);
		result = 31 * result + (value != null ? value.hashCode() : 0);
		result = 31 * result + (definedValues != null ? definedValues.hashCode() : 0);
		return result;
	}
}
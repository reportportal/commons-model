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

package com.epam.ta.reportportal.ws.model.attribute;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MAX_ATTRIBUTE_LENGTH;
import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MIN_ITEM_ATTRIBUTE_VALUE_LENGTH;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
public class ItemAttributeResource implements Serializable {

	@Size(max = MAX_ATTRIBUTE_LENGTH)
	private String key;

	@NotBlank
	@Size(min = MIN_ITEM_ATTRIBUTE_VALUE_LENGTH, max = MAX_ATTRIBUTE_LENGTH)
	private String value;

	public ItemAttributeResource() {
	}

	public ItemAttributeResource(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ItemAttributeResource{");
		sb.append("key='").append(key).append('\'');
		sb.append(", value='").append(value).append('\'');
		sb.append('}');
		return sb.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		ItemAttributeResource that = (ItemAttributeResource) o;

		if (key != null ? !key.equals(that.key) : that.key != null) {
			return false;
		}
		return value != null ? value.equals(that.value) : that.value == null;
	}

	@Override
	public int hashCode() {
		int result = key != null ? key.hashCode() : 0;
		result = 31 * result + (value != null ? value.hashCode() : 0);
		return result;
	}
}

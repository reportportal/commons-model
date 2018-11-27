/*
 * Copyright 2018 EPAM Systems
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

package com.epam.ta.reportportal.ws.model;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
public class ItemAttributeResource {

	private String key;

	private String value;

	private boolean system;

	public ItemAttributeResource() {
	}

	public ItemAttributeResource(String key, String value) {
		this.key = key;
		this.value = value;
		this.system = false;
	}

	public ItemAttributeResource(String key, String value, boolean system) {
		this.key = key;
		this.value = value;
		this.system = system;
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

	public boolean isSystem() {
		return system;
	}

	public void setSystem(boolean system) {
		this.system = system;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ItemAttributeResource{");
		sb.append("key='").append(key).append('\'');
		sb.append(", value='").append(value).append('\'');
		sb.append(", system=").append(system);
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

		if (system != that.system) {
			return false;
		}
		if (key != null ? !key.equals(that.key) : that.key != null) {
			return false;
		}
		return value != null ? value.equals(that.value) : that.value == null;
	}

	@Override
	public int hashCode() {
		int result = key != null ? key.hashCode() : 0;
		result = 31 * result + (value != null ? value.hashCode() : 0);
		result = 31 * result + (system ? 1 : 0);
		return result;
	}
}

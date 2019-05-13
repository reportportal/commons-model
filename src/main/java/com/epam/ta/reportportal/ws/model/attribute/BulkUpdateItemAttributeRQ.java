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

import com.epam.ta.reportportal.ws.annotations.NotEmpty;

import javax.validation.Valid;
import java.util.List;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
public class BulkUpdateItemAttributeRQ {

	@NotEmpty
	private List<Long> ids;

	private Description description;

	@Valid
	private List<UpdateItemAttributeRQ> attributes;

	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	public Description getDescription() {
		return description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public List<UpdateItemAttributeRQ> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<UpdateItemAttributeRQ> attributes) {
		this.attributes = attributes;
	}

	public enum Action {
		DELETE,
		UPDATE,
		CREATE
	}

	public static class Description {

		String description;

		Action action;

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Action getAction() {
			return action;
		}

		public void setAction(Action action) {
			this.action = action;
		}
	}
}

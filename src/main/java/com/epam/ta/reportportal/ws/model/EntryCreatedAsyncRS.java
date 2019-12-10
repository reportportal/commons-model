/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.ws.model;

/**
 * @author Konstantin Antipin
 */
public class EntryCreatedAsyncRS {

	private String id;

	public EntryCreatedAsyncRS() {
	}

	public EntryCreatedAsyncRS(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("EntryCreatedAsyncRS{");
		sb.append("id='").append(id).append('\'');
		sb.append('}');
		return sb.toString();
	}
}

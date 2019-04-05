/*
 * Copyright 2018 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.epam.ta.reportportal.ws.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Map;

/**
 * @param <T> Type of Entity
 * @author Dzmitry_Kavalets
 */
public class BulkRQ<T> {

	@Valid
	@NotNull
	@JsonProperty(value = "entities", required = true)
	private Map<String, T> entities;

	public Map<String, T> getEntities() {
		return entities;
	}

	public void setEntities(Map<String, T> entities) {
		this.entities = entities;
	}

	@Override
	public String toString() {
		return "BulkRQ{" + "entities=" + entities + '}';
	}
}

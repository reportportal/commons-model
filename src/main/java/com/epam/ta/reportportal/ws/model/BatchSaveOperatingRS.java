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
 
package com.epam.ta.reportportal.ws.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Response with results of completion save batch operation.
 * 
 * @author Aliaksei_Makayed
 *
 */
@JsonInclude(Include.NON_NULL)
public class BatchSaveOperatingRS {

	@JsonProperty("responses")
	List<BatchElementCreatedRS> responses;
	
	public BatchSaveOperatingRS() {
		responses = new ArrayList<BatchElementCreatedRS>();
	}

	public List<BatchElementCreatedRS> getResponses() {
		return responses;
	}
	
	public void addResponse(BatchElementCreatedRS elementCreatedRS) {
		responses.add(elementCreatedRS);
	}

	public void setResponses(List<BatchElementCreatedRS> responses) {
		this.responses = responses;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("BatchSaveOperatingRS{");
		sb.append("responses=").append(responses);
		sb.append('}');
		return sb.toString();
	}
}
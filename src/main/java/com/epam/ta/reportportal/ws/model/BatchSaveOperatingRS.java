/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/epam/ReportPortal
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
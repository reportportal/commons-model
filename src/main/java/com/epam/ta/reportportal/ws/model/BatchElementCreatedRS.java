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
 
package com.epam.ta.reportportal.ws.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Element of response for batch save operation.
 * 
 * @author Aliaksei_Makayed
 *
 */
@JsonInclude(Include.NON_NULL)
public class BatchElementCreatedRS extends EntryCreatedRS {
	
	@JsonProperty("message")
	private String message;

	@JsonProperty("stackTrace")
	private String stackTrace;
	
	public BatchElementCreatedRS() {
		
	}
	
	public BatchElementCreatedRS(Long id) {
		super.setId(id);
	}
	
	public BatchElementCreatedRS(String stackTrace, String message) {
		setMessage(message);
		setStackTrace(stackTrace);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStackTrace() {
		return stackTrace;
	}

	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("BatchElementCreatedRS{");
		sb.append("message='").append(message).append('\'');
		sb.append(", stackTrace='").append(stackTrace).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
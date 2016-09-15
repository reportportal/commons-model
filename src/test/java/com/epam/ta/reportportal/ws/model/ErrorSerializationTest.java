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

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Serializer/Deserializer unit tests
 * 
 * @author Andrei Varabyeu
 * 
 */
public class ErrorSerializationTest {

	private static final String SERIALIZATION_RESULT = "{\"error_code\":5000,\"message\":\"MESSAGE\",\"stack_trace\":\"STACK_TRACE\"}";

	private ObjectMapper om = getObjectMapper();

	@Test
	public void testSerializer() throws JsonProcessingException {
		String json = om.writeValueAsString(getErrorResponse());
		Assert.assertEquals(SERIALIZATION_RESULT, json);
	}

	@Test
	public void testDeserializer() throws IOException {
		ErrorRS fromJson = om.readValue(SERIALIZATION_RESULT, ErrorRS.class);
		Assert.assertEquals(getErrorResponse(), fromJson);
	}

	private ErrorRS getErrorResponse() {
		ErrorRS error = new ErrorRS();
		error.setMessage("MESSAGE");
		error.setStackTrace("STACK_TRACE");
		error.setErrorType(ErrorType.UNCLASSIFIED_ERROR);
		return error;
	}

	private ObjectMapper getObjectMapper() {
		ObjectMapper om = new ObjectMapper();
		om.configure(SerializationFeature.INDENT_OUTPUT, false);
		return om;
	}
}
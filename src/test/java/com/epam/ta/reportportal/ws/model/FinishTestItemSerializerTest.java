/*
 * Copyright 2018 EPAM Systems
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

import com.epam.ta.reportportal.ws.model.issue.Issue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

/**
 * @author Pavel Bortnik
 */
public class FinishTestItemSerializerTest {

	private ObjectMapper om = getObjectMapper();

	private static final String FINISH_TEST_ITEM_RQ = "{\"attributes\":[],\"status\":\"PASSED\",\"description\":\"description\","
			+ "\"issue\":{\"autoAnalyzed\":false,\"ignoreAnalyzer\":false},\"retry\":false}";

	@Test
	public void testSerializer() throws JsonProcessingException {
		String json = om.writeValueAsString(getFinishTestItem());
		Assert.assertEquals("Incorrect serialization result", FINISH_TEST_ITEM_RQ, json);
	}

	@Test
	public void testDeserializer() throws IOException {
		FinishTestItemRQ rq = om.readValue(FINISH_TEST_ITEM_RQ.getBytes(), FinishTestItemRQ.class);
		Assert.assertEquals("Incorrect deserialization result", rq.getStatus(), "PASSED");
	}

	private FinishTestItemRQ getFinishTestItem() {
		FinishTestItemRQ finishTestItemRQ = new FinishTestItemRQ();
		finishTestItemRQ.setStatus("PASSED");
		finishTestItemRQ.setRetry(false);
		finishTestItemRQ.setDescription("description");
		finishTestItemRQ.setIssue(new Issue());
		finishTestItemRQ.setAttributes(Collections.<ItemAttributesRQ>emptySet());

		return finishTestItemRQ;
	}

	private ObjectMapper getObjectMapper() {
		ObjectMapper om = new ObjectMapper();
		om.configure(SerializationFeature.INDENT_OUTPUT, false);
		return om;
	}

}

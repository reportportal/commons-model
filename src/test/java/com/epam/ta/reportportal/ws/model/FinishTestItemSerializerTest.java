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

import com.epam.ta.reportportal.ws.reporting.ItemAttributesRQ;
import com.epam.ta.reportportal.ws.reporting.Issue;
import com.epam.ta.reportportal.ws.reporting.FinishTestItemRQ;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
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
		FinishTestItemRQ rq = om.readValue(FINISH_TEST_ITEM_RQ.getBytes(StandardCharsets.UTF_8), FinishTestItemRQ.class);
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

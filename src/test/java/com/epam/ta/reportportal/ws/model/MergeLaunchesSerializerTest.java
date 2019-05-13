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

import com.epam.ta.reportportal.ws.model.attribute.ItemAttributeResource;
import com.epam.ta.reportportal.ws.model.launch.MergeLaunchesRQ;
import com.epam.ta.reportportal.ws.model.launch.Mode;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.Date;

/**
 * @author Pavel Bortnik
 */
public class MergeLaunchesSerializerTest {

	private static final String EXPECTED_JSON = "{\"name\":\"name\","
			+ "\"description\":\"description\",\"attributes\":[{\"key\":\"key\",\"value\":\"value\"}],\"startTime\":0,\"mode\":\"DEFAULT\","
			+ "\"launches\":[1],\"endTime\":1,\"mergeType\":\"BASIC\",\"extendSuitesDescription\":true}";

	private ObjectMapper om = new ObjectMapper();

	@Test
	public void testSerializer() throws JsonProcessingException {
		MergeLaunchesRQ rq = getMergeLaunches();
		String json = om.writeValueAsString(rq);
		Assert.assertEquals("Incorrect serialization result", EXPECTED_JSON, json);
	}

	@Test
	public void testDeserializer() throws IOException {
		MergeLaunchesRQ rq = om.readValue(EXPECTED_JSON.getBytes(), MergeLaunchesRQ.class);
		Assert.assertEquals("Incorrect deserialization result", getMergeLaunches(), rq);
	}

	private MergeLaunchesRQ getMergeLaunches() {
		MergeLaunchesRQ rq = new MergeLaunchesRQ();
		rq.setName("name");
		rq.setDescription("description");
		rq.setMode(Mode.DEFAULT);
		rq.setStartTime(new Date(0));
		ItemAttributeResource itemAttributeResource = new ItemAttributeResource("key", "value");
		rq.setAttributes(Collections.singleton(itemAttributeResource));
		rq.setEndTime(new Date(1));
		rq.setExtendSuitesDescription(true);
		rq.setLaunches(Collections.singleton(1L));
		rq.setMergeStrategyType("BASIC");
		return rq;
	}

}

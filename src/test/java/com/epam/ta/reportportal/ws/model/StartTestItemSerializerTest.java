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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Test Item custom serializer test
 *
 * @author Andrei Varabyeu
 */
public class StartTestItemSerializerTest {

	private ObjectMapper om = getObjectMapper();

	private static final String START_ITEM_RQ = "{\"description\":\"description\",\"launch_id\":\"some id\",\"type\":\"LAUNCH\",\"rerun\":false}";

	@Test
	public void testSerializer() throws JsonProcessingException {
		String json = om.writeValueAsString(getStartTestItem());
		Assert.assertEquals("Incorrect serialization result", START_ITEM_RQ, json);
	}

	@Test
	public void testDeserializer() throws IOException {
		StartTestItemRQ rq = om.readValue(START_ITEM_RQ.toLowerCase().getBytes(), StartTestItemRQ.class);
		Assert.assertEquals("Incorrect deserialization result", rq.getType(), "LAUNCH");
	}

	private StartTestItemRQ getStartTestItem() {
		StartTestItemRQ startTestItem = new StartTestItemRQ();
		startTestItem.setDescription("description");
		startTestItem.setLaunchId("some id");
		startTestItem.setType("launch");

		return startTestItem;
	}

	private ObjectMapper getObjectMapper() {
		ObjectMapper om = new ObjectMapper();
		om.configure(SerializationFeature.INDENT_OUTPUT, false);
		return om;
	}
}
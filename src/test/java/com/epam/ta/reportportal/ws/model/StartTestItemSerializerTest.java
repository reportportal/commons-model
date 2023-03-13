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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test Item custom serializer test
 *
 * @author Andrei Varabyeu
 */
public class StartTestItemSerializerTest {

  private static final String START_ITEM_RQ = "{\"launchUuid\":\"1\",\"description\":\"description\",\"type\":\"LAUNCH\",\"retry\":false,\"hasStats\":true}";
  private ObjectMapper om = getObjectMapper();

  @Test
  public void testSerializer() throws JsonProcessingException {
    String json = om.writeValueAsString(getStartTestItem());
    Assert.assertEquals("Incorrect serialization result", START_ITEM_RQ, json);
  }

  @Test
  public void testDeserializer() throws IOException {
    StartTestItemRQ rq = om.readValue(START_ITEM_RQ, StartTestItemRQ.class);
    Assert.assertEquals("Incorrect deserialization result", rq.getType(), "LAUNCH");
  }

  private StartTestItemRQ getStartTestItem() {
    StartTestItemRQ startTestItem = new StartTestItemRQ();
    startTestItem.setDescription("description");
    startTestItem.setLaunchUuid("1");
    startTestItem.setType("launch");
    startTestItem.setRetry(false);

    return startTestItem;
  }

  private ObjectMapper getObjectMapper() {
    ObjectMapper om = new ObjectMapper();
    om.configure(SerializationFeature.INDENT_OUTPUT, false);
    return om;
  }
}
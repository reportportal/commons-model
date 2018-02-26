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

    private static final String EXPECTED_JSON = "{\"name\":\"name\"," +
            "\"description\":\"description\",\"tags\":[\"tag\"],\"start_time\":0,\"mode\":\"DEFAULT\"," +
            "\"launches\":[1],\"end_time\":1,\"merge_type\":\"BASIC\",\"extendSuitesDescription\":true}";

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
        rq.setTags(Collections.singleton("tag"));
        rq.setEndTime(new Date(1));
        rq.setExtendSuitesDescription(true);
        rq.setLaunches(Collections.singleton(1L));
        rq.setMergeStrategyType("BASIC");
        return rq;
    }

}

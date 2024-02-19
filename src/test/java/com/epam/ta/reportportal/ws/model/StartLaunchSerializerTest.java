package com.epam.ta.reportportal.ws.model;

import com.epam.ta.reportportal.ws.reporting.StartLaunchRS;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author <a href="mailto:pavel_bortnik@epam.com">Pavel Bortnik</a>
 */
public class StartLaunchSerializerTest {

	private ObjectMapper om = getObjectMapper();

	@Test
	public void testSerializerNotNull() throws JsonProcessingException {
		String json = om.writeValueAsString(getLaunchRs());
		Assert.assertEquals("Incorrect serialization result", "{\"id\":\"1\"}", json);
	}

	@Test
	public void testSerializerFull() throws JsonProcessingException {
		final StartLaunchRS startTestItem = getLaunchRs();
		startTestItem.setNumber(1L);
		String json = om.writeValueAsString(startTestItem);
		Assert.assertEquals("Incorrect serialization result", "{\"id\":\"1\",\"number\":1}", json);
	}

	private StartLaunchRS getLaunchRs() {
		StartLaunchRS rs = new StartLaunchRS();
		rs.setId("1");
		rs.setNumber(null);
		return rs;
	}

	private ObjectMapper getObjectMapper() {
		ObjectMapper om = new ObjectMapper();
		om.configure(SerializationFeature.INDENT_OUTPUT, false);
		return om;
	}

}

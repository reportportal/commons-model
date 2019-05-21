package com.epam.ta.reportportal.ws.annotations;

import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class NotNullMapValueValidatorTest {

	private static Validator validator;

	@BeforeClass
	public static void init() {
		validator = Validation.buildDefaultValidatorFactory().getValidator();
	}

	@Test
	public void nullMapTest() {
		TestClass testClass = new TestClass();

		Set<ConstraintViolation<TestClass>> constraints = validator.validate(testClass);

		assertTrue(constraints.isEmpty());
	}

	@Test
	public void nullValueTest() {
		TestClass testClass = new TestClass();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("bla", null);
		testClass.setMap(map);

		Set<ConstraintViolation<TestClass>> constraints = validator.validate(testClass);

		assertFalse(constraints.isEmpty());
	}

	private static class TestClass {

		@NotNullMapValue
		private Map<String, String> map;

		public Map<String, String> getMap() {
			return map;
		}

		public void setMap(Map<String, String> map) {
			this.map = map;
		}
	}
}
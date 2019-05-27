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

package com.epam.ta.reportportal.ws.annotations;

import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
public class InValidatorTest {

	@Test
	public void testNegative() {
		TestEntity testEntity = new TestEntity();
		testEntity.setField("notAllowed");

		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<TestEntity>> constraints = validator.validate(testEntity);

		boolean found = false;
		for (ConstraintViolation<?> cv : constraints) {
			if ("field".equals(cv.getPropertyPath().iterator().next().getName()) && cv.getMessage().contains("not allowed")) {
				found = true;
				break;
			}
		}

		assertTrue(found);
	}

	@Test
	public void testPositive() {
		TestEntity testEntity = new TestEntity();
		testEntity.setField("ALLowed1");

		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<TestEntity>> constraints = validator.validate(testEntity);

		boolean found = false;
		for (ConstraintViolation<?> cv : constraints) {
			if ("field".equals(cv.getPropertyPath().iterator().next().getName()) && cv.getMessage().contains("not allowed")) {
				found = true;
				break;
			}
		}

		assertFalse(found);
	}

	@Test
	public void testNull() {
		TestEntity testEntity = new TestEntity();
		testEntity.setField(null);

		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<TestEntity>> constraints = validator.validate(testEntity);

		boolean found = false;
		for (ConstraintViolation<?> cv : constraints) {
			if ("field".equals(cv.getPropertyPath().iterator().next().getName()) && cv.getMessage().contains("not allowed")) {
				found = true;
				break;
			}
		}

		assertFalse(found);
	}

	private class TestEntity {

		@In(allowedValues = { "allowed1", "allowed2" })
		private String field;

		public String getField() {
			return field;
		}

		public void setField(String field) {
			this.field = field;
		}
	}
}
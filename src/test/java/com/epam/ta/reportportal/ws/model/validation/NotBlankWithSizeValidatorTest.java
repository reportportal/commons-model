/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.epam.ta.reportportal.ws.model.validation;

import com.epam.ta.reportportal.ws.annotations.NotBlankWithSize;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

import static org.apache.commons.lang3.StringUtils.EMPTY;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author <a href="mailto:tatyana_gladysheva@epam.com">Tatyana Gladysheva</a>
 */
@RunWith(MockitoJUnitRunner.class)
public class NotBlankWithSizeValidatorTest {

	private static final String NOT_NULL_PROPERTY = "{NotNull}";
	private static final String NOT_BLANK_PROPERTY = "{NotBlank}";
	private static final String SIZE_PROPERTY = "{Size}";
	private static final String SPACE = " ";

	private static Validator validator;

	@BeforeClass
	public static void init() {
		validator = Validation.buildDefaultValidatorFactory().getValidator();
	}

	@Test
	public void validateShouldReturnNoViolationsWhenNameIsValid() {
		//GIVEN
		String name = "Valid name";
		TestClass testObject = new TestClass();
		testObject.setName(name);

		//WHEN
		Set<ConstraintViolation<TestClass>> violations = validator.validate(testObject);

		//THEN
		assertThat(violations.isEmpty(), is(true));
	}

	@Test
	public void validateShouldReturnOneViolationWithNotNullMessageWhenNameIsNull() {
		//GIVEN
		TestClass testObject = new TestClass();
		testObject.setName(null);

		//WHEN
		Set<ConstraintViolation<TestClass>> violations = validator.validate(testObject);

		//THEN
		assertThat(violations.size(), is(1));

		ConstraintViolation<TestClass> violation = violations.iterator().next();
		String actualMessage = violation.getMessage();

		assertThat(actualMessage, is(NOT_NULL_PROPERTY));
	}

	@Test
	public void validateShouldReturnOneViolationWithNotBlankMessageWhenNameIsEmpty() {
		//GIVEN
		TestClass testObject = new TestClass();
		testObject.setName(EMPTY);

		String expectedMessage = NOT_BLANK_PROPERTY + SPACE + SIZE_PROPERTY;

		//WHEN
		Set<ConstraintViolation<TestClass>> violations = validator.validate(testObject);

		//THEN
		assertThat(violations.size(), is(1));

		ConstraintViolation<TestClass> violation = violations.iterator().next();
		String actualMessage = violation.getMessage();

		assertThat(actualMessage, is(expectedMessage));
	}

	@Test
	public void validateShouldReturnOneViolationWithNotBlankMessageWhenNameConsistsOfWhitespaces() {
		//GIVEN
		String name = "                   ";
		TestClass testObject = new TestClass();
		testObject.setName(name);

		String expectedMessage = NOT_BLANK_PROPERTY + SPACE + SIZE_PROPERTY;

		//WHEN
		Set<ConstraintViolation<TestClass>> violations = validator.validate(testObject);

		//THEN
		assertThat(violations.size(), is(1));

		ConstraintViolation<TestClass> violation = violations.iterator().next();
		String actualMessage = violation.getMessage();

		assertThat(actualMessage, is(expectedMessage));
	}

	@Test
	public void validateShouldReturnOneViolationWithSizeMessageWhenNameHasLessThanMinNumberOfCharacters() {
		//GIVEN
		String name = "cc";

		TestClass testObject = new TestClass();
		testObject.setName(name);

		//WHEN
		Set<ConstraintViolation<TestClass>> violations = validator.validate(testObject);

		//THEN
		assertThat(violations.size(), is(1));

		ConstraintViolation<TestClass> violation = violations.iterator().next();
		String actualMessage = violation.getMessage();

		assertThat(actualMessage, is(SIZE_PROPERTY));
	}

	@Test
	public void validateShouldReturnOneViolationWithSizeMessageWhenNameHasMoreThanMaxNumberOfCharacters() {
		//GIVEN
		String name = "ttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt";

		TestClass testObject = new TestClass();
		testObject.setName(name);

		//WHEN
		Set<ConstraintViolation<TestClass>> violations = validator.validate(testObject);

		//THEN
		assertThat(violations.size(), is(1));

		ConstraintViolation<TestClass> violation = violations.iterator().next();
		String actualMessage = violation.getMessage();

		assertThat(actualMessage, is(SIZE_PROPERTY));
	}

	@Test
	public void validateShouldReturnNoViolationsWhenNameHasNumberOfCharactersEqualToMin() {
		//GIVEN
		String name = "ccc";
		TestClass testObject = new TestClass();
		testObject.setName(name);

		//WHEN
		Set<ConstraintViolation<TestClass>> violations = validator.validate(testObject);

		//THEN
		assertThat(violations.isEmpty(), is(true));
	}

	@Test
	public void validateShouldReturnNoViolationsWhenNameHasNumberOfCharactersEqualToMax() {
		//GIVEN
		String name = "tttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt";
		TestClass testObject = new TestClass();
		testObject.setName(name);

		//WHEN
		Set<ConstraintViolation<TestClass>> violations = validator.validate(testObject);

		//THEN
		assertThat(violations.isEmpty(), is(true));
	}

	private class TestClass {

		@NotBlankWithSize(min = 3, max = 128)
		private String name;

		public String getName() {
			return name;
		}

		void setName(String name) {
			this.name = name;
		}
	}
}
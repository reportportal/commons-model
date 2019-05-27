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

import com.epam.ta.reportportal.ws.model.attribute.ItemAttributeResource;
import com.epam.ta.reportportal.ws.model.launch.UpdateLaunchRQ;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Pavel Bortnik
 */
public class ElementLengthValidatorTest {

	private static Validator validator;

	@BeforeClass
	public static void init() {
		validator = Validation.buildDefaultValidatorFactory().getValidator();
	}

	@Test
	public void testElementLengthValidatorNegative() {
		final char[] charArray = new char[270];
		Arrays.fill(charArray, 't');
		UpdateLaunchRQ rq = new UpdateLaunchRQ();
		rq.setAttributes(new HashSet<ItemAttributeResource>() {{
			add(new ItemAttributeResource(new String(charArray), "qwerty"));
		}});
		Set<ConstraintViolation<UpdateLaunchRQ>> constraints = validator.validate(rq);
		Assert.assertTrue("Constraint found", constraints.size() > 0);
	}

	@Test
	public void testElementLengthValidator() {
		final char[] charArray = new char[120];
		Arrays.fill(charArray, 't');
		UpdateLaunchRQ rq = new UpdateLaunchRQ();
		rq.setAttributes(new HashSet<ItemAttributeResource>() {{
			add(new ItemAttributeResource(new String(charArray), "qwerty"));
		}});
		Set<ConstraintViolation<UpdateLaunchRQ>> constraints = validator.validate(rq);
		Assert.assertTrue("Constraints not found", constraints.isEmpty());
	}
}
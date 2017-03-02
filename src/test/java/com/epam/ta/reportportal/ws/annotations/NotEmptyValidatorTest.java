/*
 * Copyright 2017 EPAM Systems
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
package com.epam.ta.reportportal.ws.annotations;

import com.epam.ta.reportportal.ws.model.StartRQ;
import org.junit.Assert;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * @author Andrei Varabyeu
 */
public class NotEmptyValidatorTest {

	@Test
	public void testNotEmptyValidator() {
		StartRQ startRQ = new StartRQ();
		startRQ.setName("");

		//Getting Validator instance with Annotations
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();

		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<StartRQ>> constraints = validator.validate(startRQ);

		boolean found = false;
		for (ConstraintViolation<?> cv : constraints) {
			if ("name".equals(cv.getPropertyPath().iterator().next().getName()) && cv.getMessage().contains("empty")) {
				found = true;
				break;
			}
		}
		Assert.assertTrue("Constraint not found", found);

	}
}
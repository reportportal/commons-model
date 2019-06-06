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

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
public class InCollectionValidator implements ConstraintValidator<In, Collection<String>> {

	private String[] allowedValues;

	@Override
	public void initialize(In constraintAnnotation) {
		allowedValues = new String[constraintAnnotation.allowedValues().length];
		for (int i = 0; i < constraintAnnotation.allowedValues().length; i++) {
			allowedValues[i] = constraintAnnotation.allowedValues()[i].toUpperCase();
		}
	}

	@Override
	public boolean isValid(Collection<String> value, ConstraintValidatorContext context) {
		List<String> upperCaseList = new ArrayList<String>();
		for (String next : value) {
			upperCaseList.add(next.toUpperCase());
		}
		return Arrays.asList(allowedValues).containsAll(upperCaseList);
	}
}

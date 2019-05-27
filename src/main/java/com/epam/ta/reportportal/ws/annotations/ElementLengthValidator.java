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

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Collection;

public class ElementLengthValidator implements ConstraintValidator<ElementLength, Collection<ItemAttributeResource>> {

    private ElementLength length;

    @Override
    public void initialize(ElementLength constraintAnnotation) {
        length = constraintAnnotation;
    }

    @Override
	public boolean isValid(Collection<ItemAttributeResource> value, ConstraintValidatorContext context) {
        if (null == value || value.isEmpty()) {
            return true;
        }
		for (ItemAttributeResource attr : value) {
			String key = attr.getKey();
			String val = attr.getValue();
			if (key != null) {
				if (key.length() < length.min() || key.length() > length.max()) {
					return false;
				}
			}
			if (val != null) {
				if (val.length() < length.min() || val.length() > length.max()) {
					return false;
				}
            }
        }
        return true;
    }
}

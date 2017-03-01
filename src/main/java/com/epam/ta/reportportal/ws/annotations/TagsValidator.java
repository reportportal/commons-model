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

package com.epam.ta.reportportal.ws.annotations;

import com.epam.ta.reportportal.ws.model.ValidationConstraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Collection;


/**
 * Length of the all tags shouldn't be over {@link ValidationConstraints#MAX_NAME_LENGTH}
 *
 * @author Pavel Bortnik
 */
public class TagsValidator implements ConstraintValidator<Tags, Collection<String>> {

    @Override
    public void initialize(Tags constraintAnnotation) {

    }

    @Override
    public boolean isValid(Collection<String> value, ConstraintValidatorContext context) {
        if (value == null){
            return true;
        }
        for(String tag: value){
            if (tag.length() > ValidationConstraints.MAX_NAME_LENGTH){
                return false;
            }
        }
        return true;
    }
}

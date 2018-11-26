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

import com.epam.ta.reportportal.ws.model.launch.UpdateLaunchRQ;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Arrays;
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
/*        rq.setTags(new HashSet<String>() {{
            add(new String(charArray));
        }});*/
        Set<ConstraintViolation<UpdateLaunchRQ>> constraints = validator.validate(rq);
        Assert.assertTrue("Constraint found", constraints.size() > 0);
    }

    @Test
    public void testElementLengthValidator() {
        final char[] charArray = new char[120];
        Arrays.fill(charArray, 't');
        UpdateLaunchRQ rq = new UpdateLaunchRQ();
/*        rq.setTags(new HashSet<String>() {{
            add(new String(charArray));
        }});*/
        Set<ConstraintViolation<UpdateLaunchRQ>> constraints = validator.validate(rq);
        Assert.assertTrue("Constraints not found", constraints.isEmpty());
    }
}
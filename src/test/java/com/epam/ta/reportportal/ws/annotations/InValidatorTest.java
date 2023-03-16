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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
public class InValidatorTest {

  private static Validator validator;

  @BeforeClass
  public static void init() {
    validator = Validation.buildDefaultValidatorFactory().getValidator();
  }

  @Test
  public void testNegative() {
    StringTestEntity stringTestEntity = new StringTestEntity();
    stringTestEntity.setField("notAllowed");

    Set<ConstraintViolation<StringTestEntity>> constraints = validator.validate(stringTestEntity);

    boolean found = false;
    for (ConstraintViolation<?> cv : constraints) {
      if ("field".equals(cv.getPropertyPath().iterator().next().getName()) && cv.getMessage()
          .contains("not allowed")) {
        found = true;
        break;
      }
    }

    assertTrue(found);
  }

  @Test
  public void testPositive() {
    StringTestEntity stringTestEntity = new StringTestEntity();
    stringTestEntity.setField("ALLowed1");

    Set<ConstraintViolation<StringTestEntity>> constraints = validator.validate(stringTestEntity);

    boolean found = false;
    for (ConstraintViolation<?> cv : constraints) {
      if ("field".equals(cv.getPropertyPath().iterator().next().getName()) && cv.getMessage()
          .contains("not allowed")) {
        found = true;
        break;
      }
    }

    assertFalse(found);
  }

  @Test
  public void testNull() {
    StringTestEntity stringTestEntity = new StringTestEntity();
    stringTestEntity.setField(null);

    Set<ConstraintViolation<StringTestEntity>> constraints = validator.validate(stringTestEntity);

    boolean found = false;
    for (ConstraintViolation<?> cv : constraints) {
      if ("field".equals(cv.getPropertyPath().iterator().next().getName()) && cv.getMessage()
          .contains("not allowed")) {
        found = true;
        break;
      }
    }

    assertFalse(found);
  }

  @Test
  public void testCollectionPositive() {
    CollectionTestEntity collectionTestEntity = new CollectionTestEntity();
    collectionTestEntity.setField(Arrays.asList("ALLOWED1", "allowed2"));

    Set<ConstraintViolation<CollectionTestEntity>> constaints = validator.validate(
        collectionTestEntity);

    assertTrue(constaints.isEmpty());
  }

  @Test
  public void testCollectionNegative() {
    CollectionTestEntity collectionTestEntity = new CollectionTestEntity();
    collectionTestEntity.setField(Arrays.asList("notAllowed", "allowed1", "allowed2"));

    Set<ConstraintViolation<CollectionTestEntity>> constaints = validator.validate(
        collectionTestEntity);

    assertFalse(constaints.isEmpty());
  }

  private static class StringTestEntity {

    @In(allowedValues = {"allowed1", "allowed2"})
    private String field;

    public String getField() {
      return field;
    }

    public void setField(String field) {
      this.field = field;
    }
  }

  private static class CollectionTestEntity {

    @In(allowedValues = {"allowed1", "allowed2"})
    private List<String> field;

    public List<String> getField() {
      return field;
    }

    public void setField(List<String> field) {
      this.field = field;
    }
  }
}
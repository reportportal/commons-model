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
package com.epam.ta.reportportal.ws.model;

import java.util.HashSet;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Dzmitry_Kavalets
 */
public class ErrorTypeTest {

  @Test
  public void duplicateCodes() {
    final int length = ErrorType.values().length;
    Set<Integer> codes = new HashSet<Integer>();
    for (ErrorType errorType : ErrorType.values()) {
      codes.add(errorType.getCode());
    }
    Assert.assertEquals(length, codes.size());
  }
}
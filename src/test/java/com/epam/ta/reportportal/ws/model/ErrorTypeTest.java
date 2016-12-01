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
package com.epam.ta.reportportal.ws.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

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
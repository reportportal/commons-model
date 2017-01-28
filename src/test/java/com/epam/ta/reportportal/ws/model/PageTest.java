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

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * Tests for {@link Page.PageMetadata}
 * Initially grabbed from Spring's <a href="https://github.com/spring-projects/spring-hateoas/blob/642b6736764068ffeee38379629db5fc15cf927d/src/test/java/org/springframework/hateoas/PagedResourcesUnitTest.java">PagedResourcesUnitTest.java</a>
 *
 * @author Andrei Varabyeu
 */
public class PageTest {

    private static final Page.PageMetadata METADATA = new Page.PageMetadata(10, 1, 200);

    @Test(expected = IllegalArgumentException.class)
    public void preventsNegativePageSize() {
        new Page.PageMetadata(-1, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void preventsNegativePageNumber() {
        new Page.PageMetadata(0, -1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void preventsNegativeTotalElements() {
        new Page.PageMetadata(0, 0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void preventsNegativeTotalPages() {
        new Page.PageMetadata(0, 0, 0, -1);
    }

    @Test
    public void allowsOneIndexedPages() {
        new Page.PageMetadata(10, 1, 0);
    }

    @Test
    public void calculatesTotalPagesCorrectly() {
        assertThat(new Page.PageMetadata(5, 0, 16).getTotalPages(), CoreMatchers.is(4L));
    }
}


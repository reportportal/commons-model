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

package com.epam.ta.reportportal.ws.model.filter;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.*;

/**
 * Part of widget domain object. This class contains parameters for selecting
 * widget content <br>
 * IE sorting, number of items.
 * 
 * @author Aliaksei_Makayed
 * 
 */
@JsonInclude(Include.NON_NULL)
public class SelectionParameters {

	@Min(value = MIN_COLLECTION_SIZE)
	@JsonProperty(value = "orders", required = true)
	private List<Order> orders;

	@Min(value = MIN_PAGE_NUMBER)
	@Max(value = MAX_PAGE_NUMBER)
	@JsonProperty(value = "page_number")
	private int pageNumber;

	public SelectionParameters() {
		// by default page number shouldn't be 0 because
		// spring paging model can't load page with number 0
		this.pageNumber = 1;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		SelectionParameters that = (SelectionParameters) o;

		if (pageNumber != that.pageNumber) {
			return false;
		}
		return orders != null ? orders.equals(that.orders) : that.orders == null;
	}

	@Override
	public int hashCode() {
		int result = orders != null ? orders.hashCode() : 0;
		result = 31 * result + pageNumber;
		return result;
	}

	@Override
	public String toString() {
		return "SelectionParameters{" + "orders=" + orders + ", pageNumber=" + pageNumber + '}';
	}
}
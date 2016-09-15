/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/epam/ReportPortal
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

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

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
	
	@NotNull
	@JsonProperty(value = "sorting_column", required = true)
	private String sortingColumnName;

	@NotNull
	@JsonProperty(value = "is_asc", required = true)
	private boolean isAsc;

	@NotNull
	@Min(value = MIN_FILTER_LIMIT)
	@Max(value = MAX_FILTER_LIMIT)
	@JsonProperty(value = "quantity", required = true)
	private int quantity;

	@Min(value = MIN_PAGE_NUMBER)
	@Max(value = MAX_PAGE_NUMBER)
	@JsonProperty(value = "page_number")
	private int pageNumber;
	
	public SelectionParameters() {
		// by default page number shouldn't be 0 because 
		// spring paging model can't load page with number 0
		this.pageNumber = 1;
	}
	
	public String getSortingColumnName() {
		return sortingColumnName;
	}

	public void setSortingColumnName(String sortingColumnName) {
		this.sortingColumnName = sortingColumnName;
	}

	public boolean getIsAsc() {
		return isAsc;
	}

	public void setIsAsc(boolean isAsc) {
		this.isAsc = isAsc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isAsc ? 1231 : 1237);
		result = prime * result + pageNumber;
		result = prime * result + quantity;
		result = prime * result + ((sortingColumnName == null) ? 0 : sortingColumnName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SelectionParameters other = (SelectionParameters) obj;
		if (isAsc != other.isAsc)
			return false;
		if (pageNumber != other.pageNumber)
			return false;
		if (quantity != other.quantity)
			return false;
		if (sortingColumnName == null) {
			if (other.sortingColumnName != null)
				return false;
		} else if (!sortingColumnName.equals(other.sortingColumnName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("SelectionParameters{");
		sb.append("sortingColumnName='").append(sortingColumnName).append('\'');
		sb.append(", isAsc=").append(isAsc);
		sb.append(", quantity=").append(quantity);
		sb.append(", pageNumber=").append(pageNumber);
		sb.append('}');
		return sb.toString();
	}
}
package com.epam.ta.reportportal.ws.model.filter;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

/**
 * @author Pavel Bortnik
 */
public class Order {

	@NotNull
	@JsonProperty(value = "sorting_column", required = true)
	private String sortingColumnName;

	@NotNull
	@JsonProperty(value = "is_asc", required = true)
	private boolean isAsc;

	public String getSortingColumnName() {
		return sortingColumnName;
	}

	public void setSortingColumnName(String sortingColumnName) {
		this.sortingColumnName = sortingColumnName;
	}

	public boolean isAsc() {
		return isAsc;
	}

	public void setIsAsc(boolean isAsc) {
		this.isAsc = isAsc;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Order order = (Order) o;

		if (isAsc != order.isAsc) {
			return false;
		}
		return sortingColumnName != null ? sortingColumnName.equals(order.sortingColumnName) : order.sortingColumnName == null;
	}

	@Override
	public int hashCode() {
		int result = sortingColumnName != null ? sortingColumnName.hashCode() : 0;
		result = 31 * result + (isAsc ? 1 : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Order{" + "sortingColumnName='" + sortingColumnName + '\'' + ", isAsc=" + isAsc + '}';
	}
}

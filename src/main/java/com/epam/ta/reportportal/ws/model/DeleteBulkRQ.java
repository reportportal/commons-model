package com.epam.ta.reportportal.ws.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
public class DeleteBulkRQ {

	@NotNull
	@JsonProperty(value = "ids")
	private List<Long> ids;

	public DeleteBulkRQ() {
	}

	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	@Override
	public String toString() {
		return "DeleteBulkRQ{" + "ids=" + ids + '}';
	}
}

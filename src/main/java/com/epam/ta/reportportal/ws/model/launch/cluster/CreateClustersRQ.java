package com.epam.ta.reportportal.ws.model.launch.cluster;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateClustersRQ {

	@JsonProperty(value = "removeNumbers")
	private boolean removeNumbers;

	public CreateClustersRQ() {
	}

	public boolean isRemoveNumbers() {
		return removeNumbers;
	}

	public void setRemoveNumbers(boolean removeNumbers) {
		this.removeNumbers = removeNumbers;
	}
}

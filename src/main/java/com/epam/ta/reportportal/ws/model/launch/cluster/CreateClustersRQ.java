package com.epam.ta.reportportal.ws.model.launch.cluster;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateClustersRQ {

	@NotNull
	@JsonProperty(value = "launchId", required = true)
	private Long launchId;

	@JsonProperty(value = "removeNumbers")
	private boolean removeNumbers;

	public CreateClustersRQ() {
	}

	public Long getLaunchId() {
		return launchId;
	}

	public void setLaunchId(Long launchId) {
		this.launchId = launchId;
	}

	public boolean isRemoveNumbers() {
		return removeNumbers;
	}

	public void setRemoveNumbers(boolean removeNumbers) {
		this.removeNumbers = removeNumbers;
	}
}

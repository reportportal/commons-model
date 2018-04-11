package com.epam.ta.reportportal.ws.model.item;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Pavel Bortnik
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnlinkExternalIssueRq {

	@NotNull
	@JsonProperty(value = "testItemIds")
	private List<Long> testItemIds;

	@NotNull
	@JsonProperty(value = "issue_ids")
	private List<String> issueIds;

	public List<Long> getTestItemIds() {
		return testItemIds;
	}

	public void setTestItemIds(List<Long> testItemIds) {
		this.testItemIds = testItemIds;
	}

	public List<String> getIssueIds() {
		return issueIds;
	}

	public void setIssueIds(List<String> issueIds) {
		this.issueIds = issueIds;
	}
}

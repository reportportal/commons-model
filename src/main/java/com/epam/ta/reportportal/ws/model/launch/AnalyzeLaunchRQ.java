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

package com.epam.ta.reportportal.ws.model.launch;

import com.epam.ta.reportportal.ws.annotations.In;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author <a href="mailto:pavel_bortnik@epam.com">Pavel Bortnik</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnalyzeLaunchRQ {

	@NotNull
	@JsonProperty(value = "launchId", required = true)
	@ApiModelProperty
	private Long launchId;

	@NotNull
	@JsonProperty(value = "analyzerMode", required = true)
	@In(allowedValues = { "all", "launch_name", "current_launch" })
	@ApiModelProperty(allowableValues = "ALL, LAUNCH_NAME, CURRENT_LAUNCH")
	private String analyzerHistoryMode;

	@NotNull
	@JsonProperty(value = "analyzeItemsMode", required = true)
	@In(allowedValues = { "to_investigate", "auto_analyzed", "manually_analyzed" })
	@ApiModelProperty(allowableValues = "TO_INVESTIGATE, AUTO_ANALYZED, MANUALLY_ANALYZED")
	private List<String> analyzeItemsMode;

	public Long getLaunchId() {
		return launchId;
	}

	public void setLaunchId(Long launchId) {
		this.launchId = launchId;
	}

	public String getAnalyzerHistoryMode() {
		return analyzerHistoryMode;
	}

	public void setAnalyzerHistoryMode(String analyzerHistoryMode) {
		this.analyzerHistoryMode = analyzerHistoryMode;
	}

	public List<String> getAnalyzeItemsMode() {
		return analyzeItemsMode;
	}

	public void setAnalyzeItemsMode(List<String> analyzeItemsMode) {
		this.analyzeItemsMode = analyzeItemsMode;
	}
}

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

package com.epam.ta.reportportal.ws.model.project;

import com.epam.ta.reportportal.ws.annotations.In;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.*;

/**
 * @author Pavel Bortnik
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnalyzerConfig {

	@Min(value = MIN_DOC_FREQ)
	@Max(value = MAX_DOC_FREQ)
	@JsonProperty(value = "minDocFreq")
	private Integer minDocFreq;

	@Min(value = MIN_TERM_FREQ)
	@Max(value = MAX_TERM_FREQ)
	@JsonProperty(value = "minTermFreq")
	private Integer minTermFreq;

	@Min(value = MIN_SHOULD_MATCH)
	@Max(value = MAX_SHOULD_MATCH)
	@JsonProperty(value = "minShouldMatch")
	private Integer minShouldMatch;

	@Min(value = MIN_NUMBER_OF_LOG_LINES)
	@Max(value = MAX_NUMBER_OF_LOG_LINES)
	@JsonProperty(value = "numberOfLogLines")
	private Integer numberOfLogLines;

	@JsonProperty(value = "isAutoAnalyzerEnabled")
	private Boolean isAutoAnalyzerEnabled;

	@JsonProperty(value = "analyzerMode")
	@In(allowedValues = { "all", "launch_name", "current_launch" })
	@ApiModelProperty(allowableValues = "ALL, LAUNCH_NAME")
	private String analyzerMode;

	@JsonProperty(value = "indexingRunning")
	@ApiParam(hidden = true)
	private boolean indexingRunning;

	public boolean isIndexingRunning() {
		return indexingRunning;
	}

	public void setIndexingRunning(boolean indexingRunning) {
		this.indexingRunning = indexingRunning;
	}

	public Integer getMinDocFreq() {
		return minDocFreq;
	}

	public void setMinDocFreq(Integer minDocFreq) {
		this.minDocFreq = minDocFreq;
	}

	public Integer getMinTermFreq() {
		return minTermFreq;
	}

	public void setMinTermFreq(Integer minTermFreq) {
		this.minTermFreq = minTermFreq;
	}

	public Integer getMinShouldMatch() {
		return minShouldMatch;
	}

	public void setMinShouldMatch(Integer minShouldMatch) {
		this.minShouldMatch = minShouldMatch;
	}

	public Integer getNumberOfLogLines() {
		return numberOfLogLines;
	}

	public void setNumberOfLogLines(Integer numberOfLogLines) {
		this.numberOfLogLines = numberOfLogLines;
	}

	public Boolean getIsAutoAnalyzerEnabled() {
		return isAutoAnalyzerEnabled;
	}

	public void setIsAutoAnalyzerEnabled(Boolean autoAnalyzerEnabled) {
		isAutoAnalyzerEnabled = autoAnalyzerEnabled;
	}

	public String getAnalyzerMode() {
		return analyzerMode;
	}

	public void setAnalyzerMode(String analyzerMode) {
		this.analyzerMode = analyzerMode;
	}

}

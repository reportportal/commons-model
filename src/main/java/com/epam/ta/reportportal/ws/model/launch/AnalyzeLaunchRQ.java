/*
 * Copyright 2018 EPAM Systems
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

package com.epam.ta.reportportal.ws.model.launch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Pavel Bortnik
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnalyzeLaunchRQ {

	@JsonProperty(value = "launch_ids", required = true)
	@ApiModelProperty
	private List<String> launchIds;

	@JsonProperty(value = "analyzer_mode", required = true)
	@ApiModelProperty
	private String analyzerMode;

	@JsonProperty(value = "analyze_items_mode", required = true)
	@ApiModelProperty
	private List<String> analyzeItemsMode;

	public List<String> getLaunchIds() {
		return launchIds;
	}

	public void setLaunchIds(List<String> launchIds) {
		this.launchIds = launchIds;
	}

	public String getAnalyzerMode() {
		return analyzerMode;
	}

	public void setAnalyzerMode(String analyzerMode) {
		this.analyzerMode = analyzerMode;
	}

	public List<String> getAnalyzeItemsMode() {
		return analyzeItemsMode;
	}

	public void setAnalyzeItemsMode(List<String> analyzeItemsMode) {
		this.analyzeItemsMode = analyzeItemsMode;
	}
}

/*
 * Copyright 2017 EPAM Systems
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
package com.epam.ta.reportportal.ws.model.widget;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Model object for getting widget preview content
 *
 * @author Pavel Bortnik
 */

@JsonInclude(Include.NON_NULL)
public class WidgetPreviewRQ {

	@NotNull
	@JsonProperty(value = "widgetType", required = true)
	@ApiModelProperty(required = true, allowableValues = "oldLineChart, investigatedTrend, launchStatistics, statisticTrend,"
			+ " casesTrend, notPassed, overallStatistics, uniqueBugTable, bugTrend, activityStream, launchesComparisonChart,"
			+ " launchesDurationChart, launchesTable, topTestCases, flakyTestCases, passingRateSummary, passingRatePerLaunch,"
			+ " productStatus, mostTimeConsuming, cumulative")
	private String widgetType;

	@Valid
	@JsonProperty(value = "contentParameters")
	private ContentParameters contentParameters;

	@JsonProperty(value = "filterIds")
	private List<Long> filterIds;

	@NotNull
	public String getWidgetType() {
		return widgetType;
	}

	public void setWidgetType(@NotNull String widgetType) {
		this.widgetType = widgetType;
	}

	public ContentParameters getContentParameters() {
		return contentParameters;
	}

	public void setContentParameters(ContentParameters contentParameters) {
		this.contentParameters = contentParameters;
	}

	public List<Long> getFilterIds() {
		return filterIds;
	}

	public void setFilterIds(List<Long> filterIds) {
		this.filterIds = filterIds;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		WidgetPreviewRQ that = (WidgetPreviewRQ) o;

		if (!widgetType.equals(that.widgetType)) {
			return false;
		}
		if (contentParameters != null ? !contentParameters.equals(that.contentParameters) : that.contentParameters != null) {
			return false;
		}
		return filterIds != null ? filterIds.equals(that.filterIds) : that.filterIds == null;
	}

	@Override
	public int hashCode() {
		int result = widgetType.hashCode();
		result = 31 * result + (contentParameters != null ? contentParameters.hashCode() : 0);
		result = 31 * result + (filterIds != null ? filterIds.hashCode() : 0);
		return result;
	}
}

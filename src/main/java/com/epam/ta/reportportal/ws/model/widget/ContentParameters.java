/*
 * Copyright 2016 EPAM Systems
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

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MAX_WIDGET_LIMIT;
import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MIN_WIDGET_LIMIT;

/**
 * Part of widget domain object. Describe chart parameters
 *
 * @author Aliaksei_Makayed
 */
@JsonInclude(Include.NON_NULL)
public class ContentParameters {

	@NotNull
	@JsonProperty(value = "widget_type", required = true)
	@ApiModelProperty(required = true, allowableValues = "line_chart, column_chart, bar_chart, combine_pie_chart, trends_chart, "
			+ "not_passed_chart, cases_trend_chart, table, activity_panel, statistics_panel, unique_bug_table, bug_trend, "
			+ "launches_comparison_chart, launches_duration_chart, launches_table")
	private String widgetType;

	// fields for main data(for example: graphs at the chart)
	@JsonProperty(value = "content_fields", required = true)
	private List<String> contentFields;

	@NotNull
	@Min(value = MIN_WIDGET_LIMIT)
	@Max(value = MAX_WIDGET_LIMIT)
	@JsonProperty(value = "itemsCount", required = true)
	private int itemsCount;

	@JsonProperty(value = "widgetOptions")
	private Map<String, Set<String>> widgetOptions;

	public String getWidgetType() {
		return widgetType;
	}

	public void setWidgetType(String widgetType) {
		this.widgetType = widgetType;
	}

	public Map<String, Set<String>> getWidgetOptions() {
		return widgetOptions;
	}

	public void setWidgetOptions(Map<String, Set<String>> widgetOptions) {
		this.widgetOptions = widgetOptions;
	}

	public int getItemsCount() {
		return itemsCount;
	}

	public void setItemsCount(int itemsCount) {
		this.itemsCount = itemsCount;
	}

	public List<String> getContentFields() {
		return contentFields;
	}

	public void setContentFields(List<String> contentFields) {
		this.contentFields = contentFields;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		ContentParameters that = (ContentParameters) o;

		if (itemsCount != that.itemsCount) {
			return false;
		}
		if (widgetType != null ? !widgetType.equals(that.widgetType) : that.widgetType != null) {
			return false;
		}
		if (contentFields != null ? !contentFields.equals(that.contentFields) : that.contentFields != null) {
			return false;
		}
		return widgetOptions != null ? widgetOptions.equals(that.widgetOptions) : that.widgetOptions == null;
	}

	@Override
	public int hashCode() {
		int result = widgetType != null ? widgetType.hashCode() : 0;
		result = 31 * result + (contentFields != null ? contentFields.hashCode() : 0);
		result = 31 * result + itemsCount;
		result = 31 * result + (widgetOptions != null ? widgetOptions.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "ContentParameters{" + "widgetType='" + widgetType + '\'' + ", contentFields=" + contentFields + ", itemsCount=" + itemsCount
				+ ", widgetOptions=" + widgetOptions + '}';
	}
}
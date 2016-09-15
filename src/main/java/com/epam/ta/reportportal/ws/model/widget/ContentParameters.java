/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/epam/ReportPortal
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

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.*;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Part of widget domain object. Describe chart parameters
 * 
 * @author Aliaksei_Makayed
 * 
 */
@JsonInclude(Include.NON_NULL)
public class ContentParameters {

	@NotNull
	@JsonProperty(value = "type", required = true)
	@ApiModelProperty(required = true, allowableValues = "line_chart, column_chart, bar_chart, combine_pie_chart, trends_chart, "
			+ "not_passed_chart, cases_trend_chart, table, activity_panel, statistics_panel, unique_bug_table, bug_trend, "
			+ "launches_comparison_chart, launches_duration_chart, launches_table")
	private String type;

	@NotNull
	@JsonProperty(value = "gadget", required = true)
	@ApiModelProperty(required = true, allowableValues = "old_line_chart, investigated_trend, launch_statistics, "
			+ "statistic_trend, cases_trend, not_passed, overall_statistics, unique_bug_table, bug_trend, activity_stream, "
			+ "launches_comparison_chart, launches_duration_chart, launches_table, most_failed_test_cases")
	private String gadget;

	// fields names for any required meta data(for example: dots at the x axis)
	@JsonProperty(value = "metadata_fields")
	private List<String> metadataFields;

	// fields for main data(for example: graphs at the chart)
	@Size(min = MIN_COLLECTION_SIZE)
	@JsonProperty(value = "content_fields", required = true)
	private List<String> contentFields;

	@NotNull
	@Min(value = MIN_WIDGET_LIMIT)
	@Max(value = MAX_WIDGET_LIMIT)
	@JsonProperty(value = "itemsCount", required = true)
	private int itemsCount;

	@JsonProperty(value = "widgetOptions")
	private Map<String, List<String>> widgetOptions;

	public Map<String, List<String>> getWidgetOptions() {
		return widgetOptions;
	}

	public void setWidgetOptions(Map<String, List<String>> widgetOptions) {
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

	public List<String> getMetadataFields() {
		return metadataFields;
	}

	public void setMetadataFields(List<String> metadataFields) {
		this.metadataFields = metadataFields;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGadget() {
		return gadget;
	}

	public void setGadget(String value) {
		this.gadget = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contentFields == null) ? 0 : contentFields.hashCode());
		result = prime * result + ((metadataFields == null) ? 0 : metadataFields.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContentParameters other = (ContentParameters) obj;
		if (contentFields == null) {
			if (other.contentFields != null)
				return false;
		} else if (!contentFields.equals(other.contentFields))
			return false;
		if (metadataFields == null) {
			if (other.metadataFields != null)
				return false;
		} else if (!metadataFields.equals(other.metadataFields))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ContentParameters{");
		sb.append("type='").append(type).append('\'');
		sb.append(", gadget='").append(gadget).append('\'');
		sb.append(", metadataFields=").append(metadataFields);
		sb.append(", contentFields=").append(contentFields);
		sb.append('}');
		return sb.toString();
	}
}
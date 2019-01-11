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
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MAX_WIDGET_LIMIT;
import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MIN_WIDGET_LIMIT;

/**
 * Part of widget domain object. Describe chart parameters
 *
 * @author Aliaksei_Makayed
 */
@JsonInclude(Include.NON_NULL)
public class ContentParameters {

	// fields for main data(for example: graphs at the chart)
	@JsonProperty(value = "contentFields", required = true)
	private List<String> contentFields;

	@NotNull
	@Min(value = MIN_WIDGET_LIMIT)
	@Max(value = MAX_WIDGET_LIMIT)
	@JsonProperty(value = "itemsCount", required = true)
	private int itemsCount;

	@JsonProperty(value = "widgetOptions")
	@JsonSerialize(as = MapSerializer.class)
	private Map<String, Object> widgetOptions;

	public List<String> getContentFields() {
		return contentFields;
	}

	public void setContentFields(List<String> contentFields) {
		this.contentFields = contentFields;
	}

	public int getItemsCount() {
		return itemsCount;
	}

	public void setItemsCount(int itemsCount) {
		this.itemsCount = itemsCount;
	}

	public Map<String, Object> getWidgetOptions() {
		return widgetOptions;
	}

	public void setWidgetOptions(Map<String, Object> widgetOptions) {
		this.widgetOptions = widgetOptions;
	}
}
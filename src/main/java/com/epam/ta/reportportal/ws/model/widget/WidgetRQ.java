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

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.epam.ta.reportportal.ws.model.SharableEntityRQ;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Domain model object for creating and updating widget
 *
 * @author Aliaksei_Makayed
 */

@JsonInclude(Include.NON_NULL)
public class WidgetRQ extends SharableEntityRQ {

	@JsonProperty(value = "name")
	@NotEmpty
	@Size(min = ValidationConstraints.MIN_NAME_LENGTH, max = ValidationConstraints.MAX_WIDGET_NAME_LENGTH)
	private String name;

	@Valid
	@JsonProperty(value = "content_parameters")
	private ContentParameters contentParameters;

	@JsonProperty(value = "filter_id")
	private List<Long> filterIds;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	public String toString() {
		return "WidgetRQ{" + "name='" + name + '\'' + ", contentParameters=" + contentParameters + ", filterIds=" + filterIds + '}';
	}
}
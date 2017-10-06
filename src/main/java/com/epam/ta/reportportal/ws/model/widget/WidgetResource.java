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
import com.epam.ta.reportportal.ws.model.OwnedResource;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Map;

/**
 * @author Dzmitry_Kavalets
 */
public class WidgetResource extends OwnedResource {

	@NotNull
	@JsonProperty(value = "id", required = true)
	private String widgetId;

	@NotNull
	@NotEmpty
	@Size(min = ValidationConstraints.MIN_NAME_LENGTH, max = ValidationConstraints.MAX_WIDGET_NAME_LENGTH)
	@JsonProperty(value = "name", required = true)
	private String name;

	@NotNull
	@Valid
	@JsonProperty(value = "content_parameters", required = true)
	private ContentParameters contentParameters;

	@JsonProperty(value = "filter_id")
	private String filterId;

	@JsonProperty(value = "content")
	private Map<String, ?> content;

	public String getWidgetId() {
		return widgetId;
	}

	public void setWidgetId(String id) {
		this.widgetId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFilterId() {
		return filterId;
	}

	public void setFilterId(String filterId) {
		this.filterId = filterId;
	}

	public ContentParameters getContentParameters() {
		return contentParameters;
	}

	public void setContentParameters(ContentParameters contentParameters) {
		this.contentParameters = contentParameters;
	}

	public Map<String, ?> getContent() {
		return content;
	}

	public void setContent(Map<String, ?> content) {
		this.content = content;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("WidgetResource{");
		sb.append("widgetId='").append(widgetId).append('\'');
		sb.append(", name='").append(name).append('\'');
		sb.append(", contentParameters=").append(contentParameters);
		sb.append(", filterId='").append(filterId).append('\'');
		sb.append(", content=").append(content);
		sb.append('}');
		return sb.toString();
	}
}
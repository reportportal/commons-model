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
 
package com.epam.ta.reportportal.ws.model.dashboard;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.epam.ta.reportportal.ws.model.OwnedResource;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.hateoas.ResourceSupport;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain model DashBoard resource object. JSON Representation of Report Portal
 * domain object. Extends Spring's {@link ResourceSupport} class which contains
 * several fields related to HATEAOS constraint
 * 
 * @see <a href="http://en.wikipedia.org/wiki/HATEOAS">HATEOAS Description</a>
 * 
 * @author Aliaksei_Makayed
 */
@JsonInclude(Include.NON_NULL)
public class DashboardResource extends OwnedResource {

	@NotNull
	@JsonProperty(value = "id", required = true)
	@ApiModelProperty(required = true)
	private String dashboardId;

	@NotEmpty
	@NotNull
	@Size(min = ValidationConstraints.MIN_NAME_LENGTH, 
	max = ValidationConstraints.MAX_DASHBOARD_NAME_LENGTH)
	@JsonProperty(value = "name", required = true)
	@ApiModelProperty(required = true)
	private String name;

	@JsonProperty(value = "widgets")
	private List<WidgetObjectModel> widgets;

	public String getDashboardId() {
		return dashboardId;
	}

	public void setDashboardId(String dashboardId) {
		this.dashboardId = dashboardId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<WidgetObjectModel> getWidgets() {
		return widgets;
	}

	public void setWidgets(List<WidgetObjectModel> widgets) {
		this.widgets = widgets;
	}

	public static class WidgetObjectModel {
		@JsonProperty(value = "widgetId")
		private String widgetId;
		
		@JsonProperty(value = "widgetSize")
		private List<Integer> widgetSize;
		
		@JsonProperty(value = "widgetPosition")
		private List<Integer> widgetPosition;
		
		public WidgetObjectModel() {
		}
		
		public WidgetObjectModel(String widgetId, List<Integer> widgetSize, List<Integer> widgetPosition) {
			this.setWidgetId(widgetId);
			this.setWidgetSize(widgetSize);
			this.setWidgetPosition(widgetPosition);
		}
		
		public void setWidgetId(String value) {
			this.widgetId = value;
		}
		
		public String getWidgetId() {
			return widgetId;
		}
		
		public void setWidgetSize(List<Integer> value) {
			this.widgetSize = value;
		}
		
		public List<Integer> getWidgetSize() {
			return widgetSize;
		}
		
		public void setWidgetPosition(List<Integer> value) {
			this.widgetPosition = value;
		}
		
		public List<Integer> getWidgetPosition() {
			return widgetPosition;
		}

		@Override
		public String toString() {
			final StringBuilder sb = new StringBuilder("WidgetObjectModel{");
			sb.append("widgetId='").append(widgetId).append('\'');
			sb.append(", widgetSize=").append(widgetSize);
			sb.append(", widgetPosition=").append(widgetPosition);
			sb.append('}');
			return sb.toString();
		}
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("DashboardResource{");
		sb.append("dashboardId='").append(dashboardId).append('\'');
		sb.append(", name='").append(name).append('\'');
		sb.append(", widgets=").append(widgets);
		sb.append('}');
		return sb.toString();
	}
}
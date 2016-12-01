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

import javax.validation.constraints.Size;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.epam.ta.reportportal.ws.model.SharableEntityRQ;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.epam.ta.reportportal.ws.model.dashboard.DashboardResource.WidgetObjectModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain object for updating dashboards.
 * 
 * @author Aliaksei_Makayed
 * 
 */
@JsonInclude(Include.NON_NULL)
public class UpdateDashboardRQ extends SharableEntityRQ{

	@JsonProperty(value = "name")
	@NotEmpty
	@Size(min = ValidationConstraints.MIN_NAME_LENGTH, 
	max = ValidationConstraints.MAX_DASHBOARD_NAME_LENGTH)
	private String name;

	@JsonProperty(value = "addWidget")
	private WidgetObjectModel addWidget;

	@JsonProperty(value = "deleteWidget")
	private String deleteWidgetId;
	
	@JsonProperty(value = "updateWidgets")
	private List<WidgetObjectModel> widgets;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WidgetObjectModel getAddWidget() {
		return addWidget;
	}

	public void setAddWidget(WidgetObjectModel value) {
		this.addWidget = value;
	}

	public String getDeleteWidgetId() {
		return deleteWidgetId;
	}

	public void setDeleteWidgetId(String value) {
		this.deleteWidgetId = value;
	}

	public void setWidgets(List<WidgetObjectModel> value) {
		this.widgets = value;
	}
	
	public List<WidgetObjectModel> getWidgets() {
		return widgets;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("UpdateDashboardRQ{");
		sb.append("name='").append(name).append('\'');
		sb.append(", addWidget=").append(addWidget);
		sb.append(", deleteWidgetId='").append(deleteWidgetId).append('\'');
		sb.append(", widgets=").append(widgets);
		sb.append('}');
		return sb.toString();
	}
}
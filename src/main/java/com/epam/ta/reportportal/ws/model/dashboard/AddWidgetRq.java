package com.epam.ta.reportportal.ws.model.dashboard;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author Pavel Bortnik
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddWidgetRq {

	@Valid
	@NotNull
	@JsonProperty(value = "addWidget")
	private DashboardResource.WidgetObjectModel addWidget;

	public DashboardResource.WidgetObjectModel getAddWidget() {
		return addWidget;
	}

	public void setAddWidget(DashboardResource.WidgetObjectModel addWidget) {
		this.addWidget = addWidget;
	}
}

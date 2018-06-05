package com.epam.ta.reportportal.ws.model.dashboard;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Pavel Bortnik
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddWidgetRq {

	@JsonProperty(value = "add_widget")
	private DashboardResource.WidgetObjectModel objectModel;

	public DashboardResource.WidgetObjectModel getObjectModel() {
		return objectModel;
	}

	public void setObjectModel(DashboardResource.WidgetObjectModel objectModel) {
		this.objectModel = objectModel;
	}
}

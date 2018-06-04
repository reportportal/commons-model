package com.epam.ta.reportportal.ws.model.dashboard;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

/**
 * @author Pavel Bortnik
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddWidgetRq {

	@JsonProperty("widget_id")
	@NotNull
	private Long widgetId;

	@JsonProperty("dashboard_id")
	@NotNull
	private Long dashboardId;

	public Long getWidgetId() {
		return widgetId;
	}

	public void setWidgetId(Long widgetId) {
		this.widgetId = widgetId;
	}

	public Long getDashboardId() {
		return dashboardId;
	}

	public void setDashboardId(Long dashboardId) {
		this.dashboardId = dashboardId;
	}
}

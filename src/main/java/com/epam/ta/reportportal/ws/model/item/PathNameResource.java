package com.epam.ta.reportportal.ws.model.item;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Map;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PathNameResource implements Serializable {

	@JsonProperty(value = "launchPathName")
	private LaunchPathName launchPathName;

	@JsonProperty(value = "itemPaths")
	private Map<Long, String> itemPaths;

	public PathNameResource() {
	}

	public PathNameResource(LaunchPathName launchPathName, Map<Long, String> itemPaths) {
		this.launchPathName = launchPathName;
		this.itemPaths = itemPaths;
	}

	public LaunchPathName getLaunchPathName() {
		return launchPathName;
	}

	public void setLaunchPathName(LaunchPathName launchPathName) {
		this.launchPathName = launchPathName;
	}

	public Map<Long, String> getItemPaths() {
		return itemPaths;
	}

	public void setItemPaths(Map<Long, String> itemPaths) {
		this.itemPaths = itemPaths;
	}
}

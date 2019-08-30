package com.epam.ta.reportportal.ws.model.item;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PathNameResource implements Serializable {

	@JsonProperty(value = "launchPathName")
	private LaunchPathName launchPathName;

	@JsonProperty(value = "itemPaths")
	private List<ItemPathName> itemPaths;

	public PathNameResource() {
	}

	public PathNameResource(LaunchPathName launchPathName, List<ItemPathName> itemPaths) {
		this.launchPathName = launchPathName;
		this.itemPaths = itemPaths;
	}

	public LaunchPathName getLaunchPathName() {
		return launchPathName;
	}

	public void setLaunchPathName(LaunchPathName launchPathName) {
		this.launchPathName = launchPathName;
	}

	public List<ItemPathName> getItemPaths() {
		return itemPaths;
	}

	public void setItemPaths(List<ItemPathName> itemPaths) {
		this.itemPaths = itemPaths;
	}
}

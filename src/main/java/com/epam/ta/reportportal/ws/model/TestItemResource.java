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

package com.epam.ta.reportportal.ws.model;

import com.epam.ta.reportportal.ws.model.issue.Issue;
import com.epam.ta.reportportal.ws.model.statistics.StatisticsResource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * JSON Representation of Report Portal domain object
 *
 * @author Andrei Varabyeu
 * @see <a href="http://en.wikipedia.org/wiki/HATEOAS">HATEOAS Description</a>
 */
@JsonInclude(Include.NON_NULL)
public class TestItemResource {

	@JsonProperty(value = "id")
	private Long itemId;

	@JsonProperty(value = "name")
	private String name;

	@JsonProperty(value = "description")
	private String description;

	@JsonProperty(value = "parameters")
	private List<ParameterResource> parameters;

	@JsonProperty(value = "tags")
	private Set<String> tags;

	@JsonProperty(value = "type")
	private String type;

	@JsonProperty(value = "start_time")
	private Date startTime;

	@JsonProperty(value = "end_time")
	private Date endTime;

	@JsonProperty(value = "status")
	private String status;

	@JsonProperty(value = "statistics")
	private StatisticsResource statisticsResource;

	@JsonProperty(value = "parent")
	private Long parent;

	@JsonProperty(value = "path_names")
	private Map<Long, String> pathNames;

	@JsonProperty(value = "launchStatus")
	private String launchStatus;

	@JsonProperty(value = "issue")
	private Issue issue;

	@JsonProperty(value = "has_children")
	private boolean hasChildren;

	@JsonProperty(value = "launchId")
	private Long launchId;

	@JsonProperty(value = "uniqueId")
	private String uniqueId;

	@JsonProperty(value = "retries")
	private List<TestItemResource> retries;

	public List<TestItemResource> getRetries() {
		return retries;
	}

	public void setRetries(List<TestItemResource> retries) {
		this.retries = retries;
	}

	public Long getLaunchId() {
		return launchId;
	}

	public void setLaunchId(Long launchId) {
		this.launchId = launchId;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<ParameterResource> getParameters() {
		return parameters;
	}

	public void setParameters(List<ParameterResource> parameters) {
		this.parameters = parameters;
	}

	public Set<String> getTags() {
		return tags;
	}

	public void setTags(Set<String> value) {
		this.tags = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getParent() {
		return parent;
	}

	public void setParent(Long parent) {
		this.parent = parent;
	}

	public Map<Long, String> getPathNames() {
		return pathNames;
	}

	public void setPathNames(Map<Long, String> value) {
		this.pathNames = value;
	}

	public void setLaunchStatus(String value) {
		this.launchStatus = value;
	}

	public String getLaunchStatus() {
		return launchStatus;
	}

	public StatisticsResource getStatisticsResource() {
		return statisticsResource;
	}

	public void setStatisticsResource(StatisticsResource statisticsResource) {
		this.statisticsResource = statisticsResource;
	}

	public boolean isHasChildren() {
		return hasChildren;
	}

	public void setHasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	@Override
	public String toString() {
		return "TestItemResource{" + "itemId='" + itemId + '\'' + ", name='" + name + '\'' + ", description='" + description + '\''
				+ ", parameters='" + parameters + '\'' + ", tags=" + tags + ", type='" + type + '\'' + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", status='" + status + '\'' + ", statisticsResource=" + statisticsResource + ", parent='" + parent + '\''
				+ ", pathNames=" + pathNames + ", launchStatus='" + launchStatus + '\'' + ", issue=" + issue + ", hasChildren=" + hasChildren
				+ ", launchId='" + launchId + '\'' + ", uniqueId='" + uniqueId + '\'' + '}';
	}
}

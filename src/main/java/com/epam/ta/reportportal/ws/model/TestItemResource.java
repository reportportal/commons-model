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

import java.util.Date;
import java.util.Map;
import java.util.Set;

import org.springframework.hateoas.ResourceSupport;

import com.epam.ta.reportportal.ws.model.issue.Issue;
import com.epam.ta.reportportal.ws.model.statistics.Statistics;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JSON Representation of Report Portal domain object. Extends Spring's
 * {@link ResourceSupport} class which contains several fields related to
 * HATEAOS constraint
 * 
 * @see <a href="http://en.wikipedia.org/wiki/HATEOAS">HATEOAS Description</a>
 * 
 * @author Andrei Varabyeu
 * 
 */
@JsonInclude(Include.NON_NULL)
public class TestItemResource extends ResourceSupport {

	@JsonProperty(value = "id")
	private String itemId;

	@JsonProperty(value = "name")
	private String name;

	@JsonProperty(value = "description")
	private String description;
	
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
	private Statistics statistics;

	@JsonProperty(value = "parent")
	private String parent;
	
	@JsonProperty(value = "path_names")
	private Map<String, String> pathNames;
	
	@JsonProperty(value = "launchStatus")
	private String launchStatus;

	@JsonProperty(value = "issue")
	private Issue issue;

	@JsonProperty(value = "has_childs")
	private boolean hasChilds;
	
	@JsonProperty(value = "launchId")
	private String launchId;

	public String getLaunchId() {
		return launchId;
	}

	public void setLaunchId(String launchId) {
		this.launchId = launchId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
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

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}
	
	public Map<String, String> getPathNames() {
		return pathNames;
	}
	
	public void setPathNames(Map<String, String> value) {
		this.pathNames = value;
	}
	
	public void setLaunchStatus(String value) {
		this.launchStatus = value;
	}
	
	public String getLaunchStatus() {
		return launchStatus;
	}

	public Statistics getStatistics() {
		return statistics;
	}

	public void setStatistics(Statistics statistics) {
		this.statistics = statistics;
	}

	public void setHasChilds(boolean hasChilds) {
		this.hasChilds = hasChilds;
	}

	public boolean isHasChilds() {
		return hasChilds;
	}

	@Override
	public String toString() {
		return "TestItemResource{" +
				"itemId='" + itemId + '\'' +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", tags=" + tags +
				", type='" + type + '\'' +
				", startTime=" + startTime +
				", endTime=" + endTime +
				", status='" + status + '\'' +
				", statistics=" + statistics +
				", parent='" + parent + '\'' +
				", pathNames=" + pathNames +
				", launchStatus='" + launchStatus + '\'' +
				", issue=" + issue +
				", hasChilds=" + hasChilds +
				", launchId='" + launchId + '\'' +
				'}';
	}
}
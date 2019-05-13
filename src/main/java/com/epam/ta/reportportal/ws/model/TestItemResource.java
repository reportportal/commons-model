/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.ws.model;

import com.epam.ta.reportportal.ws.model.attribute.ItemAttributeResource;
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

	@JsonProperty(value = "attributes")
	private Set<ItemAttributeResource> attributes;

	@JsonProperty(value = "type")
	private String type;

	@JsonProperty(value = "startTime")
	private Date startTime;

	@JsonProperty(value = "endTime")
	private Date endTime;

	@JsonProperty(value = "status")
	private String status;

	@JsonProperty(value = "statistics")
	private StatisticsResource statisticsResource;

	@JsonProperty(value = "parent")
	private Long parent;

	@JsonProperty(value = "pathNames")
	private Map<Long, String> pathNames;

	@JsonProperty(value = "launchStatus")
	private String launchStatus;

	@JsonProperty(value = "issue")
	private Issue issue;

	@JsonProperty(value = "hasChildren")
	private boolean hasChildren;

	@JsonProperty(value = "launchId")
	private Long launchId;

	@JsonProperty(value = "uniqueId")
	private String uniqueId;

	@JsonProperty(value = "patternTemplates")
	private Set<String> patternTemplates;

	@JsonProperty(value = "retries")
	private List<TestItemResource> retries;

	@JsonProperty(value = "path")
	private String path;

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

	public Set<ItemAttributeResource> getAttributes() {
		return attributes;
	}

	public void setAttributes(Set<ItemAttributeResource> attributes) {
		this.attributes = attributes;
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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Set<String> getPatternTemplates() {
		return patternTemplates;
	}

	public void setPatternTemplates(Set<String> patternTemplates) {
		this.patternTemplates = patternTemplates;
	}

	@Override
	public String toString() {
		return "TestItemResource{" + "itemId=" + itemId + ", name='" + name + '\'' + ", description='" + description + '\''
				+ ", parameters=" + parameters + ", attributes=" + attributes + ", type='" + type + '\'' + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", status='" + status + '\'' + ", statisticsResource=" + statisticsResource + ", parent="
				+ parent + ", pathNames=" + pathNames + ", launchStatus='" + launchStatus + '\'' + ", issue=" + issue + ", hasChildren="
				+ hasChildren + ", launchId=" + launchId + ", uniqueId='" + uniqueId + '\'' + ", patternTemplates=" + patternTemplates
				+ ", retries=" + retries + ", path='" + path + '\'' + '}';
	}
}

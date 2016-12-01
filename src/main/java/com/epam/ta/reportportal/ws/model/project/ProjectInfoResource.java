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

package com.epam.ta.reportportal.ws.model.project;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.hateoas.ResourceSupport;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.epam.ta.reportportal.ws.model.ModelViews;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;

/**
 * Project info resource representation for responses<br>
 * {@link com.epam.ta.reportportal.ws.model.ModelViews.DefaultView} used as
 * default fields output<br>
 * {@link com.epam.ta.reportportal.ws.model.ModelViews.FullProjectInfoView} used
 * as extended fields output<br>
 * 
 * @author Dzmitry_Kavalets
 * @author Andrei_Ramanchuk
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectInfoResource extends ResourceSupport {

	@NotNull
	@NotEmpty
	@JsonProperty(value = "projectId")
	private String projectId;

	@NotNull
	@JsonProperty(value = "usersQuantity")
	private Integer usersQuantity;

	@NotNull
	@JsonProperty(value = "launchesQuantity")
	private Long launchesQuantity;

	@JsonProperty(value = "launchesPerUser")
	@JsonView(ModelViews.FullProjectInfoView.class)
	private List<LaunchesPerUser> launchesPerUser;

	@JsonProperty(value = "uniqueTickets")
	@JsonView(ModelViews.FullProjectInfoView.class)
	private Integer uniqueTickets;

	@JsonProperty(value = "launchesPerWeek")
	@JsonView(ModelViews.FullProjectInfoView.class)
	private String launchesPerWeek;

	@NotNull
	@JsonProperty(value = "lastRun")
	private Date lastRun;

	@NotNull
	@JsonProperty(value = "creationDate")
	private Date creationDate;

	private String entryType;

	public ProjectInfoResource() {
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public Integer getUsersQuantity() {
		return usersQuantity;
	}

	public void setUsersQuantity(Integer usersQuantity) {
		this.usersQuantity = usersQuantity;
	}

	public Long getLaunchesQuantity() {
		return launchesQuantity;
	}

	public void setLaunchesQuantity(Long launchesQuantity) {
		this.launchesQuantity = launchesQuantity;
	}

	public void setLaunchesPerUser(List<LaunchesPerUser> value) {
		this.launchesPerUser = value;
	}

	public List<LaunchesPerUser> getLaunchesPerUser() {
		return launchesPerUser;
	}

	public void setUniqueTickets(Integer value) {
		this.uniqueTickets = value;
	}

	public Integer getUniqueTickets() {
		return uniqueTickets;
	}

	public void setLaunchesPerWeek(String value) {
		this.launchesPerWeek = value;
	}

	public String getLaunchesPerWeek() {
		return launchesPerWeek;
	}

	public Date getLastRun() {
		return lastRun;
	}

	public void setLastRun(Date lastRun) {
		this.lastRun = lastRun;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getEntryType() {
		return entryType;
	}

	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}
}
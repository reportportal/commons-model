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

package com.epam.ta.reportportal.ws.model.project.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Issue sub-type resource representation
 * 
 * @author Andrei_Ramanchuk
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IssueSubTypeResource {

	@JsonProperty(value = "id")
	private Long id;

	@JsonProperty(value = "locator")
	private String locator;

	@JsonProperty(value = "typeRef")
	private String typeRef;

	@JsonProperty(value = "longName")
	private String longName;

	@JsonProperty(value = "shortName")
	private String shortName;

	@JsonProperty(value = "color")
	private String color;

	public IssueSubTypeResource() {

	}

	public IssueSubTypeResource(Long id, String locator, String typeRef, String longName, String shortName, String color) {
		this.id = id;
		this.locator = locator;
		this.typeRef = typeRef;
		this.longName = longName;
		this.shortName = shortName;
		this.color = color;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocator() {
		return locator;
	}

	public void setLocator(String locator) {
		this.locator = locator;
	}

	public String getTypeRef() {
		return typeRef;
	}

	public void setTypeRef(String typeRef) {
		this.typeRef = typeRef;
	}

	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

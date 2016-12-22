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

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Issue sub-type resource representation
 * 
 * @author Andrei_Ramanchuk
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IssueSubTypeResource extends ResourceSupport {

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

	public IssueSubTypeResource(String id, String ref, String longN, String shortN, String color) {
		this.locator = id;
		this.typeRef = ref;
		this.longName = longN;
		this.shortName = shortN;
		this.color = color;
	}

	public void setLocator(String locator) {
		this.locator = locator;
	}

	public String getLocator() {
		return locator;
	}

	public void setTypeRef(String typeRef) {
		this.typeRef = typeRef;
	}

	public String getTypeRef() {
		return typeRef;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public String getLongName() {
		return longName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
}
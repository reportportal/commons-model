/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/epam/ReportPortal
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
 
package com.epam.ta.reportportal.ws.model.favorites;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;


/**
 * Domain object for adding resources to favorites resources.
 * 
 * @author Aliaksei_Makayed
 * 
 */
@JsonInclude(Include.NON_NULL)
public class AddFavoriteResourceRQ {
	
	@NotNull
	@NotEmpty
	@JsonProperty(value = "resource_id", required = true)
	@ApiModelProperty(required = true)
	private String resourceId;
	
	@NotNull
	@JsonProperty(value = "resource_type", required = true)
	@ApiModelProperty(required = true)
	private FavoriteResourceTypes type;

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public FavoriteResourceTypes getType() {
		return type;
	}

	public void setType(FavoriteResourceTypes type) {
		this.type = type;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("AddFavoriteResourceRQ{");
		sb.append("resourceId='").append(resourceId).append('\'');
		sb.append(", type=").append(type);
		sb.append('}');
		return sb.toString();
	}
}
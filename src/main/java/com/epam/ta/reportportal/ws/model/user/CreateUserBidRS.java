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

package com.epam.ta.reportportal.ws.model.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class CreateUserBidRS {

	@JsonProperty(value = "msg")
	private String message;

	@JsonProperty(value = "bid")
	private String bid;

	@JsonProperty(value = "backLink")
	private String backLink;

	public void setMessage(String value) {
		this.message = value;
	}

	public String getMessage() {
		return message;
	}

	public void setBid(String uuid) {
		this.bid = uuid;
	}

	public String getBid() {
		return bid;
	}

	public void setBackLink(String link) {
		this.backLink = link;
	}

	public String getBackLink() {
		return backLink;
	}
}
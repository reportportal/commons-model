/*
 * Copyright 2017 EPAM Systems
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
package com.epam.ta.reportportal.ws.model.launch;

import com.epam.ta.reportportal.ws.model.EntryCreatedAsyncRS;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model of launch start resource
 *
 * @author Andrei Varabyeu
 */
public class FinishLaunchRS extends EntryCreatedAsyncRS {

	@JsonProperty("number")
	private Long number;

	@JsonProperty("link")
	private String link;

	public FinishLaunchRS() {
	}

	public FinishLaunchRS(Long id, Long number, String link) {
		super(id);
		this.number = number;
		this.link = link;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("FinishLaunchRS{");
		sb.append("number=").append(number);
		sb.append(", link='").append(link).append('\'');
		sb.append('}');
		return sb.toString();
	}
}

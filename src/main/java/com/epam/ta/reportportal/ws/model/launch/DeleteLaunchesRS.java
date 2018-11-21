/*
 * Copyright 2018 EPAM Systems
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

package com.epam.ta.reportportal.ws.model.launch;

import com.epam.ta.reportportal.ws.model.ErrorRS;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
public class DeleteLaunchesRS {

	@JsonProperty("successfullyDeleted")
	private List<Long> deleted;

	@JsonProperty("notFound")
	private List<Long> notFound;

	@JsonProperty("noPermissions")
	private List<Long> noPermissions;

	@JsonProperty("errors")
	private List<ErrorRS> errors;

	public DeleteLaunchesRS() {
	}

	public DeleteLaunchesRS(List<Long> deleted, List<Long> notFound, List<Long> noPermissions, List<ErrorRS> errors) {
		this.deleted = deleted;
		this.notFound = notFound;
		this.noPermissions = noPermissions;
		this.errors = errors;
	}

	public List<Long> getDeleted() {
		return deleted;
	}

	public void setDeleted(List<Long> deleted) {
		this.deleted = deleted;
	}

	public List<Long> getNotFound() {
		return notFound;
	}

	public void setNotFound(List<Long> notFound) {
		this.notFound = notFound;
	}

	public List<Long> getNoPermissions() {
		return noPermissions;
	}

	public void setNoPermissions(List<Long> noPermissions) {
		this.noPermissions = noPermissions;
	}

	public List<ErrorRS> getErrors() {
		return errors;
	}

	public void setErrors(List<ErrorRS> errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("DeleteLaunchesRS{");
		sb.append("deleted=").append(deleted);
		sb.append(", notFound=").append(notFound);
		sb.append(", noPermissions=").append(noPermissions);
		sb.append(", errors=").append(errors);
		sb.append('}');
		return sb.toString();
	}
}

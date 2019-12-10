/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.ws.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Size;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MAX_DESCRIPTION;
import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MIN_DESCRIPTION;

/**
 * Base entity for sharable resources. This resource should contains owner in
 * response.
 * 
 * @author Aliaksei_Makayed
 * 
 */
@JsonInclude(Include.NON_NULL)
public class OwnedResource {

	@JsonProperty(value = "owner")
	private String owner;

	@JsonProperty(value = "share")
	private boolean share;

	@Size(min = MIN_DESCRIPTION, max = MAX_DESCRIPTION)
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public boolean isShare() {
		return share;
	}

	public void setShare(boolean share) {
		this.share = share;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("OwnedResource{");
		sb.append("owner='").append(owner).append('\'');
		sb.append(", share=").append(share);
		sb.append(", description='").append(description).append('\'');
		sb.append('}');
		return sb.toString();
	}
}

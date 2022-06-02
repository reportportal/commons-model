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

package com.epam.ta.reportportal.ws.model.project.email;

import com.epam.ta.reportportal.ws.annotations.In;
import com.epam.ta.reportportal.ws.annotations.NotBlankStringCollection;
import com.epam.ta.reportportal.ws.model.attribute.ItemAttributeResource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Cases object for notifications sending declarations
 *
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class SenderCaseDTO implements Serializable {
	/**
	 * Generated SVUID
	 */
	private static final long serialVersionUID = -3546546654348861010L;

	@NotEmpty
	@JsonProperty("ruleName")
	private String ruleName;

	@NotEmpty
	@NotBlankStringCollection
	@JsonProperty(value = "recipients")
	private List<String> recipients;

	@NotBlank
	@JsonProperty(value = "sendCase")
	@In(allowedValues = { "always", "failed", "toInvestigate", "more10", "more20", "more50" })
	@ApiModelProperty(allowableValues = "ALWAYS, FAILED, MORE_10, MORE_20, MORE_50")
	private String sendCase;

	@NotBlankStringCollection
	@JsonProperty(value = "launchNames")
	private List<String> launchNames;

	@Valid
	@JsonProperty(value = "attributes")
	private Set<ItemAttributeResource> attributes;

	@JsonProperty(value = "enabled")
	private boolean enabled;

	public SenderCaseDTO() {
	}

	public SenderCaseDTO(String ruleName, List<String> recs, String sendMode, List<String> laNames, Set<ItemAttributeResource> attributes, boolean enabled) {
		this.ruleName = ruleName;
		this.recipients = recs;
		this.sendCase = sendMode;
		this.launchNames = laNames;
		this.attributes = attributes;
		this.enabled = enabled;
	}

	/* Getters and setters block */
	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public void setRecipients(List<String> recipients) {
		this.recipients = recipients;
	}

	public List<String> getRecipients() {
		return recipients;
	}

	public void setSendCase(String value) {
		this.sendCase = value;
	}

	public String getSendCase() {
		return sendCase;
	}

	public void setLaunchNames(List<String> value) {
		this.launchNames = value;
	}

	public List<String> getLaunchNames() {
		return launchNames;
	}

	public Set<ItemAttributeResource> getAttributes() {
		return attributes;
	}

	public void setAttributes(Set<ItemAttributeResource> attributes) {
		this.attributes = attributes;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/* Auto generated methods */
	@Override
	public String toString() {
		return "SenderCaseDTO{" + "ruleName=" + ruleName + "recipients=" + recipients + ", sendCase='" + sendCase + '\'' + ", launchNames=" + launchNames
				+ ", attributes=" + attributes + ", enabled=" + enabled + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SenderCaseDTO that = (SenderCaseDTO) o;
		return Objects.equals(ruleName, that.ruleName) && Objects.equals(recipients, that.recipients)
				&& Objects.equals(sendCase, that.sendCase) && Objects.equals(launchNames, that.launchNames)
				&& Objects.equals(attributes, that.attributes) && Objects.equals(enabled, that.enabled);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ruleName, recipients, sendCase, launchNames, attributes, enabled);
	}
}

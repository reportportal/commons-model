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

package com.epam.ta.reportportal.ws.model.integration.auth;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;

import javax.validation.constraints.NotEmpty;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */

@ApiModel
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SamlDetailsResource {

	private Long id;

	/**
	 * Provider name associated with IDP
	 */
	@NotEmpty
	private String identityProviderName;
	/**
	 * Alias associated with IDP
	 */
	private String identityProviderAlias;
	/**
	 * IDP metadata URL
	 */
	@NotEmpty
	private String identityProviderMetadataUrl;
	/**
	 * Attribute Name Format Id associated with IDP for user identification
	 */
	private String identityProviderNameId;
	/**
	 * IDP URL
	 */
	private String identityProviderUrl;
	/**
	 * Attribute name associated with full name of user in SAML response
	 */
	private String fullNameAttribute;
	/**
	 * Attribute name associated with first name of user in SAML response
	 */
	private String firstNameAttribute;
	/**
	 * Attribute name associated with last name of user in SAML response
	 */
	private String lastNameAttribute;
	/**
	 * Attribute name associated with email of user in SAML response
	 */
	@NotEmpty
	private String emailAttribute;
	/**
	 * Indicates IDP availability for authentication
	 */
	private boolean enabled;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentityProviderName() {
		return identityProviderName;
	}

	public void setIdentityProviderName(String identityProviderName) {
		this.identityProviderName = identityProviderName;
	}

	public String getIdentityProviderAlias() {
		return identityProviderAlias;
	}

	public void setIdentityProviderAlias(String identityProviderAlias) {
		this.identityProviderAlias = identityProviderAlias;
	}

	public String getIdentityProviderMetadataUrl() {
		return identityProviderMetadataUrl;
	}

	public void setIdentityProviderMetadataUrl(String identityProviderMetadataUrl) {
		this.identityProviderMetadataUrl = identityProviderMetadataUrl;
	}

	public String getIdentityProviderNameId() {
		return identityProviderNameId;
	}

	public void setIdentityProviderNameId(String identityProviderNameId) {
		this.identityProviderNameId = identityProviderNameId;
	}

	public String getIdentityProviderUrl() {
		return identityProviderUrl;
	}

	public void setIdentityProviderUrl(String identityProviderUrl) {
		this.identityProviderUrl = identityProviderUrl;
	}

	public String getFullNameAttribute() {
		return fullNameAttribute;
	}

	public void setFullNameAttribute(String fullNameAttribute) {
		this.fullNameAttribute = fullNameAttribute;
	}

	public String getFirstNameAttribute() {
		return firstNameAttribute;
	}

	public void setFirstNameAttribute(String firstNameAttribute) {
		this.firstNameAttribute = firstNameAttribute;
	}

	public String getLastNameAttribute() {
		return lastNameAttribute;
	}

	public void setLastNameAttribute(String lastNameAttribute) {
		this.lastNameAttribute = lastNameAttribute;
	}

	public String getEmailAttribute() {
		return emailAttribute;
	}

	public void setEmailAttribute(String emailAttribute) {
		this.emailAttribute = emailAttribute;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
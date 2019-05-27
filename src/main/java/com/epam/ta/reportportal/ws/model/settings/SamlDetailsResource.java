/*
 * Copyright 2019 EPAM Systems
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

package com.epam.ta.reportportal.ws.model.settings;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Contains information about SAML provider settings passed for configuration
 *
 * @author Yevgeniy Svalukhin
 */

@ApiModel
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SamlDetailsResource implements Serializable {
    private static final long serialVersionUID = 392039435L;

    /**
     * Provider name associated with IDP
     */
    @NotEmpty
    @NotNull
    private String identityProviderName;
    /**
     * Alias associated with IDP
     */
    private String identityProviderAlias;
    /**
     * IDP metadata URL
     */
    @NotNull
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
    @NotNull
    @NotEmpty
    private String emailAttribute;
    /**
     * Indicates IDP availability for authentication
     */
    private boolean enabled;

    public String getIdentityProviderName() {
        return identityProviderName;
    }

    public SamlDetailsResource setIdentityProviderName(String identityProviderName) {
        this.identityProviderName = identityProviderName;
        return this;
    }

    public String getIdentityProviderAlias() {
        return identityProviderAlias;
    }

    public SamlDetailsResource setIdentityProviderAlias(String identityProviderAlias) {
        this.identityProviderAlias = identityProviderAlias;
        return this;
    }

    public String getIdentityProviderMetadataUrl() {
        return identityProviderMetadataUrl;
    }

    public SamlDetailsResource setIdentityProviderMetadataUrl(String identityProviderMetadataUrl) {
        this.identityProviderMetadataUrl = identityProviderMetadataUrl;
        return this;
    }

    public String getIdentityProviderNameId() {
        return identityProviderNameId;
    }

    public SamlDetailsResource setIdentityProviderNameId(String identityProviderNameId) {
        this.identityProviderNameId = identityProviderNameId;
        return this;
    }

    public String getIdentityProviderUrl() {
        return identityProviderUrl;
    }

    public SamlDetailsResource setIdentityProviderUrl(String identityProviderUrl) {
        this.identityProviderUrl = identityProviderUrl;
        return this;
    }

    public String getFullNameAttribute() {
        return fullNameAttribute;
    }

    public SamlDetailsResource setFullNameAttribute(String fullNameAttribute) {
        this.fullNameAttribute = fullNameAttribute;
        return this;
    }

    public String getFirstNameAttribute() {
        return firstNameAttribute;
    }

    public SamlDetailsResource setFirstNameAttribute(String firstNameAttribute) {
        this.firstNameAttribute = firstNameAttribute;
        return this;
    }

    public String getLastNameAttribute() {
        return lastNameAttribute;
    }

    public SamlDetailsResource setLastNameAttribute(String lastNameAttribute) {
        this.lastNameAttribute = lastNameAttribute;
        return this;
    }

    public String getEmailAttribute() {
        return emailAttribute;
    }

    public SamlDetailsResource setEmailAttribute(String emailAttribute) {
        this.emailAttribute = emailAttribute;
        return this;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public SamlDetailsResource setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}

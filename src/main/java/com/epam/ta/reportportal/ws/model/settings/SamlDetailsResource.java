package com.epam.ta.reportportal.ws.model.settings;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@ApiModel
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SamlDetailsResource implements Serializable {
    private static final long serialVersionUID = 392039435L;

    @NotEmpty
    @NotNull
    private String identityProviderName;
    private String identityProviderAlias;
    @NotNull
    @NotEmpty
    private String identityProviderMetadataUrl;
    private String identityProviderNameId;
    private String identityProviderUrl;
    private String fullNameAttribute;
    private String firstNameAttribute;
    private String lastNameAttribute;
    @NotNull
    @NotEmpty
    private String emailAttribute;
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

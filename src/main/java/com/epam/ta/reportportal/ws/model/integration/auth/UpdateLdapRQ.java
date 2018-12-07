package com.epam.ta.reportportal.ws.model.integration.auth;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateLdapRQ implements Serializable {

	@NotNull
	@Valid
	@JsonProperty("ldapAttributes")
	private LdapAttributes ldapAttributes;

	@JsonProperty(value = "userDnPattern")
	private String userDnPattern;

	@JsonProperty(value = "userSearchFilter")
	private String userSearchFilter;

	@JsonProperty(value = "groupSearchBase")
	private String groupSearchBase;

	@JsonProperty(value = "groupSearchFilter")
	private String groupSearchFilter;

	@JsonProperty(value = "passwordEncoderType")
	private String passwordEncoderType;

	@JsonProperty(value = "passwordAttribute")
	private String passwordAttribute;

	@JsonProperty(value = "managerDn")
	private String managerDn;

	@JsonProperty(value = "managerPassword")
	private String managerPassword;

	@NotNull
	public LdapAttributes getLdapAttributes() {
		return ldapAttributes;
	}

	public void setLdapAttributes(@NotNull LdapAttributes ldapAttributes) {
		this.ldapAttributes = ldapAttributes;
	}

	public String getUserDnPattern() {
		return userDnPattern;
	}

	public void setUserDnPattern(String userDnPattern) {
		this.userDnPattern = userDnPattern;
	}

	public String getUserSearchFilter() {
		return userSearchFilter;
	}

	public void setUserSearchFilter(String userSearchFilter) {
		this.userSearchFilter = userSearchFilter;
	}

	public String getGroupSearchBase() {
		return groupSearchBase;
	}

	public void setGroupSearchBase(String groupSearchBase) {
		this.groupSearchBase = groupSearchBase;
	}

	public String getGroupSearchFilter() {
		return groupSearchFilter;
	}

	public void setGroupSearchFilter(String groupSearchFilter) {
		this.groupSearchFilter = groupSearchFilter;
	}

	public String getPasswordEncoderType() {
		return passwordEncoderType;
	}

	public void setPasswordEncoderType(String passwordEncoderType) {
		this.passwordEncoderType = passwordEncoderType;
	}

	public String getPasswordAttribute() {
		return passwordAttribute;
	}

	public void setPasswordAttribute(String passwordAttribute) {
		this.passwordAttribute = passwordAttribute;
	}

	public String getManagerDn() {
		return managerDn;
	}

	public void setManagerDn(String managerDn) {
		this.managerDn = managerDn;
	}

	public String getManagerPassword() {
		return managerPassword;
	}

	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}

	@Override
	public String toString() {
		return "UpdateLdapRQ{" + "ldapAttributes=" + ldapAttributes + ", userDnPattern='" + userDnPattern + '\'' + ", userSearchFilter='"
				+ userSearchFilter + '\'' + ", groupSearchBase='" + groupSearchBase + '\'' + ", groupSearchFilter='" + groupSearchFilter
				+ '\'' + ", passwordEncoderType='" + passwordEncoderType + '\'' + ", passwordAttribute='" + passwordAttribute + '\''
				+ ", managerDn='" + managerDn + '\'' + ", managerPassword='" + managerPassword + '\'' + '}';
	}
}

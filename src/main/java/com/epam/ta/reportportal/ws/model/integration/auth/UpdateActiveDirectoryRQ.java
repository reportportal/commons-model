package com.epam.ta.reportportal.ws.model.integration.auth;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateActiveDirectoryRQ implements Serializable {

	@NotNull
	@Valid
	@JsonProperty(value = "ldapAttributes")
	private LdapAttributes ldapAttributes;

	@NotNull
	@NotEmpty
	@JsonProperty(value = "domain")
	private String domain;

	public LdapAttributes getLdapAttributes() {
		return ldapAttributes;
	}

	public void setLdapAttributes(LdapAttributes ldapAttributes) {
		this.ldapAttributes = ldapAttributes;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "UpdateActiveDirectoryRQ{" + "ldapAttributes=" + ldapAttributes + ", domain='" + domain + '\'' + '}';
	}
}

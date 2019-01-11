package com.epam.ta.reportportal.ws.model.integration.auth;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractLdapResource implements Serializable {

	@JsonProperty(value = "ldapAttributes")
	private LdapAttributes ldapAttributes;

	public LdapAttributes getLdapAttributes() {
		return ldapAttributes;
	}

	public void setLdapAttributes(LdapAttributes ldapAttributes) {
		this.ldapAttributes = ldapAttributes;
	}

	@Override
	public String toString() {
		return "AbstractLdapResource{" + "ldapAttributes=" + ldapAttributes + '}';
	}
}

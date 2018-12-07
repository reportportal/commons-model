package com.epam.ta.reportportal.ws.model.integration.auth;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LdapAttributes implements Serializable {

	@NotNull
	private Long integrationId;

	@Pattern(regexp = "^ldaps?://.*")
	@NotEmpty
	private String url;

	@NotEmpty
	private String baseDn;

	@NotNull
	@Valid
	@JsonProperty("synchronizationAttributes")
	private SynchronizationAttributesResource synchronizationAttributes;

	@NotNull
	public Long getIntegrationId() {
		return integrationId;
	}

	public void setIntegrationId(@NotNull Long integrationId) {
		this.integrationId = integrationId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBaseDn() {
		return baseDn;
	}

	public void setBaseDn(String baseDn) {
		this.baseDn = baseDn;
	}

	public SynchronizationAttributesResource getSynchronizationAttributes() {
		return synchronizationAttributes;
	}

	public void setSynchronizationAttributes(SynchronizationAttributesResource synchronizationAttributes) {
		this.synchronizationAttributes = synchronizationAttributes;
	}

	@Override
	public String toString() {
		return "LdapAttributes{" + "integrationId=" + integrationId + ", url='" + url + '\'' + ", baseDn='" + baseDn + '\''
				+ ", synchronizationAttributes=" + synchronizationAttributes + '}';
	}
}
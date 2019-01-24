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
	@JsonProperty(value = "enabled")
	private Boolean enabled;

	@Pattern(regexp = "^ldaps?://.*")
	@NotNull
	@NotEmpty
	@JsonProperty(value = "url")
	private String url;

	@NotNull
	@NotEmpty
	@JsonProperty(value = "baseDn")
	private String baseDn;

	@NotNull
	@Valid
	@JsonProperty("synchronizationAttributes")
	private SynchronizationAttributesResource synchronizationAttributes;

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
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
		return "LdapAttributes{" + "enabled=" + enabled + ", url='" + url + '\'' + ", baseDn='"
				+ baseDn + '\'' + ", synchronizationAttributes=" + synchronizationAttributes + '}';
	}
}
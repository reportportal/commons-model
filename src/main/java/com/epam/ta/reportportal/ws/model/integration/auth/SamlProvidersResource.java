package com.epam.ta.reportportal.ws.model.integration.auth;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.Valid;
import java.util.List;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SamlProvidersResource extends AbstractAuthResource {

	@Valid
	private List<SamlResource> providers;

	public List<SamlResource> getProviders() {
		return providers;
	}

	public void setProviders(List<SamlResource> providers) {
		this.providers = providers;
	}
}

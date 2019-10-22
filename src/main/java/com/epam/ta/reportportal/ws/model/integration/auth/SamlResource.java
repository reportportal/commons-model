package com.epam.ta.reportportal.ws.model.integration.auth;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.Valid;
import java.util.List;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SamlResource extends AbstractAuthResource {

	@Valid
	private List<SamlDetails> providers;

	public List<SamlDetails> getProviders() {
		return providers;
	}

	public void setProviders(List<SamlDetails> providers) {
		this.providers = providers;
	}
}

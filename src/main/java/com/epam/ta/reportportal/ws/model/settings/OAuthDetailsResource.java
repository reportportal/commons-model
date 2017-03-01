/*
 * Copyright 2016 EPAM Systems
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

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author Andrei Varabyeu
 */
public class OAuthDetailsResource implements Serializable {

	private static final String URL_PATTERN = "^(http:\\/\\/|https:\\/\\/)?(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-z]{3}.?([a-z]+)?$\n";

	@NotEmpty
	@NotNull
	private String clientId;

	@Pattern(regexp = URL_PATTERN)
	private String accessTokenUri;

	@Pattern(regexp = URL_PATTERN)
	private String userAuthorizationUri;

	private List<String> scope;

	@NotEmpty
	@NotNull
	private String clientSecret;

	private String authenticationScheme;

	private String clientAuthenticationScheme;

	private String grantType;

	private String tokenName = "access_token";

	private Map<String, String> restrictions;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getAccessTokenUri() {
		return accessTokenUri;
	}

	public void setAccessTokenUri(String accessTokenUri) {
		this.accessTokenUri = accessTokenUri;
	}

	public List<String> getScope() {
		return scope;
	}

	public void setScope(List<String> scope) {
		this.scope = scope;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getAuthenticationScheme() {
		return authenticationScheme;
	}

	public void setAuthenticationScheme(String authenticationScheme) {
		this.authenticationScheme = authenticationScheme;
	}

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getTokenName() {
		return tokenName;
	}

	public void setTokenName(String tokenName) {
		this.tokenName = tokenName;
	}

	public Map<String, String> getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(Map<String, String> restrictions) {
		this.restrictions = restrictions;
	}

	public String getUserAuthorizationUri() {
		return userAuthorizationUri;
	}

	public void setUserAuthorizationUri(String userAuthorizationUri) {
		this.userAuthorizationUri = userAuthorizationUri;
	}

	public String getClientAuthenticationScheme() {
		return clientAuthenticationScheme;
	}

	public void setClientAuthenticationScheme(String clientAuthenticationScheme) {
		this.clientAuthenticationScheme = clientAuthenticationScheme;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		OAuthDetailsResource that = (OAuthDetailsResource) o;

		if (clientId != null ? !clientId.equals(that.clientId) : that.clientId != null)
			return false;
		if (accessTokenUri != null ? !accessTokenUri.equals(that.accessTokenUri) : that.accessTokenUri != null)
			return false;
		if (userAuthorizationUri != null ? !userAuthorizationUri.equals(that.userAuthorizationUri) : that.userAuthorizationUri != null)
			return false;
		if (scope != null ? !scope.equals(that.scope) : that.scope != null)
			return false;
		if (clientSecret != null ? !clientSecret.equals(that.clientSecret) : that.clientSecret != null)
			return false;
		if (authenticationScheme != null ? !authenticationScheme.equals(that.authenticationScheme) : that.authenticationScheme != null)
			return false;
		if (clientAuthenticationScheme != null ?
				!clientAuthenticationScheme.equals(that.clientAuthenticationScheme) :
				that.clientAuthenticationScheme != null)
			return false;
		if (grantType != null ? !grantType.equals(that.grantType) : that.grantType != null)
			return false;
		if (tokenName != null ? !tokenName.equals(that.tokenName) : that.tokenName != null)
			return false;
		return restrictions != null ? restrictions.equals(that.restrictions) : that.restrictions == null;
	}

	@Override
	public int hashCode() {
		int result = clientId != null ? clientId.hashCode() : 0;
		result = 31 * result + (accessTokenUri != null ? accessTokenUri.hashCode() : 0);
		result = 31 * result + (userAuthorizationUri != null ? userAuthorizationUri.hashCode() : 0);
		result = 31 * result + (scope != null ? scope.hashCode() : 0);
		result = 31 * result + (clientSecret != null ? clientSecret.hashCode() : 0);
		result = 31 * result + (authenticationScheme != null ? authenticationScheme.hashCode() : 0);
		result = 31 * result + (clientAuthenticationScheme != null ? clientAuthenticationScheme.hashCode() : 0);
		result = 31 * result + (grantType != null ? grantType.hashCode() : 0);
		result = 31 * result + (tokenName != null ? tokenName.hashCode() : 0);
		result = 31 * result + (restrictions != null ? restrictions.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("OAuthDetailsResource{");
		sb.append("clientId='").append(clientId).append('\'');
		sb.append(", accessTokenUri='").append(accessTokenUri).append('\'');
		sb.append(", userAuthorizationUri='").append(userAuthorizationUri).append('\'');
		sb.append(", scope=").append(scope);
		sb.append(", clientSecret='").append(clientSecret).append('\'');
		sb.append(", authenticationScheme='").append(authenticationScheme).append('\'');
		sb.append(", clientAuthenticationScheme='").append(clientAuthenticationScheme).append('\'');
		sb.append(", grantType='").append(grantType).append('\'');
		sb.append(", tokenName='").append(tokenName).append('\'');
		sb.append(", restrictions=").append(restrictions);
		sb.append('}');
		return sb.toString();
	}
}

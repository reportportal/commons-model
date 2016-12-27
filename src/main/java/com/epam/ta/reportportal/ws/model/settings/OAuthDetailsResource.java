package com.epam.ta.reportportal.ws.model.settings;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.google.common.base.MoreObjects;

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
	private String clientId;

	@Pattern(regexp = URL_PATTERN)
	private String accessTokenUri;

	@Pattern(regexp = URL_PATTERN)
	private String userAuthorizationUri;

	private List<String> scope;

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

	public Map<String, ?> getRestrictions() {
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
		return com.google.common.base.Objects.equal(clientId, that.clientId) && com.google.common.base.Objects
				.equal(accessTokenUri, that.accessTokenUri) && com.google.common.base.Objects
				.equal(userAuthorizationUri, that.userAuthorizationUri) && com.google.common.base.Objects.equal(scope, that.scope)
				&& com.google.common.base.Objects.equal(clientSecret, that.clientSecret) && com.google.common.base.Objects
				.equal(authenticationScheme, that.authenticationScheme) && com.google.common.base.Objects
				.equal(clientAuthenticationScheme, that.clientAuthenticationScheme) && com.google.common.base.Objects
				.equal(grantType, that.grantType) && com.google.common.base.Objects.equal(tokenName, that.tokenName)
				&& com.google.common.base.Objects.equal(restrictions, that.restrictions);
	}

	@Override
	public int hashCode() {
		return com.google.common.base.Objects
				.hashCode(clientId, accessTokenUri, userAuthorizationUri, scope, clientSecret, authenticationScheme,
						clientAuthenticationScheme, grantType, tokenName, restrictions);
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("clientId", clientId).add("accessTokenUri", accessTokenUri)
				.add("userAuthorizationUri", userAuthorizationUri).add("scope", scope).add("clientSecret", clientSecret)
				.add("authenticationScheme", authenticationScheme).add("clientAuthenticationScheme", clientAuthenticationScheme)
				.add("grantType", grantType).add("tokenName", tokenName).add("restrictions", restrictions).toString();
	}
}

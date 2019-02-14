package com.epam.ta.reportportal.ws.model.settings;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
public class OAuthRegistrationResourceTest {

	private final String urlRegex = OAuthRegistrationResource.URL_PATTERN;

	private final List<String> correctUrls = new ArrayList<String>() {
		{
			add("https://github.com/login/oauth/access_token");
			add("github.com/login/oauth/access_token");
			add("https://www.github.com/login/oauth/access_token");
			add("www.github.com/login/oauth/access_token");
		}

	};

	private final List<String> wrongUrls = new ArrayList<String>() {
		{
			add("http:/github.com");
			add("http://github..com");
			add("http:/github.com");
		}

	};

	@Test
	public void regexTestPositive() {
		final Pattern pattern = Pattern.compile(urlRegex);

		for (String url : correctUrls) {
			Matcher matcher = pattern.matcher(url);
			Assert.assertTrue(matcher.matches());
		}
	}

	@Test
	public void regexTestNegative() {
		final Pattern pattern = Pattern.compile(urlRegex);

		for (String url : wrongUrls) {
			Matcher matcher = pattern.matcher(url);
			Assert.assertFalse(matcher.matches());
		}
	}

}
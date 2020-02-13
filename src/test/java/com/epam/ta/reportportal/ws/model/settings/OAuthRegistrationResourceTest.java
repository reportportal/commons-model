/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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

	private static final String URL_REGEX = OAuthRegistrationResource.URL_PATTERN;

	private final List<String> correctUrls = new ArrayList<String>() {
		{
			add("https://github.com/login/oauth/access_token");
			add("github.com/login/oauth/access_token");
			add("https://www.github.com/login/oauth/access_token");
			add("www.github.com/login/oauth/access_token");
			add("http://www.github.com:8080/login/oauth/access_token");
			add("www.github.com:8080/login/oauth/access_token");
		}

	};

	private final List<String> wrongUrls = new ArrayList<String>() {
		{
			add("http:/github.com");
			add("http://github..com");
			add("http:/github.com");
			add("http:/github.com");
			add("http:/github.com/access:8080");
			add("http:/github:8080a.com");
		}

	};

	@Test
	public void regexTestPositive() {
		final Pattern pattern = Pattern.compile(URL_REGEX);

		for (String url : correctUrls) {
			Matcher matcher = pattern.matcher(url);
			Assert.assertTrue(matcher.matches());
		}
	}

	@Test
	public void regexTestNegative() {
		final Pattern pattern = Pattern.compile(URL_REGEX);

		for (String url : wrongUrls) {
			Matcher matcher = pattern.matcher(url);
			Assert.assertFalse(matcher.matches());
		}
	}

}
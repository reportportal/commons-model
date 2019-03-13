package com.epam.ta.reportportal.ws.model.user;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
public class EditUserRqValidationTest {

	private String regex = "(\\s*[\\pL0-9-_\\.]+\\s*)+";
	private Pattern pattern = Pattern.compile(regex);

	private List<String> correctNames;
	private List<String> incorrectNames;

	@Before
	public void setUp() {
		correctNames = new ArrayList<String>() {
			{
				add("J J");
				add("J");
				add("J_J_9_a-qwe www");
				add("A b c d e");
				add("John Murphy");
			}
		};

		incorrectNames = new ArrayList<String>() {
			{
				add("  ");
				add("");
				add("A b C *");
				add(" * ");
			}
		};

	}

	@Test
	public void validateFullName() {
		for(String name: correctNames) {
			Matcher matcher = pattern.matcher(name);
			Assert.assertTrue(matcher.matches());
		}

		for(String name: incorrectNames) {
			Matcher matcher = pattern.matcher(name);
			Assert.assertFalse(matcher.matches());
		}
	}
}

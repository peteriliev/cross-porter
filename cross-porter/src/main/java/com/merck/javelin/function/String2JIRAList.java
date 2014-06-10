package main.java.com.merck.javelin.function;

import static main.java.com.merck.javelin.Settings.JIRA_REGEX_PATTERN;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String2JIRAList implements Function<String, List<String>> {

	private String2JIRAList() {
	}

	public static final Function<String, List<String>> INSTANCE = new String2JIRAList();

	private static final Pattern _JIRA_REGEX_PATTERN = Pattern.compile(JIRA_REGEX_PATTERN);

	@Override
	public List<String> apply(final String src) {
		// TODO:peteri - validate src w/ AppacheCommons

		final Matcher matcher = _JIRA_REGEX_PATTERN.matcher(src);

		final List<String> result = new ArrayList<>();

		while (matcher.find()) {
			result.add(matcher.group());
		}

		return result;
	}
}

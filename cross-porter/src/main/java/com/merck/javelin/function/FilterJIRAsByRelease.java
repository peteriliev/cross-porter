package main.java.com.merck.javelin.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import main.java.com.merck.javelin.MyLogEntry;

public class FilterJIRAsByRelease implements Predicate<MyLogEntry> {

	private final List<String> releaseJIRAs;

	private FilterJIRAsByRelease(final List<String> releaseJIRAs) {
		this.releaseJIRAs = releaseJIRAs;
	}

	public static Predicate<MyLogEntry> newInstance(final List<String> releaseJIRAs) {
		if (null == releaseJIRAs) {
			throw new IllegalArgumentException("Invalid release JIRAs: NULL");
		}

		return new FilterJIRAsByRelease(convert(releaseJIRAs));
	}

	private final static List<String> convert(final List<String> raw) {
		assert null != raw;

		final List<String> result = new ArrayList<String>(raw.size());

		for (final String str : raw) {
			result.add(str.toUpperCase());
		}

		return result;
	}

	@Override
	public boolean test(final MyLogEntry logEntry) {
		if (null == logEntry) {
			throw new IllegalArgumentException("Illegal MyLogEntry: NULL");
		}

		for (final String jira : logEntry.getJIRAs()) {
			if (this.releaseJIRAs.contains(jira.toUpperCase())) {
				return true;
			}
		}

		return false;
	}
}

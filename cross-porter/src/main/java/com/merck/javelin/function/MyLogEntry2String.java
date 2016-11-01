package main.java.com.merck.javelin.function;

import java.util.function.Function;

import main.java.com.merck.javelin.MyLogEntry;

public class MyLogEntry2String implements Function<MyLogEntry, String> {

	private MyLogEntry2String() {

	}

	public static final Function<MyLogEntry, String> INSTANCE = new MyLogEntry2String();

	private static final String NEW_LINE = "\n";

	@Override
	public String apply(final MyLogEntry logEntry) {
		if (null == logEntry) {
			throw new IllegalArgumentException("Illegal log entry: NULL");
		}

		final StringBuilder builder = new StringBuilder();

		builder.append("echo \"\"").append(NEW_LINE);
		builder.append("echo \"Cross-porting revision #").append(logEntry.getRevision()).append("...\"").append(NEW_LINE);

		builder.append("echo \"svn cleanup...\"").append(NEW_LINE);
		builder.append("svn cleanup").append(NEW_LINE);

		builder.append("echo \"svn update...\"").append(NEW_LINE);
		builder.append("svn update").append(NEW_LINE);

		builder.append("svn merge https://svn.javelingroup.com/svn/arp/trunk@");
		builder.append(logEntry.getRevision() - 1);
		builder.append(" ");
		builder.append("https://svn.javelingroup.com/svn/arp/trunk@");
		builder.append(logEntry.getRevision());
		builder.append(NEW_LINE);

		builder.append("svn commit -m \"[CROSS-PORT] revision #");
		builder.append(logEntry.getRevision());
		builder.append(" from trunk (author ");
		builder.append(logEntry.getAuthor());
		builder.append("): ");
		builder.append(logEntry.getFullNote().replace("\"", "'")).append("\"");
		builder.append(NEW_LINE);

		// builder.append("echo \"Press any key to continue...\"").append(NEW_LINE);
		// builder.append("read -e").append(NEW_LINE).append(NEW_LINE);
		builder.append("####################################################").append(NEW_LINE);
		builder.append(NEW_LINE);

		return builder.toString();
	}
}

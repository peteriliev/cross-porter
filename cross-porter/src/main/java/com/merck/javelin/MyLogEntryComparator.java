package main.java.com.merck.javelin;

import java.util.Comparator;

public class MyLogEntryComparator implements Comparator<MyLogEntry> {

	private MyLogEntryComparator()
	{
	}

	public static final Comparator<MyLogEntry> INSTANCE = new MyLogEntryComparator();
	
	@Override
	public int compare(final MyLogEntry a, final MyLogEntry b) {
		if (null == a) {
			throw new IllegalArgumentException("1st log entry illegal: NULL");
		}

		if (null == b) {
			throw new IllegalArgumentException("2nd log entry illegal: NULL");
		}

		return a.getRevision() - b.getRevision();
	}
}

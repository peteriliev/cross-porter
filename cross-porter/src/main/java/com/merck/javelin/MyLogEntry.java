package main.java.com.merck.javelin;

import java.util.List;

public class MyLogEntry {
	@Override
	public String toString() {
		return "MyLogEntry [revision=" + revision + ", jiras=" + jiras + ", fullNote=" + fullNote + ", author=" + getAuthor() + "]";
	}

	private final int revision;
	private final List<String> jiras;
	private final String fullNote;
	private final String author;

	private MyLogEntry(final int revision, final List<String> jiras, final String fullNote, final String author) {
		this.revision = revision;
		this.jiras = jiras;
		this.fullNote = fullNote;
		this.author = author;
	}

	public static MyLogEntry newInstance(final int revision, final List<String> jiras, final String fullNote, final String author) {
		// TODO:peteri - validate
		return new MyLogEntry(revision, jiras, fullNote, author);
	}

	public int getRevision() {
		return revision;
	}

	public List<String> getJIRAs() {
		return jiras;
	}

	public String getFullNote() {
		return fullNote;
	}

	public String getAuthor() {
		return author;
	}
}
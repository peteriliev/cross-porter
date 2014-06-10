package main.java.com.merck.javelin;

public final class Settings {
	private Settings() {
		throw new IllegalStateException("Trying to instantiate class Settings");
	}

	public static final String SVN_XML_LOGENTRY = "logentry";

	public static final String SVN_XML_REVISION = "revision";

	public static final String SVN_XML_MSG = "msg";
	
	public static final String SVN_XML_AUTHOR = "author";

	public static final String JIRA_REGEX_PATTERN = "BR-\\d{4}";

}

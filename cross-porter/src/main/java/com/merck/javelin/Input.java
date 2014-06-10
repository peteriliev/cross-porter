package main.java.com.merck.javelin;

import java.util.Arrays;
import java.util.List;

public final class Input {
	private Input() {
		throw new IllegalStateException("Attempt to instantiate class Input");
	}

	// Run in trunk local context
	// svn log --xml -r 26695:HEAD > 5.0.52.x_JIRAs.xml

	static final String XML_FILE = "C://Users/peteri/JIRA_xml/files/5.0.52.x_JIRAs.xml";

	static final String[] _JIRAS_2_0_52_1 = new String[] { "BR-9854", "BR-9851", "BR-9846", "BR-9791", "BR-9468" };

	static final List<String> JIRAS_2_0_52_1 = Arrays.asList(_JIRAS_2_0_52_1);
}

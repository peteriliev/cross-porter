package main.java.com.merck.javelin;

import java.util.Arrays;
import java.util.List;

public final class Input {
	private Input() {
		throw new IllegalStateException("Attempt to instantiate class Input");
	}

	// svn log --xml -r 5000:HEAD https://svn.foo.com/svn/arp/trunk > RC9.4.xml

	// mvn exec:java -Dexec.mainClass="main.java.com.merck.javelin.GodClass"

	static final String XML_FILE = "C://projects/Aurora/cross-porter/files/RC9.4.xml";

	static final String[] _JIRAS_RC9_4 = new String[] { "ARP-6592" };

	static final List<String> JIRAS_RC_9_4 = Arrays.asList(_JIRAS_RC9_4);
}

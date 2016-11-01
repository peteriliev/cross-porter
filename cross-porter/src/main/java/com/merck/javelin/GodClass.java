package main.java.com.merck.javelin;

import static main.java.com.merck.javelin.Input.XML_FILE;

import java.io.File;
import java.util.List;
import java.util.stream.Stream;

import main.java.com.merck.javelin.function.DOM2NodeList;
import main.java.com.merck.javelin.function.FilterJIRAsByRelease;
import main.java.com.merck.javelin.function.Log2DOM;
import main.java.com.merck.javelin.function.MyLogEntryStream2File;
import main.java.com.merck.javelin.function.NodeList2MyLogList;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class GodClass {

	public static void main(String[] args) {

		final File xmlSVNLog = new File(XML_FILE);

		final Document doc = Log2DOM.INSTANCE.apply(xmlSVNLog);

		final NodeList svnNodes = DOM2NodeList.INSTANCE.apply(doc);

		final List<MyLogEntry> rawSVNLog = NodeList2MyLogList.INSTANCE.apply(svnNodes);

		final Stream<MyLogEntry> filteredSVNLost = rawSVNLog.stream().filter(FilterJIRAsByRelease.newInstance(Input.JIRAS_RC_9_4));

		final Stream<MyLogEntry> sortedSVNList = filteredSVNLost.sorted(MyLogEntryComparator.INSTANCE);

		MyLogEntryStream2File.newInstance().apply(sortedSVNList);
	}
}
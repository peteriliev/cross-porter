package main.java.com.merck.javelin.function;

import static main.java.com.merck.javelin.Settings.SVN_XML_LOGENTRY;

import java.util.function.Function;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public final class DOM2NodeList implements Function<Document, NodeList> {

	private DOM2NodeList() {

	}

	public static final DOM2NodeList INSTANCE = new DOM2NodeList();

	@Override
	public NodeList apply(final Document doc) {
		if (null == doc) {
			throw new IllegalArgumentException("Invalid Document: NULL");
		}

		doc.getDocumentElement().normalize();

		final NodeList result = doc.getElementsByTagName(SVN_XML_LOGENTRY);

		return result;
	}
}

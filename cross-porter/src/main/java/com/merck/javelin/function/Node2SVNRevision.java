package main.java.com.merck.javelin.function;

import static main.java.com.merck.javelin.Settings.SVN_XML_REVISION;

import java.util.function.Function;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class Node2SVNRevision implements Function<Node, Integer> {

	private Node2SVNRevision() {
	}

	public static final Function<Node, Integer> INSTANCE = new Node2SVNRevision();

	@Override
	public Integer apply(final Node node) {
		if (null == node) {
			throw new IllegalArgumentException("Illegal Node: NULL");
		}

		if (node.getNodeType() != Node.ELEMENT_NODE) {
			throw new IllegalArgumentException("Illegal Node: " + node.getClass().getCanonicalName());
		}

		final Element eElement = (Element) node;

		final String strRevision = eElement.getAttribute(SVN_XML_REVISION);

		return Integer.valueOf(strRevision);
	}
}
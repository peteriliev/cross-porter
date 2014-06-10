package main.java.com.merck.javelin.function;

import static main.java.com.merck.javelin.Settings.SVN_XML_AUTHOR;

import java.util.function.Function;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Node2Author implements Function<Node, String> {

	private Node2Author() {
	}

	public static final Function<Node, String> INSTANCE = new Node2Author();

	private static final int SINGLE_ENTRY = 0;

	@Override
	public String apply(final Node node) {
		if (null == node) {
			throw new IllegalArgumentException("Illegal Node: NULL");
		}

		if (node.getNodeType() != Node.ELEMENT_NODE) {
			throw new IllegalArgumentException("Illegal Node: " + node.getClass().getCanonicalName());
		}

		final Element eElement = (Element) node;

		final NodeList nodeList = eElement.getElementsByTagName(SVN_XML_AUTHOR);

		if (nodeList.getLength() != 1) {
			throw new IllegalArgumentException("Illegal Node: 'author' element length != 1");
		}

		final Node msgNode = nodeList.item(SINGLE_ENTRY);
		final String textContent = msgNode.getTextContent().trim();

		return textContent;
	}
}
package main.java.com.merck.javelin.function;

import java.util.List;
import java.util.function.Function;

import org.w3c.dom.Node;

public class Node2SVNJIRAList implements Function<Node, List<String>> {

	private Node2SVNJIRAList() {
	}

	public static final Function<Node, List<String>> INSTANCE = new Node2SVNJIRAList();

	@Override
	public List<String> apply(final Node node) {
		if (null == node) {
			throw new IllegalArgumentException("Illegal Node: NULL");
		}

		if (node.getNodeType() != Node.ELEMENT_NODE) {
			throw new IllegalArgumentException("Illegal Node: " + node.getClass().getCanonicalName());
		}

		final String msg = Node2Msg.INSTANCE.apply(node);

		final List<String> result = String2JIRAList.INSTANCE.apply(msg);

		return result;
	}
}
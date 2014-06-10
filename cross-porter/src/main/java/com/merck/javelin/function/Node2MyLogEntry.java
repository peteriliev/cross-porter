package main.java.com.merck.javelin.function;

import java.util.List;
import java.util.function.Function;

import main.java.com.merck.javelin.MyLogEntry;

import org.w3c.dom.Node;

public final class Node2MyLogEntry implements Function<Node, MyLogEntry> {

	private Node2MyLogEntry() {

	}

	public static final Function<Node, MyLogEntry> INSTANCE = new Node2MyLogEntry();

	@Override
	public MyLogEntry apply(final Node node) {
		if (null == node) {
			throw new IllegalArgumentException("Invalid Node: NULL");
		}

		if (node.getNodeType() != Node.ELEMENT_NODE) {
			throw new IllegalArgumentException("Illegal Node: " + node.getClass().getCanonicalName());
		}

		final Integer revision = Node2SVNRevision.INSTANCE.apply(node);
		final List<String> JIRAList = Node2SVNJIRAList.INSTANCE.apply(node);
		final String msg = Node2Msg.INSTANCE.apply(node);
		final String author = Node2Author.INSTANCE.apply(node);

		return MyLogEntry.newInstance(revision, JIRAList, msg, author);
	}
}

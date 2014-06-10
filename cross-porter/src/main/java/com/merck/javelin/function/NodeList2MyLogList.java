package main.java.com.merck.javelin.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import main.java.com.merck.javelin.MyLogEntry;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class NodeList2MyLogList implements Function<NodeList, List<MyLogEntry>> {

	private NodeList2MyLogList() {
	}

	public static final Function<NodeList, List<MyLogEntry>> INSTANCE = new NodeList2MyLogList();

	@Override
	public List<MyLogEntry> apply(final NodeList nodeList) {

		if (null == nodeList) {
			throw new IllegalArgumentException("Illegal NodeList: NULL");
		}

		final List<MyLogEntry> result = new ArrayList<MyLogEntry>(nodeList.getLength());

		for (int i = 0; i < nodeList.getLength(); i++) {
			final Node node = nodeList.item(i);
			final MyLogEntry logEntry = Node2MyLogEntry.INSTANCE.apply(node);
			result.add(logEntry);
		}

		return result;
	}
}

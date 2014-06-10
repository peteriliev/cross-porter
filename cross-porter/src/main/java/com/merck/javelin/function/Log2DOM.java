package main.java.com.merck.javelin.function;

import java.io.File;
import java.util.function.Function;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public final class Log2DOM implements Function<File, Document> {

	private Log2DOM() {
	}

	public static final Function<File, Document> INSTANCE = new Log2DOM();

	@Override
	public Document apply(final File file) {
		if (null == file) {
			throw new IllegalArgumentException("Illegal file: NULL");
		}

		final DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

		try {
			final DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			final Document doc = dBuilder.parse(file);
			return doc;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

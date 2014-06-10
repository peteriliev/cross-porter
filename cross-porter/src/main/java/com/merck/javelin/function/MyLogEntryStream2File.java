package main.java.com.merck.javelin.function;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.function.Function;
import java.util.stream.Stream;

import main.java.com.merck.javelin.MyLogEntry;
import main.java.com.merck.javelin.Output;

public class MyLogEntryStream2File implements Function<Stream<MyLogEntry>, File> {

	private MyLogEntryStream2File() {
	}

	public static Function<Stream<MyLogEntry>, File> newInstance() {
		return new MyLogEntryStream2File();
	}

	@Override
	public File apply(final Stream<MyLogEntry> logStream) {
		if (null == logStream) {
			throw new IllegalArgumentException("Invalid Stream<MyLogEntry>: NULL");
		}

		try {
			final File file = new File(Output.SH_SCRIPT_FILE);

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			final FileWriter fw = new FileWriter(file.getAbsoluteFile());
			final BufferedWriter bw = new BufferedWriter(fw);

			for (final Object objLogEntry : logStream.toArray()) {
				final MyLogEntry logEntry = (MyLogEntry) objLogEntry;
				final String str = MyLogEntry2String.INSTANCE.apply(logEntry);
				bw.write(str);
			}

			bw.close();

			return file;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
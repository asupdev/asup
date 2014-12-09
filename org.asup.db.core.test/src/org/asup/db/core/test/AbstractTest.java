package org.asup.db.core.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public abstract class AbstractTest {

	protected List<String> readStatementsForTest(String scriptName) throws IOException, SQLException {

		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		URL entry = bundle.getEntry("/resources/statements/" + scriptName + ".txt");
		List<String> sourceSQL = readLinesFromInputStream(entry.openStream());

		return sourceSQL;
	}

	public static List<String> readLinesFromInputStream(InputStream inputStream) throws IOException {
		return readLinesFrom(new BufferedReader(new InputStreamReader(inputStream)));
	}

	public static List<String> readLinesFromFile(File file) throws IOException {
		return readLinesFrom(new BufferedReader(new FileReader(file)));
	}

	public static List<String> readLinesFrom(BufferedReader in) throws IOException {
		ArrayList<String> linee = new ArrayList<String>();
		String str;
		while ((str = in.readLine()) != null) {
			linee.add(str);
		}
		in.close();
		return linee;
	}

}

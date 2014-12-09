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

import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QStatement;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class TestCommands extends AbstractCommandProviderImpl {

	@Inject
	private QConnectionManager connectionManager;

	
	public void _test(CommandInterpreter interpreter) throws Exception {

		String scriptName = interpreter.nextArgument();
		String catalog = interpreter.nextArgument();

//		QTestRunner testRunner = testManager.prepareRunner(testContext, className.asString());
//		QTestResult testResult = testManager.executeRunner(testContext, testRunner);
		
		QConnection connectionTo = connectionManager.createConnection(catalog);
		List<String> statements = readStatementsForTest(scriptName);

		long timeIni = System.currentTimeMillis();
		int count = 0;

		QStatement statement = null;
		try {
			statement = connectionTo.createStatement();

			for (String sql : statements) {
				count++;
				try {
					statement.execute(sql);
				} catch (SQLException e) {
//					System.err.println(e.getMessage());
				}
			}
		} finally {
			statement.close();
		}

		long timeEnd = System.currentTimeMillis();
		System.out.println("DONE! " + count + " " + (timeEnd - timeIni));

		connectionTo.close();
	}

	private List<String> readStatementsForTest(String scriptName) throws IOException, SQLException {

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

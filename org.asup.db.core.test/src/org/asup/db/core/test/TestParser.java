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
import javax.inject.Named;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionManager;
import org.asup.db.syntax.QQueryParser;
import org.asup.fw.core.QApplication;
import org.asup.fw.core.QContext;
import org.asup.fw.test.AssertionState;
import org.asup.fw.test.QAssertionResult;
import org.asup.fw.test.QTestAsserter;
import org.asup.fw.test.QTestManager;
import org.asup.fw.test.QTestResult;
import org.asup.fw.test.QTestRunner;
import org.asup.fw.test.annotation.Test;
import org.asup.fw.test.annotation.TestStarted;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class TestParser extends AbstractCommandProviderImpl {

	@Inject
	private QConnectionManager connectionManager;
	@Inject
	private QApplication application;
	@Inject
	private QTestManager testManager;

	public void _testParser(CommandInterpreter interpreter) throws Exception {

		String script = interpreter.nextArgument();
		String catalog = interpreter.nextArgument();
		
		
		QContext testContext = application.getContext().createLocalContext(catalog+"/"+script);
		
		QConnection connection = connectionManager.createConnection(catalog);
		testContext.set(QConnection.class, connection);
		
		testContext.set("org.asup.db.core.test.script", script);

		QTestRunner testRunner = null;
		QTestResult testResult = null;

		// Translate
		testRunner = testManager.prepareRunner(testContext, Translate.class);
		testResult = testManager.executeRunner(testContext, testRunner);
		printTestResult(testResult);
	}

	private void printTestResult(QTestResult testResult) {
		System.out.println(testResult);
		StringBuffer resultString = new StringBuffer();
		int failedNr = 0;
		int successNr = 0;		
		for (QAssertionResult assertionResult : testResult.getAssertResults()) {
			if (AssertionState.SUCCESS.equals(assertionResult.getAssertionState())) {
				successNr++;
			} else {
				failedNr++;
			}
			resultString.append("\t" + assertionResult + "\n");
		}
		System.out.println(resultString + "\nSuccess: " + successNr + " failed: " + failedNr);
	}

	@Test(category = "DBSYNTAX", object = "TRANSLATE")
	public static class Translate extends AbstractTest {

		@Inject
		private QTestAsserter testAsserter;
		
		@Inject
		private QQueryParser queryParser;
		

		@TestStarted
		public void doTest(@Named("org.asup.db.core.test.script") String script) throws SQLException, IOException {

			List<String> statements = readStatementsForTest(script);

			testAsserter.resetTime();
			
			SQLQueryParseResult parseResult = null;
			for (String sql : statements) {

				try {
					parseResult = queryParser.parseQuery(sql);
					
				} catch (Exception e) {	
					
				}
				
				testAsserter.assertNotNull("Test parser: " + sql, parseResult);
			}
		}
	}

	public static abstract class AbstractTest {

		protected List<String> readStatementsForTest(String scriptName) throws IOException, SQLException {

			Bundle bundle = FrameworkUtil.getBundle(this.getClass());
			URL entry = bundle.getEntry("/resources/statements/" + scriptName + ".txt");
			List<String> sourceSQL = readLinesFromInputStream(entry.openStream());

			return sourceSQL;
		}

		public List<String> readLinesFromInputStream(InputStream inputStream) throws IOException {
			return readLinesFrom(new BufferedReader(new InputStreamReader(inputStream)));
		}

		public List<String> readLinesFromFile(File file) throws IOException {
			return readLinesFrom(new BufferedReader(new FileReader(file)));
		}

		public List<String> readLinesFrom(BufferedReader in) throws IOException {
			ArrayList<String> linee = new ArrayList<String>();
			String str;
			while ((str = in.readLine()) != null) {
				linee.add(str);
			}
			in.close();
			return linee;
		}

	}
}

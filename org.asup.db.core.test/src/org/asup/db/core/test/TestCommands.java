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
import org.asup.db.core.QStatement;
import org.asup.db.syntax.QQueryParser;
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

public class TestCommands extends AbstractCommandProviderImpl {

	@Inject
	private QConnectionManager connectionManager;
	@Inject
	private QTestManager testManager;

	public void _testDBCore(CommandInterpreter interpreter) throws Exception {

		String script = interpreter.nextArgument();
		String catalog = interpreter.nextArgument();
		QConnection connection = connectionManager.createConnection(catalog);
		
		QContext testContext = connection.getContext().createChildContext(script);		
		testContext.set(QConnection.class, connection);
		testContext.set("org.asup.db.core.test.script", script);

		try {
			// Translate
			QTestRunner testRunner = testManager.prepareRunner(testContext, Translate.class);
			QTestResult testResult = testRunner.call();
			
			printTestResult(testResult);
	
			// Parse
			testRunner = testManager.prepareRunner(testContext, Parse.class);
			testResult = testRunner.call();
			
			printTestResult(testResult);
			
			// Execute
			testRunner = testManager.prepareRunner(testContext, Execute.class);
			testResult = testRunner.call();
					
			printTestResult(testResult);
		}
		finally {
			// TODO remove and listen context.close()
			connection.close();
			
			testContext.close();
		}
	}

	private void printTestResult(QTestResult testResult) {
		
		System.out.println();
		System.out.println(testResult);

		int failedNr = 0;
		int successNr = 0;
		
		for (QAssertionResult assertionResult : testResult.getAssertResults()) {
			if (AssertionState.SUCCESS.equals(assertionResult.getAssertionState())) {
				successNr++;
			} else {
				failedNr++;
			}
			System.out.println("\t" + assertionResult);
		}
		System.out.println("Success: " + successNr);
		if(failedNr >0)
			System.err.println("Failed: " + failedNr);
	}

	@Test(category = "DBSYNTAX", object = "TRANSLATE")
	public static class Translate extends AbstractTest {

		@Inject
		private QConnection connection;
		@Inject
		private QTestAsserter testAsserter;

		@TestStarted
		public void doTest(@Named("org.asup.db.core.test.script") String script) throws SQLException, IOException {

			List<String> statements = readStatementsForTest(script);

			testAsserter.resetTime();
			for (String sql : statements) {

				String result = null;
				try {
					result = connection.translate(sql);
				} catch (SQLException e) {
				}
				testAsserter.assertNotNull("Test translate: " + sql, result);
			}
		}
	}

	@Test(category = "DBSYNTAX", object = "PARSE")
	public static class Parse extends AbstractTest {

		@Inject
		private QTestAsserter testAsserter;
		
		@Inject
		private QQueryParser queryParser;
		

		@TestStarted
		public void doTest(@Named("org.asup.db.core.test.script") String script) throws SQLException, IOException {

			List<String> statements = readStatementsForTest(script);

			testAsserter.resetTime();
						
			for (String sql : statements) {
				SQLQueryParseResult parseResult = null;
				try {
					parseResult = queryParser.parseQuery(sql);
					
				} catch (Exception e) {	
//					e.printStackTrace();
				}
				
				testAsserter.assertNotNull("Test parser: " + sql, parseResult);
			}
		}
	}
	
	@Test(category = "DBSYNTAX", object = "EXECUTE")
	public static class Execute extends AbstractTest {

		@Inject
		private QConnection connection;
		@Inject
		private QTestAsserter testAsserter;

		@TestStarted
		public void doTest(@Named("org.asup.db.core.test.script") String script) throws SQLException, IOException {
			
			List<String> statements = readStatementsForTest(script);

			testAsserter.resetTime();
			QStatement statement = null;
			try {
				statement = connection.createStatement();

				for (String sql : statements) {
					boolean result = true;

					try {
						statement.execute(sql);
					} catch (SQLException e) {
						result = false;
					}
					testAsserter.assertTrue("Test execute: " + sql, result);
				}
			} finally {
				statement.close();
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

package org.asup.db.core.test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QStatement;
import org.asup.fw.core.QContext;
import org.asup.fw.test.QAssertionResult;
import org.asup.fw.test.QTestAsserter;
import org.asup.fw.test.QTestContext;
import org.asup.fw.test.QTestManager;
import org.asup.fw.test.QTestResult;
import org.asup.fw.test.QTestRunner;
import org.asup.fw.test.annotation.Test;
import org.asup.fw.test.annotation.TestStarted;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class TestCommands extends AbstractCommandProviderImpl {

	@Inject
	private QConnectionManager connectionManager;
	@Inject
	private QContext context;
	@Inject
	private QTestManager testManager;

	public void _testDBCORE(CommandInterpreter interpreter) throws Exception {

		String script = interpreter.nextArgument();
		String catalog = interpreter.nextArgument();
		
		QTestContext testContext = testManager.createTestContext(context);

		QConnection connection = connectionManager.createConnection(catalog);
		testContext.set(QConnection.class, connection);
		testContext.set("org.asup.db.core.test.script", script);

		QTestRunner testRunner = null;
		QTestResult testResult = null;

		// Translate
		testRunner = testManager.prepareRunner(testContext, Translate.class);
		testResult = testManager.executeRunner(testContext, testRunner);
		printTestResult(testResult);

		// Execute
		testRunner = testManager.prepareRunner(testContext, Execute.class);
		testResult = testManager.executeRunner(testContext, testRunner);
		printTestResult(testResult);
		
		connection.close();
	}

	private void printTestResult(QTestResult testResult) {
		System.out.println(testResult);
		for (QAssertionResult assertionResult : testResult.getAssertResults()) {
			System.out.println("\t" + assertionResult);
		}
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
}

package org.asup.il.isam.test;

import java.io.IOException;
import java.sql.SQLException;

import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionManager;
import org.asup.fw.core.QContext;
import org.asup.fw.test.AssertionState;
import org.asup.fw.test.QAssertionResult;
import org.asup.fw.test.QTestAsserter;
import org.asup.fw.test.QTestManager;
import org.asup.fw.test.QTestResult;
import org.asup.fw.test.QTestRunner;
import org.asup.fw.test.annotation.Test;
import org.asup.fw.test.annotation.TestStarted;
import org.asup.il.isam.QIsamFactory;
import org.asup.il.isam.QIsamManager;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class TestCommands extends AbstractCommandProviderImpl {

	@Inject
	private QConnectionManager connectionManager;
	@Inject
	private QIsamManager isamManager;
	@Inject
	private QTestManager testManager;

	public void _testILISAM(CommandInterpreter interpreter) throws Exception {

		String catalog = interpreter.nextArgument();
		
		QConnection connection = connectionManager.createConnection(catalog);		
		QIsamFactory isamFactory = isamManager.createFactory(connection);
		
		QContext testContext = connection.getContext().createChildContext("ILIsam");		
		testContext.set(QIsamFactory.class, isamFactory);

		QTestRunner testRunner = null;
		QTestResult testResult = null;

		// Translate
		testRunner = testManager.prepareRunner(testContext, Read.class);
		testResult = testManager.executeRunner(testContext, testRunner);
		printTestResult(testResult);

		connection.close();
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
	

	@Test(category = "ILISAM", object = "FILE")
	public static class Read {

		@Inject
		private QTestAsserter testAsserter;

		@TestStarted
		public void doTest() throws SQLException, IOException {
			
			testAsserter.toString();
		}
	}
}
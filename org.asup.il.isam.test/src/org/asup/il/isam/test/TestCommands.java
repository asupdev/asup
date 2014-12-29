package org.asup.il.isam.test;

import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionManager;
import org.asup.fw.core.QContext;
import org.asup.fw.test.AssertionState;
import org.asup.fw.test.QAssertionResult;
import org.asup.fw.test.QTestManager;
import org.asup.fw.test.QTestResult;
import org.asup.fw.test.QTestRunner;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataManager;
import org.asup.il.isam.QIsamFactory;
import org.asup.il.isam.QIsamManager;
import org.asup.il.isam.test.runner.KSDS_read;
import org.asup.il.isam.test.runner.KSDS_readp;
import org.asup.il.isam.test.runner.KSDS_write;
import org.asup.il.isam.test.runner.RRDS_read;
import org.asup.il.isam.test.runner.RRDS_readp;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class TestCommands extends AbstractCommandProviderImpl {

	@Inject
	private QConnectionManager connectionManager;
	@Inject
	private QDataManager dataManager;
	@Inject
	private QIsamManager isamManager;
	@Inject
	private QTestManager testManager;

	public void _testILIsam(CommandInterpreter interpreter) throws Exception {

		String catalog = interpreter.nextArgument();

		QConnection connection = connectionManager.createConnection(catalog);
		QDataFactory dataFactory = dataManager.createFactory(connection);
		QIsamFactory isamFactory = isamManager.createFactory(connection);

		QContext testContext = connection.getContext().createChildContext("ILIsam");
		testContext.set(QConnection.class, connection);
		testContext.set(QDataFactory.class, dataFactory);
		testContext.set(QIsamFactory.class, isamFactory);

		QTestRunner testRunner = null;
		QTestResult testResult = null;

		try {
			// RRDS
/*			testRunner = testManager.prepareRunner(testContext, RRDS_read.class);
			testResult = testRunner.call();
			printTestResult(testResult);

			testRunner = testManager.prepareRunner(testContext, RRDS_readp.class);
			testResult = testRunner.call();
			printTestResult(testResult);
			
			// KSDS
			testRunner = testManager.prepareRunner(testContext, KSDS_read.class);
			testResult = testRunner.call();
			printTestResult(testResult);
			
			testRunner = testManager.prepareRunner(testContext, KSDS_readp.class);
			testResult = testRunner.call();
			printTestResult(testResult);*/
			
			testRunner = testManager.prepareRunner(testContext, KSDS_write.class);
			testResult = testRunner.call();
			printTestResult(testResult);
			
		} finally {
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
			System.out.println("Failed: " + failedNr+"\n");

	}
}
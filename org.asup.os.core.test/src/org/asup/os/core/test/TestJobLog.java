package org.asup.os.core.test;

import javax.inject.Inject;

import org.asup.fw.core.QContext;
import org.asup.fw.core.QContextID;
import org.asup.fw.test.QTestAsserter;
import org.asup.fw.test.QTestManager;
import org.asup.fw.test.QTestResult;
import org.asup.fw.test.QTestRunner;
import org.asup.fw.test.annotation.Test;
import org.asup.fw.test.annotation.TestStarted;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLog;
import org.asup.os.core.jobs.QJobLogEntry;
import org.asup.os.core.jobs.QJobLogManager;
import org.asup.os.core.jobs.QJobManager;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class TestJobLog extends AbstractCommandProviderImpl {

	@Inject
	private QTestManager testManager;	
	@Inject
	private QJobManager jobManager;	
	
	public void _testJOBLOG(CommandInterpreter interpreter) throws Exception {
		
		String user = interpreter.nextArgument();
		
		QContextID contextID = jobManager.create(user, null);
		QJob job = jobManager.lookup(contextID);
		
		QContext testContext = job.getContext().createChildContext("Test JOBLOG");		
		testContext.set(QJob.class, job);

		try {
			// JobLog
			QTestRunner testRunner = testManager.prepareRunner(testContext, JobLog.class);
			QTestResult testResult = testRunner.call();
			
			printTestResult(testResult);
		}
		finally {

			testContext.close();
			
			jobManager.close(job);			
		}
		
		
	}

	
	@Test(category = "OSCORE", object = "JOBLOG")
	public static class JobLog {

		@Inject
		private QJob job;
		@Inject
		private QJobLogManager jobLogManger;
		@Inject
		private QTestAsserter testAsserter;

		@TestStarted
		public void doTest() {

			jobLogManger.info(job, "Test INFO");
			
			QJobLog jobLog = jobLogManger.lookup(job);
			
			String lastMessage = null;
			
			for(QJobLogEntry jobLogEntry: jobLog.getEntries()) {
				lastMessage = jobLogEntry.getMessage();
			}
			
			testAsserter.assertEquals("Test JOBLOG", "Test INFO", lastMessage);

		}
	}
}

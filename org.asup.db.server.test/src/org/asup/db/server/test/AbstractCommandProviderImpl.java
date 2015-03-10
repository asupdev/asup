package org.asup.db.server.test;

import org.asup.fw.core.impl.ServiceImpl;
import org.asup.fw.test.AssertionState;
import org.asup.fw.test.QAssertionResult;
import org.asup.fw.test.QTestResult;
import org.eclipse.osgi.framework.console.CommandProvider;

public abstract class AbstractCommandProviderImpl extends ServiceImpl implements CommandProvider {

	
	protected void printTestResult(QTestResult testResult) {
		
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
	
	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}

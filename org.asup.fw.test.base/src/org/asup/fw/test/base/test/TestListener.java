package org.asup.fw.test.base.test;

import org.asup.fw.test.QAssertionFailed;
import org.asup.fw.test.QAssertionResult;
import org.asup.fw.test.QAssertionSuccess;
import org.asup.fw.test.QTestListener;
import org.asup.fw.test.QTestRunner;

public class TestListener implements QTestListener {

	@Override
	public void addAssertionResult(QAssertionResult assertionResult) {
		if ((assertionResult instanceof QAssertionSuccess)) {
		} else if ((assertionResult instanceof QAssertionFailed)) {
		}
	}

	@Override
	public void startTest(QTestRunner test) {
	}

	@Override
	public void endTest(QTestRunner test) {
	}

}

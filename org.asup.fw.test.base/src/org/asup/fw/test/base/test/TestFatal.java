package org.asup.fw.test.base.test;

import org.asup.fw.test.annotation.TestStarted;
import org.asup.fw.test.base.BaseAssertImpl;

public class TestFatal extends BaseAssertImpl{

	@TestStarted
	public void runTest() {


		success("RunTest method called");

		assertTrue("Assert true success", true);
		assertTrue("Assert true failed", false);

		// Not reachable if previous assert is FATAL
		fail("Not reachable because testCase is FATAL and previous assert was fatal");
	}
}

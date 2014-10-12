/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Dario Foresti	- Initial API and implementation 
 */
package org.asup.fw.test.base.test;

import org.asup.fw.test.QAssertionFailed;
import org.asup.fw.test.annotation.TestStarted;
import org.asup.fw.test.base.BaseAssertImpl;

public class TestAsupTester extends BaseAssertImpl{

	@TestStarted
	public void runTest() {

		int expectedFailedCount = 0;

		success("RunTest method called");

		assertTrue("Assert true success", true);
		assertTrue("Assert true failed", false);
		expectedFailedCount++;

		assertNull("Assert null success", null);
		assertNull("Assert null failed", new Object());
		expectedFailedCount++;

		assertNotNull("Assert not null success", new Object());
		assertNotNull("Assert not null failed", null);
		expectedFailedCount++;

		assertEquals("Assert equals boolean success", true, true);
		assertEquals("Assert equals boolean failed", true, false);
		expectedFailedCount++;

		assertEquals("Assert equals String success", "abc", "abc");
		assertEquals("Assert equals boolean failed", "abc", "cba");
		expectedFailedCount++;

		Integer obj1 = new Integer(1);
		Integer obj2 = new Integer(2);
		Integer obj3 = new Integer(1);
		assertEquals("Assert equals Object success", obj1, obj3);
		assertEquals("Assert equals Object failed", obj1, obj2);
		expectedFailedCount++;

		assertSame("Assert same Object success", obj1, obj1);
		assertSame("Assert same Object failed", obj1, new Integer(1));
		expectedFailedCount++;

		assertNotSame("Assert not same Object success", obj1, new Integer(1));
		assertNotSame("Assert not same Object failed", obj1, obj1);
		expectedFailedCount++;

		assertEquals("Assert equals double success", 1d, 1d);
		assertEquals("Assert equals double failed", 1d, 2d);
		expectedFailedCount++;

		assertEquals("Assert equals double delta success", 1d, 4d, 3d);
		assertEquals("Assert equals double delta failed", 1d, 4d, 2d);
		expectedFailedCount++;

		assertEquals("Assert equals float success", 1f, 1f);
		assertEquals("Assert equals float failed", 1f, 2f);
		expectedFailedCount++;

		assertEquals("Assert equals float delta success", 1f, 4f, 3f);
		assertEquals("Assert equals float delta failed", 1f, 4f, 2f);
		expectedFailedCount++;

		assertEquals("Assert equals int success", 1, 1);
		assertEquals("Assert equals int failed", 1, 2);
		expectedFailedCount++;

		assertEquals("Assert equals char success", 'a', 'a');
		assertEquals("Assert equals char failed", 'a', 'b');
		expectedFailedCount++;

		int failedCount = 0;
		for (int i = 0; i < getTestRunner().getTestResult().getAssertResults().size(); i++) {
			if (getTestRunner().getTestResult().getAssertResults().get(i) instanceof QAssertionFailed) {
				failedCount++;
			}
		}

		// Manage global test result
		if (failedCount == expectedFailedCount) {
			getTestRunner().getTestResult().setFailed(false);
		} else {
			getTestRunner().getTestResult().setFailed(true);
			fail("Expected " + expectedFailedCount + " failures but was " + failedCount);
		}
	}
}

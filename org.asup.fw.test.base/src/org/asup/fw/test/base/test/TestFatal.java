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

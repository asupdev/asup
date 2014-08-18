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

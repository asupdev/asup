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
 *   Mattia Rocchi	- Implementation
 */
package org.asup.fw.test.base;

import javax.inject.Inject;

import org.asup.fw.core.FrameworkCoreException;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QContext;
import org.asup.fw.core.QContextID;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.fw.test.FrameworkTestFailureError;
import org.asup.fw.test.QFrameworkTestFactory;
import org.asup.fw.test.QTestManager;
import org.asup.fw.test.QTestResult;
import org.asup.fw.test.QTestRunner;
import org.asup.fw.test.QUnitTestRunner;
import org.asup.fw.test.annotation.TestStarted;
import org.asup.fw.test.impl.FrameworkTestFactoryImpl;

public class BaseTestManagerImpl extends ServiceImpl implements QTestManager {

	@Inject
	private QContext frameworkContext;	
	
	@Override
	public QTestRunner prepareRunner(QContextID contextID, String className) throws FrameworkCoreException {
	
		QUnitTestRunner testRunner = FrameworkTestFactoryImpl.eINSTANCE.createUnitTestRunner();
		testRunner.setClassName(className);
		QTestResult testResult = FrameworkTestFactoryImpl.eINSTANCE.createTestResult();		
		testRunner.setTestResult(testResult);
		
		return testRunner;
	}

	@Override
	public QTestResult execute(QContextID contextID, QTestRunner runner) throws FrameworkCoreException {

	    // runner context
	    QContext runnerContext = frameworkContext.createChild();
	    runnerContext.set(QTestRunner.class, runner);

	    // result
		QTestResult testResult = QFrameworkTestFactory.eINSTANCE.createTestResult();

		if(runner instanceof QUnitTestRunner) {
			executeUnitRunner(contextID, (QUnitTestRunner) runner, runnerContext, testResult);
		}
		else {
			throw new FrameworkCoreRuntimeException("Unknown runner: "+runner);
		}
		
		return testResult;
	}
	
	private void executeUnitRunner(QContextID contextID, QUnitTestRunner runner, QContext context, QTestResult result) throws FrameworkCoreException {

		// TODO: revise class search in bundles
		Class<?> testClass = frameworkContext.loadClass(contextID, runner.getClassName());
	    if(testClass == null)
	    	throw new FrameworkCoreException("Invalid runner: "+runner);

		Object testCase = context.make(testClass);
		
		long start = System.currentTimeMillis();

		try {
			context.invoke(testCase, TestStarted.class);
		} catch(FrameworkTestFailureError exc) {
			result.setFailed(true);
		}

		long end = System.currentTimeMillis();
		result.setTime(end-start);
	}
}
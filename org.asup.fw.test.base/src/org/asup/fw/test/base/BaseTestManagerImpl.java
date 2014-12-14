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

import org.asup.fw.core.FrameworkCoreException;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QContext;
import org.asup.fw.core.QContextID;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.fw.test.QFrameworkTestFactory;
import org.asup.fw.test.QTestAsserter;
import org.asup.fw.test.QTestManager;
import org.asup.fw.test.QTestResult;
import org.asup.fw.test.QTestRunner;
import org.asup.fw.test.QUnitTestRunner;
import org.asup.fw.test.annotation.Test;
import org.asup.fw.test.annotation.TestStarted;
import org.asup.fw.test.impl.FrameworkTestFactoryImpl;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class BaseTestManagerImpl extends ServiceImpl implements QTestManager {
	
	@Override
	public QTestRunner prepareRunner(QContext context, String className) throws FrameworkCoreException {
	
		QUnitTestRunner testRunner = FrameworkTestFactoryImpl.eINSTANCE.createUnitTestRunner();
		testRunner.setClassName(className);
		
		return testRunner;
	}

	@Override
	public QTestRunner prepareRunner(QContext context, Class<?> klass) throws FrameworkCoreException {
		
		QUnitTestRunner testRunner = FrameworkTestFactoryImpl.eINSTANCE.createUnitTestRunner();
		
		Bundle bundle = FrameworkUtil.getBundle(klass);
		
		String className = "asup:/omac/"+bundle.getSymbolicName()+"/"+klass.getName();
		
		testRunner.setClassName(className);

		return testRunner;
	}

	@Override
	public QTestResult executeRunner(QContext context, QTestRunner runner) throws FrameworkCoreException {

	    // result
		QTestResult testResult = QFrameworkTestFactory.eINSTANCE.createTestResult();
	    context.set(QTestAsserter.class, new BaseTestAsserterImpl(testResult, runner.getTestListeners()));


		if(runner instanceof QUnitTestRunner) {

			QContextID contextID = context.get(QContextID.class);
			Class<?> testClass = context.loadClass(contextID, ((QUnitTestRunner) runner).getClassName());
		    if(testClass == null)
		    	throw new FrameworkCoreException("Invalid runner: "+runner);

		    Test test = testClass.getAnnotation(Test.class);
		    if(test != null)
		    	System.out.println(test.category()+"/"+test.object());
		    
			Object testCase = context.make(testClass);
			
			long start = System.currentTimeMillis();
			try {
				context.invoke(testCase, TestStarted.class);
			} 
			catch(Exception exc) {
				testResult.setFailed(true);
			}
			long end = System.currentTimeMillis();
			
			testResult.setTime(end-start);

		}
		else {
			throw new FrameworkCoreRuntimeException("Unknown runner: "+runner);
		}
		
		return testResult;
	}
}

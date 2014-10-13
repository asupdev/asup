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

import java.lang.annotation.Annotation;

import org.asup.fw.core.FrameworkCoreException;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QContext;
import org.asup.fw.core.QContextID;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.fw.test.QFrameworkTestFactory;
import org.asup.fw.test.QTestAsserter;
import org.asup.fw.test.QTestContext;
import org.asup.fw.test.QTestManager;
import org.asup.fw.test.QTestResult;
import org.asup.fw.test.QTestRunner;
import org.asup.fw.test.QUnitTestRunner;
import org.asup.fw.test.annotation.TestStarted;
import org.asup.fw.test.impl.FrameworkTestFactoryImpl;
import org.asup.fw.test.impl.TestContextImpl;

public class BaseTestManagerImpl extends ServiceImpl implements QTestManager {
	
	@Override
	public QTestRunner prepareRunner(QContext context, String className) throws FrameworkCoreException {
	
		QUnitTestRunner testRunner = FrameworkTestFactoryImpl.eINSTANCE.createUnitTestRunner();
		testRunner.setClassName(className);
		QTestResult testResult = FrameworkTestFactoryImpl.eINSTANCE.createTestResult();		
		testRunner.setTestResult(testResult);
		
		return testRunner;
	}

	@Override
	public QTestResult executeRunner(QContext context, QTestRunner runner) throws FrameworkCoreException {

		QContextID contextID = context.get(QContextID.class);

	    // result
		QTestResult testResult = QFrameworkTestFactory.eINSTANCE.createTestResult();

		if(runner instanceof QUnitTestRunner) {
			executeUnitRunner(context, contextID, (QUnitTestRunner) runner, testResult);
		}
		else {
			throw new FrameworkCoreRuntimeException("Unknown runner: "+runner);
		}
		
		return testResult;
	}
	
	private void executeUnitRunner(QContext context, QContextID contextID, QUnitTestRunner runner, QTestResult result) throws FrameworkCoreException {

	    context.set(QTestAsserter.class, new BaseTestAsserterImpl(runner));

		// TODO: revise class search in bundles
		Class<?> testClass = context.loadClass(contextID, runner.getClassName());
	    if(testClass == null)
	    	throw new FrameworkCoreException("Invalid runner: "+runner);

		Object testCase = context.make(testClass);
		
		long start = System.currentTimeMillis();

		try {
			context.invoke(testCase, TestStarted.class);
		} catch(Exception exc) {
			result.setFailed(true);
		}

		long end = System.currentTimeMillis();
		result.setTime(end-start);
	}

	@Override
	public QTestContext createTestContext(QContext context) throws FrameworkCoreException {

	    // runner context
	    QContext runnerContext = context.createChild();
	    
		return new MyTestContext(runnerContext);
	}
	
	public class MyTestContext extends TestContextImpl {
		
		private QContext delegate;
		
		public MyTestContext(QContext delegate) {
			this.delegate = delegate;
		}

		@Override
		public QContext createChild() throws FrameworkCoreRuntimeException {
			return delegate.createChild();
		}

		@Override
		public <T> T get(Class<T> clazz) {
			return delegate.get(clazz);
		}

		@Override
		public void inject(Object object) throws FrameworkCoreRuntimeException {
			delegate.inject(object);
		}

		@Override
		public Class<?> loadClass(QContextID contextID, String address) {
			return delegate.loadClass(contextID, address);
		}

		@Override
		public <A extends Annotation> void invoke(Object object, Class<A> qualifier) throws FrameworkCoreRuntimeException {
			delegate.invoke(object, qualifier);
		}

		@Override
		public <T> T make(Class<T> klass) throws FrameworkCoreRuntimeException {
			return delegate.make(klass);
		}

		@Override
		public <T> void set(Class<T> klass, T object) throws FrameworkCoreRuntimeException {
			delegate.set(klass, object);
		}

		@Override
		public <T> void set(String name, T object) throws FrameworkCoreRuntimeException {
			delegate.set(name, object);
		}
	}
}
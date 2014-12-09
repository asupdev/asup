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
import org.asup.fw.test.annotation.Test;
import org.asup.fw.test.annotation.TestStarted;
import org.asup.fw.test.impl.FrameworkTestFactoryImpl;
import org.asup.fw.test.impl.TestContextImpl;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class BaseTestManagerImpl extends ServiceImpl implements QTestManager {
	
	@Override
	public QTestRunner prepareRunner(QTestContext context, String className) throws FrameworkCoreException {
	
		QUnitTestRunner testRunner = FrameworkTestFactoryImpl.eINSTANCE.createUnitTestRunner();
		testRunner.setClassName(className);
		
		return testRunner;
	}

	@Override
	public QTestRunner prepareRunner(QTestContext context, Class<?> klass) throws FrameworkCoreException {
		
		QUnitTestRunner testRunner = FrameworkTestFactoryImpl.eINSTANCE.createUnitTestRunner();
		
		Bundle bundle = FrameworkUtil.getBundle(klass);
		
		String className = "asup:/omac/"+bundle.getSymbolicName()+"/"+klass.getName();
		
		testRunner.setClassName(className);

		return testRunner;
	}

	@Override
	public QTestResult executeRunner(QTestContext context, QTestRunner runner) throws FrameworkCoreException {

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

	@Override
	public QTestContext createTestContext(QContext context) throws FrameworkCoreException {

	    // runner context
	    QContext runnerContext = context.createChild();
	    
		return new MyTestContext(runnerContext);
	}
	
	public class MyTestContext extends TestContextImpl {
		
		private QContext delegate;
		
		protected MyTestContext(QContext delegate) {
			this.delegate = delegate;
		}
		
		@Override
		public QContextID getID() {
			return delegate.getID();
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

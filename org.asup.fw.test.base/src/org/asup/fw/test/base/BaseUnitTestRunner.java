package org.asup.fw.test.base;

import org.asup.fw.core.FrameworkCoreException;
import org.asup.fw.core.QContext;
import org.asup.fw.test.QFrameworkTestFactory;
import org.asup.fw.test.QTestAsserter;
import org.asup.fw.test.QTestResult;
import org.asup.fw.test.annotation.Test;
import org.asup.fw.test.annotation.TestStarted;
import org.asup.fw.test.impl.UnitTestRunnerImpl;

public class BaseUnitTestRunner extends UnitTestRunnerImpl {

	private QContext context;
	private String classURI;
	
	public BaseUnitTestRunner(QContext context, String classURI) {
		this.context = context;
		this.classURI = classURI;
	}
	
	@Override
	public QTestResult call() throws Exception {		

		Class<?> testClass = context.loadClass(classURI);
	    if(testClass == null)
	    	throw new FrameworkCoreException("Invalid runner: "+classURI);

	    // result
		QTestResult testResult = QFrameworkTestFactory.eINSTANCE.createTestResult();
	    Test test = testClass.getAnnotation(Test.class);
		testResult.setCategory(test.category());
		testResult.setObject(test.object());
		testResult.setRunner(testClass.getSimpleName());

		QTestAsserter testAsserter = new BaseTestAsserterImpl(testResult, getTestListeners());
	    context.set(QTestAsserter.class, testAsserter);
	    
		Object testCase = context.make(testClass);

		long start = System.currentTimeMillis();
		try {
			testAsserter.resetTime();
			context.invoke(testCase, TestStarted.class);
		} 
		catch(Exception exc) {
			testResult.setFailed(true);
		}
		long end = System.currentTimeMillis();
		
		testResult.setTime(end-start);
	    
	    return testResult;
	}

}

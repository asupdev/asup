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
package org.asup.fw.test.base;

import java.util.List;

import javax.inject.Inject;

import org.asup.fw.test.FrameworkTestFailureError;
import org.asup.fw.test.QAsserter;
import org.asup.fw.test.QAssertionFailed;
import org.asup.fw.test.QAssertionResult;
import org.asup.fw.test.QAssertionSuccess;
import org.asup.fw.test.QFrameworkTestFactory;
import org.asup.fw.test.QTestListener;
import org.asup.fw.test.QTestRunner;

public abstract class BaseAssertImpl implements QAsserter {

	@Inject
	private QTestRunner testRunner;

	private boolean fatal;
	
	/**
     * Asserts that a condition is true. If it isn't it throws
     * an AssertionFailedError with the given message.
     */
    public void assertTrue(String message, boolean condition) {
        if (condition) {
        	success(message);
        } else {
        	fail(message);
        }
    }

    /**
     * Asserts that a condition is true. If it isn't it throws
     * an AssertionFailedError.
     */
    public void assertTrue(boolean condition) {
        assertTrue(null, condition);
    }

    /**
     * Asserts that a condition is false. If it isn't it throws
     * an AssertionFailedError with the given message.
     */
    public void assertFalse(String message, boolean condition) {
        assertTrue(message, !condition);
    }

    /**
     * Asserts that a condition is false. If it isn't it throws
     * an AssertionFailedError.
     */
    public void assertFalse(boolean condition) {
        assertFalse(null, condition);
    }



    /**
     * Asserts that two objects are equal. If they are not
     * an AssertionFailedError is thrown with the given message.
     */
    public void assertEquals(String message, Object expected, Object actual) {
        if (expected == null && actual == null) {
            return;
        }
        if (expected != null && expected.equals(actual)) {
            successEquals(message, expected, actual);
        }
        else {
        	failNotEquals(message, expected, actual);
        }
    }

    /**
     * Asserts that two objects are equal. If they are not
     * an AssertionFailedError is thrown.
     */
    public void assertEquals(Object expected, Object actual) {
        assertEquals(null, expected, actual);
    }

    /**
     * Asserts that two Strings are equal.
     */
    public void assertEquals(String message, String expected, String actual) {
        if (expected == null && actual == null) {
            return;
        }
        if (expected != null && expected.equals(actual)) {
        	successEquals(message, expected, actual);
        } else {
        	failNotEquals(message, expected, actual);
        }
    }

    /**
     * Asserts that two Strings are equal.
     */
    public void assertEquals(String expected, String actual) {
        assertEquals(null, expected, actual);
    }

    /**
     * Asserts that two doubles are equal concerning a delta.  If they are not
     * an AssertionFailedError is thrown with the given message.  If the expected
     * value is infinity then the delta value is ignored.
     */
    public void assertEquals(String message, double expected, double actual, double delta) {
        if (Double.compare(expected, actual) == 0 || Math.abs(expected - actual) <= delta){
        	successEquals(message, new Double(expected), new Double(actual));
        } else {
            failNotEquals(message, new Double(expected), new Double(actual));
        }
    }

    /**
     * Asserts that two doubles are equal concerning a delta. If the expected
     * value is infinity then the delta value is ignored.
     */
    public void assertEquals(double expected, double actual, double delta) {
        assertEquals(null, expected, actual, delta);
    }

    /**
     * Asserts that two floats are equal concerning a positive delta. If they
     * are not an AssertionFailedError is thrown with the given message. If the
     * expected value is infinity then the delta value is ignored.
     */
    public void assertEquals(String message, float expected, float actual, float delta) {
        if (Float.compare(expected, actual) == 0 || Math.abs(expected - actual) <= delta) {
        	successEquals(message, new Float(expected), new Float(actual));
        } else {
            failNotEquals(message, new Float(expected), new Float(actual));
        }
    }

    /**
     * Asserts that two floats are equal concerning a delta. If the expected
     * value is infinity then the delta value is ignored.
     */
    public void assertEquals(float expected, float actual, float delta) {
        assertEquals(null, expected, actual, delta);
    }

    /**
     * Asserts that two longs are equal. If they are not
     * an AssertionFailedError is thrown with the given message.
     */
    public void assertEquals(String message, long expected, long actual) {
        assertEquals(message, new Long(expected), new Long(actual));
    }

    /**
     * Asserts that two longs are equal.
     */
    public void assertEquals(long expected, long actual) {
        assertEquals(null, expected, actual);
    }

    /**
     * Asserts that two booleans are equal. If they are not
     * an AssertionFailedError is thrown with the given message.
     */
    public void assertEquals(String message, boolean expected, boolean actual) {
        assertEquals(message, Boolean.valueOf(expected), Boolean.valueOf(actual));
    }

    /**
     * Asserts that two booleans are equal.
     */
    public void assertEquals(boolean expected, boolean actual) {
        assertEquals(null, expected, actual);
    }

    /**
     * Asserts that two bytes are equal. If they are not
     * an AssertionFailedError is thrown with the given message.
     */
    public void assertEquals(String message, byte expected, byte actual) {
        assertEquals(message, new Byte(expected), new Byte(actual));
    }

    /**
     * Asserts that two bytes are equal.
     */
    public void assertEquals(byte expected, byte actual) {
        assertEquals(null, expected, actual);
    }

    /**
     * Asserts that two chars are equal. If they are not
     * an AssertionFailedError is thrown with the given message.
     */
    public void assertEquals(String message, char expected, char actual) {
        assertEquals(message, new Character(expected), new Character(actual));
    }

    /**
     * Asserts that two chars are equal.
     */
    public void assertEquals(char expected, char actual) {
        assertEquals(null, expected, actual);
    }

    /**
     * Asserts that two shorts are equal. If they are not
     * an AssertionFailedError is thrown with the given message.
     */
    public void assertEquals(String message, short expected, short actual) {
        assertEquals(message, new Short(expected), new Short(actual));
    }

    /**
     * Asserts that two shorts are equal.
     */
    public void assertEquals(short expected, short actual) {
        assertEquals(null, expected, actual);
    }

    /**
     * Asserts that two ints are equal. If they are not
     * an AssertionFailedError is thrown with the given message.
     */
    public void assertEquals(String message, int expected, int actual) {
        assertEquals(message, new Integer(expected), new Integer(actual));
    }

    /**
     * Asserts that two ints are equal.
     */
    public void assertEquals(int expected, int actual) {
        assertEquals(null, expected, actual);
    }

    /**
     * Asserts that an object isn't null.
     */
    public void assertNotNull(Object object) {
        assertNotNull(null, object);
    }

    /**
     * Asserts that an object isn't null. If it is
     * an AssertionFailedError is thrown with the given message.
     */
    public void assertNotNull(String message, Object object) {
        assertTrue(message, object != null);
    }

    /**
     * Asserts that an object is null. If it isn't an {@link AssertionError} is
     * thrown.
     * Message contains: Expected: <null> but was: object
     *
     * @param object Object to check or <code>null</code>
     */
    public void assertNull(Object object) {
        if (object != null) {
            assertNull("Expected: <null> but was: " + object.toString(), object);
        }
    }

    /**
     * Asserts that an object is null.  If it is not
     * an AssertionFailedError is thrown with the given message.
     */
    public void assertNull(String message, Object object) {
        assertTrue(message, object == null);
    }

    /**
     * Asserts that two objects refer to the same object. If they are not
     * an AssertionFailedError is thrown with the given message.
     */
    public void assertSame(String message, Object expected, Object actual) {
        if (expected == actual) {
            successSame(message);
        } else {
        	failNotSame(message, expected, actual);
        }
    }

    /**
     * Asserts that two objects refer to the same object. If they are not
     * the same an AssertionFailedError is thrown.
     */
    public void assertSame(Object expected, Object actual) {
        assertSame(null, expected, actual);
    }

    /**
     * Asserts that two objects do not refer to the same object. If they do
     * refer to the same object an AssertionFailedError is thrown with the
     * given message.
     */
    public void assertNotSame(String message, Object expected, Object actual) {
        if (expected == actual) {
            failSame(message);
        } else {
        	successNotSame(message, expected, actual);
        }

    }

    /**
     * Asserts that two objects do not refer to the same object. If they do
     * refer to the same object an AssertionFailedError is thrown.
     */
    public void assertNotSame(Object expected, Object actual) {
        assertNotSame(null, expected, actual);
    }

    public void failSame(String message) throws FrameworkTestFailureError {
        String formatted = (message != null) ? message + " " : "";
        fail(formatted + "expected not same");
    }

    public void failNotSame(String message, Object expected, Object actual) throws FrameworkTestFailureError {
        String formatted = (message != null) ? message + " " : "";
        fail(formatted + "expected same:<" + expected + "> was not:<" + actual + ">");
    }

    public void successSame(String message) {
        String formatted = (message != null) ? message + " " : "";
        success(formatted + "as expected same");
    }

    public void successNotSame(String message, Object expected, Object actual) {
        String formatted = (message != null) ? message + " " : "";
        success(formatted + "expected not same:<" + expected + "> was not :<" + actual + "> as expected");
    }


	public QTestRunner getTestRunner() {
		return testRunner;
	}


	public void setTestRunner(QTestRunner value) {
		this.testRunner = value;
	}

	/**
     * Fails a test with no message.
	 * @throws FrameworkTestFailureError
     */
    public void fail() throws FrameworkTestFailureError {
        fail(null);
    }

	 /**
     * Fails a test with the given message.
	 * @throws FrameworkTestFailureError
     */
    public void fail(String message) throws FrameworkTestFailureError {

    	//Create fail assertion
    	QAssertionFailed assertionFailed = QFrameworkTestFactory.eINSTANCE.createAssertionFailed();
    	assertionFailed.setMessage(message);
//    	assertionFailed.setTestClass(this.getClass().getName());
//    	assertionFailed.setTestName(getTestName());

    	getTestRunner().getTestResult().getAssertResults().add(assertionFailed);
    	getTestRunner().getTestResult().setFailed(true);
    	notifyAssertResult(assertionFailed);

    	if (fatal) 
    		throw new FrameworkTestFailureError("Fatal test case");
    }

    public void failNotEquals(String message, Object expected, Object actual) throws FrameworkTestFailureError {
        fail(formatFailMessage(message, expected, actual));
    }

    /**
     * Success a test with no message.
     */
    public void success() {
        success(null);
    }

    /**
     * Fails a test with the given message.
     */
    public void success(String message) {

    	//Create fail assertion
    	QAssertionSuccess assertionSuccess = QFrameworkTestFactory.eINSTANCE.createAssertionSuccess();
    	assertionSuccess.setMessage(message);
//    	assertionSuccess.setTestClass(this.getClass().getName());
//    	assertionSuccess.setTestName(getTestName());

    	getTestRunner().getTestResult().getAssertResults().add(assertionSuccess);
    	notifyAssertResult(assertionSuccess);
    }

    public void successEquals(String message, Object expected, Object actual) {
        success(formatSuccessMessage(message, expected, actual));
    }

    public static String formatSuccessMessage(String message, Object expected, Object actual) {
        String formatted = "";
        if (message != null && message.length() > 0) {
            formatted = message + " ";
        }
        return formatted + "expected:<" + expected + "> was:<" + actual + ">";
    }


    public static String formatFailMessage(String message, Object expected, Object actual) {
        String formatted = "";
        if (message != null && message.length() > 0) {
            formatted = message + " ";
        }
        return formatted + "expected:<" + expected + "> but was:<" + actual + ">";
    }

	public void notifyAssertResult(QAssertionResult assertionResult) {
		List<QTestListener> testListeners = getTestRunner().getTestListeners();
		for (int i = 0; i < testListeners.size(); i++) {
			testListeners.get(i).addAssertionResult(assertionResult);
		}
	}

//	public abstract void notifyAssertResult(QAssertionResult AssertionResult);
}

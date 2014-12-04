/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.test.impl;

import java.util.Collection;
import java.util.List;
import org.asup.fw.test.QAssertionResult;
import org.asup.fw.test.QFrameworkTestPackage;
import org.asup.fw.test.QTestResult;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.fw.test.impl.TestResultImpl#isFailed <em>Failed</em>}</li>
 *   <li>{@link org.asup.fw.test.impl.TestResultImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.asup.fw.test.impl.TestResultImpl#getAssertResults <em>Assert Results</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestResultImpl extends EObjectImpl implements QTestResult {
	/**
	 * The default value of the '{@link #isFailed() <em>Failed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAILED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFailed() <em>Failed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailed()
	 * @generated
	 * @ordered
	 */
	protected boolean failed = FAILED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected long time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssertResults() <em>Assert Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertResults()
	 * @generated
	 * @ordered
	 */
	protected EList<QAssertionResult> assertResults;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFrameworkTestPackage.Literals.TEST_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFailed() {
		return failed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailed(boolean newFailed) {
		boolean oldFailed = failed;
		failed = newFailed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFrameworkTestPackage.TEST_RESULT__FAILED, oldFailed, failed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(long newTime) {
		long oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFrameworkTestPackage.TEST_RESULT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QAssertionResult> getAssertResults() {
		if (assertResults == null) {
			assertResults = new EObjectContainmentEList<QAssertionResult>(QAssertionResult.class, this, QFrameworkTestPackage.TEST_RESULT__ASSERT_RESULTS);
		}
		return assertResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QFrameworkTestPackage.TEST_RESULT__ASSERT_RESULTS:
				return ((InternalEList<?>)getAssertResults()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QFrameworkTestPackage.TEST_RESULT__FAILED:
				return isFailed();
			case QFrameworkTestPackage.TEST_RESULT__TIME:
				return getTime();
			case QFrameworkTestPackage.TEST_RESULT__ASSERT_RESULTS:
				return getAssertResults();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QFrameworkTestPackage.TEST_RESULT__FAILED:
				setFailed((Boolean)newValue);
				return;
			case QFrameworkTestPackage.TEST_RESULT__TIME:
				setTime((Long)newValue);
				return;
			case QFrameworkTestPackage.TEST_RESULT__ASSERT_RESULTS:
				getAssertResults().clear();
				getAssertResults().addAll((Collection<? extends QAssertionResult>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QFrameworkTestPackage.TEST_RESULT__FAILED:
				setFailed(FAILED_EDEFAULT);
				return;
			case QFrameworkTestPackage.TEST_RESULT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case QFrameworkTestPackage.TEST_RESULT__ASSERT_RESULTS:
				getAssertResults().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QFrameworkTestPackage.TEST_RESULT__FAILED:
				return failed != FAILED_EDEFAULT;
			case QFrameworkTestPackage.TEST_RESULT__TIME:
				return time != TIME_EDEFAULT;
			case QFrameworkTestPackage.TEST_RESULT__ASSERT_RESULTS:
				return assertResults != null && !assertResults.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (failed: ");
		result.append(failed);
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //TestResultImpl

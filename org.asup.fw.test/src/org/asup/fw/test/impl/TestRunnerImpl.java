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
import org.asup.fw.test.QFrameworkTestPackage;
import org.asup.fw.test.QTestListener;
import org.asup.fw.test.QTestRunner;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.fw.test.impl.TestRunnerImpl#getTestListeners <em>Test Listeners</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TestRunnerImpl extends EObjectImpl implements QTestRunner {
	/**
	 * The cached value of the '{@link #getTestListeners() <em>Test Listeners</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestListeners()
	 * @generated
	 * @ordered
	 */
	protected EList<QTestListener> testListeners;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestRunnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFrameworkTestPackage.Literals.TEST_RUNNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QTestListener> getTestListeners() {
		if (testListeners == null) {
			testListeners = new EObjectContainmentEList<QTestListener>(QTestListener.class, this, QFrameworkTestPackage.TEST_RUNNER__TEST_LISTENERS);
		}
		return testListeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void runTest() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QFrameworkTestPackage.TEST_RUNNER__TEST_LISTENERS:
				return ((InternalEList<?>)getTestListeners()).basicRemove(otherEnd, msgs);
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
			case QFrameworkTestPackage.TEST_RUNNER__TEST_LISTENERS:
				return getTestListeners();
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
			case QFrameworkTestPackage.TEST_RUNNER__TEST_LISTENERS:
				getTestListeners().clear();
				getTestListeners().addAll((Collection<? extends QTestListener>)newValue);
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
			case QFrameworkTestPackage.TEST_RUNNER__TEST_LISTENERS:
				getTestListeners().clear();
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
			case QFrameworkTestPackage.TEST_RUNNER__TEST_LISTENERS:
				return testListeners != null && !testListeners.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestRunnerImpl

/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.dk.compiler.impl;

import java.util.Collection;
import java.util.List;

import org.asup.dk.compiler.QCompilationTrashcan;
import org.asup.dk.compiler.QDevelopmentKitCompilerPackage;

import org.asup.il.data.QDataTerm;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Trashcan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.dk.compiler.impl.CompilationTrashcanImpl#getDataTerms <em>Data Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompilationTrashcanImpl extends MinimalEObjectImpl.Container implements QCompilationTrashcan {
	/**
	 * The cached value of the '{@link #getDataTerms() <em>Data Terms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<QDataTerm<?>> dataTerms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationTrashcanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDevelopmentKitCompilerPackage.Literals.COMPILATION_TRASHCAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QDataTerm<?>> getDataTerms() {
		if (dataTerms == null) {
			dataTerms = new EObjectContainmentEList<QDataTerm<?>>(QDataTerm.class, this, QDevelopmentKitCompilerPackage.COMPILATION_TRASHCAN__DATA_TERMS);
		}
		return dataTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDevelopmentKitCompilerPackage.COMPILATION_TRASHCAN__DATA_TERMS:
				return ((InternalEList<?>)getDataTerms()).basicRemove(otherEnd, msgs);
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
			case QDevelopmentKitCompilerPackage.COMPILATION_TRASHCAN__DATA_TERMS:
				return getDataTerms();
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
			case QDevelopmentKitCompilerPackage.COMPILATION_TRASHCAN__DATA_TERMS:
				getDataTerms().clear();
				getDataTerms().addAll((Collection<? extends QDataTerm<?>>)newValue);
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
			case QDevelopmentKitCompilerPackage.COMPILATION_TRASHCAN__DATA_TERMS:
				getDataTerms().clear();
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
			case QDevelopmentKitCompilerPackage.COMPILATION_TRASHCAN__DATA_TERMS:
				return dataTerms != null && !dataTerms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompilationTrashcanImpl

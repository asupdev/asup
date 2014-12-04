/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.impl;

import java.lang.reflect.Method;

import org.asup.il.data.QDataTerm;
import org.asup.il.data.QDataTermVisitor;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.il.data.QMultipleAtomicDataTerm;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Term Visitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DataTermVisitorImpl extends MinimalEObjectImpl.Container implements QDataTermVisitor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTermVisitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataPackage.Literals.DATA_TERM_VISITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QDataTerm<?> term) {
		try {
			@SuppressWarnings("unchecked")
			Method method = getMethod("endVisit", (Class<QDataTerm<?>>) term.getClass());
			if(method == null) {
				System.out.println(term);
			}
			method.invoke(this, new Object[] {term});
		}
		catch (Exception e) {
			System.out.println(term);
		}		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QMultipleAtomicDataTerm<?> term) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QMultipleCompoundDataTerm<?> term) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QUnaryAtomicDataTerm<?> term) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QUnaryCompoundDataTerm<?> term) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QDataTerm<?> term) {

		try {
			@SuppressWarnings("unchecked")
			Method method = getMethod("visit", (Class<QDataTerm<?>>) term.getClass());
			if(method == null) {
				System.out.println(term);
				return false;
			}
			return (boolean) method.invoke(this, new Object[] {term});
		}
		catch (Exception e) {
			System.out.println(term);
			return false;
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QMultipleAtomicDataTerm<?> term) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QMultipleCompoundDataTerm<?> term) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QUnaryAtomicDataTerm<?> term) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QUnaryCompoundDataTerm<?> term) {
		return true;
	}
	

	protected Method getMethod(String name, Class<QDataTerm<?>> c) {
		Method m = null;

		Class<?>[] interfaces = c.getInterfaces();
		for (int i = 0; i < interfaces.length; i++) {
			try {
				m = getClass().getMethod(name, new Class[] {interfaces[i]});
				break;
			} 
			catch (NoSuchMethodException e) {}
		}
		return m;
	}
} //DataTermVisitorImpl

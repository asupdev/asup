/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.impl;

import java.lang.reflect.Method;

import org.asup.il.core.QNode;
import org.asup.il.data.QArray;
import org.asup.il.data.QBinary;
import org.asup.il.data.QBoolean;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QData;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QDataVisitor;
import org.asup.il.data.QDatetime;
import org.asup.il.data.QDecimal;
import org.asup.il.data.QEnum;
import org.asup.il.data.QFloating;
import org.asup.il.data.QGraphic;
import org.asup.il.data.QHexadecimal;
import org.asup.il.data.QIdentifier;
import org.asup.il.data.QIndicator;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.il.data.QPointer;
import org.asup.il.data.QScroller;
import org.asup.il.data.QStroller;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Visitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DataVisitorImpl extends MinimalEObjectImpl.Container implements QDataVisitor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataVisitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataPackage.Literals.DATA_VISITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QData data) {
		try {
			@SuppressWarnings("unchecked")
			Method method = getMethod("endVisit", (Class<QNode>) data.getClass());
			if(method == null) {
				System.out.println(data);
			}
			method.invoke(this, new Object[] {data});
		}
		catch (Exception e) {
			System.out.println(data);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QArray<?> data) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QBinary data) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QBoolean data) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QCharacter data) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QDataStruct data) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QDatetime data) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QDecimal data) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QEnum<?, ?> data) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QFloating data) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QGraphic data) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QHexadecimal data) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QIdentifier data) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QIndicator data) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QPointer data) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QScroller<?> data) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QStroller<?> data) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QData data) {
		
		try {
			@SuppressWarnings("unchecked")
			Method method = getMethod("visit", (Class<QNode>) data.getClass());
			if(method == null) {
				System.out.println(data);
				return false;
			}
			return (boolean) method.invoke(this, new Object[] {data});
		}
		catch (Exception e) {
			System.out.println(data);
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QArray<?> data) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QBinary data) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QBoolean data) {
		return true;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QCharacter data) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QDataStruct data) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QDatetime data) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QDecimal data) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QEnum<?, ?> data) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QFloating data) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QGraphic data) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QHexadecimal data) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QIdentifier data) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QIndicator data) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QPointer data) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QScroller<?> data) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QStroller<?> data) {
		return true;
	}


	protected Method getMethod(String name, Class<QNode> c) {
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
} //DataVisitorImpl

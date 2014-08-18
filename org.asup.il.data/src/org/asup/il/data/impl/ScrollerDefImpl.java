/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.impl;

import java.lang.String;
import java.util.List;

import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.il.data.QScroller;
import org.asup.il.data.QScrollerDef;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scroller Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.il.data.impl.ScrollerDefImpl#getOccurrences <em>Occurrences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScrollerDefImpl<D extends QScroller<?>> extends MultipleAtomicDataDefImpl<D> implements QScrollerDef<D> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getOccurrences() <em>Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrences()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCURRENCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOccurrences() <em>Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrences()
	 * @generated
	 * @ordered
	 */
	protected String occurrences = OCCURRENCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScrollerDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataPackage.Literals.SCROLLER_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOccurrences() {
		return occurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrences(String newOccurrences) {
		String oldOccurrences = occurrences;
		occurrences = newOccurrences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataPackage.SCROLLER_DEF__OCCURRENCES, oldOccurrences, occurrences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageDataPackage.SCROLLER_DEF__OCCURRENCES:
				return getOccurrences();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QIntegratedLanguageDataPackage.SCROLLER_DEF__OCCURRENCES:
				setOccurrences((String)newValue);
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
			case QIntegratedLanguageDataPackage.SCROLLER_DEF__OCCURRENCES:
				setOccurrences(OCCURRENCES_EDEFAULT);
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
			case QIntegratedLanguageDataPackage.SCROLLER_DEF__OCCURRENCES:
				return OCCURRENCES_EDEFAULT == null ? occurrences != null : !OCCURRENCES_EDEFAULT.equals(occurrences);
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
		result.append(" (occurrences: ");
		result.append(occurrences);
		result.append(')');
		return result.toString();
	}

	@Override
	public Class<?> getJavaClass() {		
		return List.class;
	}

	@Override
	public Class<?> getDataClass() {
		return QScroller.class;
	}
} //ScrollerDefImpl

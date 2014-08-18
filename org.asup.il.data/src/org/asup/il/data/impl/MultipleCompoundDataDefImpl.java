/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.impl;

import java.lang.Boolean;
import java.lang.String;
import java.util.Collection;
import java.util.List;

import org.asup.il.data.QCompoundDataDef;
import org.asup.il.data.QCompoundDataPart;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.il.data.QMultipleCompoundDataDef;
import org.asup.il.data.QStroller;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Compound Data Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.il.data.impl.MultipleCompoundDataDefImpl#getClassDelegator <em>Class Delegator</em>}</li>
 *   <li>{@link org.asup.il.data.impl.MultipleCompoundDataDefImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.asup.il.data.impl.MultipleCompoundDataDefImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.asup.il.data.impl.MultipleCompoundDataDefImpl#isQualified <em>Qualified</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MultipleCompoundDataDefImpl<D extends QStroller<?>> extends MultipleDataDefImpl<D> implements QMultipleCompoundDataDef<D> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getClassDelegator() <em>Class Delegator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassDelegator()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_DELEGATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassDelegator() <em>Class Delegator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassDelegator()
	 * @generated
	 * @ordered
	 */
	protected String classDelegator = CLASS_DELEGATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<QDataTerm<?>> elements;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isQualified() <em>Qualified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQualified()
	 * @generated
	 * @ordered
	 */
	protected static final boolean QUALIFIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isQualified() <em>Qualified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQualified()
	 * @generated
	 * @ordered
	 */
	protected boolean qualified = QUALIFIED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleCompoundDataDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataPackage.Literals.MULTIPLE_COMPOUND_DATA_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassDelegator() {
		return classDelegator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassDelegator(String newClassDelegator) {
		String oldClassDelegator = classDelegator;
		classDelegator = newClassDelegator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__CLASS_DELEGATOR, oldClassDelegator, classDelegator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QDataTerm<?>> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<QDataTerm<?>>(QDataTerm.class, this, QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isQualified() {
		return qualified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualified(boolean newQualified) {
		boolean oldQualified = qualified;
		qualified = newQualified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__QUALIFIED, oldQualified, qualified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__CLASS_DELEGATOR:
				return getClassDelegator();
			case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__ELEMENTS:
				return getElements();
			case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__PREFIX:
				return getPrefix();
			case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__QUALIFIED:
				return isQualified();
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
			case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__CLASS_DELEGATOR:
				setClassDelegator((String)newValue);
				return;
			case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends QDataTerm<?>>)newValue);
				return;
			case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__PREFIX:
				setPrefix((String)newValue);
				return;
			case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__QUALIFIED:
				setQualified((Boolean)newValue);
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
			case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__CLASS_DELEGATOR:
				setClassDelegator(CLASS_DELEGATOR_EDEFAULT);
				return;
			case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__ELEMENTS:
				getElements().clear();
				return;
			case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__QUALIFIED:
				setQualified(QUALIFIED_EDEFAULT);
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
			case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__CLASS_DELEGATOR:
				return CLASS_DELEGATOR_EDEFAULT == null ? classDelegator != null : !CLASS_DELEGATOR_EDEFAULT.equals(classDelegator);
			case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__QUALIFIED:
				return qualified != QUALIFIED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == QCompoundDataPart.class) {
			switch (derivedFeatureID) {
				case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__CLASS_DELEGATOR: return QIntegratedLanguageDataPackage.COMPOUND_DATA_PART__CLASS_DELEGATOR;
				case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__ELEMENTS: return QIntegratedLanguageDataPackage.COMPOUND_DATA_PART__ELEMENTS;
				case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__PREFIX: return QIntegratedLanguageDataPackage.COMPOUND_DATA_PART__PREFIX;
				case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__QUALIFIED: return QIntegratedLanguageDataPackage.COMPOUND_DATA_PART__QUALIFIED;
				default: return -1;
			}
		}
		if (baseClass == QCompoundDataDef.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == QCompoundDataPart.class) {
			switch (baseFeatureID) {
				case QIntegratedLanguageDataPackage.COMPOUND_DATA_PART__CLASS_DELEGATOR: return QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__CLASS_DELEGATOR;
				case QIntegratedLanguageDataPackage.COMPOUND_DATA_PART__ELEMENTS: return QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__ELEMENTS;
				case QIntegratedLanguageDataPackage.COMPOUND_DATA_PART__PREFIX: return QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__PREFIX;
				case QIntegratedLanguageDataPackage.COMPOUND_DATA_PART__QUALIFIED: return QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_DEF__QUALIFIED;
				default: return -1;
			}
		}
		if (baseClass == QCompoundDataDef.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (classDelegator: ");
		result.append(classDelegator);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", qualified: ");
		result.append(qualified);
		result.append(')');
		return result.toString();
	}

} //MultipleCompoundDataDefImpl

/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file.impl;

import java.util.Collection;
import java.util.List;

import org.asup.il.core.QFacet;
import org.asup.il.core.QIntegratedLanguageCorePackage;
import org.asup.il.core.QNamedNode;
import org.asup.il.core.QNode;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QOperatingSystemFilePackage;
import org.asup.os.type.impl.TypedObjectImpl;
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
 * An implementation of the model object '<em><b>QFile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.os.type.file.impl.FileImpl#getFacets <em>Facets</em>}</li>
 *   <li>{@link org.asup.os.type.file.impl.FileImpl#getDictionary <em>Dictionary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FileImpl extends TypedObjectImpl implements QFile {
	/**
	 * The cached value of the '{@link #getFacets() <em>Facets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacets()
	 * @generated
	 * @ordered
	 */
	protected EList<QFacet> facets;
	/**
	 * The default value of the '{@link #getDictionary() <em>Dictionary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionary()
	 * @generated
	 * @ordered
	 */
	protected static final String DICTIONARY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDictionary() <em>Dictionary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionary()
	 * @generated
	 * @ordered
	 */
	protected String dictionary = DICTIONARY_EDEFAULT;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemFilePackage.Literals.FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QFacet> getFacets() {
		if (facets == null) {
			facets = new EObjectContainmentEList<QFacet>(QFacet.class, this, QOperatingSystemFilePackage.FILE__FACETS);
		}
		return facets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDictionary() {
		return dictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDictionary(String newDictionary) {
		String oldDictionary = dictionary;
		dictionary = newDictionary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.FILE__DICTIONARY, oldDictionary, dictionary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <F extends QFacet> F getFacet(Class<F> klass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNode getParent() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChild() {
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
			case QOperatingSystemFilePackage.FILE__FACETS:
				return ((InternalEList<?>)getFacets()).basicRemove(otherEnd, msgs);
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
			case QOperatingSystemFilePackage.FILE__FACETS:
				return getFacets();
			case QOperatingSystemFilePackage.FILE__DICTIONARY:
				return getDictionary();
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
			case QOperatingSystemFilePackage.FILE__FACETS:
				getFacets().clear();
				getFacets().addAll((Collection<? extends QFacet>)newValue);
				return;
			case QOperatingSystemFilePackage.FILE__DICTIONARY:
				setDictionary((String)newValue);
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
			case QOperatingSystemFilePackage.FILE__FACETS:
				getFacets().clear();
				return;
			case QOperatingSystemFilePackage.FILE__DICTIONARY:
				setDictionary(DICTIONARY_EDEFAULT);
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
			case QOperatingSystemFilePackage.FILE__FACETS:
				return facets != null && !facets.isEmpty();
			case QOperatingSystemFilePackage.FILE__DICTIONARY:
				return DICTIONARY_EDEFAULT == null ? dictionary != null : !DICTIONARY_EDEFAULT.equals(dictionary);
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
		if (baseClass == QNode.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == QNamedNode.class) {
			switch (derivedFeatureID) {
				case QOperatingSystemFilePackage.FILE__FACETS: return QIntegratedLanguageCorePackage.NAMED_NODE__FACETS;
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
		if (baseClass == QNode.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == QNamedNode.class) {
			switch (baseFeatureID) {
				case QIntegratedLanguageCorePackage.NAMED_NODE__FACETS: return QOperatingSystemFilePackage.FILE__FACETS;
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
		result.append(" (dictionary: ");
		result.append(dictionary);
		result.append(')');
		return result.toString();
	}
} //QFileImpl

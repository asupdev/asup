/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.impl;

import org.asup.os.omac.QCreationInfo;
import org.asup.os.omac.QMemoryInfo;
import org.asup.os.omac.impl.ObjectNameableImpl;
import org.asup.os.type.QOperatingSystemTypePackage;
import org.asup.os.type.QTypedObject;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QTyped Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.os.type.impl.TypedObjectImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link org.asup.os.type.impl.TypedObjectImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.asup.os.type.impl.TypedObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.asup.os.type.impl.TypedObjectImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.asup.os.type.impl.TypedObjectImpl#getCreationInfo <em>Creation Info</em>}</li>
 *   <li>{@link org.asup.os.type.impl.TypedObjectImpl#getMemoryInfo <em>Memory Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypedObjectImpl extends ObjectNameableImpl implements QTypedObject {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected String application = APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBRARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected String library = LIBRARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreationInfo() <em>Creation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationInfo()
	 * @generated
	 * @ordered
	 */
	protected QCreationInfo creationInfo;

	/**
	 * The cached value of the '{@link #getMemoryInfo() <em>Memory Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryInfo()
	 * @generated
	 * @ordered
	 */
	protected QMemoryInfo memoryInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemTypePackage.Literals.TYPED_OBJECT;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMemoryInfo getMemoryInfo() {
		return memoryInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemoryInfo(QMemoryInfo newMemoryInfo, NotificationChain msgs) {
		QMemoryInfo oldMemoryInfo = memoryInfo;
		memoryInfo = newMemoryInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemTypePackage.TYPED_OBJECT__MEMORY_INFO, oldMemoryInfo, newMemoryInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryInfo(QMemoryInfo newMemoryInfo) {
		if (newMemoryInfo != memoryInfo) {
			NotificationChain msgs = null;
			if (memoryInfo != null)
				msgs = ((InternalEObject)memoryInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemTypePackage.TYPED_OBJECT__MEMORY_INFO, null, msgs);
			if (newMemoryInfo != null)
				msgs = ((InternalEObject)newMemoryInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemTypePackage.TYPED_OBJECT__MEMORY_INFO, null, msgs);
			msgs = basicSetMemoryInfo(newMemoryInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemTypePackage.TYPED_OBJECT__MEMORY_INFO, newMemoryInfo, newMemoryInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttribute() {
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
			case QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO:
				return basicSetCreationInfo(null, msgs);
			case QOperatingSystemTypePackage.TYPED_OBJECT__MEMORY_INFO:
				return basicSetMemoryInfo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemTypePackage.TYPED_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(String newApplication) {
		String oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION, oldApplication, application));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemTypePackage.TYPED_OBJECT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCreationInfo getCreationInfo() {
		return creationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationInfo(QCreationInfo newCreationInfo, NotificationChain msgs) {
		QCreationInfo oldCreationInfo = creationInfo;
		creationInfo = newCreationInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO, oldCreationInfo, newCreationInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationInfo(QCreationInfo newCreationInfo) {
		if (newCreationInfo != creationInfo) {
			NotificationChain msgs = null;
			if (creationInfo != null)
				msgs = ((InternalEObject)creationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO, null, msgs);
			if (newCreationInfo != null)
				msgs = ((InternalEObject)newCreationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO, null, msgs);
			msgs = basicSetCreationInfo(newCreationInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO, newCreationInfo, newCreationInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibrary() {
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(String newLibrary) {
		String oldLibrary = library;
		library = newLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemTypePackage.TYPED_OBJECT__LIBRARY, oldLibrary, library));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION:
				return getApplication();
			case QOperatingSystemTypePackage.TYPED_OBJECT__LIBRARY:
				return getLibrary();
			case QOperatingSystemTypePackage.TYPED_OBJECT__NAME:
				return getName();
			case QOperatingSystemTypePackage.TYPED_OBJECT__TEXT:
				return getText();
			case QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO:
				return getCreationInfo();
			case QOperatingSystemTypePackage.TYPED_OBJECT__MEMORY_INFO:
				return getMemoryInfo();
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
			case QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION:
				setApplication((String)newValue);
				return;
			case QOperatingSystemTypePackage.TYPED_OBJECT__LIBRARY:
				setLibrary((String)newValue);
				return;
			case QOperatingSystemTypePackage.TYPED_OBJECT__NAME:
				setName((String)newValue);
				return;
			case QOperatingSystemTypePackage.TYPED_OBJECT__TEXT:
				setText((String)newValue);
				return;
			case QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO:
				setCreationInfo((QCreationInfo)newValue);
				return;
			case QOperatingSystemTypePackage.TYPED_OBJECT__MEMORY_INFO:
				setMemoryInfo((QMemoryInfo)newValue);
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
			case QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION:
				setApplication(APPLICATION_EDEFAULT);
				return;
			case QOperatingSystemTypePackage.TYPED_OBJECT__LIBRARY:
				setLibrary(LIBRARY_EDEFAULT);
				return;
			case QOperatingSystemTypePackage.TYPED_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QOperatingSystemTypePackage.TYPED_OBJECT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO:
				setCreationInfo((QCreationInfo)null);
				return;
			case QOperatingSystemTypePackage.TYPED_OBJECT__MEMORY_INFO:
				setMemoryInfo((QMemoryInfo)null);
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
			case QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION:
				return APPLICATION_EDEFAULT == null ? application != null : !APPLICATION_EDEFAULT.equals(application);
			case QOperatingSystemTypePackage.TYPED_OBJECT__LIBRARY:
				return LIBRARY_EDEFAULT == null ? library != null : !LIBRARY_EDEFAULT.equals(library);
			case QOperatingSystemTypePackage.TYPED_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QOperatingSystemTypePackage.TYPED_OBJECT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO:
				return creationInfo != null;
			case QOperatingSystemTypePackage.TYPED_OBJECT__MEMORY_INFO:
				return memoryInfo != null;
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
		result.append(" (application: ");
		result.append(application);
		result.append(", library: ");
		result.append(library);
		result.append(", name: ");
		result.append(name);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}
} //TypedObjectImpl

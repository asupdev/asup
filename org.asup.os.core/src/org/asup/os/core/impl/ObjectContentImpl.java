/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.impl;

import java.util.Collection;
import java.util.List;

import org.asup.os.core.QOperatingSystemCorePackage;
import org.asup.os.core.QContentLock;
import org.asup.os.core.QObjectContent;
import org.asup.os.omac.QObject;
import org.asup.os.omac.impl.ObjectImpl;
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
 * An implementation of the model object '<em><b>QObject Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.os.core.impl.ObjectContentImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.asup.os.core.impl.ObjectContentImpl#getReadLock <em>Read Lock</em>}</li>
 *   <li>{@link org.asup.os.core.impl.ObjectContentImpl#getWriteLock <em>Write Lock</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectContentImpl<T extends QObject> extends ObjectImpl implements QObjectContent<T> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<T> entries;

	/**
	 * The cached value of the '{@link #getReadLock() <em>Read Lock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadLock()
	 * @generated
	 * @ordered
	 */
	protected QContentLock readLock;

	/**
	 * The cached value of the '{@link #getWriteLock() <em>Write Lock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteLock()
	 * @generated
	 * @ordered
	 */
	protected QContentLock writeLock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemCorePackage.Literals.OBJECT_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<T> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<T>(QObject.class, this, QOperatingSystemCorePackage.OBJECT_CONTENT__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QContentLock getReadLock() {
		return readLock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadLock(QContentLock newReadLock, NotificationChain msgs) {
		QContentLock oldReadLock = readLock;
		readLock = newReadLock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemCorePackage.OBJECT_CONTENT__READ_LOCK, oldReadLock, newReadLock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadLock(QContentLock newReadLock) {
		if (newReadLock != readLock) {
			NotificationChain msgs = null;
			if (readLock != null)
				msgs = ((InternalEObject)readLock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemCorePackage.OBJECT_CONTENT__READ_LOCK, null, msgs);
			if (newReadLock != null)
				msgs = ((InternalEObject)newReadLock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemCorePackage.OBJECT_CONTENT__READ_LOCK, null, msgs);
			msgs = basicSetReadLock(newReadLock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCorePackage.OBJECT_CONTENT__READ_LOCK, newReadLock, newReadLock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QContentLock getWriteLock() {
		return writeLock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriteLock(QContentLock newWriteLock, NotificationChain msgs) {
		QContentLock oldWriteLock = writeLock;
		writeLock = newWriteLock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemCorePackage.OBJECT_CONTENT__WRITE_LOCK, oldWriteLock, newWriteLock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteLock(QContentLock newWriteLock) {
		if (newWriteLock != writeLock) {
			NotificationChain msgs = null;
			if (writeLock != null)
				msgs = ((InternalEObject)writeLock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemCorePackage.OBJECT_CONTENT__WRITE_LOCK, null, msgs);
			if (newWriteLock != null)
				msgs = ((InternalEObject)newWriteLock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemCorePackage.OBJECT_CONTENT__WRITE_LOCK, null, msgs);
			msgs = basicSetWriteLock(newWriteLock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCorePackage.OBJECT_CONTENT__WRITE_LOCK, newWriteLock, newWriteLock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemCorePackage.OBJECT_CONTENT__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
			case QOperatingSystemCorePackage.OBJECT_CONTENT__READ_LOCK:
				return basicSetReadLock(null, msgs);
			case QOperatingSystemCorePackage.OBJECT_CONTENT__WRITE_LOCK:
				return basicSetWriteLock(null, msgs);
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
			case QOperatingSystemCorePackage.OBJECT_CONTENT__ENTRIES:
				return getEntries();
			case QOperatingSystemCorePackage.OBJECT_CONTENT__READ_LOCK:
				return getReadLock();
			case QOperatingSystemCorePackage.OBJECT_CONTENT__WRITE_LOCK:
				return getWriteLock();
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
			case QOperatingSystemCorePackage.OBJECT_CONTENT__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends T>)newValue);
				return;
			case QOperatingSystemCorePackage.OBJECT_CONTENT__READ_LOCK:
				setReadLock((QContentLock)newValue);
				return;
			case QOperatingSystemCorePackage.OBJECT_CONTENT__WRITE_LOCK:
				setWriteLock((QContentLock)newValue);
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
			case QOperatingSystemCorePackage.OBJECT_CONTENT__ENTRIES:
				getEntries().clear();
				return;
			case QOperatingSystemCorePackage.OBJECT_CONTENT__READ_LOCK:
				setReadLock((QContentLock)null);
				return;
			case QOperatingSystemCorePackage.OBJECT_CONTENT__WRITE_LOCK:
				setWriteLock((QContentLock)null);
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
			case QOperatingSystemCorePackage.OBJECT_CONTENT__ENTRIES:
				return entries != null && !entries.isEmpty();
			case QOperatingSystemCorePackage.OBJECT_CONTENT__READ_LOCK:
				return readLock != null;
			case QOperatingSystemCorePackage.OBJECT_CONTENT__WRITE_LOCK:
				return writeLock != null;
		}
		return super.eIsSet(featureID);
	}

} //QObjectContentImpl

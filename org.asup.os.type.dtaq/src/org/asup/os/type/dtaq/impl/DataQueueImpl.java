/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.dtaq.impl;

import org.asup.os.type.dtaq.DataQueueType;
import org.asup.os.type.dtaq.QDataQueue;
import org.asup.os.type.dtaq.QDataQueueContent;
import org.asup.os.type.dtaq.QOperatingSystemDataQueuePackage;
import org.asup.os.type.impl.TypedObjectImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QData Queue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.os.type.dtaq.impl.DataQueueImpl#getDataQueueType <em>Data Queue Type</em>}</li>
 *   <li>{@link org.asup.os.type.dtaq.impl.DataQueueImpl#getKeyLength <em>Key Length</em>}</li>
 *   <li>{@link org.asup.os.type.dtaq.impl.DataQueueImpl#getMaxEntryLength <em>Max Entry Length</em>}</li>
 *   <li>{@link org.asup.os.type.dtaq.impl.DataQueueImpl#isSenderInfo <em>Sender Info</em>}</li>
 *   <li>{@link org.asup.os.type.dtaq.impl.DataQueueImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataQueueImpl extends TypedObjectImpl implements QDataQueue {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getDataQueueType() <em>Data Queue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataQueueType()
	 * @generated
	 * @ordered
	 */
	protected static final DataQueueType DATA_QUEUE_TYPE_EDEFAULT = DataQueueType.FIFO;

	/**
	 * The cached value of the '{@link #getDataQueueType() <em>Data Queue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataQueueType()
	 * @generated
	 * @ordered
	 */
	protected DataQueueType dataQueueType = DATA_QUEUE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyLength() <em>Key Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyLength()
	 * @generated
	 * @ordered
	 */
	protected static final int KEY_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKeyLength() <em>Key Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyLength()
	 * @generated
	 * @ordered
	 */
	protected int keyLength = KEY_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxEntryLength() <em>Max Entry Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEntryLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ENTRY_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxEntryLength() <em>Max Entry Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEntryLength()
	 * @generated
	 * @ordered
	 */
	protected int maxEntryLength = MAX_ENTRY_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isSenderInfo() <em>Sender Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSenderInfo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SENDER_INFO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSenderInfo() <em>Sender Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSenderInfo()
	 * @generated
	 * @ordered
	 */
	protected boolean senderInfo = SENDER_INFO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected QDataQueueContent content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataQueueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemDataQueuePackage.Literals.DATA_QUEUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDataQueueContent getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(QDataQueueContent newContent, NotificationChain msgs) {
		QDataQueueContent oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemDataQueuePackage.DATA_QUEUE__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(QDataQueueContent newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemDataQueuePackage.DATA_QUEUE__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemDataQueuePackage.DATA_QUEUE__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemDataQueuePackage.DATA_QUEUE__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataQueueType getDataQueueType() {
		return dataQueueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataQueueType(DataQueueType newDataQueueType) {
		DataQueueType oldDataQueueType = dataQueueType;
		dataQueueType = newDataQueueType == null ? DATA_QUEUE_TYPE_EDEFAULT : newDataQueueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemDataQueuePackage.DATA_QUEUE__DATA_QUEUE_TYPE, oldDataQueueType, dataQueueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKeyLength() {
		return keyLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyLength(int newKeyLength) {
		int oldKeyLength = keyLength;
		keyLength = newKeyLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemDataQueuePackage.DATA_QUEUE__KEY_LENGTH, oldKeyLength, keyLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxEntryLength() {
		return maxEntryLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxEntryLength(int newMaxEntryLength) {
		int oldMaxEntryLength = maxEntryLength;
		maxEntryLength = newMaxEntryLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemDataQueuePackage.DATA_QUEUE__MAX_ENTRY_LENGTH, oldMaxEntryLength, maxEntryLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSenderInfo() {
		return senderInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderInfo(boolean newSenderInfo) {
		boolean oldSenderInfo = senderInfo;
		senderInfo = newSenderInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemDataQueuePackage.DATA_QUEUE__SENDER_INFO, oldSenderInfo, senderInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__CONTENT:
				return basicSetContent(null, msgs);
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
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__DATA_QUEUE_TYPE:
				return getDataQueueType();
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__KEY_LENGTH:
				return getKeyLength();
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__MAX_ENTRY_LENGTH:
				return getMaxEntryLength();
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__SENDER_INFO:
				return isSenderInfo();
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__CONTENT:
				return getContent();
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
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__DATA_QUEUE_TYPE:
				setDataQueueType((DataQueueType)newValue);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__KEY_LENGTH:
				setKeyLength((Integer)newValue);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__MAX_ENTRY_LENGTH:
				setMaxEntryLength((Integer)newValue);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__SENDER_INFO:
				setSenderInfo((Boolean)newValue);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__CONTENT:
				setContent((QDataQueueContent)newValue);
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
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__DATA_QUEUE_TYPE:
				setDataQueueType(DATA_QUEUE_TYPE_EDEFAULT);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__KEY_LENGTH:
				setKeyLength(KEY_LENGTH_EDEFAULT);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__MAX_ENTRY_LENGTH:
				setMaxEntryLength(MAX_ENTRY_LENGTH_EDEFAULT);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__SENDER_INFO:
				setSenderInfo(SENDER_INFO_EDEFAULT);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__CONTENT:
				setContent((QDataQueueContent)null);
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
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__DATA_QUEUE_TYPE:
				return dataQueueType != DATA_QUEUE_TYPE_EDEFAULT;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__KEY_LENGTH:
				return keyLength != KEY_LENGTH_EDEFAULT;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__MAX_ENTRY_LENGTH:
				return maxEntryLength != MAX_ENTRY_LENGTH_EDEFAULT;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__SENDER_INFO:
				return senderInfo != SENDER_INFO_EDEFAULT;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__CONTENT:
				return content != null;
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
		result.append(" (dataQueueType: ");
		result.append(dataQueueType);
		result.append(", keyLength: ");
		result.append(keyLength);
		result.append(", maxEntryLength: ");
		result.append(maxEntryLength);
		result.append(", senderInfo: ");
		result.append(senderInfo);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getAttribute() {
		return null;
	}
} //DataQueueImpl

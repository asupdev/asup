/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation
 */
package org.asup.os.type.cmd.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.asup.os.type.cmd.CommandParameterOrder;
import org.asup.os.type.cmd.CommandStatus;
import org.asup.os.type.cmd.QCommand;
import org.asup.os.type.cmd.QCommandParameter;
import org.asup.os.type.cmd.QCommandSource;
import org.asup.os.type.cmd.QOperatingSystemCommandPackage;
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
 * An implementation of the model object '<em><b>QCommand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.os.type.cmd.impl.CommandImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.asup.os.type.cmd.impl.CommandImpl#isAllowBatch <em>Allow Batch</em>}</li>
 *   <li>{@link org.asup.os.type.cmd.impl.CommandImpl#isClassCMD <em>Class CMD</em>}</li>
 *   <li>{@link org.asup.os.type.cmd.impl.CommandImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.asup.os.type.cmd.impl.CommandImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link org.asup.os.type.cmd.impl.CommandImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.asup.os.type.cmd.impl.CommandImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.asup.os.type.cmd.impl.CommandImpl#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandImpl extends TypedObjectImpl implements QCommand {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowBatch() <em>Allow Batch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowBatch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_BATCH_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAllowBatch() <em>Allow Batch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowBatch()
	 * @generated
	 * @ordered
	 */
	protected boolean allowBatch = ALLOW_BATCH_EDEFAULT;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #isClassCMD() <em>Class CMD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClassCMD()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLASS_CMD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClassCMD() <em>Class CMD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClassCMD()
	 * @generated
	 * @ordered
	 */
	protected boolean classCMD = CLASS_CMD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<QCommandParameter> parameters;

	/**
	 * The default value of the '{@link #getProgram() <em>Program</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected String program = PROGRAM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected QCommandSource source;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CommandStatus STATUS_EDEFAULT = CommandStatus.SUPPORTED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CommandStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemCommandPackage.Literals.COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.COMMAND__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowBatch() {
		return allowBatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowBatch(boolean newAllowBatch) {
		boolean oldAllowBatch = allowBatch;
		allowBatch = newAllowBatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.COMMAND__ALLOW_BATCH, oldAllowBatch, allowBatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QCommandParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<QCommandParameter>(QCommandParameter.class, this, QOperatingSystemCommandPackage.COMMAND__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgram() {
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgram(String newProgram) {
		String oldProgram = program;
		program = newProgram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.COMMAND__PROGRAM, oldProgram, program));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCommandSource getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(QCommandSource newSource, NotificationChain msgs) {
		QCommandSource oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.COMMAND__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(QCommandSource newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemCommandPackage.COMMAND__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemCommandPackage.COMMAND__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.COMMAND__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CommandStatus newStatus) {
		CommandStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.COMMAND__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.COMMAND__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClassCMD() {
		return classCMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCMD(boolean newClassCMD) {
		boolean oldClassCMD = classCMD;
		classCMD = newClassCMD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.COMMAND__CLASS_CMD, oldClassCMD, classCMD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public QCommandParameter getParameter(String name) {
		
		for(QCommandParameter qParameter: getParameters()) {
			if(qParameter.getName().equals(name))
				return qParameter;
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<QCommandParameter> getParameters(CommandParameterOrder order) {

		List<QCommandParameter> parameters = new ArrayList<QCommandParameter>(getParameters());
		
		switch (order) {
		case NAME:
			Collections.sort(parameters, new Comparator<QCommandParameter>() {
				@Override
				public int compare(QCommandParameter param1, QCommandParameter param2) {
					return param1.getName().compareToIgnoreCase(param2.getName());
				}
			});
			break;
		case POSITION:
			Collections.sort(parameters, new Comparator<QCommandParameter>() {
				@Override
				public int compare(QCommandParameter param1, QCommandParameter param2) {
					return Integer.compare(param1.getPosition(), param2.getPosition());
				}
			});
			break;
		}
		
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSupported() {
		boolean result = false;		
		if (status == CommandStatus.TODO || status == CommandStatus.SUPPORTED) result = true;
		 return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemCommandPackage.COMMAND__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case QOperatingSystemCommandPackage.COMMAND__SOURCE:
				return basicSetSource(null, msgs);
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
			case QOperatingSystemCommandPackage.COMMAND__ADDRESS:
				return getAddress();
			case QOperatingSystemCommandPackage.COMMAND__ALLOW_BATCH:
				return isAllowBatch();
			case QOperatingSystemCommandPackage.COMMAND__CLASS_CMD:
				return isClassCMD();
			case QOperatingSystemCommandPackage.COMMAND__PARAMETERS:
				return getParameters();
			case QOperatingSystemCommandPackage.COMMAND__PROGRAM:
				return getProgram();
			case QOperatingSystemCommandPackage.COMMAND__SOURCE:
				return getSource();
			case QOperatingSystemCommandPackage.COMMAND__STATUS:
				return getStatus();
			case QOperatingSystemCommandPackage.COMMAND__TYPE_NAME:
				return getTypeName();
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
			case QOperatingSystemCommandPackage.COMMAND__ADDRESS:
				setAddress((String)newValue);
				return;
			case QOperatingSystemCommandPackage.COMMAND__ALLOW_BATCH:
				setAllowBatch((Boolean)newValue);
				return;
			case QOperatingSystemCommandPackage.COMMAND__CLASS_CMD:
				setClassCMD((Boolean)newValue);
				return;
			case QOperatingSystemCommandPackage.COMMAND__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends QCommandParameter>)newValue);
				return;
			case QOperatingSystemCommandPackage.COMMAND__PROGRAM:
				setProgram((String)newValue);
				return;
			case QOperatingSystemCommandPackage.COMMAND__SOURCE:
				setSource((QCommandSource)newValue);
				return;
			case QOperatingSystemCommandPackage.COMMAND__STATUS:
				setStatus((CommandStatus)newValue);
				return;
			case QOperatingSystemCommandPackage.COMMAND__TYPE_NAME:
				setTypeName((String)newValue);
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
			case QOperatingSystemCommandPackage.COMMAND__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case QOperatingSystemCommandPackage.COMMAND__ALLOW_BATCH:
				setAllowBatch(ALLOW_BATCH_EDEFAULT);
				return;
			case QOperatingSystemCommandPackage.COMMAND__CLASS_CMD:
				setClassCMD(CLASS_CMD_EDEFAULT);
				return;
			case QOperatingSystemCommandPackage.COMMAND__PARAMETERS:
				getParameters().clear();
				return;
			case QOperatingSystemCommandPackage.COMMAND__PROGRAM:
				setProgram(PROGRAM_EDEFAULT);
				return;
			case QOperatingSystemCommandPackage.COMMAND__SOURCE:
				setSource((QCommandSource)null);
				return;
			case QOperatingSystemCommandPackage.COMMAND__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case QOperatingSystemCommandPackage.COMMAND__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
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
			case QOperatingSystemCommandPackage.COMMAND__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case QOperatingSystemCommandPackage.COMMAND__ALLOW_BATCH:
				return allowBatch != ALLOW_BATCH_EDEFAULT;
			case QOperatingSystemCommandPackage.COMMAND__CLASS_CMD:
				return classCMD != CLASS_CMD_EDEFAULT;
			case QOperatingSystemCommandPackage.COMMAND__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case QOperatingSystemCommandPackage.COMMAND__PROGRAM:
				return PROGRAM_EDEFAULT == null ? program != null : !PROGRAM_EDEFAULT.equals(program);
			case QOperatingSystemCommandPackage.COMMAND__SOURCE:
				return source != null;
			case QOperatingSystemCommandPackage.COMMAND__STATUS:
				return status != STATUS_EDEFAULT;
			case QOperatingSystemCommandPackage.COMMAND__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
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
		result.append(" (address: ");
		result.append(address);
		result.append(", allowBatch: ");
		result.append(allowBatch);
		result.append(", classCMD: ");
		result.append(classCMD);
		result.append(", program: ");
		result.append(program);
		result.append(", status: ");
		result.append(status);
		result.append(", typeName: ");
		result.append(typeName);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getAttribute() {
		return null;
	}

} //QCommandImpl

/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.pgm.impl;

import java.util.Collection;
import java.util.List;

import org.asup.fw.core.QContext;
import org.asup.os.omac.impl.ObjectImpl;
import org.asup.os.type.pgm.QActivationGroup;
import org.asup.os.type.pgm.QOperatingSystemProgramPackage;
import org.asup.os.type.pgm.QProgram;
import org.asup.os.type.pgm.QCallableProgram;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QActivation Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.os.type.pgm.impl.ActivationGroupImpl#getFrameworkContext <em>Framework Context</em>}</li>
 *   <li>{@link org.asup.os.type.pgm.impl.ActivationGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.asup.os.type.pgm.impl.ActivationGroupImpl#getPrograms <em>Programs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivationGroupImpl extends ObjectImpl implements QActivationGroup {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getFrameworkContext() <em>Framework Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameworkContext()
	 * @generated NOT
	 * @ordered
	 */
	protected transient QContext frameworkContext;

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
	 * The cached value of the '{@link #getPrograms() <em>Programs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<QCallableProgram> programs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivationGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemProgramPackage.Literals.ACTIVATION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemProgramPackage.ACTIVATION_GROUP__PROGRAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrograms()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QContext getFrameworkContext() {
		return frameworkContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrameworkContext(QContext newFrameworkContext, NotificationChain msgs) {
		QContext oldFrameworkContext = frameworkContext;
		frameworkContext = newFrameworkContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemProgramPackage.ACTIVATION_GROUP__FRAMEWORK_CONTEXT, oldFrameworkContext, newFrameworkContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameworkContext(QContext newFrameworkContext) {
		if (newFrameworkContext != frameworkContext) {
			NotificationChain msgs = null;
			if (frameworkContext != null)
				msgs = ((InternalEObject)frameworkContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemProgramPackage.ACTIVATION_GROUP__FRAMEWORK_CONTEXT, null, msgs);
			if (newFrameworkContext != null)
				msgs = ((InternalEObject)newFrameworkContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemProgramPackage.ACTIVATION_GROUP__FRAMEWORK_CONTEXT, null, msgs);
			msgs = basicSetFrameworkContext(newFrameworkContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemProgramPackage.ACTIVATION_GROUP__FRAMEWORK_CONTEXT, newFrameworkContext, newFrameworkContext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemProgramPackage.ACTIVATION_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QCallableProgram> getPrograms() {
		if (programs == null) {
			programs = new EObjectContainmentWithInverseEList<QCallableProgram>(QCallableProgram.class, this, QOperatingSystemProgramPackage.ACTIVATION_GROUP__PROGRAMS, QOperatingSystemProgramPackage.CALLABLE_PROGRAM__QACTIVATION_GROUP);
		}
		return programs;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public QCallableProgram lookup(QProgram program) {
		QCallableProgram qCallableProgram = null;
		for(QCallableProgram callableProgram: getPrograms()) {
			if(callableProgram.getQProgram().getLibrary().equals(program.getLibrary()) &&
			   callableProgram.getQProgram().getName().equals(program.getName())) {
				qCallableProgram = callableProgram;
				break;
			}
		}
		return qCallableProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemProgramPackage.ACTIVATION_GROUP__FRAMEWORK_CONTEXT:
				return basicSetFrameworkContext(null, msgs);
			case QOperatingSystemProgramPackage.ACTIVATION_GROUP__PROGRAMS:
				return ((InternalEList<?>)getPrograms()).basicRemove(otherEnd, msgs);
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
			case QOperatingSystemProgramPackage.ACTIVATION_GROUP__FRAMEWORK_CONTEXT:
				return getFrameworkContext();
			case QOperatingSystemProgramPackage.ACTIVATION_GROUP__NAME:
				return getName();
			case QOperatingSystemProgramPackage.ACTIVATION_GROUP__PROGRAMS:
				return getPrograms();
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
			case QOperatingSystemProgramPackage.ACTIVATION_GROUP__FRAMEWORK_CONTEXT:
				setFrameworkContext((QContext)newValue);
				return;
			case QOperatingSystemProgramPackage.ACTIVATION_GROUP__NAME:
				setName((String)newValue);
				return;
			case QOperatingSystemProgramPackage.ACTIVATION_GROUP__PROGRAMS:
				getPrograms().clear();
				getPrograms().addAll((Collection<? extends QCallableProgram>)newValue);
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
			case QOperatingSystemProgramPackage.ACTIVATION_GROUP__FRAMEWORK_CONTEXT:
				setFrameworkContext((QContext)null);
				return;
			case QOperatingSystemProgramPackage.ACTIVATION_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QOperatingSystemProgramPackage.ACTIVATION_GROUP__PROGRAMS:
				getPrograms().clear();
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
			case QOperatingSystemProgramPackage.ACTIVATION_GROUP__FRAMEWORK_CONTEXT:
				return frameworkContext != null;
			case QOperatingSystemProgramPackage.ACTIVATION_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QOperatingSystemProgramPackage.ACTIVATION_GROUP__PROGRAMS:
				return programs != null && !programs.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //QActivationGroupImpl

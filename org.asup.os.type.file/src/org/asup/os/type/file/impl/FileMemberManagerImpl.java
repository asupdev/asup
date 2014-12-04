/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.asup.os.type.file.impl;

import java.util.List;

import org.asup.fw.core.QContextID;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.os.type.file.QFileMember;
import org.asup.os.type.file.QFileMemberManager;
import org.asup.os.type.file.QFileMembered;
import org.asup.os.type.file.QOperatingSystemFilePackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Member Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class FileMemberManagerImpl extends ServiceImpl implements QFileMemberManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileMemberManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemFilePackage.Literals.FILE_MEMBER_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QFileMember> list(QContextID ContextID, String library, QFileMembered file) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFileMember lookup(QContextID ContextID, String library, QFileMembered file, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //FileMemberManagerImpl

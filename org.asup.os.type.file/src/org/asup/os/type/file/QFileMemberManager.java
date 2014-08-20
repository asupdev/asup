/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file;

import java.util.List;

import org.asup.fw.core.QContextID;
import org.asup.fw.core.QService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QFile Member Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getFileMemberManager()
 * @model abstract="true"
 * @generated
 */
public interface QFileMemberManager extends QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ContextIDRequired="true" libraryRequired="true" fileRequired="true"
	 * @generated
	 */
	List<QFileMember> list(QContextID ContextID, String library, QFileMembered file);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ContextIDRequired="true" fileRequired="true" nameRequired="true"
	 * @generated
	 */
	QFileMember lookup(QContextID ContextID, String library, QFileMembered file, String name);

} // QFileMemberManager

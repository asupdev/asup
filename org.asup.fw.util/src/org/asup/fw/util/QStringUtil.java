/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.util;

import org.asup.fw.core.QService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Util</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.fw.util.QFrameworkUtilPackage#getStringUtil()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QStringUtil extends QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true"
	 * @generated
	 */
	String firstToUpper(String string);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true"
	 * @generated
	 */
	String removeFirstChar(String string);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true"
	 * @generated
	 */
	String removeLastChar(String string);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true"
	 * @generated
	 */
	String trimL(String string);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true"
	 * @generated
	 */
	String trimR(String string);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true" charsRequired="true" timesRequired="true" beforeRequired="true"
	 * @generated
	 */
	String appendChars(String string, String chars, int times, boolean before);

} // QStringUtil

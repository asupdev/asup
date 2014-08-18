/**
 *  Copyright (c) 2012, 2014 Sme.UP and others. *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.util;

import org.asup.fw.core.QService;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Util</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.fw.util.QFrameworkUtilPackage#getFileUtil()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QFileUtil extends QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" fileNameRequired="true"
	 * @generated
	 */
	String getBaseName(String fileName);

} // FileUtil

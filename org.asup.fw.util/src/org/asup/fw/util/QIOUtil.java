/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.asup.fw.core.QService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO Util</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.fw.util.QFrameworkUtilPackage#getIOUtil()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QIOUtil extends QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model inputDataType="org.asup.fw.java.JavaInputStream" inputRequired="true" outputDataType="org.asup.fw.java.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void copy(InputStream input, OutputStream output) throws IOException;

} // IOUtil

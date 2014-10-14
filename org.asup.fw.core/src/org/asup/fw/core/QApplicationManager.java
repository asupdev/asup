/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.core;

import java.io.OutputStream;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.fw.core.QFrameworkCorePackage#getApplicationManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QApplicationManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" applicationRequired="true" outputDataType="org.asup.fw.java.JavaOutputStream"
	 * @generated
	 */
	QContext start(QApplication application, OutputStream output);

} // QApplicationManager

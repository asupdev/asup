/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.core;

import org.asup.fw.core.QService;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getFrameManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QFrameManager extends QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" objectRequired="true"
	 * @generated
	 */
	QFrame getFrame(Object object);

} // QFrameManager

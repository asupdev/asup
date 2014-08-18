/**
 *  Copyright (c) 2012, 2014 Sme.UP and others. *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.util;

import java.net.URI;
import org.asup.fw.core.QService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URI Util</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.fw.util.QFrameworkUtilPackage#getURIUtil()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QURIUtil extends QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" uriDataType="org.asup.fw.java.JavaURI" uriRequired="true"
	 * @generated
	 */
	String getBaseName(URI uri);

} // URIUtil

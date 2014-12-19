/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.output;

import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QService;
import org.asup.os.core.jobs.QJob;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Writer Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.core.output.QOperatingSystemOutputPackage#getObjectWriterFactory()
 * @model abstract="true"
 * @generated
 */
public interface QObjectWriterFactory extends QPlugin, QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobRequired="true"
	 * @generated
	 */
	QObjectWriter createObjectWriter(QJob job);

} // QObjectWriterFactory

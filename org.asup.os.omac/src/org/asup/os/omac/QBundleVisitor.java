/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.omac;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.omac.QOperatingSystemOmacPackage#getBundleVisitor()
 * @model abstract="true"
 * @generated
 */
public interface QBundleVisitor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectRequired="true"
	 * @generated
	 */
	void visit(QObject object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model containerRequired="true"
	 * @generated
	 */
	void visitEnter(QObjectContainer<?> container);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model containerRequired="true"
	 * @generated
	 */
	void visitExit(QObjectContainer<?> container);

} // QBundleVisitor

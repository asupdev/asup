/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.impl;

import org.asup.il.core.impl.TermContainerImpl;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QDataTermContainer;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Term Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DataTermContainerImpl extends TermContainerImpl<QDataTerm<?>> implements QDataTermContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTermContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataPackage.Literals.DATA_TERM_CONTAINER;
	}

} //DataTermContainerImpl

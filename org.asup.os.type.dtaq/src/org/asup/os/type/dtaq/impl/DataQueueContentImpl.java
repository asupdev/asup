/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.dtaq.impl;

import java.util.List;

import org.asup.os.core.impl.ObjectContentImpl;

import org.asup.os.type.dtaq.QDataQueueContent;
import org.asup.os.type.dtaq.QDataQueueEntry;
import org.asup.os.type.dtaq.QOperatingSystemDataQueuePackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Queue Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DataQueueContentImpl extends ObjectContentImpl<QDataQueueEntry> implements QDataQueueContent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataQueueContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemDataQueuePackage.Literals.DATA_QUEUE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public List<QDataQueueEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<QDataQueueEntry>(QDataQueueEntry.class, this, QOperatingSystemDataQueuePackage.DATA_QUEUE_CONTENT__ENTRIES);
		}
		return entries;
	}

} //DataQueueContentImpl

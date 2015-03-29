/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.co.osgi.ecf.impl;

import java.util.ArrayList;
import java.util.List;

import org.asup.co.osgi.QEndPoint;
import org.asup.co.osgi.ecf.ECFCommunicationManager;
import org.asup.co.osgi.ecf.ECFConnectorOSGIPackage;
import org.asup.co.osgi.impl.CommunicationManagerImpl;
import org.asup.fw.core.QContextID;
import org.eclipse.emf.ecore.EClass;
import org.osgi.service.remoteserviceadmin.EndpointDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>ECF Communication Manager</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ECFCommunicationManagerImpl extends CommunicationManagerImpl implements ECFCommunicationManager {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ECFCommunicationManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ECFConnectorOSGIPackage.Literals.ECF_COMMUNICATION_MANAGER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public List<QEndPoint> find(QContextID contextID) {

		List<QEndPoint> endPoints = new ArrayList<QEndPoint>();

		for (final EndpointDescription endpointDescription : ECFClientActivatorHook.getEndPoints()) {
			endPoints.add(new ECFEndPointAdapter(endpointDescription));
		}

		return endPoints;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public QEndPoint lookup(String endPointID) {

		QEndPoint endPoint = null;

		for (final EndpointDescription endpointDescription : ECFClientActivatorHook.getEndPoints()) {
			if (endpointDescription.getId().equals(endPointID)) {
				endPoint = new ECFEndPointAdapter(endpointDescription);
				break;
			}
		}

		return endPoint;
	}
} // ECFCommunicationManagerImpl

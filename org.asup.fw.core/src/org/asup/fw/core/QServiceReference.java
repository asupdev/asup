/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.fw.core.QServiceReference#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.asup.fw.core.QServiceReference#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link org.asup.fw.core.QServiceReference#getConfig <em>Config</em>}</li>
 *   <li>{@link org.asup.fw.core.QServiceReference#isRemoteExport <em>Remote Export</em>}</li>
 *   <li>{@link org.asup.fw.core.QServiceReference#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.fw.core.QFrameworkCorePackage#getServiceReference()
 * @model
 * @generated
 */
public interface QServiceReference {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.asup.fw.core.QFrameworkCorePackage#getServiceReference_ClassName()
	 * @model required="true"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.asup.fw.core.QServiceReference#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name</em>' attribute.
	 * @see #setInterfaceName(String)
	 * @see org.asup.fw.core.QFrameworkCorePackage#getServiceReference_InterfaceName()
	 * @model
	 * @generated
	 */
	String getInterfaceName();

	/**
	 * Sets the value of the '{@link org.asup.fw.core.QServiceReference#getInterfaceName <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Name</em>' attribute.
	 * @see #getInterfaceName()
	 * @generated
	 */
	void setInterfaceName(String value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(QServiceConfig)
	 * @see org.asup.fw.core.QFrameworkCorePackage#getServiceReference_Config()
	 * @model containment="true"
	 * @generated
	 */
	QServiceConfig getConfig();

	/**
	 * Sets the value of the '{@link org.asup.fw.core.QServiceReference#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(QServiceConfig value);

	/**
	 * Returns the value of the '<em><b>Remote Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Export</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Export</em>' attribute.
	 * @see #setRemoteExport(boolean)
	 * @see org.asup.fw.core.QFrameworkCorePackage#getServiceReference_RemoteExport()
	 * @model required="true"
	 * @generated
	 */
	boolean isRemoteExport();

	/**
	 * Sets the value of the '{@link org.asup.fw.core.QServiceReference#isRemoteExport <em>Remote Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Export</em>' attribute.
	 * @see #isRemoteExport()
	 * @generated
	 */
	void setRemoteExport(boolean value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.asup.fw.core.ServiceStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.asup.fw.core.ServiceStatus
	 * @see #setStatus(ServiceStatus)
	 * @see org.asup.fw.core.QFrameworkCorePackage#getServiceReference_Status()
	 * @model required="true"
	 * @generated
	 */
	ServiceStatus getStatus();

	/**
	 * Sets the value of the '{@link org.asup.fw.core.QServiceReference#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.asup.fw.core.ServiceStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ServiceStatus value);

} // ServiceReference

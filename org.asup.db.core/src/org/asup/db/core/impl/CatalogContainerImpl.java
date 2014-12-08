/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core.impl;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Properties;

import org.asup.db.core.QCatalogContainer;
import org.asup.db.core.QCatalogMetaData;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionCredentials;
import org.asup.db.core.QDatabaseCorePackage;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QContext;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.datatools.connectivity.ConnectionProfileConstants;
import org.eclipse.datatools.connectivity.ConnectionProfileException;
import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.ProfileManager;
import org.eclipse.datatools.connectivity.drivers.DriverInstance;
import org.eclipse.datatools.connectivity.drivers.DriverManager;
import org.eclipse.datatools.connectivity.drivers.IDriverMgmtConstants;
import org.eclipse.datatools.connectivity.drivers.jdbc.IJDBCConnectionProfileConstants;
import org.eclipse.datatools.connectivity.drivers.jdbc.IJDBCDriverDefinitionConstants;
import org.eclipse.datatools.connectivity.drivers.models.TemplateDescriptor;
import org.eclipse.datatools.connectivity.sqm.core.SQMServices;
import org.eclipse.datatools.connectivity.sqm.core.mappings.ProviderIDMappingRegistry;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.osgi.framework.Bundle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.core.impl.CatalogContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.asup.db.core.impl.CatalogContainerImpl#getCatalogContext <em>Catalog Context</em>}</li>
 *   <li>{@link org.asup.db.core.impl.CatalogContainerImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link org.asup.db.core.impl.CatalogContainerImpl#isSupportsRelativeRecordNumber <em>Supports Relative Record Number</em>}</li>
 *   <li>{@link org.asup.db.core.impl.CatalogContainerImpl#isSupportsGuestAccess <em>Supports Guest Access</em>}</li>
 *   <li>{@link org.asup.db.core.impl.CatalogContainerImpl#getConnectionConfig <em>Connection Config</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CatalogContainerImpl extends MinimalEObjectImpl.Container implements QCatalogContainer {

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private IConnectionProfile iConnectionProfile = null;

	
	/**
	 * The cached value of the '{@link #getCatalogContext() <em>Catalog Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogContext()
	 * @generated
	 * @ordered
	 */
	protected QContext catalogContext;

	/**
	 * The cached value of the '{@link #getMetaData() <em>Meta Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaData()
	 * @generated
	 * @ordered
	 */
	protected QCatalogMetaData metaData;

	/**
	 * The default value of the '{@link #isSupportsRelativeRecordNumber() <em>Supports Relative Record Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportsRelativeRecordNumber()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPORTS_RELATIVE_RECORD_NUMBER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSupportsRelativeRecordNumber() <em>Supports Relative Record Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportsRelativeRecordNumber()
	 * @generated
	 * @ordered
	 */
	protected boolean supportsRelativeRecordNumber = SUPPORTS_RELATIVE_RECORD_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isSupportsGuestAccess() <em>Supports Guest Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportsGuestAccess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPORTS_GUEST_ACCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSupportsGuestAccess() <em>Supports Guest Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportsGuestAccess()
	 * @generated
	 * @ordered
	 */
	protected boolean supportsGuestAccess = SUPPORTS_GUEST_ACCESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectionConfig() <em>Connection Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionConfig()
	 * @generated
	 * @ordered
	 */
	protected QConnectionConfig connectionConfig;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseCorePackage.Literals.CATALOG_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CATALOG_CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QConnectionConfig getConnectionConfig() {
		return connectionConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionConfig(QConnectionConfig newConnectionConfig, NotificationChain msgs) {
		QConnectionConfig oldConnectionConfig = connectionConfig;
		connectionConfig = newConnectionConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CATALOG_CONTAINER__CONNECTION_CONFIG, oldConnectionConfig, newConnectionConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionConfig(QConnectionConfig newConnectionConfig) {
		if (newConnectionConfig != connectionConfig) {
			NotificationChain msgs = null;
			if (connectionConfig != null)
				msgs = ((InternalEObject)connectionConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseCorePackage.CATALOG_CONTAINER__CONNECTION_CONFIG, null, msgs);
			if (newConnectionConfig != null)
				msgs = ((InternalEObject)newConnectionConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseCorePackage.CATALOG_CONTAINER__CONNECTION_CONFIG, null, msgs);
			msgs = basicSetConnectionConfig(newConnectionConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CATALOG_CONTAINER__CONNECTION_CONFIG, newConnectionConfig, newConnectionConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCatalogMetaData getMetaData() {
		if (metaData != null && ((EObject)metaData).eIsProxy()) {
			InternalEObject oldMetaData = (InternalEObject)metaData;
			metaData = (QCatalogMetaData)eResolveProxy(oldMetaData);
			if (metaData != oldMetaData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDatabaseCorePackage.CATALOG_CONTAINER__META_DATA, oldMetaData, metaData));
			}
		}
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCatalogMetaData basicGetMetaData() {
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaData(QCatalogMetaData newMetaData) {
		QCatalogMetaData oldMetaData = metaData;
		metaData = newMetaData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CATALOG_CONTAINER__META_DATA, oldMetaData, metaData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSupportsRelativeRecordNumber() {
		return supportsRelativeRecordNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportsRelativeRecordNumber(boolean newSupportsRelativeRecordNumber) {
		boolean oldSupportsRelativeRecordNumber = supportsRelativeRecordNumber;
		supportsRelativeRecordNumber = newSupportsRelativeRecordNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CATALOG_CONTAINER__SUPPORTS_RELATIVE_RECORD_NUMBER, oldSupportsRelativeRecordNumber, supportsRelativeRecordNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSupportsGuestAccess() {
		return supportsGuestAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportsGuestAccess(boolean newSupportsGuestAccess) {
		boolean oldSupportsGuestAccess = supportsGuestAccess;
		supportsGuestAccess = newSupportsGuestAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CATALOG_CONTAINER__SUPPORTS_GUEST_ACCESS, oldSupportsGuestAccess, supportsGuestAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QContext getCatalogContext() {
		if (catalogContext != null && ((EObject)catalogContext).eIsProxy()) {
			InternalEObject oldCatalogContext = (InternalEObject)catalogContext;
			catalogContext = (QContext)eResolveProxy(oldCatalogContext);
			if (catalogContext != oldCatalogContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDatabaseCorePackage.CATALOG_CONTAINER__CATALOG_CONTEXT, oldCatalogContext, catalogContext));
			}
		}
		return catalogContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QContext basicGetCatalogContext() {
		return catalogContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalogContext(QContext newCatalogContext) {
		QContext oldCatalogContext = catalogContext;
		catalogContext = newCatalogContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CATALOG_CONTAINER__CATALOG_CONTEXT, oldCatalogContext, catalogContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isActive() {
		return getMetaData() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public <C> C createConnection(Class<C> factory) throws SQLException {
		
		if(!isSupportsGuestAccess())
			throw new SQLException("Invalid catalog access: "+this.getName());

		QConnectionCredentials credentials = connectionConfig.getCredentials();
		return createConnection(factory, credentials.getUser(), credentials.getPassword());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public <C> C createConnection(Class<C> factory, String user, String password) throws SQLException {

		IConnection iConnection = getConnectionProfile().createConnection(factory.getName(), user, password);
		if (iConnection.getConnectException() != null)
			throw new FrameworkCoreRuntimeException(iConnection.getConnectException());
		
		if(factory.isAssignableFrom(iConnection.getClass()))
			return (C) iConnection;
		else
			return (C) iConnection.getRawConnection();
	}

	private IConnectionProfile getConnectionProfile() {
		
		if(iConnectionProfile == null) {
			synchronized (this) {
				if(iConnectionProfile == null) {
					try {

						ProfileManager profileManager = ProfileManager.getInstance();

						ProviderIDMappingRegistry providerIDMappingRegistry = SQMServices.getProviderIDMappingRegistry();
						String providerID = providerIDMappingRegistry.getProviderIDforVendorVersion(connectionConfig.getVendor(), connectionConfig.getVersion());
						if (providerID == null)
							throw new FrameworkCoreRuntimeException("Invalid providerID for catalog container: "+this);

						if(connectionConfig.isPersistent()) {
							iConnectionProfile = ProfileManager.getInstance().getProfileByName(getName());
							if(iConnectionProfile == null) {
								Properties properties = createPropertiesByConnectionConfig(connectionConfig);

								String text = "As.UP Catalog "+connectionConfig.getVendor()+"("+connectionConfig.getVersion()+")";
								iConnectionProfile = profileManager.createProfile(getName(), text, providerID, properties);
							}
						}
						else {
							Properties properties = createPropertiesByConnectionConfig(connectionConfig);
							iConnectionProfile = profileManager.createTransientProfile(providerID, properties);
						}

					} catch (ConnectionProfileException e) {
						throw new FrameworkCoreRuntimeException(e);
					}					
				}
			}
		}
		
		return iConnectionProfile;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseCorePackage.CATALOG_CONTAINER__CONNECTION_CONFIG:
				return basicSetConnectionConfig(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseCorePackage.CATALOG_CONTAINER__NAME:
				return getName();
			case QDatabaseCorePackage.CATALOG_CONTAINER__CATALOG_CONTEXT:
				if (resolve) return getCatalogContext();
				return basicGetCatalogContext();
			case QDatabaseCorePackage.CATALOG_CONTAINER__META_DATA:
				if (resolve) return getMetaData();
				return basicGetMetaData();
			case QDatabaseCorePackage.CATALOG_CONTAINER__SUPPORTS_RELATIVE_RECORD_NUMBER:
				return isSupportsRelativeRecordNumber();
			case QDatabaseCorePackage.CATALOG_CONTAINER__SUPPORTS_GUEST_ACCESS:
				return isSupportsGuestAccess();
			case QDatabaseCorePackage.CATALOG_CONTAINER__CONNECTION_CONFIG:
				return getConnectionConfig();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QDatabaseCorePackage.CATALOG_CONTAINER__NAME:
				setName((String)newValue);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__CATALOG_CONTEXT:
				setCatalogContext((QContext)newValue);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__META_DATA:
				setMetaData((QCatalogMetaData)newValue);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__SUPPORTS_RELATIVE_RECORD_NUMBER:
				setSupportsRelativeRecordNumber((Boolean)newValue);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__SUPPORTS_GUEST_ACCESS:
				setSupportsGuestAccess((Boolean)newValue);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__CONNECTION_CONFIG:
				setConnectionConfig((QConnectionConfig)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QDatabaseCorePackage.CATALOG_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__CATALOG_CONTEXT:
				setCatalogContext((QContext)null);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__META_DATA:
				setMetaData((QCatalogMetaData)null);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__SUPPORTS_RELATIVE_RECORD_NUMBER:
				setSupportsRelativeRecordNumber(SUPPORTS_RELATIVE_RECORD_NUMBER_EDEFAULT);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__SUPPORTS_GUEST_ACCESS:
				setSupportsGuestAccess(SUPPORTS_GUEST_ACCESS_EDEFAULT);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__CONNECTION_CONFIG:
				setConnectionConfig((QConnectionConfig)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QDatabaseCorePackage.CATALOG_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QDatabaseCorePackage.CATALOG_CONTAINER__CATALOG_CONTEXT:
				return catalogContext != null;
			case QDatabaseCorePackage.CATALOG_CONTAINER__META_DATA:
				return metaData != null;
			case QDatabaseCorePackage.CATALOG_CONTAINER__SUPPORTS_RELATIVE_RECORD_NUMBER:
				return supportsRelativeRecordNumber != SUPPORTS_RELATIVE_RECORD_NUMBER_EDEFAULT;
			case QDatabaseCorePackage.CATALOG_CONTAINER__SUPPORTS_GUEST_ACCESS:
				return supportsGuestAccess != SUPPORTS_GUEST_ACCESS_EDEFAULT;
			case QDatabaseCorePackage.CATALOG_CONTAINER__CONNECTION_CONFIG:
				return connectionConfig != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", supportsRelativeRecordNumber: ");
		result.append(supportsRelativeRecordNumber);
		result.append(", supportsGuestAccess: ");
		result.append(supportsGuestAccess);
		result.append(')');
		return result.toString();
	}
	
	private Properties createPropertiesByVendorVersion(String vendor, String version) {

		Properties properties = new Properties();
		for (TemplateDescriptor templateDescriptor : TemplateDescriptor.getDriverTemplateDescriptors()) {

			String templateVendor = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID);
			String templateVersion = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.DATABASE_VERSION_PROP_ID);

			if (templateVendor != null && templateVendor.equals(vendor) && templateVersion != null && templateVersion.equals(version)) {

				if (!templateDescriptor.getId().endsWith(TEMPLATE_SUFFIX))
					continue;

				properties.setProperty(IJDBCDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID, templateVendor);
				properties.setProperty(IJDBCDriverDefinitionConstants.DATABASE_VERSION_PROP_ID, templateVersion);

				// System.out.println(templateDescriptor.getId());
				DriverInstance driverInstances[] = DriverManager.getInstance().getDriverInstancesByTemplate(templateDescriptor.getId());
				if (driverInstances.length > 0)
					properties.setProperty(ConnectionProfileConstants.PROP_DRIVER_DEFINITION_ID, driverInstances[0].getId());

				String driverClass = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.DRIVER_CLASS_PROP_ID);
				if (driverClass != null)
					properties.setProperty(IJDBCDriverDefinitionConstants.DRIVER_CLASS_PROP_ID, driverClass);

				// platform dependent jar list
				StringBuffer jarList = new StringBuffer();
				try {
					Bundle bundle = Platform.getBundle(templateDescriptor.getElement().getDeclaringExtension().getNamespaceIdentifier());
					String paths[] = templateDescriptor.getJarList().split(";");
					for (int i = 0; i < paths.length; i++) {
						if (i > 0)
							jarList.append(System.getProperty("path.separator"));
						URL pathURL = bundle.getEntry(paths[i].trim());
						jarList.append(new Path(FileLocator.toFileURL(pathURL).getFile()).toOSString());
					}
				} catch (IOException e) {
					throw new FrameworkCoreRuntimeException(e);
				}

				properties.setProperty(IDriverMgmtConstants.PROP_DEFN_JARLIST, jarList.toString());

				String driverUrl = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.URL_PROP_ID);
				if (driverUrl != null)
					properties.setProperty(IJDBCDriverDefinitionConstants.URL_PROP_ID, driverUrl);

				String user = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.USERNAME_PROP_ID);
				if (user != null)
					properties.setProperty(IJDBCDriverDefinitionConstants.USERNAME_PROP_ID, user);

				String password = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.PASSWORD_PROP_ID);
				if (password != null)
					properties.setProperty(IJDBCDriverDefinitionConstants.PASSWORD_PROP_ID, password);

				properties.setProperty(IJDBCConnectionProfileConstants.SAVE_PASSWORD_PROP_ID, Boolean.FALSE.toString());

				break;
			}
		}

		return properties;

	}

	private Properties createPropertiesByConnectionConfig(QConnectionConfig connectionConfig) {

		Properties properties = createPropertiesByVendorVersion(connectionConfig.getVendor(), connectionConfig.getVersion());

		// configuration overrides template
		if (connectionConfig.getUrl() != null)
			properties.setProperty(IJDBCDriverDefinitionConstants.URL_PROP_ID, connectionConfig.getUrl());

		QConnectionCredentials credentials = connectionConfig.getCredentials();
		if(credentials != null) {
			properties.setProperty(IJDBCConnectionProfileConstants.USERNAME_PROP_ID, credentials.getUser());
			properties.setProperty(IJDBCDriverDefinitionConstants.PASSWORD_PROP_ID, credentials.getPassword());
		}
		properties.setProperty(IJDBCConnectionProfileConstants.SAVE_PASSWORD_PROP_ID, Boolean.TRUE.toString());

		return properties;
	}
} //CatalogContainerImpl

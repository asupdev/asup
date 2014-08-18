/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core.impl;


import java.util.Collection;
import java.util.List;
import org.asup.db.core.QDatabaseCorePackage;
import org.asup.db.core.QSchema;
import org.asup.db.core.QView;
import org.asup.db.core.QViewColumn;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.core.impl.ViewImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ViewImpl#getCreationPlugin <em>Creation Plugin</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ViewImpl#getCreationCommand <em>Creation Command</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ViewImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ViewImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends DatabaseObjectImpl implements QView {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<QViewColumn> columns;

	/**
	 * The default value of the '{@link #getCreationPlugin() <em>Creation Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationPlugin()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_PLUGIN_EDEFAULT = "IBMI";

	/**
	 * The cached value of the '{@link #getCreationPlugin() <em>Creation Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationPlugin()
	 * @generated
	 * @ordered
	 */
	protected String creationPlugin = CREATION_PLUGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationCommand() <em>Creation Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationCommand() <em>Creation Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationCommand()
	 * @generated
	 * @ordered
	 */
	protected String creationCommand = CREATION_COMMAND_EDEFAULT;

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
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseCorePackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSchema getSchema() {
		if (eContainerFeatureID() != QDatabaseCorePackage.VIEW__SCHEMA) return null;
		return (QSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(QSchema newSchema, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchema, QDatabaseCorePackage.VIEW__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(QSchema newSchema) {
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != QDatabaseCorePackage.VIEW__SCHEMA && newSchema != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = ((InternalEObject)newSchema).eInverseAdd(this, QDatabaseCorePackage.SCHEMA__VIEWS, QSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.VIEW__SCHEMA, newSchema, newSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getFullName() {
		if(getSchema() == null) 
			return null;
		else
			return getSchema().getName()+"."+getName();
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.VIEW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationCommand() {
		return creationCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationCommand(String newCreationCommand) {
		String oldCreationCommand = creationCommand;
		creationCommand = newCreationCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.VIEW__CREATION_COMMAND, oldCreationCommand, creationCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QViewColumn> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentWithInverseEList<QViewColumn>(QViewColumn.class, this, QDatabaseCorePackage.VIEW__COLUMNS, QDatabaseCorePackage.VIEW_COLUMN__VIEW);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationPlugin() {
		return creationPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationPlugin(String newCreationPlugin) {
		String oldCreationPlugin = creationPlugin;
		creationPlugin = newCreationPlugin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.VIEW__CREATION_PLUGIN, oldCreationPlugin, creationPlugin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseCorePackage.VIEW__COLUMNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColumns()).basicAdd(otherEnd, msgs);
			case QDatabaseCorePackage.VIEW__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((QSchema)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseCorePackage.VIEW__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case QDatabaseCorePackage.VIEW__SCHEMA:
				return basicSetSchema(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case QDatabaseCorePackage.VIEW__SCHEMA:
				return eInternalContainer().eInverseRemove(this, QDatabaseCorePackage.SCHEMA__VIEWS, QSchema.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseCorePackage.VIEW__COLUMNS:
				return getColumns();
			case QDatabaseCorePackage.VIEW__CREATION_PLUGIN:
				return getCreationPlugin();
			case QDatabaseCorePackage.VIEW__CREATION_COMMAND:
				return getCreationCommand();
			case QDatabaseCorePackage.VIEW__NAME:
				return getName();
			case QDatabaseCorePackage.VIEW__SCHEMA:
				return getSchema();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QDatabaseCorePackage.VIEW__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends QViewColumn>)newValue);
				return;
			case QDatabaseCorePackage.VIEW__CREATION_PLUGIN:
				setCreationPlugin((String)newValue);
				return;
			case QDatabaseCorePackage.VIEW__CREATION_COMMAND:
				setCreationCommand((String)newValue);
				return;
			case QDatabaseCorePackage.VIEW__NAME:
				setName((String)newValue);
				return;
			case QDatabaseCorePackage.VIEW__SCHEMA:
				setSchema((QSchema)newValue);
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
			case QDatabaseCorePackage.VIEW__COLUMNS:
				getColumns().clear();
				return;
			case QDatabaseCorePackage.VIEW__CREATION_PLUGIN:
				setCreationPlugin(CREATION_PLUGIN_EDEFAULT);
				return;
			case QDatabaseCorePackage.VIEW__CREATION_COMMAND:
				setCreationCommand(CREATION_COMMAND_EDEFAULT);
				return;
			case QDatabaseCorePackage.VIEW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QDatabaseCorePackage.VIEW__SCHEMA:
				setSchema((QSchema)null);
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
			case QDatabaseCorePackage.VIEW__COLUMNS:
				return columns != null && !columns.isEmpty();
			case QDatabaseCorePackage.VIEW__CREATION_PLUGIN:
				return CREATION_PLUGIN_EDEFAULT == null ? creationPlugin != null : !CREATION_PLUGIN_EDEFAULT.equals(creationPlugin);
			case QDatabaseCorePackage.VIEW__CREATION_COMMAND:
				return CREATION_COMMAND_EDEFAULT == null ? creationCommand != null : !CREATION_COMMAND_EDEFAULT.equals(creationCommand);
			case QDatabaseCorePackage.VIEW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QDatabaseCorePackage.VIEW__SCHEMA:
				return getSchema() != null;
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
		result.append(" (creationPlugin: ");
		result.append(creationPlugin);
		result.append(", creationCommand: ");
		result.append(creationCommand);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ViewImpl

/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.impl;

import org.asup.db.core.OrderingType;
import org.asup.db.core.QIndex;
import org.asup.db.core.QIndexColumn;
import org.asup.db.core.QSchema;
import org.asup.db.core.QTable;
import org.asup.db.core.QTableColumn;
import org.asup.db.core.QView;
import org.asup.db.syntax.QDatabaseSyntaxPackage;
import org.asup.db.syntax.QSyntaxBuilder;
import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.fw.core.QService;
import org.asup.fw.core.QServiceConfig;
import org.asup.fw.core.impl.PluginImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Syntax Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.syntax.impl.SyntaxBuilderImpl#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SyntaxBuilderImpl extends PluginImpl implements QSyntaxBuilder {
	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected QServiceConfig config;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SyntaxBuilderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxPackage.Literals.SYNTAX_BUILDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QServiceConfig getConfig() {
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfig(QServiceConfig newConfig, NotificationChain msgs) {
		QServiceConfig oldConfig = config;
		config = newConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxPackage.SYNTAX_BUILDER__CONFIG, oldConfig, newConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfig(QServiceConfig newConfig) {
		if (newConfig != config) {
			NotificationChain msgs = null;
			if (config != null)
				msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxPackage.SYNTAX_BUILDER__CONFIG, null, msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxPackage.SYNTAX_BUILDER__CONFIG, null, msgs);
			msgs = basicSetConfig(newConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxPackage.SYNTAX_BUILDER__CONFIG, newConfig, newConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String createSchema(QSchema schema) {
		return "CREATE SCHEMA "+schema.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String createTable(QTable table) {
		StringBuffer result = new StringBuffer("CREATE TABLE ");
		result.append(table.getFullName()+" (");

		boolean pkey = false;
		String pkey_name = null;
		
		boolean first = true;
		for(QTableColumn field: table.getColumns()) {

			if(!first)
				result.append(", ");
			
			switch (field.getDataType()) {
				case IDENTITY:
					result.append(field.getName()+" INT NOT NULL AUTO_INCREMENT");					
					pkey = true;
					pkey_name = field.getName();
					break;
				case CHARACTER:
					result.append(field.getName()+" CHAR("+field.getPrecision()+")");
					break;
				case VARCHAR:
					result.append(field.getName()+" VARCHAR("+field.getPrecision()+")");
					break;
				case DECIMAL:
					if(field.getScale() != 0)
						result.append(field.getName()+" DECIMAL("+field.getPrecision()+", "+field.getScale()+")");
					else
						result.append(field.getName()+" DECIMAL("+field.getPrecision()+",  0)");
					break;
				case TEXT:
					result.append(field.getName()+" BLOB");
					break;
				default:
					result.append(field.getName()+" "+field.getDataType().getName() .toUpperCase());
			}			
			first = false;
		}
		if(pkey)
			result.append(", PRIMARY KEY ("+pkey_name+")");
		result.append(")");
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String createView(QView view) {
		return view.getCreationCommand();		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String createIndex(QIndex index) {
		StringBuffer result = new StringBuffer("CREATE ");
		if(index.isUnique()) {
			result.append("UNIQUE ");			
		}
		result.append("INDEX "+index.getName());
		result.append(" ON "+index.getSchema().getName()+"."+index.getObject()+" (");

		boolean first = true;
		
		for(QIndexColumn field: index.getColumns()) {			
			
			if(!first)
				result.append(", ");

			result.append(field.getName());
			
			if(field.getOrdering() == OrderingType.DESCEND) 
				result.append(" DESC");

			first = false;
		}
		result.append(")");
		return result.toString();		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String dropSchema(QSchema schema) {
		return "DROP SCHEMA "+schema.getName();		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String dropTable(QTable table) {
		return "DROP TABLE "+table.getFullName();		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String dropView(QView view) {
		return "DROP VIEW "+view.getFullName();		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String dropIndex(QIndex index) {
		return "DROP INDEX "+index.getName() + " ON TABLE "+index.getSchema().getName()+"."+index.getObject();		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String deleteData(QTable table) {
		return "DELETE FROM "+table.getFullName();		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String selectData(QTable table) {
		return "SELECT * FROM "+table.getFullName();		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String insertData(QTable table, boolean prepare) {
		StringBuffer result = new StringBuffer("INSERT INTO "+table.getFullName());
		String tkn1 ="";
		String tkn2 ="";
		boolean first = true;
		for(QTableColumn field: table.getColumns()) {
			
			if(field.getName().equals("QMUKEY")) 
				continue;

			if(!first) {
				tkn1+=", ";
				tkn2+=", ";
			}
			
			tkn1+= field.getName();
			tkn2+="?";
			first = false;
		}
		if(prepare)
			result.append("("+tkn1+") VALUES("+tkn2+")");
		else
			result.append(" VALUES("+tkn1+")");
		return result.toString();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseSyntaxPackage.SYNTAX_BUILDER__CONFIG:
				return basicSetConfig(null, msgs);
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
			case QDatabaseSyntaxPackage.SYNTAX_BUILDER__CONFIG:
				return getConfig();
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
			case QDatabaseSyntaxPackage.SYNTAX_BUILDER__CONFIG:
				setConfig((QServiceConfig)newValue);
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
			case QDatabaseSyntaxPackage.SYNTAX_BUILDER__CONFIG:
				setConfig((QServiceConfig)null);
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
			case QDatabaseSyntaxPackage.SYNTAX_BUILDER__CONFIG:
				return config != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == QService.class) {
			switch (derivedFeatureID) {
				case QDatabaseSyntaxPackage.SYNTAX_BUILDER__CONFIG: return QFrameworkCorePackage.SERVICE__CONFIG;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == QService.class) {
			switch (baseFeatureID) {
				case QFrameworkCorePackage.SERVICE__CONFIG: return QDatabaseSyntaxPackage.SYNTAX_BUILDER__CONFIG;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SyntaxBuilderImpl

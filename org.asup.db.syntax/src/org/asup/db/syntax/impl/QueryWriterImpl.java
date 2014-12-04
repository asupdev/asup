/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.impl;

import org.asup.db.syntax.QDatabaseSyntaxPackage;
import org.asup.db.syntax.QQueryWriter;
import org.eclipse.datatools.modelbase.sql.query.QueryStatement;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Query Converter</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class QueryWriterImpl extends StatementWriterImpl implements QQueryWriter {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryWriterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxPackage.Literals.QUERY_WRITER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String writeQuery(QueryStatement statement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // QueryConverterImpl

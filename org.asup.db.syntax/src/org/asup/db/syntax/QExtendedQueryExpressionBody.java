/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax;

import org.eclipse.datatools.modelbase.sql.query.QueryExpressionBody;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QExtended Query Expression Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.syntax.QExtendedQueryExpressionBody#getRowOptimizeLimit <em>Row Optimize Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.syntax.QDatabaseSyntaxPackage#getExtendedQueryExpressionBody()
 * @model
 * @generated
 */
public interface QExtendedQueryExpressionBody extends QueryExpressionBody {
	/**
	 * Returns the value of the '<em><b>Row Optimize Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Optimize Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Optimize Limit</em>' attribute.
	 * @see #setRowOptimizeLimit(int)
	 * @see org.asup.db.syntax.QDatabaseSyntaxPackage#getExtendedQueryExpressionBody_RowOptimizeLimit()
	 * @model
	 * @generated
	 */
	int getRowOptimizeLimit();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.QExtendedQueryExpressionBody#getRowOptimizeLimit <em>Row Optimize Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Optimize Limit</em>' attribute.
	 * @see #getRowOptimizeLimit()
	 * @generated
	 */
	void setRowOptimizeLimit(int value);

} // QExtendedQueryExpressionBody

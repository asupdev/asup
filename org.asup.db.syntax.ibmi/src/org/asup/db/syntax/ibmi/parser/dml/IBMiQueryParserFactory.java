/*******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.asup.db.syntax.ibmi.parser.dml;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.asup.db.syntax.QDatabaseSyntaxFactory;
import org.asup.db.syntax.dml.QDatabaseDMLFactory;
import org.asup.db.syntax.dml.QExtendedQuerySelect;
import org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl;
import org.eclipse.datatools.modelbase.sql.query.QueryResultSpecification;
import org.eclipse.datatools.modelbase.sql.query.QuerySearchCondition;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionVariable;
import org.eclipse.datatools.modelbase.sql.query.util.SQLQuerySourceFormat;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParserFactory;

@SuppressWarnings("rawtypes")
public class IBMiQueryParserFactory extends SQLQueryParserFactory {

	/**
     *
     */
	public IBMiQueryParserFactory() {
		super();
		init();
	}

	/**
	 * @param aSourceFormat
	 */
	public IBMiQueryParserFactory(SQLQuerySourceFormat aSourceFormat) {
		super(aSourceFormat);
		init();
	}

	/**
	 * initializes this <code>SQLXMLQueryParserFactory</code>
	 */
	private void init() {
		if (QDatabaseSyntaxFactory.eINSTANCE == null) {
			DatabaseSyntaxPackageImpl.init();
		}
	}

	public QExtendedQuerySelect createQExtendedQuerySelect(String optAllOrDistinct,
			List aResultColList, List aIntoColList, List aTableRefList,
			QuerySearchCondition aWhereClause, List aGroupByList,
			QuerySearchCondition aHavingClause, List aSortSpecList,
			int aRowFetchLimit){
		return createQExtendedQuerySelect(optAllOrDistinct, aResultColList, aTableRefList, aIntoColList, aWhereClause, aGroupByList, aHavingClause, null, 0, 0);
	}


	@SuppressWarnings("unchecked")
	public QExtendedQuerySelect createQExtendedQuerySelect(String optAllOrDistinct,
			List aResultColList, List aIntoColList, List aTableRefList,
			QuerySearchCondition aWhereClaus, List aGroupByList,
			QuerySearchCondition aHavingClaus, List aSortSpecList,
			int aRowFetchLimit,
			int aRowOptimizeLimit) {
		QExtendedQuerySelect qrySel = QDatabaseDMLFactory.eINSTANCE.createExtendedQuerySelect();

		qrySel.setDistinct(DISTINCT.equals(optAllOrDistinct));

		if (aResultColList != null) {
			qrySel.getSelectClause().addAll(aResultColList);
		}
		if (aIntoColList != null) {
			qrySel.getIntoClause().addAll(aIntoColList);			
		}
		if (aTableRefList != null) {
			qrySel.getFromClause().addAll(aTableRefList);
		}
		qrySel.setWhereClause(aWhereClaus);
		if (aGroupByList != null) {
			qrySel.getGroupByClause().addAll(aGroupByList);
		}
		qrySel.setHavingClause(aHavingClaus);

		if (aSortSpecList != null) {
			List sortSpecList = qrySel.getSortSpecList();
			sortSpecList.addAll(aSortSpecList);
		}
		qrySel.setRowFetchLimit(aRowFetchLimit);

		qrySel.setOptimizeRecordsNumber(aRowOptimizeLimit);

		return qrySel;
	}
	
	public List createIntoClause( List aResultSpecList, ValueExpressionVariable aResultCol ) {
		  //if (statementTypeOnly) {return null;}
		  if (aResultSpecList == null)
		    aResultSpecList = new Vector();
		  if (aResultCol != null)
		    aResultSpecList.add( aResultCol );
		  return aResultSpecList;
		}

}

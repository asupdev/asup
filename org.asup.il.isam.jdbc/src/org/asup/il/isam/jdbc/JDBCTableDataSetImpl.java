/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.il.isam.jdbc;

import org.asup.db.core.QConnection;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QIndicator;
import org.asup.il.isam.AccessMode;
import org.asup.il.isam.QTableDataSet;
import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.Table;

public class JDBCTableDataSetImpl<DS extends QDataStruct> extends JDBCDataSetImpl<DS> implements QTableDataSet<DS> {

	protected JDBCTableDataSetImpl(QConnection databaseConnection, SQLObjectNameHelper sqlObjectNameHelper, Table table, AccessMode accessMode, DS dataStruct) {
		super(databaseConnection, sqlObjectNameHelper, table, accessMode, dataStruct);
	}

	@Override
	protected String buildOrderBy(OpDir dir) {
		
		StringBuffer sbOrderBy = new StringBuffer();
		
		return sbOrderBy.toString();
	}

	@Override
	public boolean chain(Object relativeRecordNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setgt(Object relativeRecordNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setll(Object relativeRecordNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean read(QIndicator endOfRecord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean readp(QIndicator endOfRecord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected String buildWhere(Object[] keySet, Object[] keyRead) {
		// TODO Auto-generated method stub
		return null;
	}

} //QTableDataSetImpl

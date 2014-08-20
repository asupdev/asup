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
import org.asup.db.core.QTable;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QIndicator;
import org.asup.il.isam.AccessMode;
import org.asup.il.isam.QTableDataSet;

public class JDBCTableDataSetImpl<DS extends QDataStruct> extends JDBCDataSetImpl<DS> implements QTableDataSet<DS> {

	protected QTable table;

	protected JDBCTableDataSetImpl(QConnection databaseConnection, AccessMode accessMode, DS dataStruct) {
		super(databaseConnection, accessMode, dataStruct);
	}
	
	@Override
	protected String buildEscapedTableName() {
		return "["+table.getSchema().getName()+"].["+table.getName()+"]";
	}

	@Override
	protected String buildWhere(Object[] keySet, Object[] keyRead) {
		return null;
	}

	@Override
	protected String buildOrderBy(OpDir dir) {
		
		StringBuffer sbOrderBy = new StringBuffer();
		sbOrderBy.append("QMUKEY");
		
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

} //QTableDataSetImpl
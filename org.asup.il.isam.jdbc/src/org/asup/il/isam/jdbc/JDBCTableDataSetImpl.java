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

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.asup.db.core.QConnection;
import org.asup.db.core.QDatabaseManager;
import org.asup.il.data.QDataStruct;
import org.asup.il.isam.AccessMode;
import org.asup.il.isam.QIndex;
import org.asup.il.isam.QIndexColumn;
import org.asup.il.isam.QTableDataSet;
import org.asup.il.isam.impl.IndexColumnImpl;
import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.Table;

public class JDBCTableDataSetImpl<DS extends QDataStruct> extends JDBCIndexDataSetImpl<DS> implements QTableDataSet<DS> {

	protected JDBCTableDataSetImpl(QConnection databaseConnection, SQLObjectNameHelper sqlObjectNameHelper, Table table, AccessMode accessMode, DS dataStruct) {
		super(databaseConnection, sqlObjectNameHelper, table, accessMode, dataStruct);

		QIndex index = new QIndex() {

			List<QIndexColumn> columns = new ArrayList<QIndexColumn>();
			@Override
			public void setName(String value) {
			}

			@Override
			public String getName() {
				return QDatabaseManager.TABLE_COLUMN_RECORD_RELATIVE_NUMBER_NAME;
			}

			@Override
			public List<QIndexColumn> getColumns() {
				
				if(this.columns.isEmpty()) {
					synchronized (this.columns) {
						QIndexColumn indexColumn = new IndexColumnImpl() {
							
						};
						indexColumn.setName(QDatabaseManager.TABLE_COLUMN_RECORD_RELATIVE_NUMBER_NAME);
						indexColumn.setNumeric(true);
						this.columns.add(indexColumn);
					}
				}
				
				return this.columns;
			}
		};
		
		init(index);
	}

	@Override
	public boolean chain(int relativeRecordNumber) {

		_opSet = OpSet.SETLL;
		_opRead = OpRead.CHAIN;
		
		_keySet = new Object[]{relativeRecordNumber};
		_keyRead = _keySet;
		
		try {
			_prepareAccess();			
			return _readNext();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public void setgt(int relativeRecordNumber) {

		_opSet = OpSet.SETGT;
		_opRead = null;
		
		_keySet = new Object[]{relativeRecordNumber};
		_keyRead = null;

	}

	@Override
	public void setll(int relativeRecordNumber) {

		_opSet = OpSet.SETLL;
		_opRead = null;
		
		_keySet = new Object[]{relativeRecordNumber};
		_keyRead = null;
	}


	@Override
	public void open() {
		super.open();
		
		setll(0);
	}


} // QTableDataSetImpl

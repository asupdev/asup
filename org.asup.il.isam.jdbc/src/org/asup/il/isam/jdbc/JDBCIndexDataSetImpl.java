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
import java.util.List;

import org.asup.db.core.QConnection;
import org.asup.db.core.QDatabaseManager;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QString;
import org.asup.il.isam.AccessMode;
import org.asup.il.isam.QIndex;
import org.asup.il.isam.QIndexColumn;
import org.asup.il.isam.QIndexDataSet;
import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.Table;

public class JDBCIndexDataSetImpl<DS extends QDataStruct> extends JDBCDataSetImpl<DS> implements QIndexDataSet<DS> {

	private QIndex _index;
	
	protected JDBCIndexDataSetImpl(QConnection databaseConnection, SQLObjectNameHelper sqkObjectNameHelper, Table table, AccessMode accessMode, DS dataStruct) {
		super(databaseConnection, sqkObjectNameHelper, table, accessMode, dataStruct);		
						
	}

	protected void init(QIndex index) {
		_index = index;
	}
	
	@Override
	public boolean chain(QBufferedData[] keyList) {
		_opSet = OpSet.CHAIN;
		_opRead = OpRead.CHAIN;
		
		_keyRead = keyList;
		
		// read next record
		try {
			_prepareAccess();			
			return _readNext();	
			
		} catch (SQLException e) {
			_isEndOfData = true;
		}

		return false;
	}

	@Override
	public boolean chain(Object keyField) {
		Object[] keyList = { keyField };
		return chain(keyList);
	}

	@Override
	public boolean reade(QBufferedData[] keyList) {

		_opRead = OpRead.READE;
		_keyRead = keyList;
		
		// read next record
		try {
			_prepareAccess();			
			return _readNext();	
			
		} catch (SQLException e) {
			_isEndOfData = true;
		}
		
		return false;		
	}

	@Override
	public void reade(Object key) {
		Object[] keyList = { key };
		reade(keyList);
	}


	@Override
	public boolean readp() {

		if(_opDir == OpDir.F) {
			for(int i=0; i<_keySet.length; i++) {
				QIndexColumn indexColumn = _index.getColumns().get(i);
				if(indexColumn.getName().equals(QDatabaseManager.TABLE_COLUMN_RECORD_RELATIVE_NUMBER_NAME))
					_keySet[i] = rrn;
				else
					_keySet[i] = record.getElement(indexColumn.getName());
						
			}
			_opSet = OpSet.SETLL;
		}
		
		_opRead = OpRead.READP;
		_keyRead = null;

		// read previous record
		try {
			_prepareAccess();
			return _readNext();

		} catch (SQLException e) {
			_isEndOfData = true;
		}

		return false;
	}

	@Override
	public boolean readpe(QBufferedData[] keyList) {
		
		_opRead = OpRead.READPE;
		_keyRead = keyList;
		
		// read next record
		try {
			_prepareAccess();			
			return _readNext();	
			
		} catch (SQLException e) {
			_isEndOfData = true;
		}
		
		return false;		
	}

	@Override
	public void readpe(Object key) {
		Object[] keyList = { key };
		readpe(keyList);
	}

	@Override
	public void setll(QBufferedData[] keyList) {
		
		_opSet = OpSet.SETLL;
		_opRead = null;
		
		_keySet = keyList;
		_keyRead = null;
	}

	@Override
	public void setll(Object key) {
		Object[] keyList = { key };
		setll(keyList);
	}

	@Override
	public <E extends Enum<E>> void setll(E key) {

		if(key.name().equalsIgnoreCase("LOVAL")) {
			setll(0);
		}
		else if(key.name().equalsIgnoreCase("HIVAL")) {
			
		}
		else
			System.err.println("Unknown special: "+key);
		
	}

	@Override
	public void setgt(QBufferedData[] keyList) {

		_opSet = OpSet.SETGT;
		_opRead = null;
		
		_keySet = keyList;
		_keyRead = null;
	}

	@Override
	public void setgt(Object key) {
		Object[] keyList = { key };
		setgt(keyList);
	}

	@Override
	public <E extends Enum<E>> void setgt(E key) {
		// TODO Auto-generated method stub
		
	} 

	@Override
	protected String buildWhere(Object[] keySet, Object[] keyRead) {

		StringBuffer sbWhere = new StringBuffer();		
		
		if(keySet == null || keySet.length <=0)
			return sbWhere.toString();		
		
		if(_opSet.equals(OpSet.SETLL ) || _opSet.equals(OpSet.SETGT) ||
		   (_opSet.equals(OpSet.CHAIN) && !_opRead.equals(OpRead.CHAIN))
		   ) {
			buildWhereSet(keySet, sbWhere);
		}
		
		if(_opRead.equals(OpRead.CHAIN)) {
			buildWhereChain(keyRead, sbWhere);
		}
		
		if(_opRead.equals(OpRead.READ) || _opRead.equals(OpRead.READE) || _opRead.equals(OpRead.READP) || _opRead.equals(OpRead.READE)) {
			buildWhereRead(keyRead, sbWhere);
		}
		
		return sbWhere.toString();
	}
	
	@Override
	protected String buildOrderBy(OpDir dir) {
		
		StringBuffer sbOrderBy = new StringBuffer();
		
		for(QIndexColumn column: _index.getColumns()) {
			if(sbOrderBy.length() != 0)
				sbOrderBy.append(", ");
			
			sbOrderBy.append(getSQLObjectNameHelper().getIdentifierQuoteString()+column.getName()+getSQLObjectNameHelper().getIdentifierQuoteString());
			if(dir == OpDir.B)
				sbOrderBy.append(" DESC");
		}
		return sbOrderBy.toString();
	}

	private void buildWhereSet(Object[] keySet, StringBuffer sbWhere) {
		
		StringBuffer sbFields = new StringBuffer();
		StringBuffer sbValues = new StringBuffer();

		List<QIndexColumn> indexColumns = _index.getColumns();
		
		if(_keySet.length >1) 
			sbFields.append("(");
		
		for(int i=0; i<keySet.length; i++) {
			
			QIndexColumn indexColumn = _index.getColumns().get(i); 
			
			// append field
			if(indexColumn.isNumeric())
				sbFields.append("digits("+getSQLObjectNameHelper().getIdentifierQuoteString()+indexColumns.get(i).getName()+getSQLObjectNameHelper().getIdentifierQuoteString()+")");
			else 
				sbFields.append(getSQLObjectNameHelper().getIdentifierQuoteString()+indexColumns.get(i).getName()+getSQLObjectNameHelper().getIdentifierQuoteString());
			
			// append value
			sbValues.append("000000000"+keySet[i].toString());
			
			if(i+1<keySet.length)
				sbFields.append(" concat ");
		}		
		if(_keySet.length >1) 	
			sbFields.append(")");
		
		if(sbWhere.length()>0) 
			sbWhere.append(" and ");
		
		// pointer lower
		if(_opSet.equals(OpSet.SETLL) || _opSet.equals(OpSet.CHAIN)) {
		
			// reader backward
			if(_opRead.equals(OpRead.READP) || _opRead.equals(OpRead.READPE)) 
				sbWhere.append(sbFields).append("<'").append(sbValues).append("'");
			
			// reader forward
			else 
				sbWhere.append(sbFields).append(">='").append(sbValues).append("'");
		}
		
		// pointer greater
		if(_opSet.equals(OpSet.SETGT)) {
			// reader backward
			if(_opRead.equals(OpRead.READP) || _opRead.equals(OpRead.READPE))
				sbWhere.append(sbFields).append("<='").append(sbValues).append("'");
			
			// reader forward
			else 			
				sbWhere.append(sbFields).append(">'").append(sbValues).append("'");
		}
	} 
	
	private void buildWhereChain(Object[] keyRead, StringBuffer sbWhere) {		
		buildWhereRead(keyRead, sbWhere);
	} 

	private void buildWhereRead(Object[] keyRead, StringBuffer sbWhere) {

		if(keyRead == null)
			return;

		List<QIndexColumn> indexColumns = _index.getColumns();
		
		for(int i=0; i<keyRead.length; i++) {

			QIndexColumn indexColumn = indexColumns.get(i);
			
			String value = null;
			// append value
			if(keyRead[i] instanceof QString) {
				value = ((QString)keyRead[i]).toString();
			}
			else 
				value = keyRead[i].toString();
			 
			
			if(sbWhere.length()>0) 
				sbWhere.append(" and ");
			
			// append field
			if(indexColumn.isNumeric())
				sbWhere.append(getSQLObjectNameHelper().getIdentifierQuoteString()+indexColumn.getName()+getSQLObjectNameHelper().getIdentifierQuoteString()).append("=").append(value);			
			else 						
				sbWhere.append(getSQLObjectNameHelper().getIdentifierQuoteString()+indexColumn.getName()+getSQLObjectNameHelper().getIdentifierQuoteString()).append("=").append("'"+value+"'");				
		}
	}
}
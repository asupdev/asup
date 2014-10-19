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
import org.asup.db.core.QIndex;
import org.asup.db.core.QIndexColumn;
import org.asup.db.core.QSchema;
import org.asup.db.core.QTable;
import org.asup.db.core.QTableColumn;
import org.asup.db.core.QView;
import org.asup.db.core.QViewColumn;
import org.asup.db.data.QDatabaseDataHelper;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QBufferedDataDef;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QString;
import org.asup.il.isam.AccessMode;
import org.asup.il.isam.QIndexDataSet;

public class JDBCIndexDataSetImpl<DS extends QDataStruct> extends JDBCDataSetImpl<DS> implements QIndexDataSet<DS> {

	protected QIndex index;

	protected List<String> _keys;
	protected QBufferedDataDef<?>[] _fields;
	
	protected JDBCIndexDataSetImpl(QConnection databaseConnection, QIndex index, AccessMode accessMode, DS dataStruct) {
		super(databaseConnection, accessMode, dataStruct);
		setIndex(index);
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

	private void setIndex(QIndex newIndex) {
		index = newIndex;
		
		_fields = new QBufferedDataDef<?>[index.getColumns().size()];
		_keys = new ArrayList<>(_fields.length);
		
		int i=0;
		for(QIndexColumn indexField: index.getColumns()) {
			_keys.add(indexField.getName());
			i++;
		}

		QSchema schema = index.getSchema();
		
		boolean objectFound = false;
		
		// table
		for(QTable table: schema.getTables()) {
			if (index.getObject().equals(table.getName())) {
				objectFound = true;
				i=0;
				for(QTableColumn field: table.getColumns()) {
					if(_keys.contains(field.getName())) {
						_fields[i] = QDatabaseDataHelper.toBufferedDef(field);
						i++;
					}
				}
				break;
			}
		}
		if(objectFound)
			return;
		// view
		for(QView view: schema.getViews()) {
			if (index.getObject().equals(view.getName())) {
				objectFound = true;
				i=0;
				for(QViewColumn field: view.getColumns()) {
					if(_keys.contains(field.getName())) {
						_fields[i] = QDatabaseDataHelper.toBufferedDef(field);
						i++;
					}
				}
				break;
			}
		}
		
		if(objectFound)
			return;

		throw new RuntimeException("Object not found: "+index.getObject());
	}

	@Override
	protected String buildEscapedTableName() {
		return "["+index.getSchema().getName()+"].["+index.getObject().replaceFirst("\\.", "]\\.[")+"]";
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
		
		List<QIndexColumn> indexFields = index.getColumns();
				
		if(indexFields.isEmpty())
			return sbOrderBy.toString();;
				
		for(QIndexColumn field: indexFields) {
			if(sbOrderBy.length() != 0)sbOrderBy.append(", ");
			
			sbOrderBy.append("["+field.getName()+"]");
			if(dir == OpDir.B)
				sbOrderBy.append(" DESC");
		}
		return sbOrderBy.toString();
	}

	private void buildWhereSet(Object[] keySet, StringBuffer sbWhere) {

		StringBuffer sbFields = new StringBuffer();
		StringBuffer sbValues = new StringBuffer();
		
		if(_keySet.length >1) 
			sbFields.append("(");
		
		for(int i=0; i<keySet.length; i++) {
			
			QBufferedDataDef<?> definition = _fields[i];
			
			// append field
			if(definition instanceof org.asup.il.data.QCharacterDef) 
				sbFields.append("["+_keys.get(i)+"]");
			else 
				sbFields.append("cast(["+_keys.get(i)+"] as CHARACTER)");
			
			// append value
			sbValues.append(keySet[i].toString());
			
			if(i+1<keySet.length)
				sbFields.append("+");
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
		
		for(int i=0; i<keyRead.length; i++) {

			QBufferedDataDef<?> definition = _fields[i];
			
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
			if(definition instanceof org.asup.il.data.QCharacterDef) 
				sbWhere.append("["+_keys.get(i)+"]").append("=").append("'"+value+"'");
			else 
				sbWhere.append("["+_keys.get(i)+"]").append("=").append(value);			
			
		}
	}
	
}
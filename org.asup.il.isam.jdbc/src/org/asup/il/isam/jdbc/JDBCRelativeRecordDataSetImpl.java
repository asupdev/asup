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

import org.asup.db.core.QConnection;
import org.asup.il.data.QIndicator;
import org.asup.il.isam.AccessMode;
import org.asup.il.isam.OperationRead;
import org.asup.il.isam.OperationSet;
import org.asup.il.isam.QIndex;
import org.asup.il.isam.QRRDataSet;
import org.asup.il.isam.QRecord;
import org.eclipse.datatools.modelbase.sql.tables.Table;

public class JDBCRelativeRecordDataSetImpl<R extends QRecord> extends JDBCDataSetImpl<R> implements QRRDataSet<R> {

	protected JDBCRelativeRecordDataSetImpl(QConnection databaseConnection, Table table, QIndex index, R record, AccessMode accessMode, boolean userOpen) {
		super(databaseConnection, table, index, record, accessMode, userOpen);
	}

	@Override
	public boolean chain(int relativeRecordNumber) {
		return chain(relativeRecordNumber, null, null, null);
	}

	@Override
	public boolean chain(int relativeRecordNumber, QIndicator notFound) {
		return chain(relativeRecordNumber, notFound, null, null);
	}

	@Override
	public boolean chain(int relativeRecordNumber, QIndicator notFound, Boolean lock) {
		return chain(relativeRecordNumber, notFound, lock, null);
	}

	@Override
	public boolean chain(int relativeRecordNumber, QIndicator notFound, Boolean lock, QIndicator error) {

		try {
			Object[] keyList = new Object[] {relativeRecordNumber};
			prepareAccess(OperationSet.CHAIN, keyList, OperationRead.CHAIN, keyList);
			
			return readNext();

		} catch (SQLException e) {
			handleSQLException(e);
		}

		if(notFound != null)
			notFound.eval(!isFound());
		
		if(error != null)
			error.eval(onError());
		
		return isFound();
	}

	@Override
	public void setgt(int relativeRecordNumber) {
		setgt(relativeRecordNumber, null, null);
	}

	@Override
	public void setgt(int relativeRecordNumber, QIndicator found) {
		setgt(relativeRecordNumber, found, null);
	}

	@Override
	public void setgt(int relativeRecordNumber, QIndicator found, QIndicator error) {

		Object[] keyList = { relativeRecordNumber };
		setKeySet(OperationSet.SET_GREATER_THAN, keyList);

		if(found != null)
			found.eval(isFound());
		
		if(error != null)
			error.eval(onError());		
	}

	@Override
	public void setll(int relativeRecordNumber) {
		setll(relativeRecordNumber, null, null, null);
	}

	@Override
	public void setll(int relativeRecordNumber, QIndicator found) {
		setll(relativeRecordNumber, found, null, null);
	}

	@Override
	public void setll(int relativeRecordNumber, QIndicator found, QIndicator equal) {
		setll(relativeRecordNumber, found, equal, null);
	}

	@Override
	public void setll(int relativeRecordNumber, QIndicator found, QIndicator equal, QIndicator error) {

		Object[] keyList = { relativeRecordNumber };
		setKeySet(OperationSet.SET_LOWER_LIMIT, keyList);

		if(found != null)
			found.eval(isFound());
		
		if(equal != null)
			equal.eval(isEqual());
		
		if(error != null)
			error.eval(onError());		
	}
} // QTableDataSetImpl

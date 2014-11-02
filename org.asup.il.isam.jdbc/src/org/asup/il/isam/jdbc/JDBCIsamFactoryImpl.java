/**
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

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.asup.db.core.QConnection;
import org.asup.db.core.QDatabaseManager;
import org.asup.db.core.QIndex;
import org.asup.db.syntax.QAliasResolver;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QData;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QDataStructDef;
import org.asup.il.data.QIndicator;
import org.asup.il.data.annotation.FileDef;
import org.asup.il.isam.AccessMode;
import org.asup.il.isam.QDataSet;
import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QIndexDataSet;
import org.asup.il.isam.QIntegratedLanguageIsamFactory;
import org.asup.il.isam.QIsamFactory;

public class JDBCIsamFactoryImpl implements QIsamFactory {

	private QConnection connection;
	private QAliasResolver aliasAliasResolver;
	private QDataFactory dataFactory;
	private QDatabaseManager databaseManager;
	
	public JDBCIsamFactoryImpl(QConnection connection, QDatabaseManager databaseManager, QAliasResolver aliasResolver, QDataFactory dataFactory) { 

		this.connection = connection;
		this.databaseManager = databaseManager;
		this.aliasAliasResolver = aliasResolver;
		this.dataFactory = dataFactory;
	}

	@Override
	public QDataSet<?> createDataSet(QDataSetTerm dataSetTerm) {

		if(dataSetTerm.getFileName().equalsIgnoreCase("PRT198"))
			return new DummyDataSet();
		

		QDataStruct dataStruct = dataFactory.createData(dataSetTerm.getRecord(), true);
		
		if(dataSetTerm.isKeyedAccess()) {
			QIndex index = getIndex(dataSetTerm.getFileName());
			return new JDBCIndexDataSetImpl<QDataStruct>(connection, index, AccessMode.UPDATE, dataStruct);
		}
		else
			return new JDBCTableDataSetImpl<QDataStruct>(connection, AccessMode.UPDATE, dataStruct);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public QDataSetTerm createDataSetTerm(Type type, List<Annotation> annotations) {

		// annotations
		if (annotations == null)
			annotations = new ArrayList<Annotation>();

		QDataSetTerm dataSetTerm = QIntegratedLanguageIsamFactory.eINSTANCE.createDataSetTerm();
		
		// klass
		List<Type> arguments = new ArrayList<Type>();
		Class<? extends QData> klass = null;		
		if(type instanceof ParameterizedType) {
			ParameterizedType pType = (ParameterizedType)type;
			klass = (Class<? extends QData>) pType.getRawType();
			for(Type argument: pType.getActualTypeArguments())
				arguments.add(argument);
		}
		else
			klass = (Class<? extends QData>) type;

		if(QIndexDataSet.class.isAssignableFrom(klass))
			dataSetTerm.setKeyedAccess(true);

		for(Annotation annotation: annotations) {
			if(annotation instanceof FileDef) {
				FileDef fileDef = (FileDef)annotation;
				dataSetTerm.setFileName(fileDef.fileName());
				dataSetTerm.setUserOpen(fileDef.userOpen());
			}
		}
		
		if(arguments.size()>0) {
			try {
				Class<QDataStruct> klassArg = (Class<QDataStruct>) arguments.get(0);
				QDataStructDef dataStructDef = (QDataStructDef) dataFactory.createDataDef(klassArg, null);
				dataSetTerm.setRecord(dataStructDef);
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		return dataSetTerm;
	}

	@SuppressWarnings("rawtypes")
	private class DummyDataSet implements QIndexDataSet {

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void close() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isEndOfData() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isFound() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void open() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean read() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean readp() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void unlock() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void update() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void write() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public QDataStruct get() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean chain(QBufferedData[] keyList) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean chain(Object keyField) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean reade(QBufferedData[] keyList) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void reade(Object key) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean readpe(QBufferedData[] keyList) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void readpe(Object key) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setll(QBufferedData[] keyList) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setll(Object key) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setgt(QBufferedData[] keyList) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setgt(Object key) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setll(Enum key) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setgt(Enum key) {
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
		
	}
	
	
	public QIndex getIndex(String name) {
		
		QIndex index = null;
		if(aliasAliasResolver != null)
			index = aliasAliasResolver.getIndex(connection, name);
		
		if(index == null)
			index = databaseManager.getIndex(connection, "P_MULT", "MUTEST0F", "MUTEST0L");
/* 		QFile file = fileManager.getOverridedDatabaseFile((QJob) contextID, name);
		if(file == null)
			file = fileReader.lookup(name);

		if(file instanceof QLogicalFile) {
			QLogicalFile logicalFile = (QLogicalFile) file;
			QIndex index = databaseManager.getIndex(connection, file.getLibrary(), logicalFile.getIndex().getObject(), logicalFile.getName());
			return index;
		}*/
		
		return index;
	}
}

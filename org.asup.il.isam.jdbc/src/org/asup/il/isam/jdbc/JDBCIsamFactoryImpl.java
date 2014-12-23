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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.asup.db.core.QCatalogMetaData;
import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionDescription;
import org.asup.db.syntax.QNameHelper;
import org.asup.il.data.QData;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QDataStructDef;
import org.asup.il.data.annotation.FileDef;
import org.asup.il.isam.AccessMode;
import org.asup.il.isam.QDataSet;
import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QIndex;
import org.asup.il.isam.QIndexDataSet;
import org.asup.il.isam.QIntegratedLanguageIsamFactory;
import org.asup.il.isam.QIsamFactory;
import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.Table;

public class JDBCIsamFactoryImpl implements QIsamFactory {

	private QConnection connection;
	private SQLObjectNameHelper sqlObjectNameHelper;
	@SuppressWarnings("unused")
	private QNameHelper nameHelper;
	private QDataFactory dataFactory;
	
	public JDBCIsamFactoryImpl(QConnection connection, SQLObjectNameHelper sqlObjectNameHelper, QNameHelper nameHelper, QDataFactory dataFactory) { 

		this.connection = connection;
		this.sqlObjectNameHelper = sqlObjectNameHelper;
		this.nameHelper = nameHelper;
		this.dataFactory = dataFactory;
	}

	@Override
	public QDataSet<?> createDataSet(QDataSetTerm dataSetTerm) {

		try {
			Table table = getTable(dataSetTerm.getFileName());
			if(table == null)
				return null;
			
			QDataStruct dataStruct = dataFactory.createData(dataSetTerm.getRecord(), true);
			
			if(dataSetTerm.isKeyedAccess()) {			
				QIndex index = connection.getContext().getAdapter(dataStruct, QIndex.class);
				JDBCIndexDataSetImpl<QDataStruct> jdbcIndexDataSetImpl = new JDBCIndexDataSetImpl<QDataStruct>(connection, sqlObjectNameHelper, table, AccessMode.UPDATE, dataStruct);
				jdbcIndexDataSetImpl.init(index);
				
				return jdbcIndexDataSetImpl;
			}
			else {
				return new JDBCTableDataSetImpl<QDataStruct>(connection, sqlObjectNameHelper, table, AccessMode.UPDATE, dataStruct);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public <DS extends QDataStruct> QDataSet<DS> createDataSet(Class<DS> klass) {

		try {
			Table table = getTable(klass.getSimpleName());
			if(table == null)
				return null;
			
			DS dataStruct = dataFactory.createDataStruct(klass, 0, true);

			return new JDBCTableDataSetImpl<DS>(connection, sqlObjectNameHelper, table, AccessMode.UPDATE, dataStruct);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}

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

	public Table getTable(String name) throws SQLException {
		
		QCatalogMetaData catalogMetaData = connection.getCatalogMetaData();
		
		QConnectionDescription connectionDescription = connection.getConnectionDescription();
		
		return catalogMetaData.getTable(connectionDescription, name);
	}
}

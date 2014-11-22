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
import org.asup.db.syntax.QAliasResolver;
import org.asup.db.syntax.QSyntaxBuilder;
import org.asup.il.data.QData;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QDataStructDef;
import org.asup.il.data.annotation.FileDef;
import org.asup.il.isam.AccessMode;
import org.asup.il.isam.QDataSet;
import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QIndexDataSet;
import org.asup.il.isam.QIntegratedLanguageIsamFactory;
import org.asup.il.isam.QIsamFactory;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.tables.Table;

public class JDBCIsamFactoryImpl implements QIsamFactory {

	private QDatabaseManager databaseManager;
	private QConnection connection;
	private QSyntaxBuilder syntaxBuilder;
	private QAliasResolver aliasAliasResolver;
	private QDataFactory dataFactory;
	
	public JDBCIsamFactoryImpl(QConnection connection, QDatabaseManager databaseManager, QSyntaxBuilder syntaxBuilder, QAliasResolver aliasResolver, QDataFactory dataFactory) { 

		this.connection = connection;
		this.databaseManager = databaseManager;
		this.syntaxBuilder = syntaxBuilder;
		this.aliasAliasResolver = aliasResolver;
		this.dataFactory = dataFactory;
	}

	@Override
	public QDataSet<?> createDataSet(QDataSetTerm dataSetTerm) {

		QDataStruct dataStruct = dataFactory.createData(dataSetTerm.getRecord(), true);
		
		if(dataSetTerm.isKeyedAccess()) {
			Index index = getIndex(dataSetTerm.getFileName());
			return new JDBCIndexDataSetImpl<QDataStruct>(connection, syntaxBuilder, index, AccessMode.UPDATE, dataStruct);
		}
		else {
			Table table = getTable(dataSetTerm.getFileName());
			return new JDBCTableDataSetImpl<QDataStruct>(connection, syntaxBuilder, table, AccessMode.UPDATE, dataStruct);
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

	public Table getTable(String name) {
		
		Table table = databaseManager.getTable(connection, null, name);
		if(aliasAliasResolver != null)
			table = aliasAliasResolver.getAliasForTable(table);
		
		return table;
	}
	
	public Index getIndex(String name) {
		
		Index index = null;
		if(aliasAliasResolver != null)
			index = aliasAliasResolver.getIndex(connection, name);
		
		return index;
	}
}

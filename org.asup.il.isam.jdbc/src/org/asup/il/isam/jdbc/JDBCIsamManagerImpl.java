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

import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.fw.core.QAdapterFactory;
import org.asup.fw.core.QApplication;
import org.asup.fw.core.QContextProvider;
import org.asup.fw.core.annotation.ServiceRegistration;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataManager;
import org.asup.il.isam.QIsamFactory;
import org.asup.il.isam.QIsamManager;
import org.eclipse.datatools.modelbase.sql.constraints.Index;

public class JDBCIsamManagerImpl extends ServiceImpl implements QIsamManager {

	@Inject
	private QApplication application;
	@Inject
	private QDataManager dataManager;
	
	@ServiceRegistration
	public void init() {		

		QAdapterFactory adapterFactory = new JDBCIsamAdatpterFactoryImpl();		
		application.getContext().registerAdapterFactory(adapterFactory, Index.class);
	}
	
	@Override
	public QIsamFactory createFactory(QContextProvider contextProvider) {
				
		QConnection connection = contextProvider.getContext().getAdapter(contextProvider, QConnection.class);
		
		QDataFactory dataFactory = dataManager.createFactory(contextProvider);

		return new JDBCIsamFactoryImpl(connection, dataFactory);
	}

}

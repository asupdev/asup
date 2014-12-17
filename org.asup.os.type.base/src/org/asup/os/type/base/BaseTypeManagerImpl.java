/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.base;

import javax.inject.Inject;

import org.asup.os.core.QSystemManager;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.type.QType;
import org.asup.os.type.impl.TypeManagerImpl;

public class BaseTypeManagerImpl extends TypeManagerImpl {
	
	
	private QResourceFactory resourceFactory;

	private String systemLibrary;

	@Inject
	public BaseTypeManagerImpl(QSystemManager systemManager, QResourceFactory resourceFactory) {
		
		this.systemLibrary = systemManager.getSystem().getSystemLibrary();		
		this.resourceFactory = resourceFactory;
		
	}

	@Override
	public QResourceReader<QType> getTypeReader(QJob job) {

		QResourceReader<QType> typeReader = resourceFactory.getResourceReader(job, QType.class, systemLibrary);		
		return typeReader;
	}	
	
}

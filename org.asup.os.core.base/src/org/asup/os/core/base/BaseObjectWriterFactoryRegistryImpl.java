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
package org.asup.os.core.base;

import javax.annotation.PostConstruct;

import org.asup.fw.core.QPluginRegistryFactory;
import org.asup.os.core.jobs.JobType;
import org.asup.os.core.output.QObjectWriterFactory;
import org.asup.os.core.output.impl.ObjectWriterFactoryRegistryImpl;

public class BaseObjectWriterFactoryRegistryImpl extends ObjectWriterFactoryRegistryImpl {

	@PostConstruct
	public void init(QPluginRegistryFactory pluginRegistryFactory) {
		setStore(pluginRegistryFactory.createPluginRegistry(QObjectWriterFactory.class));		
	}
	
	@Override
	public QObjectWriterFactory lookup(String name) {
		return super.lookup(name);
	}

	@Override
	public QObjectWriterFactory lookup(JobType jobType) {

		QObjectWriterFactory objectWriterFactory = null;

		switch (jobType) {
		case BATCH:

			objectWriterFactory = lookup("D");

			break;

		case INTERACTIVE:

			objectWriterFactory = lookup("D");

			break;

		case KERNEL:
			break;

		default:
			break;
		}

		return objectWriterFactory;
	}

}

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

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.asup.fw.core.QContextID;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobManager;
import org.asup.os.core.output.QObjectWriter;
import org.asup.os.core.output.QObjectWriterFactory;
import org.asup.os.core.output.QObjectWriterFactoryRegistry;
import org.asup.os.core.output.impl.OutputManagerImpl;

public class BaseOutputManagerImpl extends OutputManagerImpl {

	@Inject
	private QObjectWriterFactoryRegistry objectWriterFactoryRegistry;
	
	@Inject
	private QJobManager jobManager;

	private Map<QContextID, Map<String, QObjectWriter>> jobToWriters = new HashMap<QContextID, Map<String, QObjectWriter>>();
	private Map<String, QObjectWriter> defaultWriter = new HashMap<String, QObjectWriter>();

	@Override
	public QObjectWriter getDefaultWriter(QContextID contextID) {

		QObjectWriter objectWriter = defaultWriter.get(contextID.getID());

		if (objectWriter == null) {
			
			QJob job = jobManager.lookup(contextID);

			QObjectWriterFactory objectWriterFactory = objectWriterFactoryRegistry.lookup(job.getJobType());
			objectWriter = objectWriterFactory.createObjectWriter(job);

			defaultWriter.put(contextID.getID(), objectWriter);
		}

		return objectWriter;
	}

	@Override
	public QObjectWriter getObjectWriter(QContextID contextID, String name) {
		
		QJob job = jobManager.lookup(contextID);
		
		if (name == null || name.isEmpty())
			name = "*";

		Map<String, QObjectWriter> writers = jobToWriters.get(contextID);
		if (writers == null) {
			writers = new HashMap<String, QObjectWriter>();
			jobToWriters.put(contextID, writers);
		}

		QObjectWriter objectWriter = writers.get(name);
		if (objectWriter == null) {

			if (name.equals("*"))
				return getDefaultWriter(contextID);

			QObjectWriterFactory objectWriterFactory = objectWriterFactoryRegistry.lookup(name);
			objectWriter = objectWriterFactory.createObjectWriter(job);
			writers.put(name, objectWriter);
		}

		return objectWriter;
	}

	@Override
	public void registerWriter(QContextID contextID, String name, QObjectWriter objectWriter) {

		Map<String, QObjectWriter> writers = jobToWriters.get(contextID);
		if (writers == null) {
			writers = new HashMap<String, QObjectWriter>();
			jobToWriters.put(contextID, writers);
		}
		writers.put(name, objectWriter);
	}

	@Override
	public void setDefaultWriter(QContextID contextID, String name) {
		QJob job = jobManager.lookup(contextID);
		
		defaultWriter.put(contextID.getID(), getObjectWriter(job, name));
	}

}

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

import javax.inject.Inject;

import org.asup.fw.core.QContextID;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLog;
import org.asup.os.core.jobs.QJobLogEntry;
import org.asup.os.core.jobs.QJobManager;
import org.asup.os.core.jobs.QOperatingSystemJobsFactory;
import org.asup.os.core.jobs.impl.JobLogManagerImpl;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.core.resources.QResourceWriter;

public class BaseJobLogManagerImpl extends JobLogManagerImpl {

	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QJobManager jobManager;
	
	@Override
	public void info(QJob job, String message) {
		addEntry(job, 10, message);
	}

	@Override
	public void warning(QJob job, String message) {
		addEntry(job, 20, message);
	}

	@Override
	public void error(QJob job, String message) {
		addEntry(job, 30, message);
	}

	private void addEntry(QJob job, int gravity, String message) {

	    // job log
	    QJobLog jobLog = lookup(job);
	    if(jobLog == null) {
	    	jobLog = QOperatingSystemJobsFactory.eINSTANCE.createJobLog();
	    	jobLog.setJobID(job.getID());
	    
	    	job.getJobContext().set(QJobLog.class, jobLog);
	    }

		// entry
		QJobLogEntry entry = QOperatingSystemJobsFactory.eINSTANCE.createJobLogEntry();
		entry.setGravity(gravity);
		entry.setMessage(message);

		// add
		jobLog.getEntries().add(entry);
		
		// save
		try {
			QResourceWriter<QJobLog> jobLogWriter = resourceFactory.getResourceWriter(job, QJobLog.class, job.getSystem().getSystemLibrary());
			jobLogWriter.save(jobLog, true);
		}
		catch (OperatingSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public QJobLog lookup(QJob job) {
		QJobLog jobLog = null;
		
		if(job.getJobContext() != null)
			jobLog = job.getJobContext().get(QJobLog.class);

		if(jobLog == null) {
			QResourceReader<QJobLog> jobLogReader = resourceFactory.getResourceReader(job, QJobLog.class, job.getSystem().getSystemLibrary());
			jobLog = jobLogReader.lookup(job.getName());
		}
		
		return jobLog;
	}

	@Override
	public QJobLog lookup(QContextID contextID, String name, String user, int number) {
		
		QJob jobCaller = jobManager.lookup(contextID);
		QJob job = jobManager.lookup(contextID, name, user, number);
		
		QResourceReader<QJobLog> jobLogReader = resourceFactory.getResourceReader(jobCaller, QJobLog.class, jobCaller.getSystem().getSystemLibrary());
		QJobLog jobLog = jobLogReader.lookup(job.getName());
		
		return jobLog;
	}
}

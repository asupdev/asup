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
package org.asup.os.core.e4;

import java.util.Calendar;

import javax.annotation.PostConstruct;

import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.QLocker;
import org.asup.os.core.QOperatingSystemCoreFactory;
import org.asup.os.core.QSystem;
import org.asup.os.core.impl.SystemManagerImpl;
import org.asup.os.core.jobs.JobType;
import org.asup.os.core.jobs.QJob;

public class E4SystemManagerImpl extends SystemManagerImpl {
	
	private QSystem system;
	private QLocker<QSystem> locker;
	private QJob startupJob;

	private int nextJobNumber = Integer.parseInt(HHMMSS.format(Calendar.getInstance().getTime())); 
	
	@PostConstruct
	private void init() {
		
		// QSystem
		this.system = QOperatingSystemCoreFactory.eINSTANCE.createSystem();
		this.system.setName("localhost");
		this.system.setSystemUser("QCONSOLE");
		this.system.setSystemLibrary("QSYS");
		this.system.setSystemDatabase("*LOCAL");		
		this.system.setInstallPath(System.getProperty("osgi.instance.area"));
		this.system.setContext(frameworkContext);
	}
	
	@Override
	public QLocker<QSystem> getLocker() {
		return locker;
	}

	@Override
	public QSystem getSystem() {
		return system;
	}
	
	@Override
	public QJob start() throws OperatingSystemException {

		this.locker= new E4SystemLockerImpl(this.system);

		this.startupJob = createJob(JobType.KERNEL, "QCONSOLE");
		this.startupJob.setJobContext(frameworkContext.createChild());
		
		return startupJob;
	}

	@Override
	public void stop() throws OperatingSystemException {
		
		this.system = null;
		this.locker = null;
		
	}

	protected QJob getStartupJob() {
		return startupJob;
	}

	@Override
	protected synchronized int nextJobID() {
		nextJobNumber ++;
		return nextJobNumber;
	}

	@Override
	protected QJob createJob(JobType jobType, String user) throws OperatingSystemException {
		return super.createJob(jobType, user);
	}

}
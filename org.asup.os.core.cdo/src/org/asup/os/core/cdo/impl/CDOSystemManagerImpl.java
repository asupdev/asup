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
package org.asup.os.core.cdo.impl;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.fw.core.QApplication;
import org.asup.fw.core.QContext;
import org.asup.os.core.LockType;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.QLocker;
import org.asup.os.core.QOperatingSystemCoreHelper;
import org.asup.os.core.QSystem;
import org.asup.os.core.SystemStatus;
import org.asup.os.core.cdo.QCDOSystemConfig;
import org.asup.os.core.cdo.util.CDOResourceUtil;
import org.asup.os.core.cdo.util.CDOSessionUtil;
import org.asup.os.core.impl.SystemManagerImpl;
import org.asup.os.core.jobs.JobStatus;
import org.asup.os.core.jobs.JobType;
import org.asup.os.core.jobs.QJob;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.util.ConcurrentAccessException;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class CDOSystemManagerImpl extends SystemManagerImpl {

	@Inject
	private QApplication application;

	private static final String CDO_CORE = "os/core";
	
	private CDONet4jSession session;	

	private QSystem viewSystem;
	private QSystem transactionSystem;
	
	private QJob startupJob;
	
	private CDOView view;
	private CDOTransaction transaction;
	
	private CDOSystemLockerImpl systemLocker;
	
	@PostConstruct
	public void init() {
		this.systemLocker = new CDOSystemLockerImpl();
	}
	
	@Override
	public QJob start() throws OperatingSystemException {

		// prepare system
		viewSystem = prepareSystem();			
		
		// acquire system lock
		while(!getLocker().tryLock(startupJob, transactionSystem, QSystem.LOCK_TIMEOUT, LockType.EXCLUSIVE));
		
		// create job kernel
		startupJob = createJob(JobType.KERNEL, transactionSystem.getSystemUser());
		
	    // save
	    CDOResource resource = transaction.getOrCreateResource(CDO_CORE);
		resource.getContents().add((EObject)startupJob);
			
		// system not able to start 
		if(!QOperatingSystemCoreHelper.isStartable(viewSystem)) {
			try {
				transaction.commit();
			}  catch (CommitException e) {
				throw new OperatingSystemException(e);
			} 
			finally {
				getLocker().unlock(startupJob, transactionSystem);
			}
			return startupJob;
		}
		
		// update system status
		try {
			transactionSystem.setStatus(SystemStatus.STARTED);			
			transaction.commit();
						
		} catch (CommitException e) {
			throw new OperatingSystemException(e);
		}
		finally {
			getLocker().unlock(startupJob, transactionSystem);
		}
		return startupJob;
	}

	@Override
	public void stop() throws OperatingSystemException {
		
		// acquire system lock
		while(!getLocker().tryLock(startupJob, transactionSystem, QSystem.LOCK_TIMEOUT, LockType.EXCLUSIVE)); 

		// system not able to stop
		if(!QOperatingSystemCoreHelper.isStoppable(transactionSystem)) {			
			getLocker().unlock(startupJob, transactionSystem);
			return;			
		}
		
		// update system status
		try {		
			transactionSystem.setStatus(SystemStatus.STOPPED);			
			transaction.commit();
		}
		catch (CommitException e) {
			throw new OperatingSystemException(e);
		}
		finally {
			getLocker().unlock(startupJob, transactionSystem);
		}
		
		// close session
		transaction.close();
		session.close();

	}
	
	@Override
	public QSystem getSystem() {		
		return viewSystem;
	}

	protected CDONet4jSession getCDOSession() {
		return session;
	}
	
	protected QJob getStartupJob() {
		return startupJob;
	}
	
	CDOView getView() {
		return view;
	}
	
	CDOTransaction getTransaction() {
		return transaction;
	}
	
	QSystem getTransactionSystem() {
		return transactionSystem;
	}
	
	private QSystem prepareSystem() throws OperatingSystemException {

		QCDOSystemConfig systemConfig = (QCDOSystemConfig) getConfig();
		
//		this.systemName = properties.get("org.asup.os.system.name").toString();
//		this.systemAddress = properties.get("org.asup.os.system.address").toString();

		// session
		session = CDOSessionUtil.openSession("localhost:2036", systemConfig.getSystem().getName());
		
		// view
		view = session.openView();

		// transaction
		transaction = session.openTransaction();
		transaction.options().setAutoReleaseLocksEnabled(false);

		
		String queryString = "select * from "+CDOResourceUtil.getTableName(QSystem.class)+" where name=:name";
			
		try {
			CDOQuery query = transaction.createQuery("sql", queryString);
			query.setParameter("name", systemConfig.getSystem().getName());
			query.setMaxResults(1);	
			transactionSystem = query.getResultValue(QSystem.class);
		}
		catch(org.eclipse.net4j.signal.RemoteException e) {
			e.printStackTrace();
		}		

		// first run
		if(transactionSystem == null) {
			QSystem system = (QSystem) EcoreUtil.copy((EObject)systemConfig.getSystem());		
			system.setInstallPath(System.getProperty(system.getInstallPath()));
			system.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(system));		
			
			CDOResource resourceSystem = transaction.getOrCreateResource(CDO_CORE);
			resourceSystem.getContents().add((EObject)system);
			
			try {
				transaction.commit();
			} catch (ConcurrentAccessException e) {
				throw new OperatingSystemException(e);
			} catch (CommitException e) {
				throw new OperatingSystemException(e);
			}			
			
			CDOQuery query = transaction.createQuery("sql", queryString);
			query.setParameter("name", system.getName());
			query.setMaxResults(1);	
			transactionSystem = query.getResultValue(QSystem.class);
		}

		CDOQuery query = view.createQuery("sql", queryString);
		query.setParameter("name", systemConfig.getSystem().getName());
		query.setMaxResults(1);	
		QSystem system = query.getResultValue(QSystem.class);
		
		return system;
	}

	@Override
	protected synchronized int nextJobID() throws OperatingSystemException {
					
		int x = viewSystem.getLastJobNumber()+1;
		
		viewSystem.setLastJobNumber(x);
		transactionSystem.setLastJobNumber(x);

		try {
			transaction.commit();
		} catch (CommitException e) {
			throw new OperatingSystemException(e);
		}

		return x;
	}

	public void updateStatus(JobStatus status) throws OperatingSystemException {
	    try {
	    	// save job
			CDOResource resource = transaction.getOrCreateResource(CDO_CORE);
			startupJob.setJobStatus(status);
			resource.getContents().add((EObject)startupJob);
			transaction.commit();
		}
	    catch (CommitException e) {
			throw new OperatingSystemException(e);
		}
		
	}

	@Override
	public QLocker<QSystem> getLocker() {
		return systemLocker;
	}

	@Override
	protected QJob createJob(JobType jobType, String user) throws OperatingSystemException {
		return super.createJob(jobType, user);
	}

	@Override
	protected QContext createContext(String name) throws OperatingSystemException {
		return this.application.getContext().createLocalContext(name);
	}	
}
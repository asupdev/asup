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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.asup.fw.core.QContextID;
import org.asup.os.core.LockType;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.QSystem;
import org.asup.os.core.QSystemManager;
import org.asup.os.core.Scope;
import org.asup.os.core.cdo.util.CDOResourceUtil;
import org.asup.os.core.jobs.JobStatus;
import org.asup.os.core.jobs.JobType;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.impl.JobManagerImpl;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.type.jobd.QJobDescription;
import org.asup.os.type.usrprf.QUserProfile;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.ecore.EObject;

public class CDOJobManagerImpl extends JobManagerImpl {

	private CDOSystemManagerImpl systemManager;
	private QResourceFactory resourceFactory;
	
	private static final String CDO_RESOURCE = "os/core"; 
	
	private Map<String, QJob> activeJobs;
	
	@Inject
	public CDOJobManagerImpl(QSystemManager systemManager, QResourceFactory resourceFactory) {
		
		this.systemManager = (CDOSystemManagerImpl) systemManager;	
		this.resourceFactory = resourceFactory;
		this.activeJobs = new HashMap<String, QJob>();
		
		new CDOJobCloser(this).start();
	}
	
	@Override
	public QJob create(String user, String password) throws OperatingSystemException {
		
		QJob startupJob = systemManager.getStartupJob();
		QResourceReader<QUserProfile> userResource = resourceFactory.getResourceReader(startupJob, QUserProfile.class, systemManager.getSystem().getSystemLibrary());
		
		// check credential
    	QUserProfile userProfile = userResource.lookup(user);
		
    	if(userProfile == null) 
    		throw new OperatingSystemException("User "+user+" not found");

    	// lock system
		// acquire system lock
		while(!systemManager.getLocker().tryLock(startupJob, systemManager.getTransactionSystem(), QSystem.LOCK_TIMEOUT, LockType.EXCLUSIVE)); 
//			System.out.print("Retry lock system "+systemManager.getSystem().getName());
		

	    try {
//			System.out.println("lock system "+systemManager.getSystem().getName()+" jobManager");
	    	
	    	QJob job = systemManager.createJob(JobType.BATCH, userProfile.getName());
	    	   	
		    // add job description libraries
		    if(userProfile.getJobDescription() != null) {
			    QResourceReader<QJobDescription> jobDescriptionResource = resourceFactory.getResourceReader(startupJob, QJobDescription.class, Scope.ALL);
			    QJobDescription jobDescription = jobDescriptionResource.lookup(userProfile.getJobDescription());
		    	if(jobDescription != null) {
			    	for(String library: jobDescription.getLibraries()) {
			    		job.getLibraries().add(library);
			    	}
		    	}
		    }    	    
		    
	    	// save job
			CDOResource resource = systemManager.getTransaction().getOrCreateResource(CDO_RESOURCE);
			resource.getContents().add((EObject)job);
			systemManager.getTransaction().commit();
		    
		    activeJobs.put(job.getID(), job);
		    
	    	return job;
		}
	    catch (CommitException e) {
			throw new OperatingSystemException(e);
		}
	    finally {
			systemManager.getLocker().unlock(startupJob, systemManager.getTransactionSystem());
//			System.out.println("unlock system "+systemManager.getSystem().getName()+" jobManager");
	    }
	}

	@Override
	public QJob create(QJob credential) throws OperatingSystemException {
		return create(credential.getJobUser(), "*SAME");		
	}

	@Override
	public QJob lookup(QContextID contextID, String name, String user, int number) {
				
		StringBuffer queryString = new StringBuffer();
		queryString.append("select * from "+CDOResourceUtil.getTableName(QJob.class));
		queryString.append(" where jobName=:jobName and jobUser=:jobUser and jobNumber=:jobNumber");		
	    
		CDOQuery query = systemManager.getView().createQuery("sql", queryString.toString());	    
	    query.setParameter("jobName", name);
	    query.setParameter("jobUser", user);
	    query.setParameter("jobNumber", number);

	    QJob qJob = query.getResultValue(QJob.class);
	    
	    if(qJob== null)
	    	throw new OperatingSystemRuntimeException("Job not found: "+qJob);

		return qJob;
	}

	@Override
	public List<QJob> getActiveJobs() {
		
		StringBuffer queryString = new StringBuffer();
		queryString.append("select * from "+CDOResourceUtil.getTableName(QJob.class));
		queryString.append(" where jobStatus<>:end");		
	    
		CDOQuery query = systemManager.getView().createQuery("sql", queryString.toString());
	    
	    query.setParameter("end", JobStatus.END_VALUE);
	    
		List<QJob> jobs = query.getResult(QJob.class) ;		
		return jobs;
	}

	@Override
	public QJob lookup(QContextID contextID) {
		
		QJob job = null;

		if(contextID instanceof QJob) {
			job = (QJob)contextID;
			
			// not active reference
			if(job.getContext() == null)
				job = activeJobs.get(contextID.getID());
		}
		else
			job = activeJobs.get(contextID.getID());

		if(job != null)
			return job;
		
		StringBuffer queryString = new StringBuffer();
		queryString.append("select * from "+CDOResourceUtil.getTableName(QJob.class));
		queryString.append(" where jobID=:jobID");		
	    
		CDOQuery query = systemManager.getView().createQuery("sql", queryString.toString());	    
	    query.setParameter("jobID", contextID);

	    QJob qJob = query.getResultValue(QJob.class);
	    
	    if(qJob== null)
	    	throw new OperatingSystemRuntimeException("Job not found: "+qJob);
	    
	    if(qJob.getJobStatus().equals(JobStatus.END))
	    	throw new OperatingSystemRuntimeException("Job not active: "+qJob);

		return qJob;
	}
	
	protected CDOTransaction getTransaction() {
		return systemManager.getTransaction();
	}
	
	@Override
	public void updateStatus(QJob job, JobStatus status) throws OperatingSystemException {
	    try {
	    	// save job
			CDOResource resource = systemManager.getTransaction().getOrCreateResource(CDO_RESOURCE);
			job.setJobStatus(status);
			resource.getContents().add((EObject)job);
			systemManager.getTransaction().commit();			
		}
	    catch (CommitException e) {
			throw new OperatingSystemException(e);
		}		
	}
}
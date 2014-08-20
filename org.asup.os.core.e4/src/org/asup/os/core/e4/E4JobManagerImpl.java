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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.asup.fw.core.QContextID;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.QSystemManager;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.JobStatus;
import org.asup.os.core.jobs.JobType;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.impl.JobManagerImpl;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.type.jobd.QJobDescription;
import org.asup.os.type.usrprf.QUserProfile;

public class E4JobManagerImpl extends JobManagerImpl {

	private Map<String, QJob> activeJobs;
	
	private E4SystemManagerImpl systemManager;
	private QResourceFactory resourceFactory;
	
	@Inject
	public E4JobManagerImpl(QSystemManager systemManager, QResourceFactory resourceFactory) {
		this.systemManager = (E4SystemManagerImpl) systemManager;
		this.resourceFactory = resourceFactory;
		this.activeJobs = new HashMap<String, QJob>();
	}
	

	@Override
	public QJob lookup(QContextID contextID) {

		if(contextID instanceof QJob) {
			QJob job = (QJob)contextID;
			
			// not active reference
			if(job.getJobContext() == null)
				return activeJobs.get(contextID.getID());
			return job;
		}
		else
			return activeJobs.get(contextID.getID());
	}

	@Override
	public QJob lookup(QContextID contextID, String name, String user, int number) {

		QJob jobCaller = lookup(contextID);
		
		QResourceReader<QJob> jobReader = resourceFactory.getResourceReader(jobCaller, QJob.class, jobCaller.getSystem().getSystemLibrary());
		QObjectIterator<QJob> jobs = jobReader.find(null);
		while(jobs.hasNext()) {
			QJob job = jobs.next();
			if(job.getJobName().equals(name) &&
			   job.getJobUser().equals(user) &&
			   job.getJobNumber() == number)
				return job;
		}
		return null;
	}

	@Override
	public void updateStatus(QJob job, JobStatus status) throws OperatingSystemException {
		job.setJobStatus(status);
	}

	@Override
	public QJob create(String user, String password) throws OperatingSystemException {
		
		QJob startupJob = systemManager.getStartupJob();
		QResourceReader<QUserProfile> userResource = resourceFactory.getResourceReader(startupJob, QUserProfile.class, systemManager.getSystem().getSystemLibrary());
		
		// check credential
    	QUserProfile userProfile = userResource.lookup(user);
		
    	if(userProfile == null) 
    		throw new OperatingSystemException("User "+user+" not found");


    	QJob job = systemManager.createJob(JobType.BATCH, userProfile.getName());
    	   	
	    // add job description libraries
	    if(userProfile.getJobDescription() != null) {
		    QResourceReader<QJobDescription> jobDescriptionResource = resourceFactory.getResourceReader(startupJob, QJobDescription.class, Scope.ALL);
//		    QJobDescription jobDescription = jobDescriptionResource.lookup(userProfile.getJobDescription());
		    // TODO remove
		    QJobDescription jobDescription = jobDescriptionResource.lookup("ASUP");		    
	    	if(jobDescription != null) {
		    	for(String library: jobDescription.getLibraries()) {
		    		job.getLibraries().add(library);
		    	}
	    	}
	    }    	  
	    
	    // save
	    QResourceWriter<QJob> jobWriter = resourceFactory.getResourceWriter(job, QJob.class, job.getSystem().getSystemLibrary());
	    jobWriter.save(job);
	    
	    activeJobs.put(job.getID(), job);
	    
	    return job;
	}

	@Override
	public QJob create(QJob credential) throws OperatingSystemException {
		return create(credential.getJobUser(), "*SAME");		
	}

	@Override
	public List<QJob> getActiveJobs() {
		return new ArrayList<QJob>(activeJobs.values());
	}
}
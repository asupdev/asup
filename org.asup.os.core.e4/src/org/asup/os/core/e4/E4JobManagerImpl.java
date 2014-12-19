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

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.fw.core.QContextID;
import org.asup.il.expr.QExpressionParser;
import org.asup.il.expr.QExpressionParserRegistry;
import org.asup.il.expr.QLogicalExpression;
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

	private QExpressionParser expressionParser;
	
	@Inject
	public E4JobManagerImpl(QSystemManager systemManager, QResourceFactory resourceFactory) {
		this.systemManager = (E4SystemManagerImpl) systemManager;
		this.resourceFactory = resourceFactory;
		this.activeJobs = new HashMap<String, QJob>();
	}

	@PostConstruct
	public void init(QExpressionParserRegistry expressionParserRegistry) {
		this.expressionParser = expressionParserRegistry.lookup("ASUP");
	}

	@Override
	public QJob lookup(QContextID contextID) {

		if(contextID instanceof QJob) {
			QJob job = (QJob)contextID;
			
			// not active reference
			if(job.getContext() == null)
				return activeJobs.get(contextID.getID());
			return job;
		}
		else
			return activeJobs.get(contextID.getID());
	}

	@Override
	public QJob lookup(QContextID contextID, String name, String user, int number) {

		QJob jobCaller = lookup(contextID);

		QLogicalExpression filter = (QLogicalExpression) expressionParser.parsePredicate("jobName *EQ '"+name+"' *AND jobNumber *EQ " + number + " *AND jobUser *EQ '"+user+"'");
		
		QJob jobTarget = null;

		QResourceReader<QJob> jobReader = resourceFactory.getResourceReader(jobCaller, QJob.class, jobCaller.getSystem().getSystemLibrary());
		QObjectIterator<QJob> jobs = jobReader.findByExpression(filter);

		// first element
		if(jobs.hasNext())
			jobTarget = jobs.next();

		return jobTarget;
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
		    QJobDescription jobDescription = jobDescriptionResource.lookup(userProfile.getJobDescription());
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
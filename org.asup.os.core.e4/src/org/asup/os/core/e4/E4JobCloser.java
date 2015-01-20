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

import java.util.Date;
import java.util.Iterator;

import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.QOperatingSystemCoreHelper;
import org.asup.os.core.jobs.JobStatus;
import org.asup.os.core.jobs.JobType;
import org.asup.os.core.jobs.QJob;


public class E4JobCloser extends Thread {

	private E4JobManagerImpl jobManager;
	
	public E4JobCloser(E4JobManagerImpl jobManager) {
		this.jobManager = jobManager;
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				Thread.sleep(60 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			Iterator<QJob> iterator = jobManager.getActiveJobs().iterator();
			QJob tmpJob  = null;
			while(iterator.hasNext()) {
				tmpJob = iterator.next();
				if (tmpJob.getJobStatus() == JobStatus.ACTIVE) {
					Date creationDate = tmpJob.getCreationInfo().getCreationDate();
					Date now = QOperatingSystemCoreHelper.now();
					
					long seconds = (now.getTime()-creationDate.getTime())/1000;
					
					// 1 day
					if(seconds>60*60*24) {

						try {
							jobManager.updateStatus(tmpJob, JobStatus.END);
							tmpJob.getContext().close();							
						} catch (OperatingSystemException e) {
							System.err.println(e.getMessage());
						}
					}
				}				
			}
		}		
	}	
}
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
package org.asup.os.core.base.api;

import java.io.IOException;

import javax.inject.Inject;

import org.asup.fw.core.QContextID;
import org.asup.il.data.QCharacter;
import org.asup.il.data.annotation.Command;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLog;
import org.asup.os.core.jobs.QJobLogEntry;
import org.asup.os.core.jobs.QJobLogManager;
import org.asup.os.core.jobs.QJobManager;
import org.asup.os.core.output.QObjectWriter;
import org.asup.os.core.output.QOutputManager;
import org.asup.os.data.ds.JobReference;

@Command(name = "DSPJOBLOG")
@Program(name = "QMHDSPJL")
public class JobLogDisplayer {

	@Inject
	private QOutputManager outputManager;
	
	@Inject
	private QContextID contextID;
		
	@Inject
	private QJobManager jobManager;
	
	@Inject
	private QJobLogManager jobLogManager;

	@Entry
	public void main(JobReference jobRef, QCharacter output) {

		if (jobRef == null)
			return;

		QObjectWriter objectWriter = outputManager.getObjectWriter(contextID, output.trimR());
		objectWriter.initialize();

		QJob job = jobManager.lookup(contextID);

		QJobLog jobLog = jobLogManager.lookup(job, jobRef.name.trimR(), jobRef.user.trimR(), new Integer(jobRef.number.trim()));

		if(jobLog != null) {
			for (QJobLogEntry jobLogEntry : jobLog.getEntries()) {
				try {
					objectWriter.write(jobLogEntry);
				} catch (IOException e) {
					throw new OperatingSystemRuntimeException(e);
				}
			}
		}
		objectWriter.flush();
	}
}
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

import java.util.Map;

import javax.inject.Inject;

import org.asup.il.data.QCharacter;
import org.asup.il.data.annotation.Command;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLogManager;
import org.asup.os.core.jobs.QJobManager;
import org.asup.os.type.cmd.QCallableCommand;
import org.asup.os.type.cmd.QCommandManager;
import org.asup.os.type.pgm.QCallableProgram;
import org.asup.os.type.pgm.QProgramManager;
import org.asup.os.type.pgm.QProgramStatus;

@Command(name = "SBMJOB")
@Program(name = "QWTCCSBJ")
public class JobSubmitter {

	@Inject
	private QJob job;
	@Inject
	private QJobManager jobManager;
	@Inject
	private QJobLogManager jobLogManager;
	@Inject
	private QProgramManager programManager;
	@Inject
	private QProgramStatus programStatus;
	@Inject
	private QCommandManager commandManager;

	@Entry
	public void main(@DataDef(length=20000) QCharacter command, @DataDef(length = 10) QCharacter jobName) {

		Map<String, Object> variables = null;
		QCallableProgram caller = programManager.getCaller(job, programStatus.getCallableProgram());

		if (caller != null)
			variables = null; // caller.getVariables();

		try {
			// Job spawn
			QJob childJob = jobManager.create(job);
			if (!jobName.isEmpty())
				childJob.setJobName(jobName.trimR());

			// add message to queue
			job.getMessages().add(Integer.toString(childJob.getJobNumber()));

			// Submit command
			new SubmittedCommand(childJob, command.trimR(), variables).start();

			jobLogManager.info(job, "Job submitted:" + childJob);

		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	private class SubmittedCommand extends Thread {

		private QJob qJob;
		private String commandString;
		private Map<String, Object> variables;

		protected SubmittedCommand(QJob qJob, String commandString,
				Map<String, Object> variables) {
			this.qJob = qJob;
			this.commandString = commandString;
			this.variables = variables;
		}

		@Override
		public void run() {

			try {
				// execute command
				QCallableCommand callableCommand = commandManager.prepareCommand(qJob, commandString, variables, true);
				commandManager.executeCommand(qJob, callableCommand);
			} catch (OperatingSystemException e) {
				throw new OperatingSystemRuntimeException(null, e);
			}
		}
	}
}

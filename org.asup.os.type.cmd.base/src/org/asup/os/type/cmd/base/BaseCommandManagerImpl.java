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
package org.asup.os.type.cmd.base;

import org.asup.fw.core.QContextID;
import org.asup.il.data.QData;
import org.asup.il.data.QDataContext;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.jobs.QJobLogManager;
import org.asup.os.core.jobs.QJobManager;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.type.cmd.QCallableCommand;
import org.asup.os.type.cmd.QCommandParameter;
import org.asup.os.type.cmd.impl.CommandManagerImpl;
import org.asup.os.type.pgm.QProgramManager;

public abstract class BaseCommandManagerImpl extends CommandManagerImpl {

	protected QResourceFactory resourceFactory;
	protected QJobManager jobManager;
	protected QJobLogManager jobLogManager;
	protected QProgramManager programManager;

	public BaseCommandManagerImpl(QResourceFactory resourceFactory, QJobManager jobManager, 
			QJobLogManager jobLogManager, QProgramManager programManager) {
		this.resourceFactory = resourceFactory;
		this.jobManager = jobManager;
		this.jobLogManager = jobLogManager;
		this.programManager = programManager;
	}

	@Override
	public void executeCommand(QContextID contextID,
			QCallableCommand callableCommand) throws OperatingSystemException {

		jobLogManager.info(jobManager.lookup(contextID), callableCommand.getCommandString());
		
		QDataContext dataContext = callableCommand.getDataContext();

		QData[] parameters = new QData[callableCommand.getCommand()
				.getParameters().size()];
		for (QCommandParameter commandParameter : callableCommand.getCommand()
				.getParameters()) {
			int position = commandParameter.getPosition() - 1;
			parameters[position] = dataContext.getData(dataContext.getTerms()
					.get(position));
		}

		programManager.callProgram(contextID, null, callableCommand
				.getCommand().getProgram(), parameters);
	}
}
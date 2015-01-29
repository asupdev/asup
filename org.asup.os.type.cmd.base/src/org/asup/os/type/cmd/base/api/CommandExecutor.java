/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation
 */
package org.asup.os.type.cmd.base.api;

import java.util.Map;

import javax.inject.Inject;

import org.asup.il.data.QCharacter;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.type.cmd.QCallableCommand;
import org.asup.os.type.cmd.QCommandManager;

@Program(name = "QCMDEXC")
public class CommandExecutor {

	@Inject
	private QCommandManager commandManager;
//	@Inject
//	private QProgramManager programManager;
//	@Inject
//	private QProgramStatus programStatus;
	@Inject
	private QJob job;

	public CommandExecutor() {
		super();
	}

	@Entry
	public void main(@DataDef(length = 2000) QCharacter command) {

		String commandString = command.trimR();
		Map<String, Object> programsVariables = null;

		// variable environment from caller
/*		if (commandString.contains("&")) {
			QCallableProgram caller = programManager.getCaller(job, programStatus.getCallableProgram());
			if (caller != null)
				programsVariables = null; // caller.getVariables();
		}*/
	
		try {
			
			System.out.println(commandString);
			
			QCallableCommand callableCommand = commandManager.prepareCommand(job, commandString, programsVariables, true);
			commandManager.executeCommand(job, callableCommand);
		} catch (OperatingSystemException e) {
			System.err.println("Command API error: "+command+"\t"+e.getMessage());			
		}
	}
}
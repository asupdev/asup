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
package org.asup.ui.pdm.e4.console;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.inject.Inject;

import org.asup.co.shell.QOutputWrapper;
import org.asup.fw.core.QContextID;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobManager;
import org.asup.os.type.cmd.QCallableCommand;
import org.asup.os.type.cmd.QCommandManager;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;


public class ConsoleRequestHandler {

	@Inject
	private QJobManager jobManager;
	@Inject 
	private QCommandManager commandManager;
	@Inject
	private QOutputWrapper outputWrapper;
	
	private OutputStreamWriter outputStreamWriter;
	
	private QContextID contextID;
	private QJob qJob;

	private static String LOGIN = "Please connect";
	private static String WELCOME = "------------------------------------------\n"
								  + "Welcome to the As.UP console\n"
								  + "Type your user name to login\n"
								  + "Type SIGNOFF to disconnect from console\n"
								  + "------------------------------------------\n";


	public ConsoleRequestHandler(OutputStream outputStream) {
		this.outputStreamWriter = new OutputStreamWriter(outputStream);
	}

	public void handle(String request) {

		try {
			
			// hello
			if (request.equals("HELLO")) 
				outputStreamWriter.write(WELCOME);
			
			// disconnect
			else if (request.equalsIgnoreCase("SIGNOFF") || 
					 request.equalsIgnoreCase("EXIT") ||
					 request.equalsIgnoreCase("QUIT")) {
				contextID = null;
				qJob = null;				
			}
			// handle request
			else {
				try {
					if(contextID == null) { 							
						connect(request);
						outputWrapper.register(qJob.getID(), outputStreamWriter);

						outputStreamWriter.write("\n\n");
						outputStreamWriter.write("User logged\n");
						printEObject((EObject) qJob);
						outputStreamWriter.write("\n");
					}
					else {	
						executeCommand(request, outputStreamWriter);
					}
				}
				catch (Exception e) {
					outputStreamWriter.write(e.toString()+"\n");
				}
			}

			if(qJob == null)
				outputStreamWriter.write(LOGIN);
			
			outputStreamWriter.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void connect(String command) throws OperatingSystemException {
		// retrieve user
		String user = command;

		// connect
		contextID = jobManager.create(user, null);
		qJob = jobManager.lookup(contextID);		
	}
	
	private void executeCommand(final String command, final OutputStreamWriter outputStreamWriter) throws OperatingSystemException {

		if (command == null || command.trim().length() == 0) 
			return;

		Job job = new Job(command) {
			
		      @Override
		      protected IStatus run(IProgressMonitor monitor) {

					try {
						
						outputStreamWriter.write("\nCommand execution: "+command);
						outputStreamWriter.write("\n");
						outputStreamWriter.write("\n");
						outputStreamWriter.flush();						
						long timeIni = System.currentTimeMillis();

						QCallableCommand callableCommand = commandManager.prepareCommand(contextID, command, null);
			    		commandManager.executeCommand(contextID, callableCommand);			    		
						
			    		long timeEnd = System.currentTimeMillis();						
						outputStreamWriter.write("\n");
						outputStreamWriter.write("Execution info: "+"elapsed time(ms): "+(timeEnd-timeIni));
						outputStreamWriter.write("\n");						
						outputStreamWriter.flush();
						
					} catch (OperatingSystemException | IOException e) {
						e.printStackTrace();
//						jobLogManager.error(qJob, e.getMessage());
					}

		        return Status.OK_STATUS;
		      }

		    };
		    job.setUser(true);
		    job.schedule();
	}
	

	private void printEObject(EObject eObject) {
		
		EClass eClass = eObject.eClass();
		
		for(EStructuralFeature feature: eClass.getEStructuralFeatures()) {
			try {
				outputStreamWriter.write(feature.getName()+": "+eObject.eGet(feature)+"\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
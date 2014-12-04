/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Dario Foresti - Initial API and implementation 
 */
package org.asup.co.shell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.inject.Inject;

import org.asup.fw.core.QContextID;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobManager;
import org.asup.os.type.cmd.QCallableCommand;
import org.asup.os.type.cmd.QCommandManager;


public class ShellSocketHandler extends Thread {

	@Inject
	private QJobManager jobManager;
	@Inject 
	private QCommandManager commandManager;
	@Inject 
	private QOutputWrapper outputWrapper;
	
	private Socket socket;
	private QContextID contextID;
	private QJob qJob;

	private static String WELCOME = "------------------------------------------\n"
								  + "Welcome to the As.UP console\n\n"
								  + "Type your user name to login\n\n"
								  + "Type SIGNOFF to disconnect from console\n"
								  + "------------------------------------------\n";

	private static String LOGIN = "login> ";

	public ShellSocketHandler(Socket socket) {
		super();
		this.socket = socket;
	}

	public void run() {

		try {
			
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.socket.getOutputStream());
			outputStreamWriter.write(WELCOME);
			outputStreamWriter.write(LOGIN);
			outputStreamWriter.flush();

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));

			while (true) {
			
				String request = bufferedReader.readLine();

				// hello
				if (request.equals("HELLO")) 
					outputStreamWriter.write(WELCOME);
				
				// disconnect
				else if (request.equalsIgnoreCase("SIGNOFF") || 
						 request.equalsIgnoreCase("EXIT") ||
						 request.equalsIgnoreCase("QUIT")) 
					break;					
				// handle request
				else {
					try {
						if(contextID == null) { 							
							connect(request);
							outputWrapper.register(qJob.getID(), outputStreamWriter);
						}
						else
							executeCommand(request);
					}
					catch (Exception e) {
						if(e.getCause() == null)
							outputStreamWriter.write(e.getMessage()+"\n");
						else 
							outputStreamWriter.write(e.getCause().getMessage()+"\n");
					}
				}

				if(qJob != null)
					outputStreamWriter.write(qJob.getJobUser().toLowerCase()+"@"+qJob.getSystem().getName().toLowerCase()+">");
				else
					outputStreamWriter.write(LOGIN);
				
				outputStreamWriter.flush();
			}

			bufferedReader.close();
			this.socket.close();

		} catch (Exception e) {
			e.printStackTrace();
			try {
				this.socket.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	private void connect(String command) throws OperatingSystemException {
		// retrieve user
		String user = command;

		// connect
		contextID = jobManager.create(user, null);
		qJob = jobManager.lookup(contextID);		
	}
	
	private void executeCommand(String command) throws OperatingSystemException {

		if (command == null || command.trim().length() == 0) 
			return;

		QCallableCommand callableCommand = commandManager.prepareCommand(contextID, command, null, true);
		commandManager.executeCommand(contextID, callableCommand);

	}
}
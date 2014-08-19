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

import java.io.IOException;

import javax.inject.Inject;

import org.asup.il.data.annotation.Command;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.output.QObjectWriter;
import org.asup.os.core.output.QOutputManager;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.data.ds.TypedReference;
import org.asup.os.type.cmd.QCommand;
import org.asup.os.type.cmd.QCommandParameter;

@Command(name = "DSPCMDPAR")
@Program(name = "QASDSPCP")
public class CommandParameterDisplayer {

	@Inject
	private QOutputManager outputManager;
	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QJob job;

	@Entry
	public void main(TypedReference<QCommand> command) {

		QResourceReader<QCommand> commandReader = null;
		Scope scope = Scope.get(command.library.trimR());
		if (scope != null)
			commandReader = resourceFactory.getResourceReader(job, QCommand.class, scope);
		else
			commandReader = resourceFactory.getResourceReader(job, QCommand.class, command.library.trimR());

		QCommand qCommand = commandReader.lookup(command.name.trimR());
		if (qCommand == null)
			throw new OperatingSystemRuntimeException("Command not found: " + command.name.trimR());

		QObjectWriter qObjectWriter = outputManager.getDefaultWriter(job);
		qObjectWriter.initialize();

		for (QCommandParameter qCommandParameter : qCommand.getParameters()) {
			try {
				qObjectWriter.write(qCommandParameter);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		qObjectWriter.flush();
	}
}

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

import javax.inject.Inject;

import org.asup.il.data.QCharacter;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLogManager;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.data.ds.TypedReference;
import org.asup.os.type.cmd.QCallableCommand;
import org.asup.os.type.cmd.QCommandManager;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QFileMember;
import org.asup.os.type.file.QFileMemberManager;
import org.asup.os.type.file.QFileMemberRow;
import org.asup.os.type.file.QFileMembered;

@Program(name = "QASRUNMB")
public class FileMemberRunner {

	@Inject private QResourceFactory resourceFactory;
	@Inject private QCommandManager commandManager;
	@Inject private QJobLogManager jobLogManager;
	@Inject private QFileMemberManager fileMemberManager;
	@Inject private QJob job;
	
	@Entry
	public void main(TypedReference<QFile> file, @DataDef(length=10) QCharacter member) {

		QResourceReader<QFile> fileReader = resourceFactory.getResourceReader(job, QFile.class, file.library.trimR());			
		QFile qFile = fileReader.lookup(file.name.trimR());
		
		if (qFile == null) 
			throw new OperatingSystemRuntimeException("File not found: "+file);

		if(!(qFile instanceof QFileMembered))
			throw new OperatingSystemRuntimeException("Invalid file: "+file);
		
		QFileMembered fileMembered = (QFileMembered)qFile;

		QFileMember fileMember = fileMemberManager.lookup(job, file.library.trimR(), fileMembered, member.trimR()+".XMI");
		if (fileMember == null) 
			throw new OperatingSystemRuntimeException("File membe not found: "+file+"/"+member);

		for(QFileMemberRow fileMemberRow: fileMember.getRows()) {
			String line = fileMemberRow.getContent();
			if(line.trim().isEmpty())
				continue;

			try {					
				QCallableCommand command = commandManager.prepareCommand(job, line.trim(), null, true);
				commandManager.executeCommand(job, command);				
			}
			catch(Exception e) {
				jobLogManager.error(job, e.getMessage());
			}
		}		
	}
}
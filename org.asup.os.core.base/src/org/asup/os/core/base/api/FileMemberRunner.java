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
import org.asup.il.data.QDataStructWrapper;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLogManager;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
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
	
	public @Entry void main(@DataDef(qualified = true) SourceFile sourceFile,
							@DataDef(length = 10) QCharacter sourceMember) {
		
		QResourceReader<QFile> fileReader = null;
		
		switch (sourceFile.library.asEnum()) {
		case CURLIB:
			fileReader = resourceFactory.getResourceReader(job, QFile.class, Scope.CURRENT_LIBRARY);
			break;
		case LIBL:
			fileReader = resourceFactory.getResourceReader(job, QFile.class, Scope.LIBRARY_LIST);
			break;
		case OTHER:
			fileReader = resourceFactory.getResourceReader(job, QFile.class, sourceFile.library.asData().trimR());	
			break;
		}
		
		QFile qFile = fileReader.lookup(sourceFile.name.trimR());
		
		if (qFile == null) 
			throw new OperatingSystemRuntimeException("File not found: "+sourceFile);

		if(!(qFile instanceof QFileMembered))
			throw new OperatingSystemRuntimeException("Invalid file: "+sourceFile);
		
		QFileMembered fileMembered = (QFileMembered)qFile;

		QFileMember fileMember = fileMemberManager.lookup(job, sourceFile.library.asData().trimR(), fileMembered, sourceMember.trimR()+".XMI");
		if (fileMember == null) 
			throw new OperatingSystemRuntimeException("File membe not found: "+sourceFile+"/"+sourceMember);

		for(QFileMemberRow fileMemberRow: fileMember.getRows()) {
			String line = fileMemberRow.getContent();

			if(line.trim().isEmpty())
				continue;
			
			if(line.trim().startsWith("//"))
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

	public static class SourceFile extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}
}
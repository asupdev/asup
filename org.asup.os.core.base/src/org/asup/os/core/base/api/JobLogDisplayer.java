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
import org.asup.fw.core.annotation.ToDo;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructWrapper;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLog;
import org.asup.os.core.jobs.QJobLogEntry;
import org.asup.os.core.jobs.QJobLogManager;
import org.asup.os.core.jobs.QJobManager;
import org.asup.os.core.output.QObjectWriter;
import org.asup.os.core.output.QOutputManager;

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
	public void main(
			@ToDo @DataDef(qualified = true) JobName jobName,
			@ToDo @DataDef(length = 1) QEnum<OutputEnum, QCharacter> output,
			@ToDo @DataDef(qualified = true) FileToReceiveOutput fileToReceiveOutput,
			@ToDo OutputMemberOptions outputMemberOptions) {

		// TODO
		switch (output.asEnum()) {
		case APIDFN:
			break;
		case OUTFILE:
			break;
		case PRINT:
			break;
		case TERM_STAR:
			break;
		}
		
		QObjectWriter objectWriter = outputManager.getObjectWriter(contextID, output.asData().trimR());
		objectWriter.initialize();

		QJob job = jobManager.lookup(contextID);

		QJobLog jobLog = null;
		switch (jobName.name.asEnum()) {
		case TERM_STAR:
			jobLog = jobLogManager.lookup(job);
			break;
		case OTHER:
			jobLog = jobLogManager.lookup(job, jobName.name.asData().trimR(), jobName.user.trimR(), new Integer(jobName.number.trim()));
			break;
		}
				
		if (jobLog != null) {
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

	public static class JobName extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NameEnum, QCharacter> name;
		@DataDef(length = 10)
		public QCharacter user;
		@DataDef(length = 6)
		public QCharacter number;

		public static enum NameEnum {
			@Special(value = "*")
			TERM_STAR, OTHER
		}
	}

	public static enum OutputEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "L")
		PRINT, @Special(value = "M")
		APIDFN, @Special(value = "N")
		OUTFILE
	}

	public static class FileToReceiveOutput extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static class OutputMemberOptions extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10, value = "*FIRST")
		public QEnum<MemberToReceiveOutputEnum, QCharacter> memberToReceiveOutput;
		@DataDef(length = 7, value = "*REPLACE")
		public QEnum<ReplaceOrAddRecordsEnum, QCharacter> replaceOrAddRecords;

		public static enum MemberToReceiveOutputEnum {
			FIRST, OTHER
		}

		public static enum ReplaceOrAddRecordsEnum {
			@Special(value = "REPLACE")
			REPLACE, @Special(value = "ADD")
			ADD
		}
	}

}
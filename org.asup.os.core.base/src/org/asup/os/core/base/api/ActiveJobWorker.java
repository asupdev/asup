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

import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QDecimal;
import org.asup.il.data.QEnum;
import org.asup.il.data.QScroller;
import org.asup.il.data.annotation.Command;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobManager;
import org.asup.os.core.output.QObjectWriter;
import org.asup.os.core.output.QOutputManager;

@Command(name = "WRKACTJOB")
@Program(name = "QWCCDSAC")
public class ActiveJobWorker {

	@Inject
	private QOutputManager outputManager;
	@Inject
	private QJob job;
	@Inject
	private QJobManager jobManager;
	
	public @Entry void main(
			@DataDef(length = 1) QEnum<Output, QCharacter> output,
			@DataDef(length = 1) QEnum<ResetStatusStatistics, QCharacter> resetStatusStatistics,
			@DataDef(occurrences = "25", length = 10) QScroller<QEnum<Subsystem, QCharacter>> subsystem,
			@DataDef(precision = 3, scale = 1) QEnum<CPUPercentLimit, QDecimal> cPUPercentLimit,
			@DataDef(precision = 4, scale = 1) QEnum<ResponseTimeLimit, QDecimal> responseTimeLimit,
			QEnum<Sequence, QBinary> sequence,
			@DataDef(qualified = true) JobName jobName,
			@DataDef(precision = 3) QEnum<AutomaticRefreshInterval, QDecimal> automaticRefreshInterval) {
	
		
		QObjectWriter objectWriter = outputManager.getObjectWriter(job, output.asData().trimR());
		objectWriter.initialize();
		
		for (QJob qJob : jobManager.getActiveJobs()) {
			try {
				objectWriter.write(qJob);
			} catch (IOException e) {
				throw new OperatingSystemRuntimeException(e);
			}
		}

		objectWriter.flush();

	}


	public static enum Output {
		@Special(value = "*")
		TERM_STAR, @Special(value = "L")
		PRINT
	}

	public static enum ResetStatusStatistics {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum Subsystem {
		@Special(value = "*ALL")
		ALL, OTHER
	}

	public static enum CPUPercentLimit {
		@Special(value = "-1.0")
		NONE, OTHER
	}

	public static enum ResponseTimeLimit {
		@Special(value = "-1.0")
		NONE, OTHER
	}

	public static enum Sequence {
		@Special(value = "1")
		SBS, @Special(value = "9")
		AUXIO, @Special(value = "6")
		CPU, @Special(value = "10")
		CPUPCT, @Special(value = "16")
		CURUSR, @Special(value = "11")
		FUNCTION, @Special(value = "7")
		INT, @Special(value = "2")
		JOB, @Special(value = "14")
		NUMBER, @Special(value = "4")
		POOL, @Special(value = "5")
		PTY, @Special(value = "8")
		RSP, @Special(value = "12")
		STS, @Special(value = "15")
		THREADS, @Special(value = "3")
		TYPE, @Special(value = "13")
		USER
	}

	public static class JobName extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10, value = "*ALL")
		public QEnum<NameGeneric, QCharacter> nameGeneric;

		public static enum NameGeneric {
			@Special(value = "*ALL")
			ALL, @Special(value = "*SYS")
			SYS, @Special(value = "*SBS")
			SBS, OTHER
		}
	}

	public static enum AutomaticRefreshInterval {
		@Special(value = "-1")
		PRV, OTHER
	}

}
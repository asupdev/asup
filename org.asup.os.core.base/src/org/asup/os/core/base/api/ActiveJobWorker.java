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

import org.asup.fw.core.annotation.ToDo;
import org.asup.il.data.BinaryType;
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructWrapper;
import org.asup.il.data.QDecimal;
import org.asup.il.data.QEnum;
import org.asup.il.data.QScroller;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobManager;
import org.asup.os.core.output.QObjectWriter;
import org.asup.os.core.output.QOutputManager;

@Program(name = "QWCCDSAC")
public class ActiveJobWorker {

	@Inject
	private QOutputManager outputManager;
	@Inject
	private QJob job;
	@Inject
	private QJobManager jobManager;
	
	public @Entry void main(
			@ToDo @DataDef(length = 1) QEnum<OutputEnum, QCharacter> output,
			@ToDo @DataDef(length = 1) QEnum<ResetStatusStatisticsEnum, QCharacter> resetStatusStatistics,
			@ToDo @DataDef(dimension = 25, length = 10) QEnum<SubsystemEnum, QScroller<QCharacter>> subsystem,
			@ToDo @DataDef(precision = 3, scale = 1) QEnum<CPUPercentLimitEnum, QDecimal> cPUPercentLimit,
			@ToDo @DataDef(precision = 4, scale = 1) QEnum<ResponseTimeLimitEnum, QDecimal> responseTimeLimit,
			@ToDo @DataDef(binaryType = BinaryType.SHORT) QEnum<SequenceEnum, QBinary> sequence,
			@ToDo @DataDef(qualified = true) JobName jobName,
			@ToDo @DataDef(precision = 3) QEnum<AutomaticRefreshIntervalEnum, QDecimal> automaticRefreshInterval) {
	
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

	public static enum OutputEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "L")
		PRINT
	}

	public static enum ResetStatusStatisticsEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum SubsystemEnum {
		ALL, OTHER
	}

	public static enum CPUPercentLimitEnum {
		@Special(value = "-1.0")
		NONE, OTHER
	}

	public static enum ResponseTimeLimitEnum {
		@Special(value = "-1.0")
		NONE, OTHER
	}

	public static enum SequenceEnum {
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

	public static class JobName extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10, value = "*ALL")
		public QEnum<NameGenericEnum, QCharacter> nameGeneric;

		public static enum NameGenericEnum {
			ALL, SYS, SBS, OTHER
		}
	}

	public static enum AutomaticRefreshIntervalEnum {
		@Special(value = "-1")
		PRV, OTHER
	}
}
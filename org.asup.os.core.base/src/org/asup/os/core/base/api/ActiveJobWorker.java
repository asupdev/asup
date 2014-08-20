/**
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
	
	public @Entry
	void main(
			@DataDef(length = 1) QCharacter output,
			@DataDef(length = 1) QCharacter resetStatusStatistics,
			@DataDef(occurrences = "25", length = 10) QScroller<QCharacter> subsystem,
			@DataDef(precision = 3, scale = 1) QDecimal cPUPercentLimit,
			@DataDef(precision = 4, scale = 1) QDecimal responseTimeLimit,
			QBinary sequence,
			@DataDef(qualified = true) JobName jobName,
			@DataDef(precision = 3) QDecimal automaticRefreshInterval) {
	
		
		QObjectWriter objectWriter = outputManager.getObjectWriter(job, output.trimR());
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
		PRINT, MISSING
	}

	public static enum ResetStatusStatistics {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES, MISSING
	}

	public static enum Subsystem {
		@Special(value = "*ALL")
		ALL
	}

	public static enum CPUPercentLimit {
		@Special(value = "-1.0")
		NONE
	}

	public static enum ResponseTimeLimit {
		@Special(value = "-1.0")
		NONE
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
		USER, MISSING
	}

	public static class JobName extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NameGeneric, QCharacter> nameGeneric;

		public static enum NameGeneric {
			@Special(value = "*ALL")
			ALL, @Special(value = "*SYS")
			SYS, @Special(value = "*SBS")
			SBS
		}
	}

	public static enum AutomaticRefreshInterval {
		@Special(value = "-1")
		PRV
	}
}
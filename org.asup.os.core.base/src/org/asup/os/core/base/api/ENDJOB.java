package org.asup.os.core.base.api;

import org.asup.fw.core.annotation.ToDo;
import org.asup.il.data.BinaryType;
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructureHandler;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;

public @ToDo @Program(name = "ENDJOB") class ENDJOB {
	public @Entry void main(
			@ToDo @DataDef(qualified = true) JobName jobName,
			@ToDo @DataDef(length = 1) QEnum<HowToEndEnum, QCharacter> howToEnd,
			@ToDo @DataDef(binaryType = BinaryType.INTEGER) QBinary controlledEndDelayTime,
			@ToDo @DataDef(length = 1) QEnum<DeleteSpooledFilesEnum, QCharacter> deleteSpooledFiles,
			@ToDo @DataDef(binaryType = BinaryType.INTEGER) QEnum<MaximumLogEntriesEnum, QBinary> maximumLogEntries,
			@ToDo @DataDef(length = 7) QEnum<AdditionalInteractiveJobsEnum, QCharacter> additionalInteractiveJobs,
			@ToDo @DataDef(length = 10) QEnum<DuplicateJobOptionEnum, QCharacter> duplicateJobOption) {
	}

	public static class JobName extends QDataStructureHandler {
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

	public static enum HowToEndEnum {
		@Special(value = "C")
		CNTRLD, @Special(value = "I")
		IMMED
	}

	public static enum DeleteSpooledFilesEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum MaximumLogEntriesEnum {
		@Special(value = "-2")
		SAME, @Special(value = "-1")
		NOMAX, OTHER
	}

	public static enum AdditionalInteractiveJobsEnum {
		@Special(value = "NON")
		NONE, @Special(value = "GRP")
		GRPJOB, @Special(value = "ALL")
		ALL
	}

	public static enum DuplicateJobOptionEnum {
		SELECT, MSG
	}
}

package org.asup.os.type.jobd.base.api;

import javax.inject.Inject;

import org.asup.fw.core.annotation.Supported;
import org.asup.il.data.BinaryType;
import org.asup.il.data.DatetimeType;
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructWrapper;
import org.asup.il.data.QDatetime;
import org.asup.il.data.QEnum;
import org.asup.il.data.QScroller;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLogManager;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.QTypedObject;
import org.asup.os.type.QTypedReference;
import org.asup.os.type.impl.OperatingSystemTypeFactoryImpl;
import org.asup.os.type.jobd.QJobDescription;
import org.asup.os.type.jobd.QJobDescriptionManager;
import org.asup.os.core.Scope;


@Supported
@Program(name = "QWDCCHG")
public  class JobDescriptionChanger {

	@Inject
	private QJobDescriptionManager jobDescriptionManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;

	public @Entry void main(
			@Supported @DataDef(qualified = true) JobDescription jobDescription,
			@Supported @DataDef(qualified = true) QEnum<JobQueueEnum, JobQueue> jobQueue,
			@Supported @DataDef(length = 1) QEnum<JobPriorityonJOBQEnum, QCharacter> jobPriorityonJOBQ,
			@Supported @DataDef(length = 1) QEnum<OutputPriorityonOUTQEnum, QCharacter> outputPriorityonOUTQ,
			@DataDef(length = 10) QEnum<PrintDeviceEnum, QCharacter> printDevice,
			@DataDef(qualified = true) QEnum<OutputQueueEnum, OutputQueue> outputQueue,
			@Supported @DataDef(length = 50) QEnum<TextDescriptionEnum, QCharacter> textDescription,
			@Supported @DataDef(length = 10) QEnum<UserEnum, QCharacter> user,
			@DataDef(length = 15) QEnum<AccountingCodeEnum, QCharacter> accountingCode,
			@DataDef(length = 30) QEnum<PrintTextEnum, QCharacter> printText,
			@DataDef(length = 80) QEnum<RoutingDataEnum, QCharacter> routingData,
			@DataDef(length = 256) QEnum<RequestDataOrCommandEnum, QCharacter> requestDataOrCommand,
			@Supported @DataDef(dimension = 250, length = 10) QEnum<InitialLibraryListEnum, QScroller<QCharacter>> initialLibraryList,
			@DataDef(length = 10) QEnum<InitialASPGroupEnum, QCharacter> initialASPGroup,
			MessageLogging messageLogging,
			@DataDef(length = 1) QEnum<LogCLProgramCommandsEnum, QCharacter> logCLProgramCommands,
			@DataDef(length = 10) QEnum<JobLogOutputEnum, QCharacter> jobLogOutput,
			@DataDef(binaryType = BinaryType.SHORT) QEnum<JobMessageQueueMaximumSizeEnum, QBinary> jobMessageQueueMaximumSize,
			@DataDef(length = 10) QEnum<JobMessageQueueFullActionEnum, QCharacter> jobMessageQueueFullAction,
			@DataDef(binaryType = BinaryType.SHORT) QEnum<CLSyntaxCheckEnum, QBinary> cLSyntaxCheck,
			@DataDef(binaryType = BinaryType.SHORT) QEnum<EndSeverityEnum, QBinary> endSeverity,
			@DataDef(length = 1) QEnum<InquiryMessageReplyEnum, QCharacter> inquiryMessageReply,
			@DataDef(length = 1) QEnum<HoldOnJobQueueEnum, QCharacter> holdOnJobQueue,
			@DataDef(datetimeType = DatetimeType.DATE) QEnum<JobDateEnum, QDatetime> jobDate,
			@DataDef(length = 8) QEnum<JobSwitchesEnum, QCharacter> jobSwitches,
			@DataDef(length = 13) QEnum<DeviceRecoveryActionEnum, QCharacter> deviceRecoveryAction,
			@DataDef(length = 10) QEnum<TimeSliceEndPoolEnum, QCharacter> timeSliceEndPool,
			@DataDef(length = 1) QEnum<AllowMultipleThreadsEnum, QCharacter> allowMultipleThreads,
			@DataDef(length = 10) QEnum<SpooledFileActionEnum, QCharacter> spooledFileAction,
			@DataDef(length = 10) QEnum<DDMConversationEnum, QCharacter> dDMConversation) {

		QResourceWriter<QJobDescription> resource = null;
		
		String library = null;
		switch (jobDescription.library.asEnum()) {
		case LIBL:
			resource = jobDescriptionManager.getResourceWriter(job, Scope.LIBRARY_LIST);
			break;
		case CURLIB:
			resource = jobDescriptionManager.getResourceWriter(job, Scope.CURRENT_LIBRARY);
			break;
		case OTHER:
			library = jobDescription.library.asData().trimR();
			resource = jobDescriptionManager.getResourceWriter(job, library);
			break;
		}

		QJobDescription qJobDescription = resource.lookup(jobDescription.name.trimR());
		if (qJobDescription == null)
			throw new OperatingSystemRuntimeException("Job Description " + jobDescription.name + " not exists in library " + library);

		// TEXT
		switch (textDescription.asEnum()) {
		case SAME:
			break;
		case BLANK:
			qJobDescription.setText(textDescription.getSpecialName());
			break;
		case OTHER:
			qJobDescription.setText(textDescription.asData().trimR());
			break;
		}

		// JOBQ
		QTypedReference<?> refJobQueue = null;
		switch (jobQueue.asEnum()) {
		case SAME:
			refJobQueue = qJobDescription.getJobQueue();
			break;
		case OTHER:
			
			refJobQueue = OperatingSystemTypeFactoryImpl.eINSTANCE.createTypedReference();
			refJobQueue.setName(jobQueue.asData().name.trimR());
			switch (jobQueue.asData().library.asEnum()) {
			case LIBL:
			case CURLIB:
				refJobQueue.setLibrary(jobQueue.asData().library.getSpecialName());
				break;
			case OTHER:
				refJobQueue.setLibrary(jobQueue.asData().library.asData().trimR());
				break;
			}
			break;
		}
		qJobDescription.setJobQueue(refJobQueue);
		
		// JOBPTY
		switch (jobPriorityonJOBQ.asEnum()) {
		case SAME:
			break;
		case OTHER:
			qJobDescription.setJobPriorityOnJobq(jobPriorityonJOBQ.asData().trimR());
			break;
		}

		// OUTPTY
		switch (outputPriorityonOUTQ.asEnum()) {
		case SAME:
			break;
		case OTHER:
			qJobDescription.setOutputPriorityOnOutq(outputPriorityonOUTQ.asData().trimR());
			break;
		}

		// OUTQ
		QTypedReference<QTypedObject> refOutQueue = null;
		switch (outputQueue.asEnum()) {
		case SAME:
			break;
		case DEV:
		case WRKSTN:
		case USRPRF:
			refOutQueue = OperatingSystemTypeFactoryImpl.eINSTANCE.createTypedReference();
			refOutQueue.setName(outputQueue.getSpecialName());
			break;
		case OTHER:

			refOutQueue = OperatingSystemTypeFactoryImpl.eINSTANCE.createTypedReference();
			refOutQueue.setName(outputQueue.asData().name.trimR());
			switch (outputQueue.asData().library.asEnum()) {
			case LIBL:
			case CURLIB:
				refOutQueue.setLibrary(outputQueue.asData().library.getSpecialName());
				break;
			case OTHER:
				refOutQueue.setLibrary(outputQueue.asData().library.asData().trimR());
				break;
			}
			qJobDescription.setOutQueue(refOutQueue);
			break;
		}

		// USER
		switch (user.asEnum()) {
		case SAME:
			break;
		case RQD:
			qJobDescription.setUser(user.getSpecialName());
			break;
		case OTHER:
			qJobDescription.setUser(user.asData().trimR());
			break;
		}

		// INLLIBL
		switch (initialLibraryList.asEnum()) {
		case NONE:
			qJobDescription.getLibraries().clear();
			break;
		case SAME:
			break;
		case SYSVAL:
			// TODO
			break;
		case OTHER:
			qJobDescription.getLibraries().clear();
			for (QCharacter initialLibrary : initialLibraryList.asData()) {
				if (initialLibrary.trimR().isEmpty())
					continue;

				qJobDescription.getLibraries().add(initialLibrary.trimR());
			}
			break;			
		}

		try {
			resource.save(qJobDescription, true);
			jobLogManager.info(job, "Job Description " + jobDescription.name.trimR() + " changed");
		} 
		catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	public static class JobDescription extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static class JobQueue extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum JobQueueEnum {
		SAME, OTHER
	}

	public static enum JobPriorityonJOBQEnum {
		@Special(value = "*")
		SAME, OTHER
	}

	public static enum OutputPriorityonOUTQEnum {
		@Special(value = "*")
		SAME, OTHER
	}

	public static enum PrintDeviceEnum {
		SAME, @Special(value = "X'40404040404040404040'")
		USRPRF, SYSVAL, WRKSTN, OTHER
	}

	public static class OutputQueue extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum OutputQueueEnum {
		SAME, USRPRF, DEV, WRKSTN, OTHER
	}

	public static enum TextDescriptionEnum {
		SAME, @Special(value = "")
		BLANK, OTHER
	}

	public static enum UserEnum {
		SAME, RQD, OTHER
	}

	public static enum AccountingCodeEnum {
		SAME, USRPRF, @Special(value = "X'404040404040404040404040404040'")
		BLANK, OTHER
	}

	public static enum PrintTextEnum {
		SAME, SYSVAL, BLANK, OTHER
	}

	public static enum RoutingDataEnum {
		SAME, RQSDTA, OTHER
	}

	public static enum RequestDataOrCommandEnum {
		SAME, NONE, RTGDTA, OTHER
	}

	public static enum InitialLibraryListEnum {
		SAME, SYSVAL, NONE, OTHER
	}

	public static enum InitialASPGroupEnum {
		SAME, NONE, OTHER
	}

	public static class MessageLogging extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1, value = "*SAME")
		public QEnum<LevelEnum, QCharacter> level;
		@DataDef(binaryType = BinaryType.SHORT, value = "*SAME")
		public QEnum<SeverityEnum, QBinary> severity;
		@DataDef(length = 1, value = "*SAME")
		public QEnum<TextEnum, QCharacter> text;

		public static enum LevelEnum {
			@Special(value = "*")
			SAME, OTHER
		}

		public static enum SeverityEnum {
			@Special(value = "-2")
			SAME, OTHER
		}

		public static enum TextEnum {
			@Special(value = "*")
			SAME, @Special(value = "M")
			MSG, @Special(value = "S")
			SECLVL, @Special(value = "N")
			NOLIST
		}
	}

	public static enum LogCLProgramCommandsEnum {
		@Special(value = "*")
		SAME, @Special(value = "X'40'")
		NO, @Special(value = "Y")
		YES
	}

	public static enum JobLogOutputEnum {
		SAME, SYSVAL, JOBLOGSVR, JOBEND, PND
	}

	public static enum JobMessageQueueMaximumSizeEnum {
		@Special(value = "-2")
		SAME, @Special(value = "0")
		SYSVAL, OTHER
	}

	public static enum JobMessageQueueFullActionEnum {
		@Special(value = "*")
		SAME, @Special(value = "")
		SYSVAL, @Special(value = "N")
		NOWRAP, @Special(value = "W")
		WRAP, @Special(value = "P")
		PRTWRAP
	}

	public static enum CLSyntaxCheckEnum {
		@Special(value = "-2")
		SAME, @Special(value = "-1")
		NOCHK, OTHER
	}

	public static enum EndSeverityEnum {
		@Special(value = "-2")
		SAME, OTHER
	}

	public static enum InquiryMessageReplyEnum {
		@Special(value = "*")
		SAME, @Special(value = "X'00'")
		RQD, @Special(value = "X'01'")
		DFT, @Special(value = "X'02'")
		SYSRPYL
	}

	public static enum HoldOnJobQueueEnum {
		@Special(value = "*")
		SAME, @Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum JobDateEnum {
		@Special(value = "0000000")
		SAME, @Special(value = "0010000")
		SYSVAL, OTHER
	}

	public static enum JobSwitchesEnum {
		SAME, OTHER
	}

	public static enum DeviceRecoveryActionEnum {
		SAME, SYSVAL, MSG, DSCMSG, DSCENDRQS, ENDJOB, ENDJOBNOLIST
	}

	public static enum TimeSliceEndPoolEnum {
		SAME, SYSVAL, NONE, BASE
	}

	public static enum AllowMultipleThreadsEnum {
		@Special(value = "*")
		SAME, @Special(value = "X'00'")
		NO, @Special(value = "X'01'")
		YES
	}

	public static enum SpooledFileActionEnum {
		SAME, SYSVAL, KEEP, DETACH
	}

	public static enum DDMConversationEnum {
		SAME, KEEP, DROP
	}
}

package org.asup.os.type.jobd.base.api;

import javax.inject.Inject;

import org.asup.il.data.BinaryType;
import org.asup.il.data.DatetimeType;
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QDatetime;
import org.asup.il.data.QEnum;
import org.asup.il.data.QScroller;
import org.asup.il.data.annotation.Command;
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

@Command(name = "CHGJOBD")
@Program(name = "QWDCCHG", messages = {"CPF1618","CPF1625","CPF9872"})
public class JobDescriptionChanger {

	@Inject
	private QJobDescriptionManager jobDescriptionManager;
	@Inject
	private QJob job;
	@Inject 
	private QJobLogManager jobLogManager;
	public @Entry void main(
			@DataDef(qualified = true) JobDescription jobDescription,
			@DataDef(qualified = true) QEnum<JobQueueEnum, JobQueue> jobQueue,
			@DataDef(length = 1) QEnum<JobPriorityonJOBQEnum, QCharacter> jobPriorityonJOBQ,
			@DataDef(length = 1) QEnum<OutputPriorityonOUTQEnum, QCharacter> outputPriorityonOUTQ,
			@DataDef(length = 10) QEnum<PrintDeviceEnum, QCharacter> printDevice,
			@DataDef(qualified = true) QEnum<OutputQueueEnum, OutputQueue> outputQueue,
			@DataDef(length = 50) QEnum<TextDescriptionEnum, QCharacter> textDescription,
			@DataDef(length = 10) QEnum<UserEnum, QCharacter> user,
			@DataDef(length = 15) QEnum<AccountingCodeEnum, QCharacter> accountingCode,
			@DataDef(length = 30) QEnum<PrintTextEnum, QCharacter> printText,
			@DataDef(length = 80) QEnum<RoutingDataEnum, QCharacter> routingData,
			@DataDef(length = 256) QEnum<RequestDataOrCommandEnum, QCharacter> requestDataOrCommand,
			@DataDef(occurrences = "250", length = 10) QEnum<InitialLibraryListEnum, QScroller<QCharacter>> initialLibraryList,
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
		

		String library = jobDescription.library.asData().trimR();
		switch (jobDescription.library.asEnum()) {
		case LIBL:
		case CURLIB:
			library = jobDescription.library.getSpecialName();
			break;
		case OTHER:
			library = jobDescription.library.asData().trimR();
			break;
		}

		String name = jobDescription.name.trimR();
		try {
			QResourceWriter<QJobDescription> resource = jobDescriptionManager.getResourceWriter(job, library);
			QJobDescription qJobDescription = resource.lookup(name);	
			if (qJobDescription == null)
				throw new OperatingSystemException("Job Description " + name+ " not exists in library " + library);
				
			switch (textDescription.asEnum()) {
			case SAME:
				break;
			case BLANK:
				qJobDescription.setText("");
				break;
			case OTHER:
				qJobDescription.setText(textDescription.asData().trimR());
				break;
			}
			
			switch (jobQueue.asEnum()) {
			case SAME:
				break;
			case OTHER:
				if (!jobQueue.asData().name.isEmpty()) {
					QTypedReference<QTypedObject> refJobQueue = null;
					refJobQueue = OperatingSystemTypeFactoryImpl.eINSTANCE.createTypedReference();
					refJobQueue.setName(jobQueue.asData().name.trimR());
					switch (jobQueue.asData().library.asEnum()) {
					case LIBL:
						refJobQueue.setLibrary(jobQueue.asData().library.getSpecialName());
						break;
					case CURLIB:
						refJobQueue.setLibrary(jobQueue.asData().library.getSpecialName());
						break;
					case OTHER:
						refJobQueue.setLibrary(jobQueue.asData().library.asData().trimR());
						break;
					}
					qJobDescription.setJobQueue(refJobQueue);
				}
				break;
			}
			switch (jobPriorityonJOBQ.asEnum()) {
			case SAME:
				break;
			case OTHER:
				qJobDescription.setJobPriorityOnJobq(jobPriorityonJOBQ.asData().trimR());
				break;
			}
			
			switch (outputPriorityonOUTQ.asEnum()) {
			case SAME:
				break;
			case OTHER:
				qJobDescription.setOutputPriorityOnOutq(outputPriorityonOUTQ.asData().trimR());
				break;
			}
			
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
				if (!outputQueue.asData().name.isEmpty()) {
					refOutQueue = OperatingSystemTypeFactoryImpl.eINSTANCE.createTypedReference();
					refOutQueue.setName(outputQueue.asData().name.trimR());
					
					switch (outputQueue.asData().library.asEnum()) {
					case LIBL:
						refOutQueue.setLibrary(outputQueue.asData().library.getSpecialName());
						break;
					case CURLIB:
						refOutQueue.setLibrary(outputQueue.asData().library.getSpecialName());
						break;
					case OTHER:
						refOutQueue.setLibrary(outputQueue.asData().library.asData().trimR());
						break;
					}
					qJobDescription.setOutQueue(refOutQueue);
				}
				break;
			}

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

			for (QCharacter initialLibrary : initialLibraryList.asData()) {
				if (initialLibrary.trimR().isEmpty()) {
					System.err.println("Unexpected condition ljsd6523jklsdfg8d");
					break;
				}
				qJobDescription.getLibraries().add(initialLibrary.trimR());
			}

			resource.save(qJobDescription,true);

			jobLogManager.info(job, "Job Description " +jobDescription.name.trimR()+ " changed");
			
		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}		
	}

	public static class JobDescription extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			@Special(value = "*LIBL")
			LIBL, @Special(value = "*CURLIB")
			CURLIB, OTHER
		}
	}

	public static class JobQueue extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			@Special(value = "*LIBL")
			LIBL, @Special(value = "*CURLIB")
			CURLIB, OTHER
		}
	}

	public static enum JobQueueEnum {
		@Special(value = "*SAME")
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
		@Special(value = "*SAME")
		SAME, @Special(value = "X'40404040404040404040'")
		USRPRF, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*WRKSTN")
		WRKSTN, OTHER
	}

	public static class OutputQueue extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			@Special(value = "*LIBL")
			LIBL, @Special(value = "*CURLIB")
			CURLIB, OTHER
		}
	}

	public static enum OutputQueueEnum {
		@Special(value = "*SAME")
		SAME, @Special(value = "*USRPRF")
		USRPRF, @Special(value = "*DEV")
		DEV, @Special(value = "*WRKSTN")
		WRKSTN, OTHER
	}

	public static enum TextDescriptionEnum {
		@Special(value = "*SAME")
		SAME, @Special(value = "")
		BLANK, OTHER
	}

	public static enum UserEnum {
		@Special(value = "*SAME")
		SAME, @Special(value = "*RQD")
		RQD, OTHER
	}

	public static enum AccountingCodeEnum {
		@Special(value = "*SAME")
		SAME, @Special(value = "*USRPRF")
		USRPRF, @Special(value = "X'404040404040404040404040404040'")
		BLANK, OTHER
	}

	public static enum PrintTextEnum {
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*BLANK")
		BLANK, OTHER
	}

	public static enum RoutingDataEnum {
		@Special(value = "*SAME")
		SAME, @Special(value = "*RQSDTA")
		RQSDTA, OTHER
	}

	public static enum RequestDataOrCommandEnum {
		@Special(value = "*SAME")
		SAME, @Special(value = "*NONE")
		NONE, @Special(value = "*RTGDTA")
		RTGDTA, OTHER
	}

	public static enum InitialLibraryListEnum {
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*NONE")
		NONE, OTHER
	}

	public static enum InitialASPGroupEnum {
		@Special(value = "*SAME")
		SAME, @Special(value = "*NONE")
		NONE, OTHER
	}

	public static class MessageLogging extends QDataStructDelegator {
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
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*JOBLOGSVR")
		JOBLOGSVR, @Special(value = "*JOBEND")
		JOBEND, @Special(value = "*PND")
		PND
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
		@Special(value = "*SAME")
		SAME, OTHER
	}

	public static enum DeviceRecoveryActionEnum {
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*MSG")
		MSG, @Special(value = "*DSCMSG")
		DSCMSG, @Special(value = "*DSCENDRQS")
		DSCENDRQS, @Special(value = "*ENDJOB")
		ENDJOB, @Special(value = "*ENDJOBNOLIST")
		ENDJOBNOLIST
	}

	public static enum TimeSliceEndPoolEnum {
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*NONE")
		NONE, @Special(value = "*BASE")
		BASE
	}

	public static enum AllowMultipleThreadsEnum {
		@Special(value = "*")
		SAME, @Special(value = "X'00'")
		NO, @Special(value = "X'01'")
		YES
	}

	public static enum SpooledFileActionEnum {
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*KEEP")
		KEEP, @Special(value = "*DETACH")
		DETACH
	}

	public static enum DDMConversationEnum {
		@Special(value = "*SAME")
		SAME, @Special(value = "*KEEP")
		KEEP, @Special(value = "*DROP")
		DROP
	}
}

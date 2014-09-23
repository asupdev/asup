package org.asup.os.type.jobd.base.api;

import javax.inject.Inject;

import org.asup.il.data.DatetimeType;
import org.asup.il.data.QArray;
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QDatetime;
import org.asup.il.data.QEnum;
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
			@DataDef(qualified = true) JobQueue jobQueue,
			@DataDef(length = 1) QEnum<JobPriorityonJOBQ, QCharacter> jobPriorityonJOBQ,
			@DataDef(length = 1) QEnum<OutputPriorityonOUTQ, QCharacter> outputPriorityonOUTQ,
			@DataDef(length = 10) QEnum<PrintDevice, QCharacter> printDevice,
			@DataDef(qualified = true) OutputQueue outputQueue,
			@DataDef(length = 50) QEnum<TextDescription, QCharacter> textDescription,
			@DataDef(length = 10) QEnum<User, QCharacter> user,
			@DataDef(length = 15) QEnum<AccountingCode, QCharacter> accountingCode,
			@DataDef(length = 30) QEnum<PrintText, QCharacter> printText,
			@DataDef(length = 80) QEnum<RoutingData, QCharacter> routingData,
			@DataDef(length = 256) QEnum<RequestDataOrCommand, QCharacter> requestDataOrCommand,
			@DataDef(occurrences = "250", length = 10) QArray<QEnum<InitialLibraryList, QCharacter>> initialLibraryList,
			@DataDef(length = 10) QEnum<InitialASPGroup, QCharacter> initialASPGroup,
			MessageLogging messageLogging,
			@DataDef(length = 1) QEnum<LogCLProgramCommands, QCharacter> logCLProgramCommands,
			@DataDef(length = 10) QEnum<JobLogOutput, QCharacter> jobLogOutput,
			QEnum<JobMessageQueueMaximumSize, QBinary> jobMessageQueueMaximumSize,
			@DataDef(length = 10) QEnum<JobMessageQueueFullAction, QCharacter> jobMessageQueueFullAction,
			QEnum<CLSyntaxCheck, QBinary> cLSyntaxCheck,
			QEnum<EndSeverity, QBinary> endSeverity,
			@DataDef(length = 1) QEnum<InquiryMessageReply, QCharacter> inquiryMessageReply,
			@DataDef(length = 1) QEnum<HoldOnJobQueue, QCharacter> holdOnJobQueue,
			@DataDef(datetime = DatetimeType.DATE) QEnum<JobDate, QDatetime> jobDate,
			@DataDef(length = 8) QEnum<JobSwitches, QCharacter> jobSwitches,
			@DataDef(length = 13) QEnum<DeviceRecoveryAction, QCharacter> deviceRecoveryAction,
			@DataDef(length = 10) QEnum<TimeSliceEndPool, QCharacter> timeSliceEndPool,
			@DataDef(length = 1) QEnum<AllowMultipleThreads, QCharacter> allowMultipleThreads,
			@DataDef(length = 10) QEnum<SpooledFileAction, QCharacter> spooledFileAction,
			@DataDef(length = 10) QEnum<DDMConversation, QCharacter> dDMConversation) {

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

			if (!jobQueue.name.isEmpty()) {
				QTypedReference<QTypedObject> refJobQueue = null;
				refJobQueue = OperatingSystemTypeFactoryImpl.eINSTANCE.createTypedReference();
				
				switch (jobQueue.name.asEnum()) {
				case SAME:
					break;
				case OTHER:
					refJobQueue.setName(jobQueue.name.asData().trimR());
					break;
				}
				
				switch (jobQueue.library.asEnum()) {
				case LIBL:
					refJobQueue.setLibrary(jobQueue.library.getSpecialName());
					break;
				case CURLIB:
					// TODO
					refJobQueue.setLibrary(jobQueue.library.getSpecialName());
					break;
				case OTHER:
					refJobQueue.setLibrary(jobQueue.library.asData().trimR());
					break;
				}
				qJobDescription.setJobQueue(refJobQueue);
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

			if (!outputQueue.name.isEmpty()) {
				QTypedReference<QTypedObject> refOutQueue = null;
				refOutQueue = OperatingSystemTypeFactoryImpl.eINSTANCE.createTypedReference();

				switch (outputQueue.name.asEnum()) {
				case SAME:
					break;
				case DEV:
				case WRKSTN:
				case USRPRF:
					refOutQueue.setName(outputQueue.name.getSpecialName());
					break;
				case OTHER:
					refOutQueue.setName(outputQueue.name.asData().trimR());
					break;
				}
				
				switch (outputQueue.library.asEnum()) {
				case LIBL:
					refOutQueue.setLibrary(outputQueue.library.getSpecialName());
					break;
				case CURLIB:
					// TODO
					refOutQueue.setLibrary(outputQueue.library.getSpecialName());
					break;
				case OTHER:
					refOutQueue.setLibrary(outputQueue.library.asData().trimR());
					break;
				}

				qJobDescription.setOutQueue(refOutQueue);
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

			for (QEnum<InitialLibraryList, QCharacter> initialLibrary : initialLibraryList) {
				if (initialLibrary.asData().trimR().isEmpty()) {
					System.err.println("Unexpected condition ljsd6523jklsdfg8d");
					break;
				}
				qJobDescription.getLibraries().add(initialLibrary.asData().trimR());
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
		public QEnum<Library, QCharacter> library;

		public static enum Library {
			@Special(value = "*LIBL")
			LIBL, @Special(value = "*CURLIB")
			CURLIB, OTHER
		}
	}

	public static class JobQueue extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<Name, QCharacter> name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<Library, QCharacter> library;

		public static enum Name {
			@Special(value = "*SAME")
			SAME, OTHER
		}

		public static enum Library {
			@Special(value = "*LIBL")
			LIBL, @Special(value = "*CURLIB")
			CURLIB, OTHER
		}
	}

	public static enum JobPriorityonJOBQ {
		@Special(value = "*")
		SAME, OTHER
	}

	public static enum OutputPriorityonOUTQ {
		@Special(value = "*")
		SAME, OTHER
	}

	public static enum PrintDevice {
		@Special(value = "*SAME")
		SAME, @Special(value = "X'40404040404040404040'")
		USRPRF, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*WRKSTN")
		WRKSTN, OTHER
	}

	public static class OutputQueue extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<Name, QCharacter> name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<Library, QCharacter> library;

		public static enum Name {
			@Special(value = "*SAME")
			SAME, @Special(value = "*USRPRF")
			USRPRF, @Special(value = "*DEV")
			DEV, @Special(value = "*WRKSTN")
			WRKSTN, OTHER
		}

		public static enum Library {
			@Special(value = "*LIBL")
			LIBL, @Special(value = "*CURLIB")
			CURLIB, OTHER
		}
	}

	public static enum TextDescription {
		@Special(value = "*SAME")
		SAME, @Special(value = "")
		BLANK, OTHER
	}

	public static enum User {
		@Special(value = "*SAME")
		SAME, @Special(value = "*RQD")
		RQD, OTHER
	}

	public static enum AccountingCode {
		@Special(value = "*SAME")
		SAME, @Special(value = "*USRPRF")
		USRPRF, @Special(value = "X'404040404040404040404040404040'")
		BLANK, OTHER
	}

	public static enum PrintText {
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*BLANK")
		BLANK, OTHER
	}

	public static enum RoutingData {
		@Special(value = "*SAME")
		SAME, @Special(value = "*RQSDTA")
		RQSDTA, OTHER
	}

	public static enum RequestDataOrCommand {
		@Special(value = "*SAME")
		SAME, @Special(value = "*NONE")
		NONE, @Special(value = "*RTGDTA")
		RTGDTA, OTHER
	}

	public static enum InitialLibraryList {
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*NONE")
		NONE, OTHER
	}

	public static enum InitialASPGroup {
		@Special(value = "*SAME")
		SAME, @Special(value = "*NONE")
		NONE, OTHER
	}

	public static class MessageLogging extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1, value = "*SAME")
		public QEnum<Level, QCharacter> level;
		@DataDef(value = "*SAME")
		public QEnum<Severity, QBinary> severity;
		@DataDef(length = 1, value = "*SAME")
		public QEnum<Text, QCharacter> text;

		public static enum Level {
			@Special(value = "*")
			SAME, OTHER
		}

		public static enum Severity {
			@Special(value = "-2")
			SAME, OTHER
		}

		public static enum Text {
			@Special(value = "*")
			SAME, @Special(value = "M")
			MSG, @Special(value = "S")
			SECLVL, @Special(value = "N")
			NOLIST
		}
	}

	public static enum LogCLProgramCommands {
		@Special(value = "*")
		SAME, @Special(value = "X'40'")
		NO, @Special(value = "Y")
		YES
	}

	public static enum JobLogOutput {
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*JOBLOGSVR")
		JOBLOGSVR, @Special(value = "*JOBEND")
		JOBEND, @Special(value = "*PND")
		PND
	}

	public static enum JobMessageQueueMaximumSize {
		@Special(value = "-2")
		SAME, @Special(value = "0")
		SYSVAL, OTHER
	}

	public static enum JobMessageQueueFullAction {
		@Special(value = "*")
		SAME, @Special(value = "")
		SYSVAL, @Special(value = "N")
		NOWRAP, @Special(value = "W")
		WRAP, @Special(value = "P")
		PRTWRAP
	}

	public static enum CLSyntaxCheck {
		@Special(value = "-2")
		SAME, @Special(value = "-1")
		NOCHK, OTHER
	}

	public static enum EndSeverity {
		@Special(value = "-2")
		SAME, OTHER
	}

	public static enum InquiryMessageReply {
		@Special(value = "*")
		SAME, @Special(value = "X'00'")
		RQD, @Special(value = "X'01'")
		DFT, @Special(value = "X'02'")
		SYSRPYL
	}

	public static enum HoldOnJobQueue {
		@Special(value = "*")
		SAME, @Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum JobDate {
		@Special(value = "0000000")
		SAME, @Special(value = "0010000")
		SYSVAL, OTHER
	}

	public static enum JobSwitches {
		@Special(value = "*SAME")
		SAME, OTHER
	}

	public static enum DeviceRecoveryAction {
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*MSG")
		MSG, @Special(value = "*DSCMSG")
		DSCMSG, @Special(value = "*DSCENDRQS")
		DSCENDRQS, @Special(value = "*ENDJOB")
		ENDJOB, @Special(value = "*ENDJOBNOLIST")
		ENDJOBNOLIST
	}

	public static enum TimeSliceEndPool {
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*NONE")
		NONE, @Special(value = "*BASE")
		BASE
	}

	public static enum AllowMultipleThreads {
		@Special(value = "*")
		SAME, @Special(value = "X'00'")
		NO, @Special(value = "X'01'")
		YES
	}

	public static enum SpooledFileAction {
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*KEEP")
		KEEP, @Special(value = "*DETACH")
		DETACH
	}

	public static enum DDMConversation {
		@Special(value = "*SAME")
		SAME, @Special(value = "*KEEP")
		KEEP, @Special(value = "*DROP")
		DROP
	}
}

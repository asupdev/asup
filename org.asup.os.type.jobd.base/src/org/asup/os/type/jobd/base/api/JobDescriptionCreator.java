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
import org.asup.os.type.jobd.QOperatingSystemJobDescriptionFactory;

@Command(name = "CRTJOBD")
@Program(name = "QWDCCRG", messages = { "CPF1621" })
public class JobDescriptionCreator {

	@Inject
	private QJobDescriptionManager jobDescriptionManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;

	public @Entry void main(
			@DataDef(qualified = true) JobDescription jobDescription,
			@DataDef(qualified = true) JobQueue jobQueue,
			@DataDef(length = 1) QCharacter jobPriorityonJOBQ,
			@DataDef(length = 1) QCharacter outputPriorityonOUTQ,
			@DataDef(length = 10) QEnum<PrintDevice, QCharacter> printDevice,
			@DataDef(qualified = true) OutputQueue outputQueue,
			@DataDef(length = 50) QEnum<TextDescription, QCharacter> textDescription,
			@DataDef(length = 10) QEnum<User, QCharacter> user,
			@DataDef(length = 15) QEnum<AccountingCode, QCharacter> accountingCode,
			@DataDef(length = 30) QEnum<PrintText, QCharacter> printText,
			@DataDef(length = 80) QEnum<RoutingData, QCharacter> routingData,
			@DataDef(length = 256) QEnum<RequestDataOrCommand, QCharacter> requestDataOrCommand,
			@DataDef(dimension = "250", length = 10) QArray<QEnum<InitialLibraryList, QCharacter>> initialLibraryList,
			@DataDef(length = 10) QEnum<InitialASPGroup, QCharacter> initialASPGroup,
			MessageLogging messageLogging,
			@DataDef(length = 1) QEnum<LogCLProgramCommands, QCharacter> logCLProgramCommands,
			@DataDef(length = 10) QEnum<JobLogOutput, QCharacter> jobLogOutput,
			QEnum<JobMessageQueueMaximumSize, QBinary> jobMessageQueueMaximumSize,
			@DataDef(length = 10) QEnum<JobMessageQueueFullAction, QCharacter> jobMessageQueueFullAction,
			QEnum<CLSyntaxCheck, QBinary> cLSyntaxCheck,
			QBinary endSeverity,
			@DataDef(length = 1) QEnum<InquiryMessageReply, QCharacter> inquiryMessageReply,
			@DataDef(length = 1) QEnum<HoldOnJobQueue, QCharacter> holdOnJobQueue,
			@DataDef(datetimeType = DatetimeType.DATE) QEnum<JobDate, QDatetime> jobDate,
			@DataDef(length = 8) QCharacter jobSwitches,
			@DataDef(length = 13) QEnum<DeviceRecoveryAction, QCharacter> deviceRecoveryAction,
			@DataDef(length = 10) QEnum<TimeSliceEndPool, QCharacter> timeSliceEndPool,
			@DataDef(length = 10) QEnum<Authority, QCharacter> authority,
			@DataDef(length = 1) QEnum<AllowMultipleThreads, QCharacter> allowMultipleThreads,
			@DataDef(length = 10) QEnum<SpooledFileAction, QCharacter> spooledFileAction,
			@DataDef(length = 10) QEnum<DDMConversation, QCharacter> dDMConversation) {
		
		String library = "";
		switch (jobDescription.library.asEnum()) {
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
			if (qJobDescription != null)
				throw new OperatingSystemException("Job Description " + name
						+ " already exists in library " + library);
			
			qJobDescription = QOperatingSystemJobDescriptionFactory.eINSTANCE.createJobDescription();

			qJobDescription.setName(name);
			qJobDescription.setLibrary(library);
			
			switch (textDescription.asEnum()) {
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
				refJobQueue.setName(jobQueue.name.trimR());
				
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

			qJobDescription.setJobPriorityOnJobq(jobPriorityonJOBQ.trimR());
			qJobDescription.setOutputPriorityOnOutq(outputPriorityonOUTQ.trimR());

			if (!outputQueue.name.isEmpty()) {
				QTypedReference<QTypedObject> refOutQueue = null;
				refOutQueue = OperatingSystemTypeFactoryImpl.eINSTANCE.createTypedReference();

				switch (outputQueue.name.asEnum()) {
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
			
/*		TODO	
			for (QEnum<InitialLibraryList, QCharacter> initialLibrary : initialLibraryList) {
				switch (initialLibrary.asEnum()) {
				case SYSVAL:
					break;
				case NONE:
					break;
				case OTHER:
					if (initialLibrary.asData().trimR().isEmpty()) {
						System.err.println("Unexpected condition ljsd6523jklsdfg8d");
						break;
					}
					qJobDescription.getLibraries().add(initialLibrary.asData().trimR());
				}
			}
*/
			resource.save(qJobDescription);

			jobLogManager.info(job, "Job Description " + jobDescription.name.trimR()+ " created");
			
		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}
	public static class JobDescription extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*CURLIB")
		public QEnum<Library, QCharacter> library;

		public static enum Library {
			@Special(value = "*CURLIB")
			CURLIB, OTHER
		}
	}

	public static class JobQueue extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10, value = "QBATCH")
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<Library, QCharacter> library;

		public static enum Library {
			@Special(value = "*LIBL")
			LIBL, @Special(value = "*CURLIB")
			CURLIB, OTHER
		}
	}

	public static enum PrintDevice {
		@Special(value = "X'40404040404040404040'")
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
			@Special(value = "*USRPRF")
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
		@Special(value = "")
		BLANK, OTHER
	}

	public static enum User {
		@Special(value = "*RQD")
		RQD, OTHER
	}

	public static enum AccountingCode {
		@Special(value = "*USRPRF")
		USRPRF, @Special(value = "X'404040404040404040404040404040'")
		BLANK, OTHER
	}

	public static enum PrintText {
		@Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*BLANK")
		BLANK, OTHER
	}

	public static enum RoutingData {
		@Special(value = "*RQSDTA")
		RQSDTA, OTHER
	}

	public static enum RequestDataOrCommand {
		@Special(value = "*NONE")
		NONE, @Special(value = "*RTGDTA")
		RTGDTA, OTHER
	}

	public static enum InitialLibraryList {
		@Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*NONE")
		NONE, OTHER
	}

	public static enum InitialASPGroup {
		@Special(value = "*NONE")
		NONE, OTHER
	}

	public static class MessageLogging extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1, value = "4")
		public QCharacter level;
		@DataDef(value = "0")
		public QBinary severity;
		@DataDef(length = 1, value = "*NOLIST")
		public QEnum<Text, QCharacter> text;

		public static enum Text {
			@Special(value = "N")
			NOLIST, @Special(value = "M")
			MSG, @Special(value = "S")
			SECLVL
		}
	}

	public static enum LogCLProgramCommands {
		@Special(value = "X'40'")
		NO, @Special(value = "Y")
		YES
	}

	public static enum JobLogOutput {
		@Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*JOBLOGSVR")
		JOBLOGSVR, @Special(value = "*JOBEND")
		JOBEND, @Special(value = "*PND")
		PND
	}

	public static enum JobMessageQueueMaximumSize {
		@Special(value = "0")
		SYSVAL, OTHER
	}

	public static enum JobMessageQueueFullAction {
		@Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "N")
		NOWRAP, @Special(value = "W")
		WRAP, @Special(value = "P")
		PRTWRAP
	}

	public static enum CLSyntaxCheck {
		@Special(value = "-1")
		NOCHK, OTHER
	}

	public static enum InquiryMessageReply {
		@Special(value = "X'00'")
		RQD, @Special(value = "X'01'")
		DFT, @Special(value = "X'02'")
		SYSRPYL
	}

	public static enum HoldOnJobQueue {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum JobDate {
		@Special(value = "0010000")
		SYSVAL, OTHER
	}

	public static enum DeviceRecoveryAction {
		@Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*MSG")
		MSG, @Special(value = "*DSCMSG")
		DSCMSG, @Special(value = "*DSCENDRQS")
		DSCENDRQS, @Special(value = "*ENDJOB")
		ENDJOB, @Special(value = "*ENDJOBNOLIST")
		ENDJOBNOLIST
	}

	public static enum TimeSliceEndPool {
		@Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*NONE")
		NONE, @Special(value = "*BASE")
		BASE
	}

	public static enum Authority {
		@Special(value = "*LIBCRTAUT")
		LIBCRTAUT, @Special(value = "*CHANGE")
		CHANGE, @Special(value = "*ALL")
		ALL, @Special(value = "*USE")
		USE, @Special(value = "*EXCLUDE")
		EXCLUDE, OTHER
	}

	public static enum AllowMultipleThreads {
		@Special(value = "X'00'")
		NO, @Special(value = "X'01'")
		YES
	}

	public static enum SpooledFileAction {
		@Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*KEEP")
		KEEP, @Special(value = "*DETACH")
		DETACH
	}

	public static enum DDMConversation {
		@Special(value = "*KEEP")
		KEEP, @Special(value = "*DROP")
		DROP
	}

}

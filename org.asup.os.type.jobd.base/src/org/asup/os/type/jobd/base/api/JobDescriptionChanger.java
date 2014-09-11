package org.asup.os.type.jobd.base.api;

import javax.inject.Inject;

import org.asup.il.data.QArray;
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructDelegator;
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
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.QTypedObject;
import org.asup.os.type.QTypedReference;
import org.asup.os.type.impl.OperatingSystemTypeFactoryImpl;
import org.asup.os.type.jobd.QJobDescription;

@Command(name = "CHGJOBD")
@Program(name = "QWDCCHG", messages = {"CPF1618","CPF1625","CPF9872"})
public class JobDescriptionChanger {

	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QJob job;
	@Inject 
	private QJobLogManager jobLogManager;
	
	public @Entry void main(
			@DataDef(qualified = true) JobDescription jobDescription,
			@DataDef(qualified = true) JobQueue jobQueue,
			@DataDef(length = 1) QEnum<JobPriorityonJOBQ, QCharacter> jobpriorityonjobq,
			@DataDef(length = 1) QEnum<OutputPriorityonOUTQ, QCharacter> outputpriorityonoutq,
			@DataDef(length = 10) QEnum<PrintDevice, QCharacter> printdevice,
			@DataDef(qualified = true) OutputQueue outputQueue,
			@DataDef(length = 50) QCharacter textDescription,
			@DataDef(length = 10) QEnum<User, QCharacter> user,
			@DataDef(length = 15) QEnum<AccountingCode, QCharacter> accountingcode,
			@DataDef(length = 30) QEnum<PrintText, QCharacter> printtext,
			@DataDef(length = 80) QEnum<RoutingData, QCharacter> routingdata,
			@DataDef(length = 256) QEnum<RequestDataOrCommand, QCharacter> requestdataorcommand,
			@DataDef(dimension = "250", length = 10) QArray<QCharacter> initialLibraryList,
			@DataDef(length = 10) QEnum<InitialASPGroup, QCharacter> initialaspgroup,
			MessageLogging messagelogging,
			@DataDef(length = 1) QEnum<LogCLProgramCommands, QCharacter> logclprogramcommands,
			@DataDef(length = 10) QEnum<JobLogOutput, QCharacter> joblogoutput,
			QEnum<JobMessageQueueMaximumSize, QBinary> jobmessagequeuemaximumsize,
			@DataDef(length = 10) QEnum<JobMessageQueueFullAction, QCharacter> jobmessagequeuefullaction,
			QEnum<CLSyntaxCheck, QBinary> clsyntaxcheck,
			QEnum<EndSeverity, QBinary> endseverity,
			@DataDef(length = 1) QEnum<InquiryMessageReply, QCharacter> inquirymessagereply,
			@DataDef(length = 1) QEnum<HoldOnJobQueue, QCharacter> holdonjobqueue,
			@DataDef(length = 10) QCharacter jobdate,
			@DataDef(length = 8) QEnum<JobSwitches, QCharacter> jobswitches,
			@DataDef(length = 13) QEnum<DeviceRecoveryAction, QCharacter> devicerecoveryaction,
			@DataDef(length = 10) QEnum<TimeSliceEndPool, QCharacter> timesliceendpool,
			@DataDef(length = 1) QEnum<AllowMultipleThreads, QCharacter> allowmultiplethreads,
			@DataDef(length = 10) QEnum<SpooledFileAction, QCharacter> spooledfileaction,
			@DataDef(length = 10) QEnum<DDMConversation, QCharacter> ddmconversation) {

		String library = jobDescription.library.asData().trimR();
		String name = jobDescription.name.trimR();
		try {
			QResourceWriter<QJobDescription> resource = resourceFactory.getResourceWriter(job, QJobDescription.class, library);	
			QJobDescription jd = resource.lookup(name);	
			if (jd == null) {
				throw new OperatingSystemException("Job Description " + name+ " not exists in library " + library);
			} else {
				if(!textDescription.isEmpty()) 
					jd.setText(textDescription.trimR());
				if(initialLibraryList.size()>0){
					jd.getLibraries().clear();
					for(QCharacter initialLibrary : initialLibraryList){
						if(initialLibrary.trimR().isEmpty())
							continue;
						jd.getLibraries().add(initialLibrary.trimR());				
					}
				}
				if(!jobQueue.isEmpty()) {
					QTypedReference<QTypedObject> refJobQueue = null;
					refJobQueue = OperatingSystemTypeFactoryImpl.eINSTANCE.createTypedReference();
					refJobQueue.setLibrary(jobQueue.library.asData().trimR());
					refJobQueue.setName(jobQueue.name.asData().trimR());
					jd.setJobQueue(refJobQueue);
				}
				if(!outputQueue.isEmpty()) {
					QTypedReference<QTypedObject> refOutQueue = null;
					refOutQueue = OperatingSystemTypeFactoryImpl.eINSTANCE.createTypedReference();
					refOutQueue.setLibrary(outputQueue.library.asData().trimR());
					refOutQueue.setName(outputQueue.name.asData().trimR());
					jd.setOutQueue(refOutQueue);
				}
				if(!user.isEmpty()) 
					jd.setUser(user.asData().trimR());
				resource.save(jd,true);
			}
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
			CURLIB
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
			SAME
		}

		public static enum Library {
			@Special(value = "*LIBL")
			LIBL, @Special(value = "*CURLIB")
			CURLIB
		}
	}

	public static enum JobPriorityonJOBQ {
		@Special(value = "*")
		SAME
	}

	public static enum OutputPriorityonOUTQ {
		@Special(value = "*")
		SAME
	}

	public static enum PrintDevice {
		@Special(value = "*SAME")
		SAME, @Special(value = "X'40404040404040404040'")
		USRPRF, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*WRKSTN")
		WRKSTN
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
			WRKSTN
		}

		public static enum Library {
			@Special(value = "*LIBL")
			LIBL, @Special(value = "*CURLIB")
			CURLIB
		}
	}

	public static enum TextDescription {
		@Special(value = "*SAME")
		SAME, @Special(value = "")
		BLANK
	}

	public static enum User {
		@Special(value = "*SAME")
		SAME, @Special(value = "*RQD")
		RQD
	}

	public static enum AccountingCode {
		@Special(value = "*SAME")
		SAME, @Special(value = "*USRPRF")
		USRPRF, @Special(value = "X'404040404040404040404040404040'")
		BLANK
	}

	public static enum PrintText {
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*BLANK")
		BLANK
	}

	public static enum RoutingData {
		@Special(value = "*SAME")
		SAME, @Special(value = "*RQSDTA")
		RQSDTA
	}

	public static enum RequestDataOrCommand {
		@Special(value = "*SAME")
		SAME, @Special(value = "*NONE")
		NONE, @Special(value = "*RTGDTA")
		RTGDTA
	}

	public static enum InitialLibraryList {
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*NONE")
		NONE
	}

	public static enum InitialASPGroup {
		@Special(value = "*SAME")
		SAME, @Special(value = "*NONE")
		NONE
	}

	public static class MessageLogging extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1, value = "*SAME")
		public QEnum<Level, QCharacter> level;
		public @DataDef(value = "*SAME") QEnum<Severity, QBinary> severity;
		@DataDef(length = 1, value = "*SAME")
		public QEnum<Text, QCharacter> text;

		public static enum Level {
			@Special(value = "*")
			SAME
		}

		public static enum Severity {
			@Special(value = "-2")
			SAME
		}

		public static enum Text {
			@Special(value = "*")
			SAME, @Special(value = "M")
			MSG, @Special(value = "S")
			SECLVL, @Special(value = "N")
			NOLIST, MISSING
		}
	}

	public static enum LogCLProgramCommands {
		@Special(value = "*")
		SAME, @Special(value = "X'40'")
		NO, @Special(value = "Y")
		YES, MISSING
	}

	public static enum JobLogOutput {
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*JOBLOGSVR")
		JOBLOGSVR, @Special(value = "*JOBEND")
		JOBEND, @Special(value = "*PND")
		PND, MISSING
	}

	public static enum JobMessageQueueMaximumSize {
		@Special(value = "-2")
		SAME, @Special(value = "0")
		SYSVAL
	}

	public static enum JobMessageQueueFullAction {
		@Special(value = "*")
		SAME, @Special(value = "")
		SYSVAL, @Special(value = "N")
		NOWRAP, @Special(value = "W")
		WRAP, @Special(value = "P")
		PRTWRAP, MISSING
	}

	public static enum CLSyntaxCheck {
		@Special(value = "-2")
		SAME, @Special(value = "-1")
		NOCHK
	}

	public static enum EndSeverity {
		@Special(value = "-2")
		SAME
	}

	public static enum InquiryMessageReply {
		@Special(value = "*")
		SAME, @Special(value = "X'00'")
		RQD, @Special(value = "X'01'")
		DFT, @Special(value = "X'02'")
		SYSRPYL, MISSING
	}

	public static enum HoldOnJobQueue {
		@Special(value = "*")
		SAME, @Special(value = "N")
		NO, @Special(value = "Y")
		YES, MISSING
	}

	public static enum JobDate {
		@Special(value = "0000000")
		SAME, @Special(value = "0010000")
		SYSVAL
	}

	public static enum JobSwitches {
		@Special(value = "*SAME")
		SAME
	}

	public static enum DeviceRecoveryAction {
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*MSG")
		MSG, @Special(value = "*DSCMSG")
		DSCMSG, @Special(value = "*DSCENDRQS")
		DSCENDRQS, @Special(value = "*ENDJOB")
		ENDJOB, @Special(value = "*ENDJOBNOLIST")
		ENDJOBNOLIST, MISSING
	}

	public static enum TimeSliceEndPool {
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*NONE")
		NONE, @Special(value = "*BASE")
		BASE, MISSING
	}

	public static enum AllowMultipleThreads {
		@Special(value = "*")
		SAME, @Special(value = "X'00'")
		NO, @Special(value = "X'01'")
		YES, MISSING
	}

	public static enum SpooledFileAction {
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*KEEP")
		KEEP, @Special(value = "*DETACH")
		DETACH, MISSING
	}

	public static enum DDMConversation {
		@Special(value = "*SAME")
		SAME, @Special(value = "*KEEP")
		KEEP, @Special(value = "*DROP")
		DROP, MISSING
	}

}

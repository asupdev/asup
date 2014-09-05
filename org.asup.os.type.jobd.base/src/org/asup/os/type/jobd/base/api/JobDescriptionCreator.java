package org.asup.os.type.jobd.base.api;

import javax.inject.Inject;

import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QEnum;
import org.asup.il.data.QScroller;
import org.asup.il.data.annotation.Command;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.jobd.QJobDescription;

@Command(name = "CRTJOBD")
@Program(name = "QWDCCRG", messages = {})
public class JobDescriptionCreator {

	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QJob job;


	public @Entry void main(
			@DataDef(qualified = true) JobDescription jobDescription,
			@DataDef(qualified = true) JobQueue jobQueue,
			@DataDef(length = 1) QCharacter jobpriorityonjobq,
			@DataDef(length = 1) QCharacter outputpriorityonoutq,
			@DataDef(length = 10) QEnum<PrintDevice, QCharacter> printdevice,
			@DataDef(qualified = true) OutputQueue outputqueue,
			@DataDef(length = 50) QCharacter textDescription,
			@DataDef(length = 10) QEnum<User, QCharacter> user,
			@DataDef(length = 15) QEnum<AccountingCode, QCharacter> accountingcode,
			@DataDef(length = 30) QEnum<PrintText, QCharacter> printtext,
			@DataDef(length = 80) QEnum<RoutingData, QCharacter> routingdata,
			@DataDef(length = 256) QEnum<RequestDataOrCommand, QCharacter> requestdataorcommand,
			@DataDef(occurrences = "250", length = 10) QScroller<QCharacter> initiallibrarylist,
			@DataDef(length = 10) QEnum<InitialASPGroup, QCharacter> initialaspgroup,
			MessageLogging messagelogging,
			@DataDef(length = 1) QEnum<LogCLProgramCommands, QCharacter> logclprogramcommands,
			@DataDef(length = 10) QEnum<JobLogOutput, QCharacter> joblogoutput,	
			QEnum<JobMessageQueueMaximumSize, QBinary> jobmessagequeuemaximumsize,
			@DataDef(length = 10) QEnum<JobMessageQueueFullAction, QCharacter> jobmessagequeuefullaction,
			QEnum<CLSyntaxCheck, QBinary> clsyntaxcheck,
			QBinary endseverity,
			@DataDef(length = 1) QEnum<InquiryMessageReply, QCharacter> inquirymessagereply,
			@DataDef(length = 1) QEnum<HoldOnJobQueue, QCharacter> holdonjobqueue,
			@DataDef(length = 10) QCharacter jobdate,
			@DataDef(length = 8) QCharacter jobswitches,
			@DataDef(length = 13) QEnum<DeviceRecoveryAction, QCharacter> devicerecoveryaction,
			@DataDef(length = 10) QEnum<TimeSliceEndPool, QCharacter> timesliceendpool,
			@DataDef(length = 10) QEnum<Authority, QCharacter> authority,
			@DataDef(length = 1) QEnum<AllowMultipleThreads, QCharacter> allowmultiplethreads,
			@DataDef(length = 10) QEnum<SpooledFileAction, QCharacter> spooledfileaction,
			@DataDef(length = 10) QEnum<DDMConversation, QCharacter> ddmconversation) {
			
		QResourceWriter<QJobDescription> resource = resourceFactory.getResourceWriter(job, QJobDescription.class, jobDescription.library.toString());	
		QJobDescription jd = resource.lookup(jobDescription.name.toString());	
		jd.setLibrary(jobDescription.library.trimR());
		jd.setName(jobDescription.name.trimR());
		jd.setText(textDescription.trimR());
	}

	public static class JobDescription extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10)
		public QCharacter library;
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
			CURLIB
		}
	}

	public static enum PrintDevice {
		@Special(value = "X'40404040404040404040'")
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
			@Special(value = "*USRPRF")
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
		@Special(value = "")
		BLANK
	}

	public static enum User {
		@Special(value = "*RQD")
		RQD
	}

	public static enum AccountingCode {
		@Special(value = "*USRPRF")
		USRPRF, @Special(value = "X'404040404040404040404040404040'")
		BLANK
	}

	public static enum PrintText {
		@Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*BLANK")
		BLANK
	}

	public static enum RoutingData {
		@Special(value = "*RQSDTA")
		RQSDTA
	}

	public static enum RequestDataOrCommand {
		@Special(value = "*NONE")
		NONE, @Special(value = "*RTGDTA")
		RTGDTA
	}

	public static enum InitialLibraryList {
		@Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*NONE")
		NONE
	}

	public static enum InitialASPGroup {
		@Special(value = "*NONE")
		NONE
	}

	public static class MessageLogging extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1, value = "4")
		public QCharacter level;
		public @DataDef(value = "0") QBinary severity;
		@DataDef(length = 1, value = "*NOLIST")
		public QEnum<Text, QCharacter> text;

		public static enum Text {
			@Special(value = "N")
			NOLIST, @Special(value = "M")
			MSG, @Special(value = "S")
			SECLVL, MISSING
		}
	}

	public static enum LogCLProgramCommands {
		@Special(value = "X'40'")
		NO, @Special(value = "Y")
		YES, MISSING
	}

	public static enum JobLogOutput {
		@Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*JOBLOGSVR")
		JOBLOGSVR, @Special(value = "*JOBEND")
		JOBEND, @Special(value = "*PND")
		PND, MISSING
	}

	public static enum JobMessageQueueMaximumSize {
		@Special(value = "0")
		SYSVAL
	}

	public static enum JobMessageQueueFullAction {
		@Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "N")
		NOWRAP, @Special(value = "W")
		WRAP, @Special(value = "P")
		PRTWRAP, MISSING
	}

	public static enum CLSyntaxCheck {
		@Special(value = "-1")
		NOCHK
	}

	public static enum InquiryMessageReply {
		@Special(value = "X'00'")
		RQD, @Special(value = "X'01'")
		DFT, @Special(value = "X'02'")
		SYSRPYL, MISSING
	}

	public static enum HoldOnJobQueue {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES, MISSING
	}

	public static enum JobDate {
		@Special(value = "0010000")
		SYSVAL
	}

	public static enum DeviceRecoveryAction {
		@Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*MSG")
		MSG, @Special(value = "*DSCMSG")
		DSCMSG, @Special(value = "*DSCENDRQS")
		DSCENDRQS, @Special(value = "*ENDJOB")
		ENDJOB, @Special(value = "*ENDJOBNOLIST")
		ENDJOBNOLIST, MISSING
	}

	public static enum TimeSliceEndPool {
		@Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*NONE")
		NONE, @Special(value = "*BASE")
		BASE, MISSING
	}

	public static enum Authority {
		@Special(value = "*LIBCRTAUT")
		LIBCRTAUT, @Special(value = "*CHANGE")
		CHANGE, @Special(value = "*ALL")
		ALL, @Special(value = "*USE")
		USE, @Special(value = "*EXCLUDE")
		EXCLUDE
	}

	public static enum AllowMultipleThreads {
		@Special(value = "X'00'")
		NO, @Special(value = "X'01'")
		YES, MISSING
	}

	public static enum SpooledFileAction {
		@Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*KEEP")
		KEEP, @Special(value = "*DETACH")
		DETACH, MISSING
	}

	public static enum DDMConversation {
		@Special(value = "*KEEP")
		KEEP, @Special(value = "*DROP")
		DROP, MISSING
	}
}

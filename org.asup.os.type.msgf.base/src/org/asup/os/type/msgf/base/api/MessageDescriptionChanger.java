package org.asup.os.type.msgf.base.api;

import javax.inject.Inject;

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
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.msgf.QMessageDescription;
import org.asup.os.type.msgf.QMessageFile;
import org.asup.os.type.msgf.QMessageFileManager;
import org.asup.os.type.msgf.QOperatingSystemMessageFileFactory;

@Command(name = "CHGMSGD")
@Program(name = "QMHCHMSD", messages = {})
public class MessageDescriptionChanger {

	@Inject
	private QMessageFileManager messageFileManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;
	
	public @Entry void main(
			@DataDef(length = 7) QCharacter messageIdentifier,
			@DataDef(qualified = true) MessageFile messageFile,
			@DataDef(length = 132, value = "*SAME") QEnum<FirstLevelMessageText, QCharacter> firstLevelMessageText,
			@DataDef(length = 3000, value = "*SAME") QEnum<SecondLevelMessageText, QCharacter> secondLevelMessageText,
			@DataDef(value = "*SAME") QEnum<SeverityCode, QBinary> severityCode
//			@DataDef(occurrences = "99", values = { "*SAME" }) QDataStroller<MessageDataFieldsFormat> messagedatafieldsformats,
//			@DataDef(length = 1, value = "*SAME") QEnum<ReplyType, QCharacter> replytype,
//			@DataDef(value = "*SAME") MaximumReplyLength maximumreplylength,
//			@DataDef(occurrences = "20", length = 32, values = { "*SAME" }) QArray<QEnum<ValidReplyValue, QCharacter>> validreplyvalues,
//			@DataDef(occurrences = "20", values = { "*SAME" }) QDataStroller<SpecialReplyValue> specialreplyvalues,
//			@DataDef(value = "*SAME") RangeOfReplyValues rangeofreplyvalues,
//			@DataDef(value = "*SAME") RelationshipForValidReplies relationshipforvalidreplies,
//			@DataDef(length = 132, value = "*SAME") QEnum<DefaultReplyValue, QCharacter> defaultreplyvalue,
//			@DataDef(qualified = true, value = "*SAME") DefaultProgramToCall defaultprogramtocall,
//			@DataDef(occurrences = "102", values = { "*SAME" }) QArray<QEnum<DataToBeDumped, QBinary>> datatobedumped,
//			@DataDef(value = "*SAME") AlertOptions alertoptions, 
//			@DataDef(length = 1, value = "*SAME") QEnum<LogProblem, QCharacter> logproblem,
//			@DataDef(value = "*JOB") QEnum<CodedCharacterSetID, QBinary> codedcharactersetid
																							) {
	
		String library = "";
		switch (messageFile.library.asEnum()) {
		case LIBL:
		case CURLIB:
			library = messageFile.library.getSpecialName();
			break;
		case OTHER:
			library = messageFile.library.asData().trimR();
			break;
		}

		String name = messageFile.name.trimR();
		try {
			QResourceWriter<QMessageFile> resource = messageFileManager.getResourceWriter(job, library);
			QMessageFile qMessageFile = resource.lookup(name);	
			if (qMessageFile == null)
				throw new OperatingSystemException("Message File " + name+ " not exists in library " + library);

			QMessageDescription qMessageDescription = QOperatingSystemMessageFileFactory.eINSTANCE.createMessageDescription();

			qMessageDescription.setName(messageIdentifier.trimR());
			if (!qMessageFile.getMessages().contains(qMessageDescription))
				throw new OperatingSystemException("Message Description " + messageIdentifier + " not exist");

			qMessageFile.getMessages().remove(qMessageDescription);			
			
			switch (firstLevelMessageText.asEnum()) {
			case SAME:
				break;
			case OTHER:
				qMessageDescription.setMessageHelp(firstLevelMessageText.asData().trimR());
				break;
			}
			
			switch (secondLevelMessageText.asEnum()) {
			case TERM_HEX:
				break;
			case NONE:
				qMessageDescription.setMessageHelp("");
				break;
			case SAME:
				break;
			case OTHER:
				qMessageDescription.setMessageHelp(secondLevelMessageText.asData().trimR());
				break;
			}
			
			// TODO non funziona bene
			switch (severityCode.asEnum()) {
			case SAME:
				break;
			case OTHER:
				qMessageDescription.setSeverity(severityCode.asData().asInteger());
				break;
			}

			qMessageFile.getMessages().add(qMessageDescription);
			
			resource.save(qMessageFile, true);

			jobLogManager.info(job, "Message Description " + messageIdentifier + " added to Message File " + name);
			
		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	
	
	
	
	}

	public static class MessageFile extends QDataStructDelegator {
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

	public static enum FirstLevelMessageText {
		@Special(value = "*SAME")
		SAME, OTHER
	}

	public static enum SecondLevelMessageText {
		@Special(value = "*SAME")
		SAME, @Special(value = "*NONE")
		NONE, @Special(value = "*NONE")
		TERM_HEX, OTHER
	}

	public static enum SeverityCode {
		@Special(value = "-1")
		SAME, OTHER
	}

	public static class MessageDataFieldsFormat extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		public QEnum<DataType, QCharacter> datatype;
		public @DataDef(value = "*VARY") QEnum<Length, QBinary> length;
		public @DataDef(value = "0") QBinary varybytesordecpos;

		public static enum DataType {
			@Special(value = "FE")
			SAME, @Special(value = "FF")
			NONE, @Special(value = "04")
			QTDCHAR, @Special(value = "44")
			CHAR, @Special(value = "24")
			HEX, @Special(value = "2F")
			SPP, @Special(value = "03")
			DEC, @Special(value = "00")
			BIN, @Special(value = "02")
			UBIN, @Special(value = "05")
			CCHAR, @Special(value = "15")
			UTC, @Special(value = "16")
			UTCD, @Special(value = "17")
			UTCT, @Special(value = "14")
			DTS, @Special(value = "0F")
			SYP, @Special(value = "34")
			ITV, MISSING
		}

		public static enum Length {
			@Special(value = "-1")
			VARY
		}
	}

	public static enum ReplyType {
		@Special(value = "S")
		SAME, @Special(value = "X")
		NONE, @Special(value = "C")
		CHAR, @Special(value = "D")
		DEC, @Special(value = "A")
		ALPHA, @Special(value = "N")
		NAME, MISSING
	}

	public static class MaximumReplyLength extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		public QEnum<Length, QBinary> length;
		public QBinary decimalpositions;

		public static enum Length {
			@Special(value = "-2")
			SAME, @Special(value = "-3")
			NONE, @Special(value = "-1")
			TYPE
		}
	}

	public static enum ValidReplyValue {
		@Special(value = "*SAME")
		SAME, @Special(value = "*NONE")
		NONE
	}

	public static class SpecialReplyValue extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 32)
		public QEnum<OriginalFromValue, QCharacter> originalfromvalue;
		@DataDef(length = 32)
		public QCharacter replacementtovalue;

		public static enum OriginalFromValue {
			@Special(value = "*SAME")
			SAME, @Special(value = "*NONE")
			NONE
		}
	}

	public static class RangeOfReplyValues extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 32)
		public QEnum<LowerValue, QCharacter> lowervalue;
		@DataDef(length = 32)
		public QCharacter uppervalue;

		public static enum LowerValue {
			@Special(value = "*SAME")
			SAME, @Special(value = "*NONE")
			NONE
		}
	}

	public static class RelationshipForValidReplies extends
			QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		public QEnum<RelationalOperator, QCharacter> relationaloperator;
		@DataDef(length = 32)
		public QCharacter value;

		public static enum RelationalOperator {
			@Special(value = "FE")
			SAME, @Special(value = "FF")
			NONE, @Special(value = "50")
			EQ, @Special(value = "70")
			LE, @Special(value = "40")
			GE, @Special(value = "30")
			GT, @Special(value = "80")
			LT, @Special(value = "60")
			NE, @Special(value = "40")
			NL, @Special(value = "70")
			NG, MISSING
		}
	}

	public static enum DefaultReplyValue {
		@Special(value = "*SAME")
		SAME, @Special(value = "*NONE")
		NONE
	}

	public static class DefaultProgramToCall extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<Name, QCharacter> name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<Library, QCharacter> library;

		public static enum Name {
			@Special(value = "*SAME")
			SAME, @Special(value = "*NONE")
			NONE
		}

		public static enum Library {
			@Special(value = "*LIBL")
			LIBL, @Special(value = "*CURLIB")
			CURLIB
		}
	}

	public static enum DataToBeDumped {
		@Special(value = "-3")
		SAME, @Special(value = "0")
		NONE, @Special(value = "-4")
		JOB, @Special(value = "-2")
		JOBINT, @Special(value = "-1")
		JOBDMP
	}

	public static class AlertOptions extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1)
		public QEnum<AlertType, QCharacter> alerttype;
		public @DataDef(value = "*NONE") QEnum<ResourceNameVariable, QBinary> resourcenamevariable;

		public static enum AlertType {
			@Special(value = "S")
			SAME, @Special(value = "I")
			IMMED, @Special(value = "D")
			DEFER, @Special(value = "U")
			UNATTEND, @Special(value = "N")
			NO
		}

		public static enum ResourceNameVariable {
			@Special(value = "0")
			NONE
		}
	}

	public static enum LogProblem {
		@Special(value = "S")
		SAME, @Special(value = "N")
		NO, @Special(value = "Y")
		YES, MISSING
	}

	public static enum CodedCharacterSetID {
		@Special(value = "-1")
		SAME, @Special(value = "65535")
		HEX, @Special(value = "0")
		JOB
	}
	
}

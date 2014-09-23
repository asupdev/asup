package org.asup.os.type.msgf.base.api;

import javax.inject.Inject;

import org.asup.il.data.QArray;
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStroller;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QEnum;
import org.asup.il.data.QHexadecimal;
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
			@DataDef(length = 132) QEnum<FirstLevelMessageText, QCharacter> firstLevelMessageText,
			@DataDef(length = 3000) QEnum<SecondLevelMessageText, QCharacter> secondLevelMessageText,
			QEnum<SeverityCode, QBinary> severityCode,
			@DataDef(occurrences = "99") QDataStroller<MessageDataFieldsFormat> messageDataFieldsFormats,
			@DataDef(length = 1) QEnum<ReplyType, QCharacter> replyType,
			MaximumReplyLength maximumReplyLength,
			@DataDef(occurrences = "20", length = 32) QArray<QEnum<ValidReplyValue, QCharacter>> validReplyValues,
			@DataDef(occurrences = "20") QDataStroller<SpecialReplyValue> specialReplyValues,
			RangeOfReplyValues rangeOfReplyValues,
			RelationshipForValidReplies relationshipForValidReplies,
			@DataDef(length = 132) QEnum<DefaultReplyValue, QCharacter> defaultReplyValue,
			@DataDef(qualified = true) DefaultProgramToCall defaultProgramToCall,
			@DataDef(occurrences = "102") QArray<QEnum<DataToBeDumped, QBinary>> dataToBeDumped,
			AlertOptions alertOptions,
			@DataDef(length = 1) QEnum<LogProblem, QCharacter> logProblem,
			QEnum<CodedCharacterSetID, QBinary> codedCharacterSetID) {
	
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
			// Cerco il messaggio
			for(QMessageDescription messageDescription: qMessageFile.getMessages()){
				if(messageDescription.getName().equals(messageIdentifier.trimR()))
					throw new OperatingSystemException("Message Description " + messageIdentifier + " already exist");
			}

			QMessageDescription qMessageDescription = QOperatingSystemMessageFileFactory.eINSTANCE.createMessageDescription();

			qMessageDescription.setName(messageIdentifier.trimR());
//			if (!qMessageFile.getMessages().contains(qMessageDescription))
//				throw new OperatingSystemException("Message Description " + messageIdentifier + " not exist");

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
		public QEnum<DataType, QHexadecimal> dataType;
		@DataDef(value = "*VARY")
		public QEnum<Length, QBinary> length;
		@DataDef(value = "0")
		public QBinary VARYBytesOrDecPos;

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
			ITV
		}

		public static enum Length {
			@Special(value = "-1")
			VARY, OTHER
		}
	}

	public static enum ReplyType {
		@Special(value = "S")
		SAME, @Special(value = "X")
		NONE, @Special(value = "C")
		CHAR, @Special(value = "D")
		DEC, @Special(value = "A")
		ALPHA, @Special(value = "N")
		NAME
	}

	public static class MaximumReplyLength extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		public QEnum<Length, QBinary> length;
		public QBinary decimalPositions;

		public static enum Length {
			@Special(value = "-2")
			SAME, @Special(value = "-3")
			NONE, @Special(value = "-1")
			TYPE, OTHER
		}
	}

	public static enum ValidReplyValue {
		@Special(value = "*SAME")
		SAME, @Special(value = "*NONE")
		NONE, OTHER
	}

	public static class SpecialReplyValue extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 32)
		public QEnum<OriginalFromValue, QCharacter> originalFromValue;
		@DataDef(length = 32)
		public QCharacter replacementToValue;

		public static enum OriginalFromValue {
			@Special(value = "*SAME")
			SAME, @Special(value = "*NONE")
			NONE, OTHER
		}
	}

	public static class RangeOfReplyValues extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 32)
		public QEnum<LowerValue, QCharacter> lowerValue;
		@DataDef(length = 32)
		public QCharacter upperValue;

		public static enum LowerValue {
			@Special(value = "*SAME")
			SAME, @Special(value = "*NONE")
			NONE, OTHER
		}
	}

	public static class RelationshipForValidReplies extends
			QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		public QEnum<RelationalOperator, QHexadecimal> relationalOperator;
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
			NG
		}
	}

	public static enum DefaultReplyValue {
		@Special(value = "*SAME")
		SAME, @Special(value = "*NONE")
		NONE, OTHER
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
			NONE, OTHER
		}

		public static enum Library {
			@Special(value = "*LIBL")
			LIBL, @Special(value = "*CURLIB")
			CURLIB, OTHER
		}
	}

	public static enum DataToBeDumped {
		@Special(value = "-3")
		SAME, @Special(value = "0")
		NONE, @Special(value = "-4")
		JOB, @Special(value = "-2")
		JOBINT, @Special(value = "-1")
		JOBDMP, OTHER
	}

	public static class AlertOptions extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1)
		public QEnum<AlertType, QCharacter> alertType;
		@DataDef(value = "*NONE")
		public QEnum<ResourceNameVariable, QBinary> resourceNameVariable;

		public static enum AlertType {
			@Special(value = "S")
			SAME, @Special(value = "I")
			IMMED, @Special(value = "D")
			DEFER, @Special(value = "U")
			UNATTEND, @Special(value = "N")
			NO, OTHER
		}

		public static enum ResourceNameVariable {
			@Special(value = "0")
			NONE, OTHER
		}
	}

	public static enum LogProblem {
		@Special(value = "S")
		SAME, @Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum CodedCharacterSetID {
		@Special(value = "-1")
		SAME, @Special(value = "65535")
		HEX, @Special(value = "0")
		JOB, OTHER
	}
}

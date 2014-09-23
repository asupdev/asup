package org.asup.os.type.msgf.base.api;

import javax.inject.Inject;

import org.asup.il.data.BinaryType;
import org.asup.il.data.DatetimeType;
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QDatetime;
import org.asup.il.data.QEnum;
import org.asup.il.data.QScroller;
import org.asup.il.data.QStroller;
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

@Command(name = "ADDMSGD")
@Program(name = "QMHCRMSD", messages = { "CPF2401", "CPF2407", "CPF2411",
		"CPF2412", "CPF2430", "CPF2461", "CPF2483", "CPF2510", "CPF9830",
		"CPF9838" })
public class MessageDescriptionAdder {

	@Inject
	private QMessageFileManager messageFileManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;

	public @Entry void main(
			@DataDef(length = 7) QCharacter messageIdentifier,
			@DataDef(qualified = true) MessageFile messageFile,
			@DataDef(length = 132) QCharacter firstLevelMessageText,
			@DataDef(length = 3000) QEnum<SecondLevelMessageText, QCharacter> secondLevelMessageText,
			@DataDef(binary = BinaryType.SHORT) QBinary severityCode,
			@DataDef(occurrences = "99") QStroller<MessageDataFieldsFormat> messageDataFieldsFormats,
			@DataDef(length = 1) QEnum<ReplyType, QCharacter> replyType,
			MaximumReplyLength maximumReplyLength,
			@DataDef(occurrences = "20", length = 32) QScroller<QEnum<ValidReplyValue, QCharacter>> validReplyValues,
			@DataDef(occurrences = "20") QStroller<SpecialReplyValue> specialReplyValues,
			RangeOfReplyValues rangeOfReplyValues,
			RelationshipForValidReplies relationshipForValidReplies,
			@DataDef(length = 132) QEnum<DefaultReplyValue, QCharacter> defaultReplyValue,
			@DataDef(qualified = true) DefaultProgramToCall defaultProgramToCall,
			@DataDef(occurrences = "102", binary = BinaryType.SHORT) QScroller<QEnum<DataToBeDumped, QBinary>> dataToBeDumped,
			LevelOfMessage levelOfMessage,
			AlertOptions alertOptions,
			@DataDef(length = 1) QEnum<LogProblem, QCharacter> logProblem,
			@DataDef(binary = BinaryType.INTEGER) QEnum<CodedCharacterSetID, QBinary> codedCharacterSetID) {

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
			QResourceWriter<QMessageFile> resource = messageFileManager
					.getResourceWriter(job, library);
			QMessageFile qMessageFile = resource.lookup(name);
			if (qMessageFile == null)
				throw new OperatingSystemException("Message File " + name
						+ " not exists in library " + library);
			// Cerco il messaggio
			for (QMessageDescription messageDescription : qMessageFile
					.getMessages()) {
				if (messageDescription.getName().equals(
						messageIdentifier.trimR()))
					throw new OperatingSystemException("Message Description "
							+ messageIdentifier + " already exist");
			}

			QMessageDescription qMessageDescription = QOperatingSystemMessageFileFactory.eINSTANCE
					.createMessageDescription();

			qMessageDescription.setName(messageIdentifier.trimR());
			// if (qMessageFile.getMessages().contains(qMessageDescription))
			// throw new OperatingSystemException("Message Description " +
			// messageIdentifier + " already exist");

			qMessageDescription.setMessageText(firstLevelMessageText.trimR());

			switch (secondLevelMessageText.asEnum()) {
			case NONE:
				break;
			case OTHER:
				qMessageDescription.setMessageHelp(secondLevelMessageText
						.asData().trimR());
				break;
			}

			// TODO non funziona bene
			qMessageDescription.setSeverity(severityCode.asInteger());

			qMessageFile.getMessages().add(qMessageDescription);

			resource.save(qMessageFile, true);

			jobLogManager.info(job, "Message Description " + messageIdentifier
					+ " added to Message File " + name);

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

	public static enum SecondLevelMessageText {
		@Special(value = "")
		NONE, OTHER
	}

	public static class MessageDataFieldsFormat extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1)
		public QEnum<DataType, QCharacter> dataType;
		@DataDef(value = "*VARY")
		public QEnum<Length, QBinary> length;
		@DataDef(value = "0")
		public QBinary VARYBytesOrDecPos;

		public static enum DataType {
			@Special(value = "FF")
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
		@Special(value = "C")
		CHAR, @Special(value = "D")
		DEC, @Special(value = "A")
		ALPHA, @Special(value = "N")
		NAME, @Special(value = "X")
		NONE
	}

	public static class MaximumReplyLength extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		public QEnum<Length, QBinary> length;
		public QBinary decimalPositions;

		public static enum Length {
			@Special(value = "-1")
			TYPE, @Special(value = "-2")
			NONE, OTHER
		}
	}

	public static enum ValidReplyValue {
		@Special(value = "*NONE")
		NONE, OTHER
	}

	public static class SpecialReplyValue extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 32)
		public QEnum<OriginalFromValue, QCharacter> originalFromValue;
		@DataDef(length = 32)
		public QCharacter replacementToValue;

		public static enum OriginalFromValue {
			@Special(value = "*NONE")
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
			@Special(value = "*NONE")
			NONE, OTHER
		}
	}

	public static class RelationshipForValidReplies extends
			QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1)
		public QEnum<RelationalOperator, QCharacter> relationalOperator;
		@DataDef(length = 32)
		public QCharacter value;

		public static enum RelationalOperator {
			@Special(value = "FF")
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
		@Special(value = "*NONE")
		NONE, OTHER
	}

	public static class DefaultProgramToCall extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<Name, QCharacter> name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<Library, QCharacter> library;

		public static enum Name {
			@Special(value = "*NONE")
			NONE, OTHER
		}

		public static enum Library {
			@Special(value = "*LIBL")
			LIBL, @Special(value = "*CURLIB")
			CURLIB, OTHER
		}
	}

	public static enum DataToBeDumped {
		@Special(value = "0")
		NONE, @Special(value = "-4")
		JOB, @Special(value = "-2")
		JOBINT, @Special(value = "-1")
		JOBDMP, OTHER
	}

	public static class LevelOfMessage extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(datetime = DatetimeType.DATE, value = "*CURRENT")
		public QEnum<CreationDate, QDatetime> creationDate;
		@DataDef(value = "1")
		public QBinary levelNumber;

		public static enum CreationDate {
			@Special(value = "0040000")
			CURRENT, OTHER
		}
	}

	public static class AlertOptions extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1, value = "*NO")
		public QEnum<AlertType, QCharacter> alertType;
		@DataDef(value = "*NONE")
		public QEnum<ResourceNameVariable, QBinary> resourceNameVariable;

		public static enum AlertType {
			@Special(value = "I")
			IMMED, @Special(value = "D")
			DEFER, @Special(value = "U")
			UNATTEND, @Special(value = "N")
			NO
		}

		public static enum ResourceNameVariable {
			@Special(value = "0")
			NONE, OTHER
		}
	}

	public static enum LogProblem {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum CodedCharacterSetID {
		@Special(value = "0")
		JOB, @Special(value = "65535")
		HEX, OTHER
	}
}
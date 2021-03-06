package org.asup.os.type.msgf.base.api; 

import javax.inject.Inject;

import org.asup.fw.core.annotation.Supported;
import org.asup.il.data.BinaryType;
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QCharacterDef;
import org.asup.il.data.QDataStructWrapper;
import org.asup.il.data.QDecimalDef;
import org.asup.il.data.QEnum;
import org.asup.il.data.QHexadecimal;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.data.QScroller;
import org.asup.il.data.QStroller;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLogManager;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.msgf.QMessageDescription;
import org.asup.os.type.msgf.QMessageDescriptionDataField;
import org.asup.os.type.msgf.QMessageFile;
import org.asup.os.type.msgf.QMessageFileManager;
import org.asup.os.type.msgf.impl.OperatingSystemMessageFileFactoryImpl;

@Supported
@Program(name = "QMHCHMSD")
public class MessageDescriptionChanger {

	@Inject
	private QMessageFileManager messageFileManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;
	
	public @Entry void main(
			@Supported @DataDef(length = 7) QCharacter messageIdentifier,
			@Supported @DataDef(qualified = true) MessageFile messageFile,
			@Supported @DataDef(length = 132) QEnum<FirstLevelMessageTextEnum, QCharacter> firstLevelMessageText,
			@Supported @DataDef(length = 3000) QEnum<SecondLevelMessageTextEnum, QCharacter> secondLevelMessageText,
			@Supported @DataDef(binaryType = BinaryType.SHORT) QEnum<SeverityCodeEnum, QBinary> severityCode,
			@Supported @DataDef(dimension = 99) QEnum<MessageDataFieldsFormatEnum, QStroller<MessageDataFieldsFormat>> messageDataFieldsFormats,
			@DataDef(length = 1) QEnum<ReplyTypeEnum, QCharacter> replyType,
			QEnum<MaximumReplyLengthEnum, MaximumReplyLength> maximumReplyLength,
			@DataDef(dimension = 20, length = 32) QEnum<ValidReplyValueEnum, QScroller<QCharacter>> validReplyValues,
			@DataDef(dimension = 20) QEnum<SpecialReplyValueEnum, QStroller<SpecialReplyValue>> specialReplyValues,
			QEnum<RangeOfReplyValuesEnum, RangeOfReplyValues> rangeOfReplyValues,
			QEnum<RelationshipForValidRepliesEnum, RelationshipForValidReplies> relationshipForValidReplies,
			@DataDef(length = 132) QEnum<DefaultReplyValueEnum, QCharacter> defaultReplyValue,
			@DataDef(qualified = true) QEnum<DefaultProgramToCallEnum, DefaultProgramToCall> defaultProgramToCall,
			@DataDef(dimension = 102, binaryType = BinaryType.SHORT) QEnum<DataToBeDumpedEnum, QScroller<QBinary>> dataToBeDumped,
			QEnum<AlertOptionsEnum, AlertOptions> alertOptions,
			@DataDef(length = 1) QEnum<LogProblemEnum, QCharacter> logProblem,
			@DataDef(binaryType = BinaryType.INTEGER) QEnum<CodedCharacterSetIDEnum, QBinary> codedCharacterSetID) {
	
		QResourceWriter<QMessageFile> resource = null;
		String library = null;
		switch (messageFile.library.asEnum()) {
		case LIBL:
			resource = messageFileManager.getResourceWriter(job, Scope.LIBRARY_LIST);
			break;
		case CURLIB:
			resource = messageFileManager.getResourceWriter(job, Scope.CURRENT_LIBRARY);
			break;
		case OTHER:
			library = messageFile.library.asData().trimR();
			resource = messageFileManager.getResourceWriter(job, library);
			break;
		}

		String name = messageFile.name.trimR();
		try {
			QMessageFile qMessageFile = resource.lookup(name);	
			if (qMessageFile == null)
				throw new OperatingSystemException("Message File " + name+ " not exists in library " + library);

			// Cerco il messaggio
			// TODO come lo cerco???
			QMessageDescription qMessageDescription = null;
			boolean check = false;
			for(QMessageDescription messageDescription: qMessageFile.getMessages()){
				// TODO è terribile questo!!!
				if(messageDescription.getName().equals(messageIdentifier.trimR())){
					check = true;
					qMessageDescription = messageDescription;
					break;
				}
			}
			if(!check)
				throw new OperatingSystemException("Message Description " + messageIdentifier + " not exist");

			
//			QMessageDescription qMessageDescription = QOperatingSystemMessageFileFactory.eINSTANCE.createMessageDescription();

			qMessageDescription.setName(messageIdentifier.trimR());
//			if (!qMessageFile.getMessages().contains(qMessageDescription))
//				throw new OperatingSystemException("Message Description " + messageIdentifier + " not exist");

			qMessageFile.getMessages().remove(qMessageDescription);			
			
			// MSG	
			switch (firstLevelMessageText.asEnum()) {
			case SAME:
				break;
			case OTHER:
				qMessageDescription.setMessageText(firstLevelMessageText.asData().trimR());
				break;
			}
			
			// SECLVL
			switch (secondLevelMessageText.asEnum()) {
			case TERM_HEX:
			case NONE:
				qMessageDescription.setMessageHelp("");
				break;
			case SAME:
				break;
			case OTHER:
				qMessageDescription.setMessageHelp(secondLevelMessageText.asData().trimR());
				break;
			}
			
			// SEV
			switch (severityCode.asEnum()) {
			case SAME:
				break;
			case OTHER:
				qMessageDescription.setSeverity(severityCode.asData().asInteger());
				break;
			}

			// FMT TODO
			QMessageDescriptionDataField messageDescriptionDataField = null;
			messageDescriptionDataField = OperatingSystemMessageFileFactoryImpl.eINSTANCE.createMessageDescriptionDataField();
			switch (messageDataFieldsFormats.asEnum()) {
			case NONE:
				qMessageDescription.getMessageDataFields().clear();
				break;
			case OTHER:
				qMessageDescription.getMessageDataFields().clear();
				int ii = 0;
				for(MessageDataFieldsFormat messageDataFieldsFormat: messageDataFieldsFormats.asData()) {
					if(messageDataFieldsFormat.isEmpty())
						continue;
					switch (messageDataFieldsFormat.dataType.asEnum()) {
					case BIN:
						break;
					case CCHAR:
						break;
					case QTDCHAR:
					case CHAR:
						messageDescriptionDataField = OperatingSystemMessageFileFactoryImpl.eINSTANCE.createMessageDescriptionDataField();
						messageDescriptionDataField.setOutputMask(messageDataFieldsFormat.dataType.getSpecialName());
						QCharacterDef characterDefinition = QIntegratedLanguageDataFactory.eINSTANCE.createCharacterDef();
						switch (messageDataFieldsFormat.length.asEnum()) {
						case OTHER:
							characterDefinition.setLength(messageDataFieldsFormat.length.asData().asInteger());
							break;
						case VARY:
							characterDefinition.setLength(messageDataFieldsFormat.VARYBytesOrDecPos.asShort());
							characterDefinition.setVarying(true);
							break;
						}
						messageDescriptionDataField.setDataDef(characterDefinition);
						qMessageDescription.getMessageDataFields().add(ii, messageDescriptionDataField);
						break;
					case DEC:
						messageDescriptionDataField = OperatingSystemMessageFileFactoryImpl.eINSTANCE.createMessageDescriptionDataField();
						messageDescriptionDataField.setOutputMask(messageDataFieldsFormat.dataType.getSpecialName());
						QDecimalDef decimalDefinition = QIntegratedLanguageDataFactory.eINSTANCE.createDecimalDef();
						switch (messageDataFieldsFormat.length.asEnum()) {
						case OTHER:
							decimalDefinition.setPrecision(messageDataFieldsFormat.length.asData().asInteger());
							break;
						case VARY:
							break;
						}
						decimalDefinition.setScale(messageDataFieldsFormat.VARYBytesOrDecPos.asShort());
						messageDescriptionDataField.setDataDef(decimalDefinition);
						qMessageDescription.getMessageDataFields().add(ii, messageDescriptionDataField);
						break;
					case DTS:
						break;
					case HEX:
						break;
					case ITV:
						break;
					case SPP:
						break;
					case SYP:
						break;
					case UBIN:
						break;
					case UTC:
						break;
					case UTCD:
						break;
					case UTCT:
						break;
					}
					ii++;
				}
				break;
			case SAME:
				break;
			}
			qMessageFile.getMessages().add(qMessageDescription);
			resource.save(qMessageFile, true);

			jobLogManager.info(job, "Message Description " + messageIdentifier + " added to Message File " + name);
		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	public static class MessageFile extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum FirstLevelMessageTextEnum {
		SAME, OTHER
	}

	public static enum SecondLevelMessageTextEnum {
		SAME, NONE, @Special(value = "*NONE")
		TERM_HEX, OTHER
	}

	public static enum SeverityCodeEnum {
		@Special(value = "-1")
		SAME, OTHER
	}

	public static class MessageDataFieldsFormat extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1)
		public QEnum<DataTypeEnum, QHexadecimal> dataType;
		@DataDef(binaryType = BinaryType.SHORT, value = "*VARY")
		public QEnum<LengthEnum, QBinary> length;
		@DataDef(binaryType = BinaryType.SHORT, value = "0")
		public QBinary VARYBytesOrDecPos;

		public static enum DataTypeEnum {
			@Special(value = "04")
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

		public static enum LengthEnum {
			@Special(value = "-1")
			VARY, OTHER
		}
	}

	public static enum MessageDataFieldsFormatEnum {
		@Special(value = "FE")
		SAME, @Special(value = "FF")
		NONE, OTHER
	}

	public static enum ReplyTypeEnum {
		@Special(value = "S")
		SAME, @Special(value = "X")
		NONE, @Special(value = "C")
		CHAR, @Special(value = "D")
		DEC, @Special(value = "A")
		ALPHA, @Special(value = "N")
		NAME
	}

	public static class MaximumReplyLength extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.SHORT)
		public QBinary length;
		@DataDef(binaryType = BinaryType.SHORT)
		public QBinary decimalPositions;
	}

	public static enum MaximumReplyLengthEnum {
		@Special(value = "-2")
		SAME, @Special(value = "-3")
		NONE, @Special(value = "-1")
		TYPE, OTHER
	}

	public static enum ValidReplyValueEnum {
		SAME, NONE, OTHER
	}

	public static class SpecialReplyValue extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 32)
		public QCharacter originalFromValue;
		@DataDef(length = 32)
		public QCharacter replacementToValue;
	}

	public static enum SpecialReplyValueEnum {
		SAME, NONE, OTHER
	}

	public static class RangeOfReplyValues extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 32)
		public QCharacter lowerValue;
		@DataDef(length = 32)
		public QCharacter upperValue;
	}

	public static enum RangeOfReplyValuesEnum {
		SAME, NONE, OTHER
	}

	public static class RelationshipForValidReplies extends
			QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1)
		public QEnum<RelationalOperatorEnum, QHexadecimal> relationalOperator;
		@DataDef(length = 32)
		public QCharacter value;

		public static enum RelationalOperatorEnum {
			@Special(value = "50")
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

	public static enum RelationshipForValidRepliesEnum {
		@Special(value = "FE")
		SAME, @Special(value = "FF")
		NONE, OTHER
	}

	public static enum DefaultReplyValueEnum {
		SAME, NONE, OTHER
	}

	public static class DefaultProgramToCall extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum DefaultProgramToCallEnum {
		SAME, NONE, OTHER
	}

	public static enum DataToBeDumpedEnum {
		@Special(value = "-3")
		SAME, @Special(value = "0")
		NONE, @Special(value = "-4")
		JOB, @Special(value = "-2")
		JOBINT, @Special(value = "-1")
		JOBDMP, OTHER
	}

	public static class AlertOptions extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1)
		public QEnum<AlertTypeEnum, QCharacter> alertType;
		@DataDef(binaryType = BinaryType.SHORT, value = "*NONE")
		public QEnum<ResourceNameVariableEnum, QBinary> resourceNameVariable;

		public static enum AlertTypeEnum {
			@Special(value = "I")
			IMMED, @Special(value = "D")
			DEFER, @Special(value = "U")
			UNATTEND, @Special(value = "N")
			NO, OTHER
		}

		public static enum ResourceNameVariableEnum {
			@Special(value = "0")
			NONE, OTHER
		}
	}

	public static enum AlertOptionsEnum {
		@Special(value = "S")
		SAME, OTHER
	}

	public static enum LogProblemEnum {
		@Special(value = "S")
		SAME, @Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum CodedCharacterSetIDEnum {
		@Special(value = "-1")
		SAME, @Special(value = "65535")
		HEX, @Special(value = "0")
		JOB, OTHER
	}
}

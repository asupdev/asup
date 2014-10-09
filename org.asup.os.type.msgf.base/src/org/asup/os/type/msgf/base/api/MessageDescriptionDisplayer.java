package org.asup.os.type.msgf.base.api;

import java.io.IOException;

import javax.inject.Inject;

import org.asup.fw.core.annotation.Supported;
import org.asup.fw.core.annotation.ToDo;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLogManager;
import org.asup.os.core.output.QObjectWriter;
import org.asup.os.core.output.QOutputManager;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.msgf.QMessageDescription;
import org.asup.os.type.msgf.QMessageDescriptionDataField;
import org.asup.os.type.msgf.QMessageFile;
import org.asup.os.type.msgf.QMessageFileManager;

@Supported 
@Program(name = "QMHDSMSF")
public  class MessageDescriptionDisplayer {

	@Inject
	private QMessageFileManager messageFileManager;
	@Inject
	private QOutputManager outputManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;

	public @Entry void main(
			@Supported QEnum<RangeOfMessageIdentifiersEnum, RangeOfMessageIdentifiers> rangeOfMessageIdentifiers,
			@Supported @DataDef(qualified = true) MessageFile messageFile,
			@ToDo @DataDef(length = 6) QEnum<DetailEnum, QCharacter> detail,
			@ToDo @DataDef(length = 1) QEnum<FormatMessageTextEnum, QCharacter> formatMessageText,
			@Supported @DataDef(length = 1) QEnum<OutputEnum, QCharacter> output) {

		QResourceWriter<QMessageFile> resource = null;
		String library = null;
		switch (messageFile.library.asEnum()) {
		case LIBL:
		case USRLIBL:
		case CURLIB:
			library = messageFile.library.getSpecialName();
			resource = messageFileManager.getResourceWriter(job, Scope.getByName(library));
			break;
		case OTHER:
			library = messageFile.library.asData().trimR();
			resource = messageFileManager.getResourceWriter(job, library);
			break;
		}

		QMessageFile qMessageFile = resource.lookup(messageFile.name.trimR());
		if (qMessageFile == null) 
			throw new OperatingSystemRuntimeException("Message File " + messageFile.name + " not exists in library " + library);

		QObjectWriter objectWriter = outputManager.getObjectWriter(job, output.asData().trimR());
		objectWriter.initialize();

		// RANGE 
		switch (rangeOfMessageIdentifiers.asEnum()) {
		case ALL:
			for (QMessageDescription qMessageDescription : qMessageFile.getMessages()) {
				writeRecord(qMessageDescription, objectWriter);
			}
			break;
		case OTHER:
			for (@SuppressWarnings("unused") QMessageDescription qMessageDescription : qMessageFile.getMessages()) {
				switch (rangeOfMessageIdentifiers.asData().lowerValue.asEnum()) {
				case FIRST:
					break;
				case OTHER:
					break;
				}
				switch (rangeOfMessageIdentifiers.asData().upperValue.asEnum()) {
				case LAST:
					break;
				case ONLY:
					break;
				case OTHER:
					break;
				}
			}
			break;
		}

		
/*		
		for (QJob qJob : jobManager.getActiveJobs()) {
			try {
				objectWriter.write(qJob);
			} catch (IOException e) {
				throw new OperatingSystemRuntimeException(e);
			}
		}
*/
		objectWriter.flush();
	}

	private void writeRecord(QMessageDescription qMessageDescription, QObjectWriter objectWriter){
		try {
			objectWriter.write(qMessageDescription);
			for (QMessageDescriptionDataField qMessageDescriptionDataField : qMessageDescription.getMessageDataFields()) {
				try {
					objectWriter.write(qMessageDescriptionDataField);
				} catch (IOException e) {
					jobLogManager.error(job, e.getMessage());
				}
			}
		} catch (IOException e) {
			jobLogManager.error(job, e.getMessage());
		}
	}
	
	
	public static class RangeOfMessageIdentifiers extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 7, value = "*FIRST")
		public QEnum<LowerValueEnum, QCharacter> lowerValue;
		@DataDef(length = 7, value = "*ONLY")
		public QEnum<UpperValueEnum, QCharacter> upperValue;

		public static enum LowerValueEnum {
			FIRST, OTHER
		}

		public static enum UpperValueEnum {
			ONLY, LAST, OTHER
		}
	}

	public static enum RangeOfMessageIdentifiersEnum {
		ALL, OTHER
	}

	public static class MessageFile extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10, value = "QCPFMSG")
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, USRLIBL, OTHER
		}
	}

	public static enum DetailEnum {
		BASIC, FULL
	}

	public static enum FormatMessageTextEnum {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}

	public static enum OutputEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "L")
		PRINT
	}
}

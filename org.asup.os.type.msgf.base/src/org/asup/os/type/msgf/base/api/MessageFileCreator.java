package org.asup.os.type.msgf.base.api; 

import javax.inject.Inject;

import org.asup.fw.core.annotation.Supported;
import org.asup.il.data.BinaryType;
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QEnum;
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
import org.asup.os.type.msgf.QMessageFile;
import org.asup.os.type.msgf.QMessageFileManager;
import org.asup.os.type.msgf.QOperatingSystemMessageFileFactory;

@Supported
@Program(name = "QMHCRMSF")
public class MessageFileCreator {

	@Inject
	private QMessageFileManager messageFileManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;
	
	public @Entry void main(
			@Supported @DataDef(qualified = true) MessageFile messageFile,
			@Supported  @DataDef(length = 50) QEnum<TextDescriptionEnum, QCharacter> textDescription,
			FileSize fileSize,
			@DataDef(length = 10) QEnum<AuthorityEnum, QCharacter> authority,
			@DataDef(binaryType = BinaryType.INTEGER) QEnum<CodedCharacterSetIDEnum, QBinary> codedCharacterSetID) {
	
		QResourceWriter<QMessageFile> resource = null;
		String library = null;

		switch (messageFile.library.asEnum()) {
		case CURLIB:
			resource = messageFileManager.getResourceWriter(job, Scope.CURRENT_LIBRARY);
			break;
		case OTHER:
			library = messageFile.library.asData().trimR();
			resource = messageFileManager.getResourceWriter(job, library);
			break;
		}

		QMessageFile qMessageFile = resource.lookup(messageFile.name.trimR());
		if (qMessageFile != null) 
			throw new OperatingSystemRuntimeException("Message File " + messageFile.name + " already exists in library " + library);
		
		qMessageFile = QOperatingSystemMessageFileFactory.eINSTANCE.createMessageFile();

		// MSGF
		qMessageFile.setName(messageFile.name.trimR());
		qMessageFile.setLibrary(library);

		// TEXT
		switch (textDescription.asEnum()) {
		case BLANK:
			qMessageFile.setText("");
			break;
		case OTHER:
			qMessageFile.setText(textDescription.asData().trimR());
			break;
		}
		
		try {
			resource.save(qMessageFile);
			jobLogManager.info(job, "Message File " + messageFile.name.trimR()+ " created");
		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	public static class MessageFile extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*CURLIB")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			CURLIB, OTHER
		}
	}

	public static enum TextDescriptionEnum {
		@Special(value = "")
		BLANK, OTHER
	}

	public static class FileSize extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.SHORT, value = "10")
		public QBinary initialStorageSize;
		@DataDef(binaryType = BinaryType.SHORT, value = "2")
		public QBinary incrementStorageSize;
		@DataDef(binaryType = BinaryType.SHORT, value = "*NOMAX")
		public QEnum<MaximumIncrementsEnum, QBinary> maximumIncrements;

		public static enum MaximumIncrementsEnum {
			@Special(value = "-1")
			NOMAX, OTHER
		}
	}

	public static enum AuthorityEnum {
		LIBCRTAUT, CHANGE, ALL, USE, EXCLUDE, OTHER
	}

	public static enum CodedCharacterSetIDEnum {
		@Special(value = "65535")
		HEX, @Special(value = "65534")
		MSGD, @Special(value = "0")
		JOB, OTHER
	}
}

package org.asup.os.type.msgf.base.api;

import javax.inject.Inject;

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
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLogManager;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.msgf.QMessageFile;
import org.asup.os.type.msgf.QMessageFileManager;
import org.asup.os.type.msgf.QOperatingSystemMessageFileFactory;

@Program(name = "QMHCRMSF")

public class MessageFileCreator {

	@Inject
	private QMessageFileManager messageFileManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;
	
	public @Entry void main(
			@DataDef(qualified = true) MessageFile messageFile,
			@DataDef(length = 50) QEnum<TextDescription, QCharacter> textDescription,
			FileSize filesize,
			@DataDef(length = 10) QEnum<Authority, QCharacter> authority,
			@DataDef() QEnum<CodedCharacterSetID, QBinary> codedCharacterSetId) {
	
		String library = "";
		switch (messageFile.library.asEnum()) {
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
			if (qMessageFile != null) throw new OperatingSystemException("Message File " + name + " already exists in library " + library);
			
			qMessageFile = QOperatingSystemMessageFileFactory.eINSTANCE.createMessageFile();

			qMessageFile.setName(name);
			qMessageFile.setLibrary(library);
			
			switch (textDescription.asEnum()) {
			case BLANK:
				qMessageFile.setText("");
				break;
			case OTHER:
				qMessageFile.setText(textDescription.asData().trimR());
				break;
			}
			
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
		@DataDef(length = 10)
		public QEnum<Library, QCharacter> library;

		public static enum Library {
			@Special(value = "*CURLIB")
			CURLIB, OTHER
		}
	}

	public static enum TextDescription {
		@Special(value = "")
		BLANK, OTHER
	}

	public static class FileSize extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		public @DataDef() QBinary initialstoragesize;
		public @DataDef() QBinary incrementstoragesize;
		public @DataDef() QEnum<MaximumIncrements, QBinary> maximumincrements;

		public static enum MaximumIncrements {
			@Special(value = "-1")
			NOMAX, OTHER
		}
	}

	public static enum Authority {
		@Special(value = "*LIBCRTAUT")
		LIBCRTAUT, @Special(value = "*CHANGE")
		CHANGE, @Special(value = "*ALL")
		ALL, @Special(value = "*USE")
		USE, @Special(value = "*EXCLUDE")
		EXCLUDE, OTHER
	}

	public static enum CodedCharacterSetID {
		@Special(value = "65535")
		HEX, @Special(value = "65534")
		MSGD, @Special(value = "0")
		JOB
	}
}

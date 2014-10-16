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

@Supported
@Program(name = "QMHCHMSF")

public class MessageFileChanger {

	@Inject
	private QMessageFileManager messageFileManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;

	public @Entry void main(
			@Supported @DataDef(qualified = true) MessageFile messageFile,
			@Supported @DataDef(length = 50) QEnum<TextDescriptionEnum, QCharacter> textDescription,
			@DataDef(binaryType = BinaryType.INTEGER) QEnum<CodedCharacterSetIDEnum, QBinary> codedCharacterSetID) {

		QResourceWriter<QMessageFile> resource = null;
		// MSGF
		String library = null;
		switch (messageFile.library.asEnum()) {
		case LIBL:
			resource = messageFileManager.getResourceWriter(job, Scope.LIBRARY_LIST);
			break;
		case CURLIB:
			resource = messageFileManager.getResourceWriter(job, Scope.CURRENT_LIBRARY);
			break;
		case USRLIBL:
			resource = messageFileManager.getResourceWriter(job, Scope.USER_LIBRARY_LIST);
			break;
		case ALLUSR:
			resource = messageFileManager.getResourceWriter(job, Scope.ALL_USER);
			break;
		case ALL:
			resource = messageFileManager.getResourceWriter(job, Scope.ALL);
			break;
		case OTHER:
			library = messageFile.library.asData().trimR();
			resource = messageFileManager.getResourceWriter(job, library);
			break;
		}

		String name = null;
		switch (messageFile.name.asEnum()) {
		case ALL:
			// TODO 
			// il nome può essere anche *ALL, gestiamo questa cosa?
			name = messageFile.name.getSpecialName();
			break;
		case OTHER:
			name = messageFile.name.asData().trimR();
			break;
		}

		QMessageFile qMessageFile = resource.lookup(name);	
		if (qMessageFile == null)
			throw new OperatingSystemRuntimeException("Message File " + name+ " not exists in library " + library);

		// TEXT
		switch (textDescription.asEnum()) {
		case SAME:
			break;
		case BLANK:
			qMessageFile.setText("");
			break;
		case OTHER:
			qMessageFile.setText(textDescription.asData().trimR());
			break;
		}

		try {
			resource.save(qMessageFile,true);
			jobLogManager.info(job, "Message File " + name + " changed");
		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	public static class MessageFile extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NameGenericEnum, QCharacter> name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum NameGenericEnum {
			ALL, OTHER
		}

		public static enum LibraryEnum {
			LIBL, CURLIB, USRLIBL, ALLUSR, ALL, OTHER
		}
	}

	public static enum TextDescriptionEnum {
		SAME, BLANK, OTHER
	}

	public static enum CodedCharacterSetIDEnum {
		@Special(value = "-1")
		SAME, @Special(value = "65535")
		HEX, @Special(value = "65534")
		MSGD, @Special(value = "0")
		JOB, OTHER
	}
}

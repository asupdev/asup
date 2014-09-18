package org.asup.os.type.msgf.base.api;

import javax.inject.Inject;

import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.Command;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.type.msgf.QMessageFile;
import org.asup.os.type.msgf.QMessageFileManager;

//@Program(name = "QDMOVERD")

@Command(name = "OVRMSGF")
@Program(name = "QASMSGFOVR", messages = { "CPF180C"})

public class MessageFileOverrider {

	@Inject
	private QMessageFileManager messageFileManager;
	@Inject
	private QJob job;

	public @Entry void main(
			@DataDef(length = 10) QCharacter messageFileBeingOverridden,
			@DataDef(qualified = true) OverridingToMessageFile overridingToMessageFile,
			@DataDef(length = 1, value = "*NO") QEnum<SecureFromOtherOverrides, QCharacter> secureFromOtherOverrides
			) {


		String library = "";
		switch (overridingToMessageFile.library.asEnum()) {
		case LIBL:
		case CURLIB:
			library = overridingToMessageFile.library.getSpecialName();
			break;
		case OTHER:
			library = overridingToMessageFile.library.asData().trimR();
			break;
		}

		String name = overridingToMessageFile.name.trimR();
		
		QResourceReader<QMessageFile> resource = messageFileManager.getResourceReader(job, library);

		QMessageFile qMessageFile = resource.lookup(library);

		if (qMessageFile == null)
			throw new OperatingSystemRuntimeException("Message File not found: " + name);

		messageFileManager.overrideMessageFile(job, messageFileBeingOverridden.trimR(), qMessageFile);
	}

	public static class OverridingToMessageFile extends QDataStructDelegator {
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

	public static enum SecureFromOtherOverrides {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES, MISSING
	}
}

package org.asup.os.type.msgf.base.api;

import javax.inject.Inject;

import org.asup.fw.core.annotation.Supported;
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
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.type.msgf.QMessageFile;
import org.asup.os.type.msgf.QMessageFileManager;
@Supported
@Program(name = "QASMSGFOVR")

public class MessageFileOverrider {

	@Inject
	private QMessageFileManager messageFileManager;
	@Inject
	private QJob job;

	public @Entry void main(
			@Supported @DataDef(length = 10) QCharacter messageFileBeingOverridden,
			@Supported @DataDef(qualified = true) OverridingToMessageFile overridingToMessageFile,
			@DataDef(length = 1) QEnum<SecureFromOtherOverridesEnum, QCharacter> secureFromOtherOverrides) {

		QResourceReader<QMessageFile> resource = null;
		String library = null;
		switch (overridingToMessageFile.library.asEnum()) {
		case LIBL:
		case CURLIB:
			library = overridingToMessageFile.library.getSpecialName();
			resource = messageFileManager.getResourceReader(job, Scope.getByName(library));
			break;
		case OTHER:
			library = overridingToMessageFile.library.asData().trimR();
			resource = messageFileManager.getResourceReader(job, library);
			break;
		}

		QMessageFile qMessageFile = resource.lookup(library);

		if (qMessageFile == null)
			throw new OperatingSystemRuntimeException("Message File not found: " + overridingToMessageFile.name);

		messageFileManager.overrideMessageFile(job, messageFileBeingOverridden.trimR(), qMessageFile);
	}

	public static class OverridingToMessageFile extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum SecureFromOtherOverridesEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}
}

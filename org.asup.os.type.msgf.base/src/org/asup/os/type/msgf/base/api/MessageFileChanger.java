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
import org.asup.os.type.msgf.QMessageFile;
import org.asup.os.type.msgf.QMessageFileManager;

@Command(name = "CHGMSGF")
@Program(name = "QMHCHMSF", messages = { "CPF2401", "CPF2407", "CPF2411",
		"CPF247E", "CPF2483", "CPF9830"})

public class MessageFileChanger {

	@Inject
	private QMessageFileManager messageFileManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;

	public @Entry void main(
			@DataDef(qualified = true) MessageFile messageFile,
			@DataDef(length = 50) QEnum<TextDescription, QCharacter> textDescription,
			QEnum<CodedCharacterSetID, QBinary> codedcharactersetid) {

		String library = "";
		switch (messageFile.library.asEnum()) {
		case LIBL:
		case CURLIB:
		case USRLIBL:
		case ALLUSR:
		case ALL:
			library = messageFile.library.getSpecialName();
			break;
		case OTHER:
			library = messageFile.library.asData().trimR();
			break;
		}

		String name = "";
		switch (messageFile.name.asEnum()) {
		case ALL:
			name = messageFile.name.getSpecialName();
			break;
		case OTHER:
			name = messageFile.name.asData().trimR();
			break;
		}

		// TODO 
		// il nome può essere anche *ALL, gestiamo questa cosa?
		
		try {
			QResourceWriter<QMessageFile> resource = messageFileManager.getResourceWriter(job, library);
			QMessageFile qMessageFile = resource.lookup(name);	
			if (qMessageFile == null)
				throw new OperatingSystemException("Message File " + name+ " not exists in library " + library);

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

			resource.save(qMessageFile,true);

			jobLogManager.info(job, "Message File " + name + " changed");

		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	
	
	}

	public static class MessageFile extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NameGeneric, QCharacter> name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<Library, QCharacter> library;

		public static enum NameGeneric {
			@Special(value = "*ALL")
			ALL, OTHER
		}

		public static enum Library {
			@Special(value = "*LIBL")
			LIBL, @Special(value = "*CURLIB")
			CURLIB, @Special(value = "*USRLIBL")
			USRLIBL, @Special(value = "*ALLUSR")
			ALLUSR, @Special(value = "*ALL")
			ALL, OTHER
		}
	}

	public static enum TextDescription {
		@Special(value = "*SAME")
		SAME, @Special(value = "*BLANK")
		BLANK, OTHER
	}

	public static enum CodedCharacterSetID {
		@Special(value = "-1")
		SAME, @Special(value = "65535")
		HEX, @Special(value = "65534")
		MSGD, @Special(value = "0")
		JOB
	}
}

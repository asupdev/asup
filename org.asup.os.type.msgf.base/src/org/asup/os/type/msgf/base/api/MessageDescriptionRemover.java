package org.asup.os.type.msgf.base.api; 

import javax.inject.Inject;

import org.asup.fw.core.annotation.Supported;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructWrapper;
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
import org.asup.os.type.msgf.QMessageDescription;
import org.asup.os.type.msgf.QMessageFile;
import org.asup.os.type.msgf.QMessageFileManager;

@Supported
@Program(name = "QMHDLMSD")

public class MessageDescriptionRemover {

	@Inject
	private QMessageFileManager messageFileManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;

	public @Entry void main(
			@Supported @DataDef(length = 7) QCharacter messageIdentifier,
			@Supported @DataDef(qualified = true) MessageFile messageFile) {

		QResourceWriter<QMessageFile> resource = null;

		String library = null;
		switch (messageFile.library.asEnum()) {
		case LIBL:
			resource = messageFileManager.getResourceWriter(job, Scope.LIBRARY_LIST);
			break;
		case CURLIB:
			resource = messageFileManager.getResourceWriter(job, Scope.LIBRARY_LIST);
			break;
		case OTHER:
			library = messageFile.library.asData().trimR();
			resource = messageFileManager.getResourceWriter(job, library);
			break;
		}

		@SuppressWarnings("unused")
		QMessageDescription qMessageDescription = (QMessageDescription) resource.lookup(messageIdentifier.trimR());

		// TODO non ho trovato modo migliore al momento
		try {
			QMessageFile qMessageFile = resource.lookup(messageFile.name.trimR());	
			if (qMessageFile == null)
				throw new OperatingSystemException("Message File " + messageFile.name+ " not exists in library " + library);

			int ii=0;
			for(QMessageDescription messageDescription:qMessageFile.getMessages()){
				if(messageDescription.getName().equals(messageIdentifier.trimR())){
				ii++;	
				qMessageFile.getMessages().remove(messageDescription);			
				jobLogManager.info(job, "Message Description " + messageIdentifier + " deleted ");
				resource.save(qMessageFile, true);
				break;
				}
			}
			if(ii==0)
				throw new OperatingSystemException("Message Description " + messageIdentifier + " not exist");
		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	public static class MessageFile extends QDataStructWrapper {
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
}
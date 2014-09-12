package org.asup.os.type.jobd.base.api;


import javax.inject.Inject;

import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.Command;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLogManager;
import org.asup.os.core.output.QObjectWriter;
import org.asup.os.core.output.QOutputManager;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.type.QTypedObject;
import org.asup.os.type.jobd.QJobDescription;

@Command(name = "WRKJOBD")
@Program(name = "QASWRJBD", messages = {"CPF9809"})

public  class JobDescriptionWorker {
	
	@Inject 
	private QResourceFactory resourceFactory;
	@Inject 
	private QJob job;
	@Inject
	private QOutputManager outputManager;
	@Inject
	private QJobLogManager jobLogManager;
	
	

	public @Entry void main(
			@DataDef(qualified = true) JobDescription jobDescription) {

		QObjectWriter objectWriter = outputManager.getDefaultWriter(job);
		objectWriter.initialize();

		QResourceReader<?> resourceReader = null;
		Scope scope = Scope.get(jobDescription.library.asData().trimR());
		if (scope != null)
			resourceReader = resourceFactory.getResourceReader(job,	QJobDescription.class, scope);
		else
			resourceReader = resourceFactory.getResourceReader(job, QJobDescription.class, jobDescription.library.asData().trimR());

		QObjectIterator<?> objectIterator = null;
		
		switch (jobDescription.name.asEnum()) {
			case ALL:
				objectIterator = resourceReader.find(null);					
				break;
			case OTHER:
				objectIterator = resourceReader.find(jobDescription.name.asData().trimR());					
				break;
		}

		QTypedObject qObject = null;
		while (objectIterator.hasNext()) {
			try {
				qObject = (QTypedObject)objectIterator.next();
				objectWriter.write(qObject);
			} catch (Exception e) {
				jobLogManager.error(job, qObject + " " + e.getMessage());
			}
		}
		objectIterator.close();
		objectWriter.flush();
		
	}

	public static class JobDescription extends QDataStructDelegator {
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
			ALL
		}
	}
}

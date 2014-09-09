package org.asup.os.type.jobd.base.api;

import javax.inject.Inject;

import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.annotation.Command;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLogManager;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.jobd.QJobDescription;

@Command(name = "DLTJOBD")
@Program(name = "QMUDLJBD", messages = { "CPF2105", "CPF2110", "CPF2114",
		"CPF2117", "CPF2182", "CPF2189" })
public class JobDescriptionDeleter {
	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;

	public @Entry void main(
			@DataDef(qualified = true) JobDescription jobDescription) {

		try {
			deleteJobDescription(job, resourceFactory,
					jobDescription.library.trimR(),
					jobDescription.name.trimR());
			jobLogManager.info(job, "Job Description " +jobDescription.name.trimR()+ " deleted");
		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}

	}

	private void deleteJobDescription(QJob job,QResourceFactory resourceFactory, String library, String name) throws OperatingSystemException{
		QResourceWriter<QJobDescription> resource = resourceFactory.getResourceWriter(job, QJobDescription.class, library);	
		QJobDescription jd = resource.lookup(name);	
			if (jd == null)			
				throw new OperatingSystemRuntimeException("Job Description not found: "	+ name);
			resource.delete(jd);
	}

	public static class JobDescription extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		// @DataDef(length = 10, value = "*LIBL")
		// public QEnum<Library, QCharacter> library;
		@DataDef(length = 10)
		public QCharacter library;

		public static enum Library {
			@Special(value = "*LIBL")
			LIBL, @Special(value = "*CURLIB")
			CURLIB, @Special(value = "*USRLIBL")
			USRLIBL, @Special(value = "*ALL")
			ALL, @Special(value = "*ALLUSR")
			ALLUSR
		}
	}
}

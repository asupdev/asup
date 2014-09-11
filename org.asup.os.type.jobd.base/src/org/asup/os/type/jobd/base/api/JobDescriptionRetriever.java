package org.asup.os.type.jobd.base.api;

import javax.inject.Inject;

import org.asup.il.data.QArray;
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataManager;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QPointer;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.jobd.QJobDescription;

@Program(name = "QWDRJOBD", messages = { "CPF1618", "CPF24B4", "CPF3CF1",
		"CPF3CF2", "CPF3C21", "CPF3C24", "CPF3C90", "CPF9801", "CPF9802",
		"CPF9803", "CPF9804", "CPF9807", "CPF9808", "CPF9810", "CPF9820",
		"CPF9830", "CPF9872" })
public class JobDescriptionRetriever {

	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QJob job;
	@Inject
	private QDataManager dataManager;

	public @Entry void main(QPointer receiverVariable,
			QBinary receiveVariableLength,
			@DataDef(length = 8) QCharacter formatName,
			@DataDef(qualified = false) JobDescription jobDescription,
			QPointer errorCode) {

		try {
			String library = jobDescription.library.trimR();
			String name = jobDescription.name.trimR();

			QResourceWriter<QJobDescription> resource = resourceFactory
					.getResourceWriter(job, QJobDescription.class, library);
			QJobDescription qJobDescription = resource.lookup(name);

			if (qJobDescription == null)
				throw new OperatingSystemException("Job Description " + name
						+ " not exists in library " + library);

			if (formatName.eq("JOBD0100")) {
				QDataFactory dataFactory = dataManager.createFactory(job);
				JOBD0100 jobd0100 = dataFactory.createDataStruct(
						JOBD0100.class, null, 0);

				jobd0100.jobDescriptionName.eval(qJobDescription.getName());
				jobd0100.jobDescriptionLibrary.eval(qJobDescription.getLibrary());
				jobd0100.user.eval(qJobDescription.getUser());

				jobd0100.jobQueueName.eval(qJobDescription.getJobQueue().getName());
				jobd0100.jobQueueLibrary.eval(qJobDescription.getJobQueue().getLibrary());
				jobd0100.jobQueuePriority.eval(qJobDescription.getJobPriorityOnJobq());

				jobd0100.outQueueName.eval(qJobDescription.getOutQueue().getName());
				jobd0100.outQueueLibrary.eval(qJobDescription.getOutQueue().getLibrary());
				jobd0100.outQueuePriority.eval(qJobDescription.getOutputPriorityOnOutq());

				jobd0100.textDescription.eval(qJobDescription.getText());
				jobd0100.initialLibraryList.eval(qJobDescription.getLibraries());

				receiverVariable.eval(jobd0100);
			} else {
				throw new OperatingSystemException("Format name not supported");
			}

		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	public static class JobDescription extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10)
		public QCharacter library;
	}

	public static class JOBD0100 extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter jobDescriptionName;
		@DataDef(length = 10)
		public QCharacter jobDescriptionLibrary;
		@DataDef(length = 10)
		public QCharacter user;
		@DataDef(length = 10)
		public QCharacter jobQueueName;
		@DataDef(length = 10)
		public QCharacter jobQueueLibrary;
		@DataDef(length = 1)
		public QCharacter jobQueuePriority;
		@DataDef(length = 10)
		public QCharacter outQueueName;
		@DataDef(length = 10)
		public QCharacter outQueueLibrary;
		@DataDef(length = 1)
		public QCharacter outQueuePriority;
		@DataDef(length = 50)
		public QCharacter textDescription;
		@DataDef(dimension = "250", length = 11)
		public QArray<QCharacter> initialLibraryList;
	}

}

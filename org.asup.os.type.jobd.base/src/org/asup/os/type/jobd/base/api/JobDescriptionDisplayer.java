/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.os.type.jobd.base.api;

import java.io.IOException;
import java.util.List;

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
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLogManager;
import org.asup.os.core.output.QObjectWriter;
import org.asup.os.core.output.QOutputManager;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.type.QOperatingSystemTypeFactory;
import org.asup.os.type.QTypedReference;
import org.asup.os.type.jobd.QJobDescription;
import org.asup.os.type.lib.QLibrary;

@Command(name = "DSPJOBD")
@Program(name = "QWDCDSG")
public class JobDescriptionDisplayer {

	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QOutputManager outputManager;
	@Inject
	private QJobLogManager jobLogManager;
	@Inject
	private QJob job;

	@Entry
	public void main(
			@DataDef(qualified = true) JobDescription jobDescription,
			@DataDef(length = 1, value = "*") QEnum<Output, QCharacter> output) {

		QObjectWriter objectWriter = outputManager.getObjectWriter(job,	output.getSpecialName());
		objectWriter.initialize();

		if (jobDescription.name.trimR().equals("*CURRENT")) {
			writeLibraries(objectWriter, job.getLibraries());
			objectWriter.flush();
			return;
		}

		QResourceReader<QJobDescription> resourceReader = null;

		Scope scope = Scope.get(jobDescription.library.getSpecialName());
		if (scope != null)
			resourceReader = resourceFactory.getResourceReader(job, QJobDescription.class, scope);
		else
			resourceReader = resourceFactory.getResourceReader(job, QJobDescription.class, jobDescription.library.asData().trimR());

		QJobDescription qJobDescription = resourceReader.lookup(jobDescription.name.trimR());
		if (qJobDescription == null)
			throw new OperatingSystemRuntimeException("Job description not found: " + jobDescription);

		writeLibraries(objectWriter, qJobDescription.getLibraries());
		objectWriter.flush();

	}

	private void writeLibraries(QObjectWriter objectWriter, List<String> libraries) {

		for (String library : libraries) {
			QTypedReference<QLibrary> qLibrary = QOperatingSystemTypeFactory.eINSTANCE.createTypedReference();
			qLibrary.setName(library);
			try {
				objectWriter.write(qLibrary);
			} catch (IOException e) {
				jobLogManager.error(job, e.getMessage());
			}
		}
	}

	public static class JobDescription extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<Library, QCharacter> library;

		public static enum Library {
			@Special(value = "*LIBL")
			LIBL, @Special(value = "*CURLIB")
			CURLIB
		}
	}

	public static enum Output {
		@Special(value = "*")
		TERM_STAR, @Special(value = "L")
		PRINT, MISSING
	}


}

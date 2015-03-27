package org.asup.os.splf.base.api;

import javax.inject.Inject;

import org.asup.il.data.QCharacter;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.splf.QSpoolFile;

public @Program(name = "QMUSPLFP") class SpoolFilePrinter {

	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QJob job;

	public static enum QCPFMSG {
	}

	public @Entry void main(@DataDef(length = 255) QCharacter spoolID) {

		QResourceReader<QSpoolFile> spoolFileReader = resourceFactory.getResourceReader(job, QSpoolFile.class, job.getSystem().getSystemLibrary());
		QSpoolFile spoolFile = spoolFileReader.lookup(spoolID.trimR());
		System.out.println(spoolFile);
	}
}

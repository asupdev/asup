/**
 */
package org.asup.os.type.pgm.base.api;

import javax.inject.Inject;

import org.asup.il.data.QCharacter;
import org.asup.il.data.QData;
import org.asup.il.data.QScroller;
import org.asup.il.data.annotation.Command;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.jobs.QJob;
import org.asup.os.data.ds.TypedReference;
import org.asup.os.type.QTypedObject;
import org.asup.os.type.pgm.QProgramManager;

@Command(name = "CALL")
@Program(name = "QCLCALL")
public class ProgramCaller {

	@Inject
	private QJob job;
	@Inject
	private QProgramManager programManager;

	@Entry
	public void main(TypedReference<QTypedObject> program,
			@DataDef(occurrences = "255", length=32*255) QScroller<QCharacter> parameters) {

		QData[] params = new QData[255];
		for(int i=0; i<255; i++)
			params[i] = parameters.get(i+1);

		programManager.callProgram(job, program.library.trimR(), program.name.trimR(), params);
	}
}
/**
 */
package org.asup.os.type.pgm.base.api;

import javax.inject.Inject;

import org.asup.fw.core.annotation.ToDo;
import org.asup.il.data.QAdapter;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QData;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QEnum;
import org.asup.il.data.QList;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.jobs.QJob;
import org.asup.os.type.pgm.QProgramManager;

@Program(name = "QCLCALL")
public class ProgramCaller {

	@Inject
	private QJob job;
	@Inject
	private QProgramManager programManager;

	@Entry
	public void main(
			@ToDo @DataDef(qualified = true) Program program,
			@ToDo @DataDef(dimension = 255) QList<QAdapter> parameters) {

		QData[] params = new QData[parameters.count()];
		for(int i=1; i<=params.length; i++) 			
			params[i-1] = parameters.get(i);

		programManager.callProgram(job, program.library.asData().trimR(), program.name.trimR(), params);
	}
	

	public static class Program extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}
}
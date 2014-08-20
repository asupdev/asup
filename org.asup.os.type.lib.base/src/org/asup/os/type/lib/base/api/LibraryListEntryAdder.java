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
package org.asup.os.type.lib.base.api;

import javax.inject.Inject;

import org.asup.fw.util.QListUtil;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.Command;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;
import org.asup.os.core.jobs.QJob;

@Command(name = "ADDLIBLE")
@Program(name = "QLICUSRL")
public class LibraryListEntryAdder {

	@Inject
	private QJob job;

	@Inject
	private QListUtil listUtil;
	
	@Entry
	public void main(@DataDef(length = 10) QCharacter library, LibraryListPosition libraryListPosition) {

		switch (libraryListPosition.listPosition.asEnum()) {
			
			case FIRST:
				listUtil.addFirst(job.getLibraries(), library.trimR());
				break;
				
			case LAST:
				listUtil.addLast(job.getLibraries(), library.trimR());
				break;
				
			case AFTER:
				break;
				
				
			case BEFORE:
				break;
				
			case REPLACE:
				break;
				
			default:
				break;
		}
	}

	public static class LibraryListPosition extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1)
		public QEnum<ListPosition, QCharacter> listPosition;
		
		@DataDef(length = 10)
		public QCharacter referenceLibrary;

		public static enum ListPosition {
			@Special(value = "F")
			FIRST, 
			@Special(value = "L")
			LAST, 
			@Special(value = "A")
			AFTER, 
			@Special(value = "B")
			BEFORE, 
			@Special(value = "R")
			REPLACE
		}
	}
}
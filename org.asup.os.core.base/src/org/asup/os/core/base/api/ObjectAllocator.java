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
package org.asup.os.core.base.api;

import javax.inject.Inject;

import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QEnum;
import org.asup.il.data.QList;
import org.asup.il.data.QStruct;
import org.asup.il.data.annotation.Command;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.base.ObjectAllocationConflict;
import org.asup.os.core.base.ObjectAllocationScope;

@Command(name = "ALCOBJ")
@Program(name = "QWCCALOC")
public class ObjectAllocator {

	@Inject
	public QDataFactory dataContainer;

	@Entry
	public void main(
			@DataDef(length = 120, dimension = "1000") QList<QStruct> objects,
			@DataDef QBinary wait, QEnum<ObjectAllocationScope, QCharacter> scope,
			QEnum<ObjectAllocationConflict, QCharacter> conflict) {

		for (QStruct dataStructure : objects) {
			dataStructure.toString();
			
			ObjectAllocationScope enumValue = scope.asEnum();

			switch (enumValue) {
			case BLANK:
				break;
			case J:
				break;
			case L:
				break;
			case T:
				break;
			default:
				break;
			}
		}

	}
}
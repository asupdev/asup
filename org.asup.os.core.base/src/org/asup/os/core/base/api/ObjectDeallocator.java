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
import org.asup.il.data.QEnum;
import org.asup.il.data.QList;
import org.asup.il.data.annotation.Command;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.LockType;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.Scope;
import org.asup.os.core.base.ObjectAllocationConflict;
import org.asup.os.core.base.ObjectAllocationScope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.data.QTypedData;
import org.asup.os.type.QType;
import org.asup.os.type.QTypeRegistry;
import org.asup.os.type.QTypedObject;

@Command(name = "DLCOBJ")
@Program(name = "QWCCDAOC")
public class ObjectDeallocator {

	@Inject
	private QTypeRegistry typeRegistry;
	
	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QJob job;

	@Entry
	public void main(@DataDef(dimension = "50") QList<QTypedData> objects,
			@DataDef QBinary wait, QEnum<ObjectAllocationScope, QCharacter> scope,
			QEnum<ObjectAllocationConflict, QCharacter> conflict) {

		for (QTypedData object : objects) {			
			Class<QType> qType = typeRegistry.lookup(object.getType()).getTypedClass();
			lockObject(qType, object);
		}

	}

	private <T extends QTypedObject> void lockObject(Class<T> klass, QTypedData object) {

		QResourceReader<T> resourceReader = null;
		Scope libraryScope = Scope.get(object.getLibrary());
		if (libraryScope != null)
			resourceReader = resourceFactory.getResourceReader(job, klass, libraryScope);
		else
			resourceReader = resourceFactory.getResourceReader(job, klass, object.getLibrary());

		T qObject = resourceReader.lookup(object.getName());
		if (qObject == null)
			throw new OperatingSystemRuntimeException(object.getName() + " not found");

		resourceReader.getLocker().lock(job, qObject, LockType.EXCLUSIVE);
	}
}
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
package org.asup.os.core.cdo.impl;

import java.util.concurrent.TimeUnit;

import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.LockType;
import org.asup.os.core.QLocker;
import org.asup.os.core.jobs.QJob;
import org.asup.os.omac.QObject;
import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.ecore.EObject;

public class CDOObjectLockerImpl<T extends QObject> implements QLocker<T> {


	@Override
	public void lock(QJob job, T object, LockType lockType) {
		CDOObject cdoObject = CDOUtil.getCDOObject((EObject)object);

		try {
			// lock system for shared synchronization
			cdoObject.cdoWriteLock().lock();					
		}
		catch(RuntimeException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	@Override
	public boolean tryLock(QJob job, T object, long time, LockType lockType) {
		try {

			CDOObject cdoObject = CDOUtil.getCDOObject((EObject)object);
//				cdoSystem = transaction.getObject(cdoSystem.cdoID(), true);

			// lock system for shared synchronization
			CDOLock lock = cdoObject.cdoWriteLock();

			// locked by this view or others
//			if(lock.isLocked() || lock.isLockedByOthers())
//				return false;

			return lock.tryLock(time, TimeUnit.SECONDS);
		}
		catch (InterruptedException e) {
			System.err.println(e.getMessage());
			return false;
		}

	}

	@Override
	public void unlock(QJob job, T object) {

		CDOObject cdoObject = CDOUtil.getCDOObject((EObject)object);

		try {
			cdoObject.cdoWriteLock().unlock();
		}
		catch(RuntimeException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}
}
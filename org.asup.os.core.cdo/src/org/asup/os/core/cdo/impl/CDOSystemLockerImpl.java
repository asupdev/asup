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

import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.LockType;
import org.asup.os.core.QLocker;
import org.asup.os.core.QSystem;
import org.asup.os.core.jobs.QJob;
import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.ecore.EObject;

public class CDOSystemLockerImpl implements QLocker<QSystem> {
	
	@Override
	public void lock(QJob job, QSystem object, LockType lockType) {
		CDOObject cdoSystem = CDOUtil.getCDOObject((EObject)object);		
		
		// lock system for shared synchronization
		try {
			cdoSystem.cdoWriteLock().lock();
		}
		catch(RuntimeException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	@Override
	public boolean tryLock(QJob job, QSystem object, long time, LockType lockType) {
		try {
			CDOObject cdoSystem = CDOUtil.getCDOObject((EObject)object);		
//				cdoSystem = transaction.getObject(cdoSystem.cdoID(), true);
			
			// lock system for shared synchronization
			CDOLock lock = cdoSystem.cdoWriteLock();
			
			// locked by this view or others
			if(lock.isLocked() || lock.isLockedByOthers())
				return false;

			return lock.tryLock(time);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
			return false;
		}
		
	}

	@Override
	public void unlock(QJob job, QSystem object) {
		CDOObject cdoSystem = CDOUtil.getCDOObject((EObject)object);
		try {
			cdoSystem.cdoWriteLock().unlock();
		}
		catch(RuntimeException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}	
}
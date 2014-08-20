/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Dario Foresti - Initial API and implementation 
 */
package org.asup.os.core.cdo.impl;

import org.asup.os.core.QContainer;
import org.asup.os.core.QContentLock;
import org.asup.os.core.ContentLockType;
import org.asup.os.core.QContentLocker;
import org.asup.os.core.QObjectContent;
import org.asup.os.core.jobs.QJob;
import org.asup.os.omac.QObject;
import org.asup.os.type.QTypedObject;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.ecore.EObject;

public class CDOContentLockerImpl<T extends QContainer<K>, K extends QObject> implements QContentLocker<T, K> {

	@Override
	public void lock(QJob job, T object, ContentLockType lockType) {

		if (object instanceof QTypedObject){

			QObjectContent<K> content = object.getContent();


			switch (lockType.getValue()) {
			case ContentLockType.READ_LOCKED_VALUE:
				// Lock on content read
				QContentLock readLock = content.getReadLock();
				CDOObject readLockCDO = CDOUtil.getCDOObject((EObject)readLock);
				readLockCDO.cdoWriteLock().lock();
				break;

			case ContentLockType.WRITE_LOCKED_VALUE:
				// Lock on content write
				QContentLock writeLock = content.getWriteLock();
				CDOObject writeLockCDO = CDOUtil.getCDOObject((EObject)writeLock);
				writeLockCDO.cdoWriteLock().lock();
				break;

			default:
				break;
			}
		}
	}

	@Override
	public boolean tryLock(QJob job, T object, long time, ContentLockType lockType) {
		boolean result = false;
		if (object instanceof QTypedObject){

			QObjectContent<K> content = object.getContent();

			switch (lockType.getValue()) {
			case ContentLockType.READ_LOCKED_VALUE:
				// Lock on content read
				QContentLock readLock = content.getReadLock();
				CDOObject readLockCDO = CDOUtil.getCDOObject((EObject)readLock);

				try {
					result = readLockCDO.cdoWriteLock().tryLock(time);
					//readLockCDO.cdoWriteLock().lock(time);
					//result = true;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			case ContentLockType.WRITE_LOCKED_VALUE:
				// Lock on content write
				QContentLock writeLock = content.getWriteLock();
				CDOObject writeLockCDO = CDOUtil.getCDOObject((EObject)writeLock);

				try {
					result = writeLockCDO.cdoWriteLock().tryLock(time);
					//writeLockCDO.cdoWriteLock().lock(time);
					//result = true;
				} catch (InterruptedException e) {
					result = false;
				}

				break;
			}
		}

		return result;
	}

	@Override
	public void unlock(QJob job, T object, ContentLockType lockType) {
		if (object instanceof QTypedObject){

			QObjectContent<K> content = object.getContent();

			switch (lockType.getValue()) {
			case ContentLockType.READ_LOCKED_VALUE:
				// Unlock content read (only if locked by current view, not by others)
				QContentLock readLock = content.getReadLock();
				CDOObject readLockCDO = CDOUtil.getCDOObject((EObject)readLock);
				if (readLockCDO.cdoWriteLock().isLocked()){
					readLockCDO.cdoWriteLock().unlock();
				}
				break;

			case ContentLockType.WRITE_LOCKED_VALUE:
				// Unlock content write (only if locked by current view, not by others)
				QContentLock writeLock = content.getWriteLock();
				CDOObject writeLockCDO = CDOUtil.getCDOObject((EObject)writeLock);
				if (writeLockCDO.cdoWriteLock().isLocked()) {
					writeLockCDO.cdoWriteLock().unlock();
				}
				break;
			}
		}
	}


	@Override
	public boolean isLocked(QJob job, T object, ContentLockType lockType){
		boolean result = false;
		if (object instanceof QTypedObject){

			QObjectContent<K> content = object.getContent();

			switch (lockType.getValue()) {
			case ContentLockType.READ_LOCKED_VALUE:
				QContentLock readLock = content.getReadLock();
				CDOObject readLockCDO = CDOUtil.getCDOObject((EObject)readLock);
				// Return true if object is locked by current view
				result = readLockCDO.cdoWriteLock().isLocked();

				break;

			case ContentLockType.WRITE_LOCKED_VALUE:
				QContentLock writeLock = content.getWriteLock();
				CDOObject writeLockCDO = CDOUtil.getCDOObject((EObject)writeLock);
				// Return true if object is locked by current view
				result = writeLockCDO.cdoWriteLock().isLocked();

				break;
			}
		}

		return result;
	}

	@Override
	public boolean isLockedByOther(QJob job, T object, ContentLockType lockType) {
		boolean result = false;
		if (object instanceof QTypedObject){

			QObjectContent<K> content = object.getContent();

			switch (lockType.getValue()) {
			case ContentLockType.READ_LOCKED_VALUE:
				QContentLock readLock = content.getReadLock();
				CDOObject readLockCDO = CDOUtil.getCDOObject((EObject)readLock);
				// Return true if object is locked by other view
				result = readLockCDO.cdoWriteLock().isLockedByOthers();

				break;

			case ContentLockType.WRITE_LOCKED_VALUE:
				QContentLock writeLock = content.getWriteLock();
				CDOObject writeLockCDO = CDOUtil.getCDOObject((EObject)writeLock);
				// Return true if object is locked by other view
				result = writeLockCDO.cdoWriteLock().isLockedByOthers();

				break;
			}
		}

		return result;
	}
}
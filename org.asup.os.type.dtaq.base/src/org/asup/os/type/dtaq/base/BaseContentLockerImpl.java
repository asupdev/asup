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
package org.asup.os.type.dtaq.base;

import org.asup.os.core.ContentLockType;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.QContainer;
import org.asup.os.core.QContentLocker;
import org.asup.os.core.jobs.QJob;

public class BaseContentLockerImpl<T extends QContainer<?>> implements QContentLocker<T> {

	@Override
	public void lock(QJob job, T object, ContentLockType lockType) throws OperatingSystemRuntimeException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean tryLock(QJob job, T object, long time, ContentLockType lockType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void unlock(QJob job, T object, ContentLockType lockType) throws OperatingSystemRuntimeException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLocked(QJob job, T object, ContentLockType lockType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLockedByOther(QJob job, T object, ContentLockType lockType) {
		// TODO Auto-generated method stub
		return false;
	}

}

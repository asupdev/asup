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
package org.asup.os.core.e4;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.LockType;
import org.asup.os.core.QLocker;
import org.asup.os.core.QSystem;
import org.asup.os.core.jobs.QJob;

public class E4SystemLockerImpl implements QLocker<QSystem>{

	private QSystem system;
	private Lock lock = new ReentrantLock();
	
	protected E4SystemLockerImpl(QSystem system) {
		this.system = system;
	}
	
	@Override
	public void lock(QJob job, QSystem object, LockType lockType) throws OperatingSystemRuntimeException {
			if(!object.equals(system))
				throw new OperatingSystemRuntimeException("Unknown system "+object);
			
			lock.lock();
	}

	@Override
	public boolean tryLock(QJob job, QSystem object, long time, LockType lockType) {
		if(!object.equals(system))
			throw new OperatingSystemRuntimeException("Unknown system "+object);
		
		try {
			return lock.tryLock(time, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			return false;
		}
	}

	@Override
	public void unlock(QJob job, QSystem object) throws OperatingSystemRuntimeException {
		if(!object.equals(system))
			throw new OperatingSystemRuntimeException("Unknown system "+object);

		lock.unlock();
	}
	
}
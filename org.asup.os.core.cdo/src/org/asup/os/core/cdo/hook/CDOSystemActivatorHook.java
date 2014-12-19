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
package org.asup.os.core.cdo.hook;

import org.asup.fw.core.QApplication;
import org.asup.fw.core.annotation.LevelStarted;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.QSystem;
import org.asup.os.core.QSystemManager;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobManager;

public class CDOSystemActivatorHook extends ServiceImpl {

	@LevelStarted
	public void init(QApplication application, QSystemManager systemManager, QJobManager jobManager) throws OperatingSystemException {
		QJob qJob = systemManager.start();
		
		application.getContext().set(QSystem.class, systemManager.getSystem());
		application.getContext().set(QJob.class, qJob);
	}

}

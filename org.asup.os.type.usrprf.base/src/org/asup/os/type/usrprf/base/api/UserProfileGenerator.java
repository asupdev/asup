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
package org.asup.os.type.usrprf.base.api;

import javax.inject.Inject;

import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLogManager;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.usrprf.QOperatingSystemUserProfileFactory;
import org.asup.os.type.usrprf.QUserProfile;

@Program(name="QMUGNRUP")
public class UserProfileGenerator {

	@Inject 
	QResourceFactory resourceFactory;
	@Inject
	QJob job;
	@Inject
	QJobLogManager jobLogManager;

	@Entry
	public void main() {
		
		QResourceWriter<QUserProfile> userProfileWriter = resourceFactory.getResourceWriter(job, QUserProfile.class, job.getSystem().getSystemLibrary());
		
		for(int i=20; i<100; i++) {
			QUserProfile userProfile = QOperatingSystemUserProfileFactory.eINSTANCE.createUserProfile();
			userProfile.setName("QTEST"+i);
			userProfile.setText("Text of QTEST"+i);
			try {
				userProfileWriter.save(userProfile);
			} catch (OperatingSystemException e) {
				jobLogManager.error(job, e.getMessage());
			}
		}		
	}
}
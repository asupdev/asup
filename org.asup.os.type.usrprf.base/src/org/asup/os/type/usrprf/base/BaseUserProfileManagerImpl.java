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
package org.asup.os.type.usrprf.base;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.QOperatingSystemCoreHelper;
import org.asup.os.core.QSystem;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.usrprf.QOperatingSystemUserProfileFactory;
import org.asup.os.type.usrprf.QUserProfile;
import org.asup.os.type.usrprf.impl.UserProfileManagerImpl;

public class BaseUserProfileManagerImpl extends UserProfileManagerImpl {

	@Inject
	private QResourceFactory resourceFactory;
	
	@PostConstruct
	public void init(QJob job) {

		QSystem qSystem = job.getSystem();
		
		QResourceWriter<QUserProfile> userProfileWriter = resourceFactory.getResourceWriter(job, QUserProfile.class, qSystem.getSystemLibrary());
		
		try {
			if(!userProfileWriter.exists(qSystem.getSystemUser())) {
				// User Profile
				QUserProfile userProfile = QOperatingSystemUserProfileFactory.eINSTANCE.createUserProfile();
				userProfile.setName(qSystem.getSystemUser());				
				userProfile.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(job));		
				userProfile.setLibrary(qSystem.getSystemLibrary());
				userProfile.setText("As.UP System User Profile");
				QResourceWriter<QUserProfile> resourceUserProfile = resourceFactory.getResourceWriter(job, QUserProfile.class, qSystem.getSystemLibrary());	
				resourceUserProfile.save(userProfile);
			}
		}
		catch(OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}	
	}
}

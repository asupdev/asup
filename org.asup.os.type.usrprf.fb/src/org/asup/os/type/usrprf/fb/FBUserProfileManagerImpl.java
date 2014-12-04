/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Initial API and implementation
 * 	Mattia Rocchi
 */
package org.asup.os.type.usrprf.fb;

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
import org.asup.os.type.usrprf.base.BaseUserProfileManagerImpl;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

public class FBUserProfileManagerImpl extends BaseUserProfileManagerImpl {

	@Inject
	private QResourceFactory resourceFactory;
	
	@Override
	public void init(QJob job) {

		QSystem qSystem = job.getSystem();		
		QResourceWriter<QUserProfile> userProfileWriter = resourceFactory.getResourceWriter(job, QUserProfile.class, qSystem.getSystemLibrary());

		String accessToken = "CAACEdEose0cBAJSVN4eICu5gZBnmZCPRTJj6nKPZChsKsizoA5BU5b5pZBXjiWPn1UYw59EWVarotfoHQ4psy29TApe5bCktZAd1UJmgmf9rwZA978AoMkcuJmHkxPT0kT42dGwJDgcpxvtSniT2QlEZBRUGCjhYuAaiU8cHLfFNenMmMda1vBJZBxVYgQFbCb4ZD";
		FacebookClient facebookClient = new DefaultFacebookClient(accessToken);
		User root = facebookClient.fetchObject("me", User.class);
		
		if(!userProfileWriter.exists(root.getId())) {
			// User Profile
			QUserProfile userProfile = QOperatingSystemUserProfileFactory.eINSTANCE.createUserProfile();
			userProfile.setName(root.getId());				
			userProfile.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(job));		
			userProfile.setLibrary(qSystem.getSystemLibrary());
			userProfile.setText("FB root  : "+root.getName());
			QResourceWriter<QUserProfile> resourceUserProfile = resourceFactory.getResourceWriter(job, QUserProfile.class, qSystem.getSystemLibrary());
			try {
				resourceUserProfile.save(userProfile);
			}
			catch(OperatingSystemException e) {
				throw new OperatingSystemRuntimeException(e);
			}								
		}
		
		new FBUserProfileUpdater(job, userProfileWriter, facebookClient).start();
	}

}

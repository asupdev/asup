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

import java.util.ArrayList;
import java.util.List;

import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.QOperatingSystemCoreHelper;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.type.usrprf.QOperatingSystemUserProfileFactory;
import org.asup.os.type.usrprf.QUserProfile;

import com.restfb.Connection;
import com.restfb.FacebookClient;
import com.restfb.types.User;

public class FBUserProfileUpdater extends Thread {

	private QJob job;
	private QResourceWriter<QUserProfile> userProfileWriter;
	private FacebookClient facebookClient;
	
	protected FBUserProfileUpdater(QJob job, QResourceWriter<QUserProfile> userProfileWriter, FacebookClient facebookClient) {
		this.job = job;
		this.userProfileWriter = userProfileWriter;
		this.facebookClient = facebookClient;
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				Thread.sleep(60 * 1000);

				System.out.println("Update FB UserProfiles");
				
				Connection<User> friends = facebookClient.fetchConnection("me/friends", User.class);
				List<User> tempFriends = new ArrayList<User>();
				User root = facebookClient.fetchObject("me", User.class);
				tempFriends.add(root);
				
				for(User friend: friends.getData()) {			
					try {
						// User Profile
						QUserProfile userProfile = QOperatingSystemUserProfileFactory.eINSTANCE.createUserProfile();
						userProfile.setName(friend.getId());				
						userProfile.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(job));		
						userProfile.setLibrary(job.getSystem().getSystemLibrary());
						userProfile.setText("FB friend: "+friend.getName());	
						userProfileWriter.save(userProfile, true);
						tempFriends.add(friend);
					}
					catch(OperatingSystemException e) {
						throw new OperatingSystemRuntimeException(e);
					}				
				}
				
				QObjectIterator<QUserProfile> userIterator = userProfileWriter.find(null);
				List<QUserProfile> savedUser = new ArrayList<>();
				while(userIterator.hasNext()) 
					savedUser.add(userIterator.next());
				
				for(QUserProfile userProfile: savedUser) {
					if(!existsUser(tempFriends, userProfile.getName())) {
						try {
							userProfileWriter.delete(userProfile);
						} catch (OperatingSystemException e) {
							e.printStackTrace();
						}
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private boolean existsUser(List<User> users, String id) {
		for(User user: users) {
			if(user.getId().equals(id))
				return true;			
		}
		return false;
	}
}

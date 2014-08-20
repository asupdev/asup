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
package org.asup.os.type.file.jdt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.asup.dk.source.QSourceEntry;
import org.asup.dk.source.QSourceManager;
import org.asup.fw.core.QContextID;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobManager;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QFileMember;
import org.asup.os.type.file.QFileMembered;
import org.asup.os.type.file.impl.FileMemberManagerImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class JDTFileMemberManagerImpl extends FileMemberManagerImpl {

	@Inject
	private QSourceManager sourceManager;
	@Inject
	private QJobManager jobManager;

	@Override
	public List<QFileMember> list(QContextID ContextID, String library, QFileMembered file) {
		
		QJob job = jobManager.lookup(ContextID);
				
		QSourceEntry fileEntry = sourceManager.getObjectEntry(job, library, QFile.class, file.getName());
		
		List<QSourceEntry> entries = sourceManager.listChildEntries(job, fileEntry);
		
		ResourceSet resSet = new ResourceSetImpl();
		List<QFileMember> members = new ArrayList<QFileMember>();
		for(QSourceEntry entry: entries) {
			try {
				Resource resource = resSet.createResource(URI.createURI(fileEntry.getLocation().toString()));
				resource.load(entry.getInputStream(), null);
				members.add((QFileMember) resource.getContents().get(0));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return members;
	}

	@Override
	public QFileMember lookup(QContextID ContextID, String library, QFileMembered file, String name) {
		
		QJob job = jobManager.lookup(ContextID);
		
		QSourceEntry sourceFile = sourceManager.getObjectEntry(job, library, QFile.class, file.getName());
		if(sourceFile == null)
			return null;
		
		QSourceEntry sourceMember = sourceManager.getChildEntry(job, sourceFile, name);
		if(sourceMember == null)
			return null;
		
		QFileMember fileMember = null;
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI(sourceFile.getLocation().toString()));

		try {
			resource.load(sourceMember.getInputStream(), null);
			fileMember = (QFileMember) resource.getContents().get(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileMember;		
	}
}
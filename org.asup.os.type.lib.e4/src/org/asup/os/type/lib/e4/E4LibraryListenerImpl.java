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
package org.asup.os.type.lib.e4;

import java.net.URI;

import org.asup.fw.core.impl.ServiceImpl;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceEvent;
import org.asup.os.core.resources.QResourceListener;
import org.asup.os.type.lib.QLibrary;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.FrameworkUtil;

public class E4LibraryListenerImpl extends ServiceImpl implements QResourceListener<QLibrary> {

	@Override
	public void handleEvent(QResourceEvent<QLibrary> event) {

		QJob job = event.getResource().getJob();
		
		QLibrary library = event.getSource();
		URI uriLibrary = URI.create("file://"+job.getSystem().getInstallPath()+"/"+library.getName()+".jar");

		switch (event.getType()) {
		case PRE_SAVE:
			prepareBundle(job, uriLibrary);
			break;

		case PRE_DELETE:
			removeBundle(job, uriLibrary);
		default:
			break;
		}
	}
	

	private void prepareBundle(QJob job, URI uri) throws OperatingSystemRuntimeException {

		// retrieve bundle
		BundleContext bundleContext = FrameworkUtil.getBundle(job.getClass()).getBundleContext();
		Bundle bundle = bundleContext.getBundle(uri.toString());
		
		try {
			// create
			if(bundle == null) 
				bundle = bundleContext.installBundle(uri.toString());

			// start or update
			if(bundle.getState() != Bundle.ACTIVE) 
				bundle.start();
			else 
				bundle.update();

		} catch(BundleException e) {
			System.err.println(e.getMessage());
		}
	}

	private void removeBundle(QJob job, URI uri) throws OperatingSystemRuntimeException {

		// retrieve bundle
		BundleContext bundleContext = FrameworkUtil.getBundle(job.getClass()).getBundleContext();		
		Bundle bundle = bundleContext.getBundle(uri.toString());
		
		try {
			// uninstall
			if(bundle != null) 
				bundle.uninstall();
		} catch(BundleException e) {
			throw new OperatingSystemRuntimeException(e);
		}

	}
}

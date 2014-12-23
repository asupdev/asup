/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Dario Foresti	- Initial API and implementation 
 *   Mattia Rocchi	- Implementation
 */
package org.asup.fw.test.base;

import org.asup.fw.core.FrameworkCoreException;
import org.asup.fw.core.QContext;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.fw.test.QTestManager;
import org.asup.fw.test.QTestRunner;
import org.asup.fw.test.QUnitTestRunner;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class BaseTestManagerImpl extends ServiceImpl implements QTestManager {
	
	@Override
	public QTestRunner prepareRunner(QContext context, String classURI) throws FrameworkCoreException {
	
		QUnitTestRunner testRunner = new BaseUnitTestRunner(context, classURI);
		
		return testRunner;
	}

	@Override
	public QTestRunner prepareRunner(QContext context, Class<?> klass) throws FrameworkCoreException {
		
		Bundle bundle = FrameworkUtil.getBundle(klass);		
		String classURI = "asup:/omac/"+bundle.getSymbolicName()+"/"+klass.getName();

		QUnitTestRunner testRunner = new BaseUnitTestRunner(context, classURI);

		return testRunner;
	}
}

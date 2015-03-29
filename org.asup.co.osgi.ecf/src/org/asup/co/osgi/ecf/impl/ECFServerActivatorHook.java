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
package org.asup.co.osgi.ecf.impl;

import java.util.Dictionary;

import javax.inject.Named;

import org.asup.co.core.ConnectorCoreHelper;
import org.asup.co.osgi.ecf.ECFServerContainerConfig;
import org.asup.fw.core.annotation.ServiceRegistration;
import org.asup.fw.core.impl.ServiceImpl;
import org.eclipse.ecf.osgi.services.distribution.IDistributionConstants;

@SuppressWarnings({ "restriction"})
public class ECFServerActivatorHook extends ServiceImpl {

	
	@ServiceRegistration
	public void completeRegistration(
			@Named("org.asup.fw.core.service.name") String name,
			@Named("org.asup.fw.core.service.object") Object service,
			@Named("org.asup.fw.core.service.properties") Dictionary<String, Object> properties,
			@Named("org.asup.fw.core.service.remoteExport") boolean remoteExport) {

		if(remoteExport) {
			
			ECFServerContainerConfig config = (ECFServerContainerConfig) getConfig();
			properties.put(IDistributionConstants.SERVICE_EXPORTED_INTERFACES, IDistributionConstants.SERVICE_EXPORTED_INTERFACES_WILDCARD);
			properties.put(IDistributionConstants.SERVICE_EXPORTED_CONFIGS, config.getServerContainerType());
			properties.put(IDistributionConstants.SERVICE_EXPORTED_CONTAINER_FACTORY_ARGUMENTS, ConnectorCoreHelper.resolveVariables(config.getContainerId()));
		}
	}
}
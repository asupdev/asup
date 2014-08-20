/**
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.os.type.pgm.base;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import org.asup.os.core.jobs.QJob;
import org.asup.os.type.pgm.QActivationGroup;
import org.asup.os.type.pgm.QOperatingSystemProgramFactory;
import org.asup.os.type.pgm.impl.ActivationGroupManagerImpl;

public class BaseActivationGroupManagerImpl extends ActivationGroupManagerImpl {

	private Map<QJob, Map<String, QActivationGroup>> contextToMapActivationGroup = new WeakHashMap<QJob, Map<String,QActivationGroup>>();

	@Override
	public void register(QJob job, QActivationGroup activationGroup) {
		getMapActivationGroup(job).put(activationGroup.getName(), activationGroup);
	}

	@Override
	public QActivationGroup lookup(QJob job, String name) {
		return getMapActivationGroup(job).get(name);
	}

	protected Map<String, QActivationGroup> getMapActivationGroup(QJob job) {

		// retrieve job activation groups
		Map<String, QActivationGroup> mapActivationGroup = contextToMapActivationGroup.get(job);
		if(mapActivationGroup == null) { 
			mapActivationGroup = new HashMap<String, QActivationGroup>();
			contextToMapActivationGroup.put(job, mapActivationGroup);
		}		
		
		return mapActivationGroup;
	}

	@Override
	public QActivationGroup create(QJob job, String name, boolean register) {

		// create
		QActivationGroup activationGroup = QOperatingSystemProgramFactory.eINSTANCE.createActivationGroup();
		activationGroup.setName(name);
		activationGroup.setFrameworkContext(job.getJobContext().createChild());

		// register on job
		if(register)
			register(job, activationGroup);
		
		return activationGroup;

	}
}
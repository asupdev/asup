/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi				- Initial API and implementation 
 */
package org.asup.dk.compiler.rpj;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.impl.CompilerManagerImpl;
import org.asup.dk.source.QSourceEntry;
import org.asup.dk.source.QSourceManager;
import org.asup.il.flow.QCallableUnit;
import org.asup.il.flow.QModule;
import org.asup.il.flow.QProcedure;
import org.asup.il.flow.QProgram;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.type.file.QFileManager;
import org.asup.os.type.module.QModuleManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.osgi.framework.FrameworkUtil;

public class RPJCompilerManagerImpl extends CompilerManagerImpl {

	@Inject
	private QModuleManager moduleManager;
	@Inject 
	private QSourceManager sourceManager;
	@Inject
	private QFileManager fileManager;

	private ResourceSet resourceSet = new ResourceSetImpl();
	
	@Override
	public QCompilationContext createCompilationContext(QJob job, QModule module) {

		Map<String, QCompilationContext> contexts = prepareContext(job, module);
				
		RPJCompilationContextImpl compilationContext = new RPJCompilationContextImpl(job, 
																					 job.getJobContext().createChild(),
																					 fileManager,
																					 module,
																					 contexts);
		compilationContext.set(QCompilationContext.class, compilationContext);

		return compilationContext;
	}

	@Override
	public QCompilationContext createChildContext(QCompilationContext master, QProcedure procedure) {

		QJob job = master.get(QJob.class);
		
		
		Map<String, QCompilationContext> contexts = prepareContext(job, procedure);
		
		contexts.put(master.getUnitContext().getName(), master);
		
		RPJCompilationContextImpl compilationContext = new RPJCompilationContextImpl(job, 
																					 master.createChild(),
																					 fileManager,
																					 procedure,
																					 contexts);

		compilationContext.set(QCompilationContext.class, compilationContext);

		return compilationContext;
	}

	@Override
	public QCompilationContext createCompilationContext(QJob job, QProgram program) {

		Map<String, QCompilationContext> contexts = prepareContext(job, program);
		
		RPJCompilationContextImpl compilationContext = new RPJCompilationContextImpl(job,
																					 job.getJobContext().createChild(),
																					 fileManager,				
																					 program,
																					 contexts);
		compilationContext.set(QCompilationContext.class, compilationContext);
		
		return compilationContext;
	}

	@Override
	public <T> T prepareVisitor(QCompilationContext context, Class<T> visitor) {
		return context.make(visitor);
	}

	private Map<String, QCompilationContext> prepareContext(QJob job, QCallableUnit unit) {
		
		Map<String, QCompilationContext> contexts = new HashMap<>();
		
		if(!unit.getName().startsWith("*")) {
			try {
				URL entry = FrameworkUtil.getBundle(this.getClass()).getEntry("./ASUP-INF/modules.xmi");
				Resource resource = resourceSet.createResource(URI.createURI(entry.toString()));
				resource.load(Collections.EMPTY_MAP);
				
				// type check
				EObject eObject = resource.getContents().get(0);			
				if(eObject instanceof QModule) {
					QModule module = (QModule)eObject;
					
					// add *RPJ module
					contexts.put(module.getName(), createCompilationContext(job, module));
				}
	
			}
			catch(Exception e) {
				System.out.println("Error on loading resource ./ASUP-INF/modules.xmi");
			}
		}

		
		if(unit.getSetupSection() == null)
			return contexts;

		
		QResourceReader<org.asup.os.type.module.QModule> moduleReader = moduleManager.getResourceReader(job, Scope.LIBRARY_LIST);		
		for(String moduleName: unit.getSetupSection().getModules()) {
			org.asup.os.type.module.QModule module = moduleReader.lookup(moduleName);

			if (module == null)
				throw new OperatingSystemRuntimeException("Null resource for object " + moduleName, null);
			
			// lookup module source entry
			QSourceEntry moduleEntry = sourceManager.getObjectEntry(job, module.getLibrary(), org.asup.os.type.module.QModule.class, module.getName());		
			if (moduleEntry == null)
				throw new OperatingSystemRuntimeException("Null resource for object " + module.getName(), null);
			
			// XMI conversion
			QSourceEntry xmiModuleSource = sourceManager.getChildEntry(job, moduleEntry, module.getName()+ ".xmi");
			if (xmiModuleSource == null)
				throw new OperatingSystemRuntimeException("Null resource for object " + module.getName(), null);

			// load flow module
			Resource resourceModule = new XMIResourceImpl();
			try {
				resourceModule.load(xmiModuleSource.getInputStream(), Collections.EMPTY_MAP);
				QModule flowModel = (QModule) resourceModule.getContents().get(0);
				contexts.put(moduleName, createCompilationContext(job, flowModel));
			} catch (IOException e) {
				throw new OperatingSystemRuntimeException(e);
			}
			
		}
		
		return contexts;
	}
}
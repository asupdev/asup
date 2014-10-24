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
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.asup.dk.compiler.CaseSensitiveType;
import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QCompilationSetup;
import org.asup.dk.compiler.impl.CompilerManagerImpl;
import org.asup.dk.source.QSourceEntry;
import org.asup.dk.source.QSourceManager;
import org.asup.il.data.QCompoundDataTerm;
import org.asup.il.expr.QExpressionParser;
import org.asup.il.expr.QExpressionParserRegistry;
import org.asup.il.flow.QCallableUnit;
import org.asup.il.flow.QModule;
import org.asup.il.flow.QProcedure;
import org.asup.il.flow.QProgram;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceReader;
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
	private QExpressionParserRegistry expressionParserRegistry;
	@Inject
	private QModuleManager moduleManager;
	@Inject 
	private QSourceManager sourceManager;

	private ResourceSet resourceSet = new ResourceSetImpl();

	@Override
	public QCompilationContext createCompilationContext(QJob job, QModule module, CaseSensitiveType caseSensitive) {
		
		Map<String, QCompilationContext> globalContexts = new HashMap<>();	
		return createCompilationContext(job, globalContexts, module, caseSensitive);
	}
	
	private QCompilationContext createCompilationContext(QJob job, Map<String, QCompilationContext> globalContexts, QModule module, CaseSensitiveType caseSensitive) {

		List<QCompilationContext> moduleContexts = null;
		if(!module.getName().startsWith("*"))
			moduleContexts = prepareContexts(job, globalContexts, module, caseSensitive);
		else
			moduleContexts = new ArrayList<QCompilationContext>();
		
		RPJCompilationContextImpl compilationContext = new RPJCompilationContextImpl(job.getJobContext().createChild(),
																					 module,
																					 moduleContexts,
																					 caseSensitive);
		
		compilationContext.set(QCompilationContext.class, compilationContext);

		if(module.getSetupSection() != null) {
			String expressionType = module.getSetupSection().getExpressionType();
			if(expressionType != null) {
				QExpressionParser expressionParser = expressionParserRegistry.lookup(expressionType);
				compilationContext.set(QExpressionParser.class, expressionParser);
			}
		}
		
		compilationContext.set(QModule.class, module);
		
		return compilationContext;
	}

	@Override
	public QCompilationContext createCompilationContext(QJob job, QProgram program, CaseSensitiveType caseSensitive) {

		Map<String, QCompilationContext> globalContexts = new HashMap<>();
		List<QCompilationContext> moduleContexts = prepareContexts(job, globalContexts, program, caseSensitive);
		
		RPJCompilationContextImpl compilationContext = new RPJCompilationContextImpl(job.getJobContext().createChild(),
																					 program,
																					 moduleContexts,
																					 caseSensitive);

		compilationContext.set(QCompilationContext.class, compilationContext);

		if(program.getSetupSection() != null) {
			String expressionType = program.getSetupSection().getExpressionType();
			if(expressionType != null) {
				
				QExpressionParser expressionParser = expressionParserRegistry.lookup(expressionType);		
				compilationContext.set(QExpressionParser.class, expressionParser);
			}
		}
		
		compilationContext.set(QProgram.class, program);

		return compilationContext;
	}


	@Override
	public QCompilationContext createChildContext(QCompilationContext master, QProcedure procedure) {

		QJob job = master.get(QJob.class);
		
		Map<String, QCompilationContext> globalContexts = new HashMap<>();
		List<QCompilationContext> moduleContexts = prepareContexts(job, globalContexts, procedure, master.getCaseSensitive());		
		moduleContexts.add(master);
		
		RPJCompilationContextImpl compilationContext = new RPJCompilationContextImpl(master.createChild(),
																					 procedure,
																					 moduleContexts,
																					 master.getCaseSensitive());

		compilationContext.set(QCompilationContext.class, compilationContext);

		return compilationContext;
	}
	

	@Override
	public QCompilationContext createCompilationContext(QJob job, QCompoundDataTerm<?> structure, CaseSensitiveType caseSensitive) {


		List<QCompilationContext> contexts = new ArrayList<QCompilationContext>();
		
		RPJCompilationContextImpl compilationContext = new RPJCompilationContextImpl(job.getJobContext().createChild(),
																					 structure,
																					 contexts,
																					 caseSensitive);
		compilationContext.set(QCompilationContext.class, compilationContext);

		return compilationContext;
	}
	
	private void prepareDefaultContext(List<QCompilationContext> contexts, QJob job, CaseSensitiveType caseSensitive) {
		// default context
		try {
			URL entry = FrameworkUtil.getBundle(this.getClass()).getEntry("./ASUP-INF/modules.xmi");
			Resource resource = resourceSet.createResource(URI.createURI(entry.toString()));
			resource.load(Collections.EMPTY_MAP);
			
			// type check
			EObject eObject = resource.getContents().get(0);			
			if(eObject instanceof QModule) {
				QModule module = (QModule)eObject;
				
				// add *RPJ module
				QCompilationContext moduleContext = createCompilationContext(job, new HashMap<String, QCompilationContext>(), module, caseSensitive);
				contexts.add(moduleContext);
			}

		}
		catch(Exception e) {
			System.out.println("Error on loading resource ./ASUP-INF/modules.xmi");
		}
	}

	private List<QCompilationContext> prepareContexts(QJob job, Map<String, QCompilationContext> globalContexts, QCallableUnit unit, CaseSensitiveType caseSensitive) {
		
		List<QCompilationContext> moduleContexts = new ArrayList<QCompilationContext>();
		prepareDefaultContext(moduleContexts, job, caseSensitive); 
				
		if(unit.getSetupSection() == null)
			return moduleContexts;
		
		QResourceReader<org.asup.os.type.module.QModule> moduleReader = moduleManager.getResourceReader(job, Scope.LIBRARY_LIST);		
		for(String moduleName: unit.getSetupSection().getModules()) {

			QCompilationContext moduleContext = globalContexts.get(moduleName);
			
			if(moduleContext != null) {
				moduleContexts.add(moduleContext);
				continue;
			}
				
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

				moduleContext = createCompilationContext(job, globalContexts, flowModel, caseSensitive);
				
				moduleContexts.add(moduleContext);
				globalContexts.put(moduleName, moduleContext);
			} catch (IOException e) {
				throw new OperatingSystemRuntimeException(e);
			}
		}
		
		return moduleContexts;
	}

	@Override
	public void writeProgram(QCompilationContext context, QCompilationSetup setup, OutputStream output) throws IOException {

		RPJProgramWriter programWriter = new RPJProgramWriter(null, context, setup, context.getRoot().getName());
		programWriter.writeProgram((QProgram) context.getRoot());

		programWriter.writeOutputStream(output);
	}

	@Override
	public void writeModule(QCompilationContext context, QCompilationSetup setup, OutputStream output) throws IOException {
		
		RPJModuleWriter moduleWriter = new RPJModuleWriter(null, context, setup, context.getRoot().getName());		
		moduleWriter.writeModule((QModule) context.getRoot());

		moduleWriter.writeOutputStream(output);
	}

	@Override
	public void writeStruct(QCompilationContext context, QCompilationSetup setup, OutputStream output) throws IOException {
		
		RPJDataStructureWriter dataStructureWriter = new RPJDataStructureWriter(null, context, setup, context.getRoot().getName(), false);
		dataStructureWriter.writeStructure(((QCompoundDataTerm<?>)context.getRoot()).getDefinition());

		dataStructureWriter.writeOutputStream(output);
	}

	@Override
	public void writeStub(QCompilationContext context, QCompilationSetup setup, OutputStream output) throws IOException {
		
		RPJStubWriter skeletonWriter = new RPJStubWriter(null, context, setup, context.getRoot().getName());
		skeletonWriter.writeSkeleton((QProgram) context.getRoot());
		
		skeletonWriter.writeOutputStream(output);
	}

	@Override
	public void linkCompilationContext(QCompilationContext context) {

		// link childs
		for(QCompilationContext childCompilationContext: context.getChildContexts()) {
			linkCompilationContext(childCompilationContext);
		}
		
		// link root
		RPJCallableUnitLinker callableUnitLinker = context.make(RPJCallableUnitLinker.class);
		
		// register linker on context
		context.set(RPJCallableUnitLinker.class, callableUnitLinker);

		callableUnitLinker.linkFiles();
		
		callableUnitLinker.linkExternalDatas();

		callableUnitLinker.linkLikeDatas();
	}
}
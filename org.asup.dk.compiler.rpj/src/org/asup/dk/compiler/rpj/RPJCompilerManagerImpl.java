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

import org.asup.db.core.QViewDef;
import org.asup.dk.compiler.CaseSensitiveType;
import org.asup.dk.compiler.QCompilationSetup;
import org.asup.dk.compiler.QCompilationUnit;
import org.asup.dk.compiler.impl.CompilerManagerImpl;
import org.asup.dk.compiler.rpj.writer.JDTDatabaseFileWriter;
import org.asup.dk.compiler.rpj.writer.JDTDisplayFileWriter;
import org.asup.dk.compiler.rpj.writer.JDTModuleWriter;
import org.asup.dk.compiler.rpj.writer.JDTPrinterFileWriter;
import org.asup.dk.compiler.rpj.writer.JDTProgramTestWriter;
import org.asup.dk.compiler.rpj.writer.JDTProgramWriter;
import org.asup.dk.compiler.rpj.writer.JDTStubWriter;
import org.asup.dk.source.QSourceEntry;
import org.asup.dk.source.QSourceManager;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataManager;
import org.asup.il.expr.QExpressionParser;
import org.asup.il.expr.QExpressionParserRegistry;
import org.asup.il.flow.QCallableUnit;
import org.asup.il.flow.QModule;
import org.asup.il.flow.QProcedure;
import org.asup.il.flow.QProgram;
import org.asup.il.isam.QRecordWrapper;
import org.asup.il.isam.annotation.Format;
import org.asup.il.isam.annotation.Query;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.type.file.QDatabaseFile;
import org.asup.os.type.file.QDisplayFile;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QLogicalFile;
import org.asup.os.type.file.QPrinterFile;
import org.asup.os.type.module.QModuleManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.osgi.framework.FrameworkUtil;

public class RPJCompilerManagerImpl extends CompilerManagerImpl {

	@Inject
	private QExpressionParserRegistry expressionParserRegistry;
	@Inject
	private QModuleManager moduleManager;
	@Inject
	private QSourceManager sourceManager;
	@Inject
	private QDataManager dataManager;

	private ResourceSet resourceSet = new ResourceSetImpl();
	private Map<String, QCompilationUnit> globalContexts = new HashMap<>();
	
	@Override
	public QCompilationUnit createChildCompilationUnit(QCompilationUnit master, QProcedure procedure) {

		QJob job = master.getContext().get(QJob.class);

		List<QCompilationUnit> moduleContexts = prepareContexts(job, globalContexts, procedure, master.getCaseSensitive());
		moduleContexts.add(master);

		RPJCompilationUnitImpl compilationUnit = new RPJCompilationUnitImpl(master.getContext().createChildContext(procedure.getName()), procedure, moduleContexts, master.getCaseSensitive());

		compilationUnit.getContext().set(QCompilationUnit.class, compilationUnit);

		return compilationUnit;
	}

	private QCompilationUnit createCompilationUnit(QJob job, Map<String, QCompilationUnit> globalContexts, QModule module, CaseSensitiveType caseSensitive) {

		List<QCompilationUnit> moduleContexts = null;
		if (!module.getName().startsWith("*"))
			moduleContexts = prepareContexts(job, globalContexts, module, caseSensitive);
		else
			moduleContexts = new ArrayList<QCompilationUnit>();

		RPJCompilationUnitImpl compilationUnit = new RPJCompilationUnitImpl(job.getContext().createChildContext(module.getName()), module, moduleContexts, caseSensitive);

		// compilationUnit
		compilationUnit.getContext().set(QCompilationUnit.class, compilationUnit);

		// expression parser
		if (module.getSetupSection() != null) {
			String expressionType = module.getSetupSection().getExpressionType();
			if (expressionType != null) {
				QExpressionParser expressionParser = expressionParserRegistry.lookup(expressionType);
				compilationUnit.getContext().set(QExpressionParser.class, expressionParser);
			}
		}

		// dataFactory
		QDataFactory dataFactory = dataManager.createFactory(compilationUnit);
		compilationUnit.getContext().set(QDataFactory.class, dataFactory);
		
		// module
		compilationUnit.getContext().set(QModule.class, module);

		return compilationUnit;
	}

	@Override
	public QCompilationUnit createCompilationUnit(QJob job, QFile file, CaseSensitiveType caseSensitive) {

		List<QCompilationUnit> compilationUnits = new ArrayList<QCompilationUnit>();

		RPJCompilationUnitImpl compilationUnit = new RPJCompilationUnitImpl(job.getContext().createChildContext(file.getName()), file, compilationUnits, caseSensitive);
		compilationUnit.getContext().set(QCompilationUnit.class, compilationUnit);

		return compilationUnit;
	}

	@Override
	public QCompilationUnit createCompilationUnit(QJob job, QModule module, CaseSensitiveType caseSensitive) {

		return createCompilationUnit(job, globalContexts, module, caseSensitive);
	}

	@Override
	public QCompilationUnit createCompilationUnit(QJob job, QProgram program, CaseSensitiveType caseSensitive) {

		List<QCompilationUnit> moduleContexts = prepareContexts(job, globalContexts, program, caseSensitive);

		RPJCompilationUnitImpl compilationUnit = new RPJCompilationUnitImpl(job.getContext().createChildContext(program.getName()), program, moduleContexts, caseSensitive);

		// compilation unit
		compilationUnit.getContext().set(QCompilationUnit.class, compilationUnit);

		// expression parser
		if (program.getSetupSection() != null) {
			String expressionType = program.getSetupSection().getExpressionType();
			if (expressionType != null) {

				QExpressionParser expressionParser = expressionParserRegistry.lookup(expressionType);
				compilationUnit.getContext().set(QExpressionParser.class, expressionParser);
			}
		}

		// dataFactory
		QDataFactory dataFactory = dataManager.createFactory(compilationUnit);
		compilationUnit.getContext().set(QDataFactory.class, dataFactory);

		compilationUnit.getContext().set(QProgram.class, program);

		return compilationUnit;
	}

	private void linkCompilationUnit(List<String> compilationUnits, QCompilationUnit compilationUnit) {

		if (compilationUnits.contains(compilationUnit.getRoot().getName()))
			return;

		compilationUnits.add(compilationUnit.getRoot().getName());

		// link childs
		for (QCompilationUnit childCompilationUnit : compilationUnit.getChildCompilationUnits())
			linkCompilationUnit(compilationUnits, childCompilationUnit);

		// link root
		RPJCallableUnitLinker callableUnitLinker = compilationUnit.getContext().make(RPJCallableUnitLinker.class);

		// register linker on compilationUnit
		compilationUnit.getContext().set(RPJCallableUnitLinker.class, callableUnitLinker);

		callableUnitLinker.linkModules();
		
		callableUnitLinker.linkFiles();

		callableUnitLinker.linkExternalDatas();

		callableUnitLinker.linkLikeDatas();
		
		callableUnitLinker.linkOverlayDatas();

		callableUnitLinker.linkFormulas();
	}

	@Override
	public void linkCompilationUnit(QCompilationUnit compilationUnit) {

		// load childs
		List<String> compilationUnits = new ArrayList<String>();
		linkCompilationUnit(compilationUnits, compilationUnit);
	}

	private List<QCompilationUnit> prepareContexts(QJob job, Map<String, QCompilationUnit> globalContexts, QCallableUnit callableUnit, CaseSensitiveType caseSensitive) {

		List<QCompilationUnit> moduleContexts = new ArrayList<QCompilationUnit>();
		loadModule(job, moduleContexts, caseSensitive, "*RPJ");

		RPJCallableUnitInfo callableUnitInfo = RPJCallableUnitAnalyzer.analyzeCallableUnit(callableUnit);
		if(callableUnitInfo.containsSQLStatement())
			loadModule(job, moduleContexts, caseSensitive, "*SQL");
		
		if (callableUnit.getSetupSection() == null)
			return moduleContexts;

		QResourceReader<org.asup.os.type.module.QModule> moduleReader = moduleManager.getResourceReader(job, Scope.LIBRARY_LIST);
		for (String moduleName : callableUnit.getSetupSection().getModules()) {

			QCompilationUnit moduleContext = globalContexts.get(moduleName);

			if (moduleContext != null) {
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
			QSourceEntry xmiModuleSource = sourceManager.getChildEntry(job, moduleEntry, module.getName() + ".xmi");
			if (xmiModuleSource == null)
				throw new OperatingSystemRuntimeException("Null resource for object " + module.getName(), null);

			// load flow module
			Resource resourceModule = new XMIResourceImpl();
			try {
				resourceModule.load(xmiModuleSource.getInputStream(), Collections.EMPTY_MAP);
				QModule flowModel = (QModule) resourceModule.getContents().get(0);

				moduleContext = createCompilationUnit(job, globalContexts, flowModel, caseSensitive);

				moduleContexts.add(moduleContext);
				globalContexts.put(moduleName, moduleContext);
			} catch (IOException e) {
				throw new OperatingSystemRuntimeException(e);
			}
		}

		return moduleContexts;
	}

	private void loadModule(QJob job, List<QCompilationUnit> moduleContexts, CaseSensitiveType caseSensitive, String moduleName) {
		try {
			URL entry = FrameworkUtil.getBundle(this.getClass()).getEntry("./modules/"+moduleName.replaceAll("\\*", "q")+".xmi");
			Resource resource = resourceSet.createResource(URI.createURI(entry.toString()));
			resource.load(Collections.EMPTY_MAP);
			
			// type check
			EObject eObject = resource.getContents().get(0);
			
			if (eObject instanceof QModule) {
				QModule module = (QModule) eObject;

				// add *RPJ module
				QCompilationUnit moduleContext = createCompilationUnit(job, new HashMap<String, QCompilationUnit>(), module, caseSensitive);
				moduleContexts.add(moduleContext);
			}

		} catch (Exception e) {
			System.out.println("Error loading module: "+moduleName);
		}
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void writeDatabaseFile(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException {

		QDatabaseFile databaseFile = (QDatabaseFile) compilationUnit.getRoot();

		JDTDatabaseFileWriter databaseFileWriter = null;
		
		if(databaseFile instanceof QLogicalFile) {
			QLogicalFile logicalFile = (QLogicalFile) databaseFile;
						
			if(databaseFile.getDatabaseFormat().isEmpty()) {				
				String table = logicalFile.getTables().get(0);				
				databaseFileWriter = new JDTDatabaseFileWriter(null, compilationUnit, setup, compilationUnit.getRoot().getName(), table);
			}
			else
				databaseFileWriter = new JDTDatabaseFileWriter(null, compilationUnit, setup, compilationUnit.getRoot().getName(), QRecordWrapper.class);
			
			QViewDef viewDef = compilationUnit.getContext().getAdapter(logicalFile, QViewDef.class);
			if(viewDef != null) {
				databaseFileWriter.writeImport(Query.class);
				
				// @Query("SELECT * FROM TABLE")
				NormalAnnotation programAnnotation = databaseFileWriter.getAST().newNormalAnnotation();
				programAnnotation.setTypeName(databaseFileWriter.getAST().newSimpleName(Query.class.getSimpleName()));
				MemberValuePair memberValuePair = databaseFileWriter.getAST().newMemberValuePair();
				memberValuePair.setName(databaseFileWriter.getAST().newSimpleName("value"));
				StringLiteral stringLiteral = databaseFileWriter.getAST().newStringLiteral();
				stringLiteral.setLiteralValue(viewDef.getQuerySelect());
				memberValuePair.setValue(stringLiteral);
				programAnnotation.values().add(memberValuePair);

				databaseFileWriter.getTarget().modifiers().add(0, programAnnotation);

			}
		}
		else
			databaseFileWriter = new JDTDatabaseFileWriter(null, compilationUnit, setup, compilationUnit.getRoot().getName(), QRecordWrapper.class);
			
		
		// @Format("BRARTIR")
		databaseFileWriter.writeImport(Format.class);
		NormalAnnotation programAnnotation = databaseFileWriter.getAST().newNormalAnnotation();
		programAnnotation.setTypeName(databaseFileWriter.getAST().newSimpleName(Format.class.getSimpleName()));
		MemberValuePair memberValuePair = databaseFileWriter.getAST().newMemberValuePair();
		memberValuePair.setName(databaseFileWriter.getAST().newSimpleName("value"));
		StringLiteral stringLiteral = databaseFileWriter.getAST().newStringLiteral();
		stringLiteral.setLiteralValue(databaseFile.getDatabaseFormat().getName());
		memberValuePair.setValue(stringLiteral);
		programAnnotation.values().add(memberValuePair);

		databaseFileWriter.getTarget().modifiers().add(0, programAnnotation);
		
		databaseFileWriter.writeDatabaseFile(databaseFile);

		databaseFileWriter.writeOutputStream(output);
	}

	@Override
	public void writeDisplayFile(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException {

		QDisplayFile displayFile = (QDisplayFile) compilationUnit.getRoot();

		JDTDisplayFileWriter displayFileWriter = new JDTDisplayFileWriter(null, compilationUnit, setup, compilationUnit.getRoot().getName());
		displayFileWriter.writeDisplayFile(displayFile);

		displayFileWriter.writeOutputStream(output);
	}

	@Override
	public void writeModule(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException {

		QModule module = (QModule) compilationUnit.getRoot();

		JDTModuleWriter moduleWriter = new JDTModuleWriter(null, compilationUnit, setup, compilationUnit.getRoot().getName());
		moduleWriter.writeModule(module);

		moduleWriter.writeOutputStream(output);
	}

	@Override
	public void writePrinterFile(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException {

		QPrinterFile printerFile = (QPrinterFile) compilationUnit.getRoot();

		JDTPrinterFileWriter printerFileWriter = new JDTPrinterFileWriter(null, compilationUnit, setup, compilationUnit.getRoot().getName());
		printerFileWriter.writerPrinterFile(printerFile);

		printerFileWriter.writeOutputStream(output);

	}

	@Override
	public void writeProgram(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException {

		QProgram program = (QProgram) compilationUnit.getRoot();

		JDTProgramWriter programWriter = new JDTProgramWriter(null, compilationUnit, setup, compilationUnit.getRoot().getName());
		programWriter.writeProgram(program);

		programWriter.writeOutputStream(output);
	}

	@Override
	public void writeProgramTest(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException {

		QProgram program = (QProgram) compilationUnit.getRoot();

		JDTProgramTestWriter programTestWriter = new JDTProgramTestWriter(null, compilationUnit, setup, compilationUnit.getRoot().getName());
		programTestWriter.writeProgramTest(program);

		programTestWriter.writeOutputStream(output);
	}
	
	@Override
	public void writeStub(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException {

		QProgram program = (QProgram) compilationUnit.getRoot();

		JDTStubWriter skeletonWriter = new JDTStubWriter(null, compilationUnit, setup, compilationUnit.getRoot().getName());
		skeletonWriter.writeSkeleton(program);

		skeletonWriter.writeOutputStream(output);
	}
}
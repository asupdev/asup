/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi 			 - Initial API and implementation 
 *   Giuliano Giancristofaro - Implementation
 */
package org.asup.dk.compiler.rpj;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.dk.compiler.DevelopmentKitCompilerRuntimeException;
import org.asup.dk.compiler.QCompilationUnit;
import org.asup.dk.compiler.QCompilerLinker;
import org.asup.dk.compiler.QDevelopmentKitCompilerFactory;
import org.asup.il.core.QDerived;
import org.asup.il.core.QIntegratedLanguageCoreFactory;
import org.asup.il.data.QCompoundDataTerm;
import org.asup.il.data.QDataStructDef;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.flow.QCallableUnit;
import org.asup.il.flow.QDataSection;
import org.asup.il.flow.QFileSection;
import org.asup.il.flow.QSetupSection;
import org.asup.il.isam.QDataSetTerm;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.type.file.QDatabaseFile;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QFileManager;
import org.asup.os.type.file.QFileMultiFormat;
import org.asup.os.type.file.QFileSingleFormat;
import org.asup.os.type.file.QLogicalFile;
import org.asup.os.type.lib.QLibrary;
import org.asup.os.type.lib.QLibraryManager;
import org.asup.os.type.module.QModule;
import org.asup.os.type.module.QModuleManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class RPJCallableUnitLinker {

	@Inject
	private QCompilationUnit compilationUnit;
	@Inject
	private QJob job;
	@Inject
	private QFileManager fileManager;
	@Inject
	private QModuleManager moduleManager;
	@Inject
	private QLibraryManager libraryManager;

	private QResourceReader<QFile> fileReader;
	private QResourceReader<QModule> moduleReader;
	private QResourceReader<QLibrary> libraryReader;

	@PostConstruct
	public void init() {
		this.fileReader = fileManager.getResourceReader(job, Scope.LIBRARY_LIST);
		this.moduleReader = moduleManager.getResourceReader(job, Scope.LIBRARY_LIST);
		this.libraryReader = libraryManager.getLibraryReader(job);
	}

	public void linkExternalDatas() {

		if (!(compilationUnit.getRoot() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getRoot();

		QDataSection dataSection = callableUnit.getDataSection();
		if (dataSection == null)
			return;

		RPJDataTermLinker externalNameLinker = new RPJDataTermLinker(compilationUnit);
		for (QDataTerm<?> dataTerm : dataSection.getDatas()) {
			dataTerm.accept(externalNameLinker);
		}

	}

	public void linkLikeDatas() {

		if (!(compilationUnit.getRoot() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getRoot();

		QDataSection dataSection = callableUnit.getDataSection();
		if (dataSection == null)
			return;

		List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(dataSection.getDatas());

		RPJDataLikeRefactor dataLikeVisitor = new RPJDataLikeRefactor(compilationUnit);
		for (QDataTerm<?> dataTerm : dataTerms) {
			dataLikeVisitor.reset();

			dataTerm.accept(dataLikeVisitor);
			dataSection.getDatas().remove(dataTerm);
			dataSection.getDatas().add(dataLikeVisitor.getDataTerm());
		}

	}
	
	@SuppressWarnings("unused")
	private void linkRemapDatas() {

		if (!(compilationUnit.getRoot() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getRoot();

		QDataSection dataSection = callableUnit.getDataSection();
		if (dataSection == null)
			return;

		List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(dataSection.getDatas());

		RPJDataRemapRefactor dataRemapVisitor = new RPJDataRemapRefactor(compilationUnit);
		for (QDataTerm<?> dataTerm : dataTerms) {
			dataRemapVisitor.reset();

			dataTerm.accept(dataRemapVisitor);
			dataSection.getDatas().remove(dataTerm);
			dataSection.getDatas().add(dataRemapVisitor.getDataTerm());
		}

	}
	
	public void linkOverlayDatas() {

		if (!(compilationUnit.getRoot() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getRoot();

		QDataSection dataSection = callableUnit.getDataSection();
		if (dataSection == null)
			return;

		List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(dataSection.getDatas());

		RPJDataOverlayRefactor dataOverlayVisitor = new RPJDataOverlayRefactor(compilationUnit);
		for (QDataTerm<?> dataTerm : dataTerms) {
			dataOverlayVisitor.reset();

			dataTerm.accept(dataOverlayVisitor);
			dataSection.getDatas().remove(dataTerm);
			dataSection.getDatas().add(dataOverlayVisitor.getDataTerm());
		}

	}

	public void linkModules() {

		if (!(compilationUnit.getRoot() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getRoot();

		QSetupSection setupSection = callableUnit.getSetupSection();
		if (setupSection == null)
			return;

		for (String moduleName : setupSection.getModules()) {
			
			QModule module = getModule(moduleName);
			if (module == null)
				throw new OperatingSystemRuntimeException("Module not found: " + moduleName);
			
			Class<?> linkedClass = loadClass(module);
			if (linkedClass == null)
				throw new DevelopmentKitCompilerRuntimeException("Linked class not found: " + module);

			QCompilerLinker compilerLinker = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilerLinker();
			compilerLinker.setLinkedClass(linkedClass);
			
			org.asup.il.flow.QModule flowModule = compilationUnit.getModule(moduleName, false); 
			if(flowModule != null)
				compilationUnit.getModule(moduleName, false).getFacets().add(compilerLinker);
			else
				throw new OperatingSystemRuntimeException("Module not found: " + moduleName);
		}

	}

	public void linkFiles() {

		if (!(compilationUnit.getRoot() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getRoot();

		QFileSection fileSection = callableUnit.getFileSection();
		if (fileSection == null)
			return;

		for (QDataSetTerm dataSet : fileSection.getDataSets())
			linkDataSet(dataSet);

	}

	private void linkDataSet(QDataSetTerm dataSet) {

		QFile file = getFile(dataSet.getFileName());

		if (file == null)
			throw new OperatingSystemRuntimeException("File not found: " + dataSet.getFileName());

		if (file instanceof QFileSingleFormat<?>) {
			QFileSingleFormat<?> fileSingleFormat = (QFileSingleFormat<?>) file;

			linkFileSingleFormat(dataSet, fileSingleFormat);
		} else {
			QFileMultiFormat<?> fileMultiFormat = (QFileMultiFormat<?>) file;
			linkFileMultipleFormat(dataSet, fileMultiFormat);
		}

	}

	private void linkFileMultipleFormat(QDataSetTerm dataSet, QFileMultiFormat<?> fileMultiFormat) {

		Class<?> linkedClass = loadClass(fileMultiFormat);
		if (linkedClass == null)
			throw new DevelopmentKitCompilerRuntimeException("Linked class not found: " + fileMultiFormat.getName());


		QCompilerLinker compilerLinker = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilerLinker();
		compilerLinker.setLinkedClass(linkedClass);

	}

	private void linkFileSingleFormat(QDataSetTerm dataSet, QFileSingleFormat<?> fileSingleFormat) {

		if (dataSet.getFormatName() == null)
			dataSet.setFormatName(fileSingleFormat.getFileFormat().getName());

		Class<?> linkedClass = loadClass(fileSingleFormat);
		if (linkedClass == null)
			throw new DevelopmentKitCompilerRuntimeException("Linked class not found: " + fileSingleFormat.getName());

		QCompilerLinker compilerLinker = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilerLinker();		
		compilerLinker.setLinkedClass(linkedClass);

		
		if (dataSet.getRecord() == null) {

			QCompoundDataTerm<QDataStructDef> compoundDataTerm = QIntegratedLanguageDataFactory.eINSTANCE.createUnaryCompoundDataTerm();
			compoundDataTerm.setName(dataSet.getFormatName());
			
			QDataStructDef dataStructDef = QIntegratedLanguageDataFactory.eINSTANCE.createDataStructDef();
			dataStructDef.setPrefix(dataSet.getPrefix());
			
			compoundDataTerm.setDefinition(dataStructDef);
			
			if (fileSingleFormat instanceof QLogicalFile && fileSingleFormat.getFileFormat().isEmpty()) {
				QLogicalFile logicalFile = (QLogicalFile) fileSingleFormat;

				for (String table : logicalFile.getTables()) {
					QDatabaseFile superTable = (QDatabaseFile) getFile(table);

					if (superTable == null)
						throw new OperatingSystemRuntimeException("File not found: " + table);

					for(QDataTerm<?> element: superTable.getFileFormat().getFields()) {
						
						element = (QDataTerm<?>) EcoreUtil.copy((EObject)element);

						QDerived derived = QIntegratedLanguageCoreFactory.eINSTANCE.createDerived();
						element.getFacets().add(derived);

						dataStructDef.getElements().add(element);	
					}
					
				}
			} else {

				for(QDataTerm<?> element: fileSingleFormat.getFileFormat().getFields()) {
					
					element = (QDataTerm<?>) EcoreUtil.copy((EObject)element);

					QDerived derived = QIntegratedLanguageCoreFactory.eINSTANCE.createDerived();
					element.getFacets().add(derived);

					dataStructDef.getElements().add(element);	
				}

			}

			dataSet.setRecord(compoundDataTerm);
			

			QCompoundDataTerm<?> dataRecord = (QCompoundDataTerm<?>) this.compilationUnit.getDataTerm(dataSet.getFormatName(), false);
			if(dataRecord != null && !(((EObject)dataRecord).eContainer() instanceof QDataSetTerm)) {				
				compoundDataTerm.getFacets().add(compilerLinker);

				RPJDataRemapRefactor dataRemapVisitor = new RPJDataRemapRefactor(compilationUnit);
				List<QDataTerm<?>> elements = new ArrayList<QDataTerm<?>>(dataRecord.getDefinition().getElements());
				for (QDataTerm<?> dataTerm : elements) {
					dataRemapVisitor.reset();
					dataTerm.accept(dataRemapVisitor);
					if(dataRemapVisitor.getDataTerm() == null)
						dataRecord.getDefinition().getElements().remove(dataTerm);
				}

				if(dataRecord.getDefinition().getElements().size() != 1)
					throw new DevelopmentKitCompilerRuntimeException("Invalid remap: " + dataSet);

				compoundDataTerm.getDefinition().getElements().addAll(dataRecord.getDefinition().getElements());
				
				this.compilationUnit.getTrashcan().getDataTerms().add(dataRecord);
			}
			else {
				dataSet.getFacets().add(compilerLinker);				
			}

		}
		
	}

	public QFile getFile(String name) {

		QFile file = fileManager.getOverriddenFile(job, name);
		if (file == null)
			file = fileReader.lookup(name);

		return file;
	}

	public Class<?> loadClass(QFile file) {

		// TODO
		QLibrary library = libraryReader.lookup(file.getLibrary());

		String pathURI = library.getPackageURI().toString().replaceAll("/", ".") + "file/";
		URI packageURI = library.getPackageURI().resolve(file.getPackageInfoURI());

		String address = "asup:/omac/" + pathURI + packageURI.toString().replaceAll("/", ".") + "." + file.getName();
		Class<?> linkedClass = compilationUnit.getContext().loadClass(address);

		if (linkedClass == null) {
			address = "asup:/omac/" + file.getLibrary() + "/" + file.getApplication() + ".file." + file.getName();
			linkedClass = compilationUnit.getContext().loadClass(address);
		}

		// search on parent library
		if (linkedClass == null) {

			if (library.getParentLibrary() != null) {

				QLibrary masterLibrary = libraryReader.lookup(library.getParentLibrary());
				if (masterLibrary == null)
					throw new OperatingSystemRuntimeException("Master library not found: " + library);

				address = "asup:/omac/" + masterLibrary.getName() + "/" + file.getApplication() + ".file." + file.getName();
				linkedClass = compilationUnit.getContext().loadClass(address);
			}
		}

		return linkedClass;
	}

	public QModule getModule(String name) {

		QModule module = moduleReader.lookup(name);

		return module;
	}
	
	public Class<?> loadClass(QModule module) {

		// TODO
		QLibrary library = libraryReader.lookup(module.getLibrary());

		String pathURI = library.getPackageURI().toString().replaceAll("/", ".") + "module/";
		URI packageURI = library.getPackageURI().resolve(module.getPackageInfoURI());

		String address = "asup:/omac/" + pathURI + packageURI.toString().replaceAll("/", ".") + "." + module.getName();
		Class<?> linkedClass = compilationUnit.getContext().loadClass(address);

		if (linkedClass == null) {
			address = "asup:/omac/" + module.getLibrary() + "/" + module.getApplication() + ".module." + module.getName();
			linkedClass = compilationUnit.getContext().loadClass(address);
		}

		// search on parent library
		if (linkedClass == null) {

			if (library.getParentLibrary() != null) {

				QLibrary masterLibrary = libraryReader.lookup(library.getParentLibrary());
				if (masterLibrary == null)
					throw new OperatingSystemRuntimeException("Master library not found: " + library);

				address = "asup:/omac/" + masterLibrary.getName() + "/" + module.getApplication() + ".module." + module.getName();
				linkedClass = compilationUnit.getContext().loadClass(address);
			}
		}

		return linkedClass;
	}
}

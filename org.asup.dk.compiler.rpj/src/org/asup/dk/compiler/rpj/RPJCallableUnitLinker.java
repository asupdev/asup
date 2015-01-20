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
import org.asup.il.core.QRemap;
import org.asup.il.core.QTerm;
import org.asup.il.data.QCompoundDataTerm;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.flow.QCallableUnit;
import org.asup.il.flow.QDataSection;
import org.asup.il.flow.QFileSection;
import org.asup.il.flow.QSetupSection;
import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QDisplayTerm;
import org.asup.il.isam.QFileTerm;
import org.asup.il.isam.QIntegratedLanguageIsamFactory;
import org.asup.il.isam.QPrintTerm;
import org.asup.il.isam.QRecordDef;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.type.file.QDatabaseFile;
import org.asup.os.type.file.QDatabaseFileFormat;
import org.asup.os.type.file.QExternalFile;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QFileFormat;
import org.asup.os.type.file.QFileFormatField;
import org.asup.os.type.file.QFileManager;
import org.asup.os.type.file.QFileMultiFormat;
import org.asup.os.type.file.QFileSingleFormat;
import org.asup.os.type.file.QLogicalFile;
import org.asup.os.type.file.QOperatingSystemFileFactory;
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
			if (flowModule != null)
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
			linkFileTerm(dataSet);

		for(QDisplayTerm displayTerm: fileSection.getDisplays())
			linkFileTerm(displayTerm);
		
		for(QPrintTerm printerTerm: fileSection.getPrinters())
			linkFileTerm(printerTerm);
	}

	private void linkFileTerm(QFileTerm fileTerm) {

		QFile file = getFile(fileTerm.getFileName());

		// TODO retrieve type (internal=true)
		if (file == null || fileTerm.getName().equals("SRC")) {
			linkInternalFileTerm(fileTerm);
		} else {
			linkExternalFileTerm(fileTerm, file);
		}

	}

	private void linkExternalFileTerm(QFileTerm fileTerm, QFile file) {

		QExternalFile externalFile = QOperatingSystemFileFactory.eINSTANCE.createExternalFile();
		externalFile.setName(file.getName());
		fileTerm.getFacets().add(externalFile);

		if (file instanceof QFileSingleFormat<?>) {
			QFileSingleFormat<?> fileSingleFormat = (QFileSingleFormat<?>) file;
			linkFileSingleFormat((QDataSetTerm) fileTerm, fileSingleFormat, externalFile);
		} else {
			QFileMultiFormat<?> fileMultiFormat = (QFileMultiFormat<?>) file;
			linkFileMultipleFormat(fileTerm, fileMultiFormat, externalFile);
		}
	}

	private void linkInternalFileTerm(QFileTerm fileTerm) {

		QRecordDef recordDef = fileTerm.getRecord();
		if (recordDef == null) {
			recordDef = QIntegratedLanguageIsamFactory.eINSTANCE.createRecordDef();
			fileTerm.setRecord(recordDef);
		}

		// redefine record
		QCompoundDataTerm<?> dataRecord = (QCompoundDataTerm<?>) this.compilationUnit.getDataTerm(fileTerm.getFileName(), false);
		if (dataRecord == null)
			return;

		recordDef.getElements().addAll(dataRecord.getDefinition().getElements());

		// remove redefined record
		this.compilationUnit.getTrashcan().getDataTerms().add(dataRecord);
	}

	private void linkFileSingleFormat(QDataSetTerm dataSet, QFileSingleFormat<?> fileSingleFormat, QExternalFile externalFile) {

		externalFile.setFormat(fileSingleFormat.getFileFormat().getName());

		if (dataSet.getFormatName() == null)
			dataSet.setFormatName(fileSingleFormat.getFileFormat().getName());

		QRecordDef recordDef = dataSet.getRecord();
		if (recordDef == null) {
			recordDef = QIntegratedLanguageIsamFactory.eINSTANCE.createRecordDef();
			recordDef.setPrefix(dataSet.getPrefix());
			dataSet.setRecord(recordDef);
		}

		linkExternalFile(dataSet, recordDef.getElements(), externalFile);

		// redefine record
		QCompoundDataTerm<?> dataRecord = (QCompoundDataTerm<?>) this.compilationUnit.getDataTerm(dataSet.getFormatName(), false);
		if (dataRecord == null)
			return;

		for (QDataTerm<?> element : dataRecord.getDefinition().getElements()) {

			QRemap remap = element.getFacet(QRemap.class);
			if (remap == null)
				continue;

			for (QDataTerm<?> recordElement : recordDef.getElements()) {
				if (this.compilationUnit.equalsTermName(recordElement.getName(), element.getName())) {
					recordElement.getFacets().add(remap);
					break;
				}
			}

		}

		// remove redefined record
		this.compilationUnit.getTrashcan().getDataTerms().add(dataRecord);

	}

	private void linkFileMultipleFormat(QFileTerm fileTerm, QFileMultiFormat<?> fileMultiFormat, QExternalFile externalFile) {
		/*
		 * Class<?> linkedClass = loadClass(fileMultiFormat); if (linkedClass ==
		 * null) throw new
		 * DevelopmentKitCompilerRuntimeException("Linked class not found: " +
		 * fileMultiFormat.getName());
		 * 
		 * QCompilerLinker compilerLinker =
		 * QDevelopmentKitCompilerFactory.eINSTANCE.createCompilerLinker();
		 * compilerLinker.setLinkedClass(linkedClass);
		 */

		// if (dataSet.getFormatName() == null)
		// dataSet.setFormatName(fileSingleFormat.getFileFormat().getName());

		QRecordDef recordDef = QIntegratedLanguageIsamFactory.eINSTANCE.createRecordDef();

		fileTerm.setRecord(recordDef);

		linkExternalFile(fileTerm, recordDef.getElements(), externalFile);

	}

	public void linkExternalFile(QTerm term, List<QDataTerm<?>> target, QExternalFile externalFile) {

		if (externalFile.getName().startsWith("*"))
			return;

		QFile file = getFile(externalFile.getName());

		if (file == null)
			throw new OperatingSystemRuntimeException("File not found: " + externalFile.getName());

		if (file instanceof QDatabaseFile) {
			QDatabaseFile databaseFile = (QDatabaseFile) file;

			if (externalFile.getFormat() == null)
				externalFile.setFormat(databaseFile.getDatabaseFormat().getName());

			QDatabaseFileFormat databaseFileFormat = databaseFile.getDatabaseFormat();
			if (databaseFile instanceof QLogicalFile && databaseFileFormat.isEmpty()) {
				QLogicalFile logicalFile = (QLogicalFile) databaseFile;

				for (String table : logicalFile.getTables()) {
					QDatabaseFile superTable = (QDatabaseFile) getFile(table);

					if (superTable == null)
						throw new OperatingSystemRuntimeException("File not found: " + table);

					appendElements(target, superTable.getFileFormat());
				}
			} else {
				appendElements(target, databaseFileFormat);
			}
		} else if (file instanceof QFileMultiFormat<?>) {
			QFileMultiFormat<?> fileMultiFormat = (QFileMultiFormat<?>) file;

			for (QFileFormat<?> fileFormat : fileMultiFormat.getFileFormats()) {

				QCompoundDataTerm<QRecordDef> formatTerm = QIntegratedLanguageDataFactory.eINSTANCE.createUnaryCompoundDataTerm();
				formatTerm.setName(fileFormat.getName());
								
				QRecordDef recordDef = QIntegratedLanguageIsamFactory.eINSTANCE.createRecordDef();
				for (QFileFormatField field : fileFormat.getFields()) {
					recordDef.getElements().add((QDataTerm<?>) EcoreUtil.copy((EObject)field));
				}
				formatTerm.setDefinition(recordDef);
				
				target.add(formatTerm);
			}

		}

		Class<?> linkedClass = loadClass(file);
		if (linkedClass == null)
			throw new DevelopmentKitCompilerRuntimeException("Linked class not found: " + externalFile);

		QCompilerLinker compilerLinker = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilerLinker();
		compilerLinker.setLinkedClass(linkedClass);
		term.getFacets().add(compilerLinker);

	}

	private void appendElements(List<QDataTerm<?>> target, QFileFormat<?> fileFormat) {

		for (QDataTerm<?> element : fileFormat.getFields()) {

			element = (QDataTerm<?>) EcoreUtil.copy((EObject) element);

			QDerived derived = QIntegratedLanguageCoreFactory.eINSTANCE.createDerived();
			element.getFacets().add(derived);

			target.add(element);
		}
	}

	private QFile getFile(String name) {

		QFile file = fileManager.getOverriddenFile(job, name);
		if (file == null)
			file = fileReader.lookup(name);

		return file;
	}

	private Class<?> loadClass(QFile file) {

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

	private QModule getModule(String name) {

		QModule module = moduleReader.lookup(name);

		return module;
	}

	private Class<?> loadClass(QModule module) {

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

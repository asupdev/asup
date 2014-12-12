package org.asup.dk.compiler.rpj;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.dk.compiler.DevelopmentKitCompilerRuntimeException;
import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QDevelopmentKitCompilerFactory;
import org.asup.dk.compiler.QCompilerLinker;
import org.asup.fw.core.QContextID;
import org.asup.il.data.QDataStructDef;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.flow.QCallableUnit;
import org.asup.il.flow.QDataSection;
import org.asup.il.flow.QFileSection;
import org.asup.il.isam.QDataSetTerm;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QFileManager;
import org.asup.os.type.file.QFileSingleFormat;
import org.asup.os.type.file.QLogicalFile;
import org.asup.os.type.lib.QLibrary;
import org.asup.os.type.lib.QLibraryManager;

//github.com/asupdev/asup.git

public class RPJCallableUnitLinker {

	@Inject
	private QCompilationContext compilationContext;
	@Inject
	private QJob job;
	@Inject
	private QFileManager fileManager;
	@Inject
	private QLibraryManager libraryManager;

	private QResourceReader<QFile> fileReader;
	private QResourceReader<QLibrary> libraryReader;

	@PostConstruct
	public void init() {
		this.fileReader = fileManager.getResourceReader(job, Scope.LIBRARY_LIST);
		this.libraryReader = libraryManager.getLibraryReader(job);
	}

	public void linkExternalDatas() {

		if (!(compilationContext.getRoot() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationContext.getRoot();

		QDataSection dataSection = callableUnit.getDataSection();
		if (dataSection == null)
			return;

		RPJDataTermLinker externalNameLinker = new RPJDataTermLinker(compilationContext);
		for (QDataTerm<?> dataTerm : dataSection.getDatas()) {
			dataTerm.accept(externalNameLinker);
		}

	}

	public void linkLikeDatas() {

		if (!(compilationContext.getRoot() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationContext.getRoot();

		QDataSection dataSection = callableUnit.getDataSection();
		if (dataSection == null)
			return;

		List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(dataSection.getDatas());

		RPJDataLikeRefactor dataLikeVisitor = new RPJDataLikeRefactor(compilationContext);
		for (QDataTerm<?> dataTerm : dataTerms) {
			dataLikeVisitor.reset();

			dataTerm.accept(dataLikeVisitor);
			dataSection.getDatas().remove(dataTerm);
			dataSection.getDatas().add(dataLikeVisitor.getDataTerm());
		}

	}

	public void linkOverlayDatas() {

		if (!(compilationContext.getRoot() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationContext.getRoot();

		QDataSection dataSection = callableUnit.getDataSection();
		if (dataSection == null)
			return;

		List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(dataSection.getDatas());

		RPJDataOverlayRefactor dataOverlayVisitor = new RPJDataOverlayRefactor(compilationContext);
		for (QDataTerm<?> dataTerm : dataTerms) {
			dataOverlayVisitor.reset();

			dataTerm.accept(dataOverlayVisitor);
			dataSection.getDatas().remove(dataTerm);
			dataSection.getDatas().add(dataOverlayVisitor.getDataTerm());
		}

	}

	public void linkFiles() {

		if (!(compilationContext.getRoot() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationContext.getRoot();

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
			// TODO
			System.err.println("File multiformat found: "+file);
		}

	}

	private void linkFileSingleFormat(QDataSetTerm dataSet, QFileSingleFormat<?> fileSingleFormat) {

		if (dataSet.getFormatName() == null)
			dataSet.setFormatName(fileSingleFormat.getFileFormat().getName());

		if (fileSingleFormat instanceof QLogicalFile && fileSingleFormat.getFileFormat().isEmpty()) {
			QLogicalFile logicalFile = (QLogicalFile) fileSingleFormat;
			fileSingleFormat = (QFileSingleFormat<?>) getFile(logicalFile.getDictionary());

			if (fileSingleFormat == null)
				throw new OperatingSystemRuntimeException("File not found: " + logicalFile.getDictionary());
		}

		Class<?> linkedClass = loadClass(null, fileSingleFormat);
		if (linkedClass == null)
			throw new DevelopmentKitCompilerRuntimeException("Linked class not found: " + fileSingleFormat.getName());

		QCompilerLinker compilerLinker = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilerLinker();
		compilerLinker.setLinkedClass(linkedClass);
		dataSet.getFacets().add(compilerLinker);

		if (dataSet.getRecord() == null) {

			QDataStructDef dataStructDef = QIntegratedLanguageDataFactory.eINSTANCE.createDataStructDef();

			List<QDataTerm<?>> elements = new ArrayList<QDataTerm<?>>(fileSingleFormat.getFileFormat().getFields());
			dataStructDef.getElements().addAll(elements);

			dataSet.setRecord(dataStructDef);
		}
	}

	public QFile getFile(String name) {

		QFile file = fileManager.getOverriddenFile(job, name);
		if (file == null)
			file = fileReader.lookup(name);

		return file;
	}

	public Class<?> loadClass(QContextID contextID, QFile file) {

		// TODO		
		QLibrary library = libraryReader.lookup(file.getLibrary());

		String pathURI = library.getPackageURI().toString().replaceAll("/", ".") + "file/";
		URI packageURI = library.getPackageURI().resolve(file.getPackageInfoURI());

		String address = "asup:/omac/" + pathURI + packageURI.toString().replaceAll("/", ".") + "." + file.getName();
		Class<?> linkedClass = compilationContext.loadClass(null, address);
		
		if (linkedClass == null) {
			address = "asup:/omac/" + file.getLibrary() + "/" + file.getApplication() + ".file." + file.getName();
			linkedClass = compilationContext.loadClass(null, address);
		}

		// search on parent library
		if (linkedClass == null) {

			if (library.getParentLibrary() != null) {

				QLibrary masterLibrary = libraryReader.lookup(library.getParentLibrary());
				if (masterLibrary == null)
					throw new OperatingSystemRuntimeException("Master library not found: " + library);

				address = "asup:/omac/" + masterLibrary.getName() + "/" + file.getApplication() + ".file." + file.getName();
				linkedClass = compilationContext.loadClass(null, address);
			}
		}

		return linkedClass;
	}
}

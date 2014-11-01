package org.asup.dk.compiler.rpj;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.db.data.QDatabaseDataHelper;
import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.rpj.visitor.RPJDataLikeRefactor;
import org.asup.dk.compiler.rpj.visitor.RPJDataOverlayRefactor;
import org.asup.dk.compiler.rpj.visitor.RPJDataTermLinker;
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
import org.asup.os.type.file.QLogicalFile;
import org.asup.os.type.file.QPhysicalFile;
import org.asup.os.type.lib.QLibrary;
import org.asup.os.type.lib.QLibraryManager;

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
		
		// TODO
		if(!(compilationContext.getRoot() instanceof QCallableUnit))
			return;
		
		QCallableUnit callableUnit = (QCallableUnit) compilationContext.getRoot();
		
		QDataSection dataSection = callableUnit.getDataSection();
		if(dataSection == null) 
			return;
			
		RPJDataTermLinker externalNameLinker = new RPJDataTermLinker(compilationContext);
		for(QDataTerm<?> dataTerm: dataSection.getDatas()) {			
			dataTerm.accept(externalNameLinker);			
		}

	}
	
	public void linkLikeDatas() {
		
		// TODO
		if(!(compilationContext.getRoot() instanceof QCallableUnit))
			return;
		
		QCallableUnit callableUnit = (QCallableUnit) compilationContext.getRoot();
		
		QDataSection dataSection = callableUnit.getDataSection();
		if(dataSection == null) 
			return;

		List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(dataSection.getDatas());

		RPJDataLikeRefactor dataLikeVisitor = new RPJDataLikeRefactor(compilationContext);
		for(QDataTerm<?> dataTerm: dataTerms) {
			dataLikeVisitor.reset();
			
			dataTerm.accept(dataLikeVisitor);			
			dataSection.getDatas().remove(dataTerm);			
			dataSection.getDatas().add(dataLikeVisitor.getDataTerm());
		}
		
	}	

	public void linkOverlayDatas() {
		
		// TODO
		if(!(compilationContext.getRoot() instanceof QCallableUnit))
			return;
		
		QCallableUnit callableUnit = (QCallableUnit) compilationContext.getRoot();
		
		QDataSection dataSection = callableUnit.getDataSection();
		if(dataSection == null) 
			return;

		List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(dataSection.getDatas());

		RPJDataOverlayRefactor dataOverlayVisitor = new RPJDataOverlayRefactor(compilationContext);
		for(QDataTerm<?> dataTerm: dataTerms) {
			dataOverlayVisitor.reset();
			
			dataTerm.accept(dataOverlayVisitor);			
			dataSection.getDatas().remove(dataTerm);			
			dataSection.getDatas().add(dataOverlayVisitor.getDataTerm());
		}
		
	}

	public void linkFiles() {
		
		// TODO
		if(!(compilationContext.getRoot() instanceof QCallableUnit))
			return;

		QCallableUnit callableUnit = (QCallableUnit) compilationContext.getRoot();

		QFileSection fileSection = callableUnit.getFileSection();
		if(fileSection == null) 
			return;

		for(QDataSetTerm dataSet: fileSection.getDataSets()) 
			linkDataSet(dataSet);
	}
	
	
	private void linkDataSet(QDataSetTerm dataSet) {

		if(dataSet.getFileName().equalsIgnoreCase("PRT198"))
			return;
		
		QFile file = getFile(dataSet.getFileName());

		if(file == null)
			throw new OperatingSystemRuntimeException("File not found: "+dataSet.getFileName());

		if(file instanceof QPhysicalFile || file instanceof QLogicalFile) {

			QPhysicalFile physicalFile = getPhysicalFile(dataSet.getFileName());
			
			if(dataSet.getFormatName() == null)
				dataSet.setFormatName(physicalFile.getTableFormat());

			if(dataSet.getRecord() == null) {
				
				QDataStructDef dataStructDef = QIntegratedLanguageDataFactory.eINSTANCE.createDataStructDef();
				
				List<QDataTerm<?>> elements = QDatabaseDataHelper.buildDataTerm(physicalFile.getTable(), dataSet.getName()).getDefinition().getElements();			
				dataStructDef.getElements().addAll(elements);
				
				dataSet.setRecord(dataStructDef);
			}
		}
		else 
			System.err.println(file);
		
	}

	public QPhysicalFile getPhysicalFile(String name) {

		QFile file = getFile(name);

		QPhysicalFile physicalFile = null;
		if(file instanceof QPhysicalFile) {
			physicalFile = (QPhysicalFile) file;
		}
		else if(file instanceof QLogicalFile) {
			QLogicalFile logicalFile = (QLogicalFile) file;
			physicalFile = (QPhysicalFile) fileManager.getOverridedDatabaseFile(job, logicalFile.getIndex().getObject());
			
			if(physicalFile == null)
				physicalFile = (QPhysicalFile) fileReader.lookup(logicalFile.getIndex().getObject());
		}			
		
		return physicalFile;
	}


	public QFile getFile(String name) {

		QFile file = fileManager.getOverridedDatabaseFile(job, name);
		if(file == null)
			file = fileReader.lookup(name);
		
		return file;
	}
	
	public Class<?> loadClass(QContextID contextID, QFile file) {

		String address = "asup:/omac/"+file.getLibrary() + "/" + file.getApplication()+".file."+file.getName();
		Class<?> linkedClass = compilationContext.loadClass(null, address);
		
		// search on parent library
		if(linkedClass == null) {
			
			QLibrary library = libraryReader.lookup(file.getLibrary());
			if(library.getParentLibrary() != null) {

				QLibrary masterLibrary = libraryReader.lookup(library.getParentLibrary());
				if(masterLibrary == null)
					throw new OperatingSystemRuntimeException("Master library not found: "+library);
				
				address = "asup:/omac/"+masterLibrary.getName() + "/" + file.getApplication()+".file."+file.getName();
				linkedClass = compilationContext.loadClass(null, address);
			}
		}
		
		return linkedClass;
	}
}

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

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

import org.asup.db.data.QDatabaseDataHelper;
import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.impl.CompilationContextImpl;
import org.asup.dk.compiler.rpj.util.CompilationContextHelper;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QContext;
import org.asup.il.core.QNamedNode;
import org.asup.il.core.QNode;
import org.asup.il.core.QOverlay;
import org.asup.il.data.QArrayDef;
import org.asup.il.data.QCompoundDataTerm;
import org.asup.il.data.QDataStructDef;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.data.QMultipleAtomicDataTerm;
import org.asup.il.data.QUnaryAtomicDataDef;
import org.asup.il.flow.QCallableUnit;
import org.asup.il.flow.QEntry;
import org.asup.il.flow.QEntryParameter;
import org.asup.il.flow.QModule;
import org.asup.il.flow.QProcedure;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QRoutine;
import org.asup.il.isam.QDataSetTerm;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QFileManager;
import org.asup.os.type.file.QLogicalFile;
import org.asup.os.type.file.QPhysicalFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class RPJCompilationContextImpl extends CompilationContextImpl {

	private QJob job;
	private QContext delegate;
	private QFileManager fileManager;
	private QResourceReader<QFile> fileReader;
	private Map<String, QCompilationContext> contexts;
	
	private QCallableUnit callableUnit;
	
	public RPJCompilationContextImpl(QJob job, QContext delegate, QFileManager fileManager, 
									 QCallableUnit unit, Map<String, QCompilationContext> contexts) {
		
		this.callableUnit = unit;
		
		this.job = job;
		this.fileManager = fileManager;
		this.fileReader = fileManager.getResourceReader(job, Scope.LIBRARY_LIST);
		this.contexts = contexts;
		this.delegate = delegate; 
	}
	
	@Override
	public void inject(Object object) throws FrameworkCoreRuntimeException {
		delegate.inject(object);
	}

	@Override
	public <A extends Annotation> void invoke(Object object, Class<A> qualifier)
			throws FrameworkCoreRuntimeException {
		delegate.invoke(object, qualifier);
	}

	@Override
	public <T> T make(Class<T> klass) throws FrameworkCoreRuntimeException {
		return delegate.make(klass);
	}

	@Override
	public <T> void set(Class<T> klass, T object)
			throws FrameworkCoreRuntimeException {
		delegate.set(klass, object);
	}

	@Override
	public <T> void set(String name, T object)
			throws FrameworkCoreRuntimeException {
		delegate.set(name, object);
	}

	@Override
	public QContext createChild() throws FrameworkCoreRuntimeException {
		return delegate.createChild();
	}

	@Override
	public <T> T get(Class<T> clazz) {
		return delegate.get(clazz);
	}

	@Override
	public QDataSetTerm getDataSet(String name, boolean deep) {

		if(getUnitContext().getFileSection() == null)
			return null;
		
		QDataSetTerm dataSetTerm = null;
		
		for(QDataSetTerm d: getUnitContext().getFileSection().getDataSets()) {

			if(CompilationContextHelper.equalsTermName(d.getFormatName(), name) ||
			   CompilationContextHelper.equalsTermName(d.getFileName(), name) ) {
				dataSetTerm = d;
				break;
			}	
						
/*			QPhysicalFile physicalFile = getPhysicalFile(d.getFileName());
			
			dataSetTerm = QIntegratedLanguageIsamFactory.eINSTANCE.createDataSetTerm();
			dataSetTerm.setFileName(physicalFile.getName());*/

		}		
		
		// deep search
		if(dataSetTerm == null && deep) {
			for(QCompilationContext compilationContext: contexts.values()) {				
				dataSetTerm = compilationContext.getDataSet(name, true);
				
				if(dataSetTerm != null)
					break;
			}
		}
		
		return dataSetTerm;
	}	

	@Override
	public QDataTerm<?> getData(String name, boolean deep) {

		if(getUnitContext().getDataSection() == null)
			return null;
		
		// search on dataTermContainer
		QDataTerm<?> dataTerm = findData(getUnitContext().getDataSection().getDatas(), name);
		
		// search on dataSet
		if(dataTerm == null && getUnitContext().getFileSection() != null) {
			for(QDataSetTerm dataSetTerm: getUnitContext().getFileSection().getDataSets()) {

				if(dataSetTerm.getRecord() == null)
					continue;
				
				dataTerm = findData(dataSetTerm.getRecord().getElements(), name);
										
				if(dataTerm != null)
					break;
			}
		}
		
		// deep search
		if(dataTerm == null && deep) {
			for(QCompilationContext compilationContext: contexts.values()) {
				dataTerm = compilationContext.getData(name, true);
				
				if(dataTerm != null)
					break;
			}
		}
		
		return dataTerm;
	}
	
	@Override
	public QProcedure getProcedure(String name, boolean deep) {

		if(getUnitContext().getFlowSection() == null)
			return null;

		QProcedure procedure = null;

		for(QProcedure p: getUnitContext().getFlowSection().getProcedures()) {
			if(CompilationContextHelper.equalsTermName(p.getName(), name)) {
				procedure = p;
				break;
			}
		}
		
		// deep search
		if(procedure == null && deep) {
			for(QCompilationContext compilationContext: contexts.values()) {
				
				procedure = compilationContext.getProcedure(name, true);
				
				if(procedure != null)
					break;
			}
		}
		
		return procedure;
	}

	@Override
	public QModule getModule(String name, boolean deep) {
		if(getUnitContext().getSetupSection() == null)
			return null;

		QModule module = null;

		for(QCompilationContext compilationContext: contexts.values()) {
			if(compilationContext.getUnitContext() instanceof QModule) {
				
				if(CompilationContextHelper.equalsTermName(compilationContext.getUnitContext().getName(), name)) {
					module = (QModule) compilationContext.getUnitContext();
					break;
				}
			}
		}
		
		// deep search
		if(module == null && deep) {
			for(QCompilationContext compilationContext: contexts.values()) {
				
				module = compilationContext.getModule(name, true);
				
				if(module != null)
					break;
			}
		}
		
		return module;
	}

	@Override
	public QPrototype<?> getPrototype(String name, boolean deep) {

		if(getUnitContext().getFlowSection() == null)
			return null;

		QPrototype<?> prototype = null;
		
		for(QPrototype<?> p: getUnitContext().getFlowSection().getPrototypes()) {
			if(CompilationContextHelper.equalsTermName(p.getName(), name)) {
				prototype =  p;
				break;
			}
		}

		// deep search
		if(prototype == null && deep) {
			for(QCompilationContext compilationContext: contexts.values()) {
				prototype = compilationContext.getPrototype(name, true);
				
				if(prototype != null)
					break;
			}
		}
		
		// TODO remove
//		if(prototype == null && !name.startsWith("%")) 
//			prototype = getPrototype("%"+name, deep);
		
		return prototype;
	}

	
	@Override
	public QRoutine getRoutine(String name, boolean deep) {

		if(getUnitContext().getFlowSection() == null)
			return null;

		QRoutine routine = null;

		for(QRoutine r: getUnitContext().getFlowSection().getRoutines()) {
			if(CompilationContextHelper.equalsTermName(r.getName(), name)) {
				routine = r;
				break;
			}
		}
		
		// deep search
		if(routine == null && deep) {
			for(QCompilationContext compilationContext: contexts.values()) {
				
				routine = compilationContext.getRoutine(name, true);
				
				if(routine != null)
					break;
			}
		}
		
		return routine;
	}

	@Override
	public QNamedNode getNamedNode(String name, boolean deep) {
		
		QNamedNode namedNode = null;
		
		if(getUnitContext() instanceof QProcedure) {
			QProcedure qProcedure = (QProcedure)getUnitContext();
			
			for(QEntryParameter<?> entryParameter: qProcedure.getEntry().getParameters()) {
				if(CompilationContextHelper.equalsTermName(entryParameter.getName(), name)) {
					namedNode = entryParameter;
					break;
				}
			}
		}
		if(namedNode != null)
			return namedNode;
		
		// dataTerms
		namedNode = getData(name, deep);
		if(namedNode != null)
			return namedNode;
			
		// prototypes
		namedNode = getPrototype(name, deep);
		if(namedNode != null)
			return namedNode;
				
		// dataSets
		namedNode = getDataSet(name, deep); 
		if(namedNode != null)
			return namedNode;

		// prototype
		namedNode = getModule(name, deep);
		if(namedNode != null)
			return namedNode;
		
		// deep search
		if(deep) {
			for(QCompilationContext compilationContext: contexts.values()) {
				namedNode = compilationContext.getNamedNode(name, true);
				
				if(namedNode != null)
					break;
			}
		}
		
		return namedNode;
	}

	@Override
	public String getQualifiedName(QNamedNode namedNode) {

		String name = CompilationContextHelper.normalizeTermName(namedNode.getName());
		
		QNode node = namedNode;
		
		while(node.isChild()) {
			node = node.getParent();

			
			if(node instanceof QDataSetTerm) {
				name = "get()."+name;
			}

			if(node instanceof QEntry) {
				name = "qEN."+name;
			}
			else if(node instanceof QNamedNode && node != getUnitContext()) {
				QNamedNode namedChildNode = (QNamedNode)node;
				name = CompilationContextHelper.normalizeTermName(namedChildNode.getName())+"."+name;	
			}
		}
		
		return name;
	}
	
	
	private QDataTerm<?> findData(List<QDataTerm<?>> dataTerms, String name) {

		
		QDataTerm<?> dataTerm = null;		
		for(QDataTerm<?> child: dataTerms) {

			if(CompilationContextHelper.equalsTermName(child.getName(), name)) {
				dataTerm = child;
			}
			else if(child instanceof QCompoundDataTerm) {
				QCompoundDataTerm<?> compoundDataTerm = (QCompoundDataTerm<?>)child;
				dataTerm = findData(compoundDataTerm.getDefinition().getElements(), name);
			}
			
			if(dataTerm != null)
				break;
		}
		
		if(dataTerm != null) {
			
			// overlay
			QOverlay overlay = dataTerm.getFacet(QOverlay.class);
			if(overlay != null) {
				QDataTerm<?> overlaid = getData(overlay.getName(), true);
				if(overlaid == null)
					System.err.println("Overlaid term not found: "+overlay);

				if(overlaid.getDataType().isMultiple() && !dataTerm.getDataType().isMultiple()) {
					
					// multiple term
					QMultipleAtomicDataTerm<QArrayDef<?>> multipleAtomicDataTerm = QIntegratedLanguageDataFactory.eINSTANCE.createMultipleAtomicDataTerm();
					multipleAtomicDataTerm.setName(dataTerm.getName());
					multipleAtomicDataTerm.setConstant(dataTerm.isConstant());
					
					// arrayDef
					QArrayDef<?> arrayDataDef = QIntegratedLanguageDataFactory.eINSTANCE.createArrayDef();
					arrayDataDef.setArgument((QUnaryAtomicDataDef<?>) EcoreUtil.copy((EObject)dataTerm.getDefinition()));
					arrayDataDef.setDimension(((QArrayDef<?>)overlaid.getDefinition()).getDimension());
					
					multipleAtomicDataTerm.setDefinition(arrayDataDef);

					if(dataTerm.getParent() instanceof QCompoundDataTerm) {
						QCompoundDataTerm<?> parent = (QCompoundDataTerm<?>)dataTerm.getParent();
						parent.getDefinition().getElements().remove(dataTerm);
						parent.getDefinition().getElements().add(multipleAtomicDataTerm);
					}
					dataTerm = multipleAtomicDataTerm;
				}
			}
			return dataTerm;
		}
		
		return dataTerm;
	}

	@Override
	public QCallableUnit getUnitContext() {
		return callableUnit;
	}

	@Override
	public void linkDataSet(QDataSetTerm dataSet) {
		
		if(dataSet.getFormatName() == null) {
			
			QPhysicalFile physicalFile = getPhysicalFile(dataSet.getFileName());
			
			dataSet.setFormatName(physicalFile.getTableFormat());
		}		
		
		if(dataSet.getRecord() == null) {

			QPhysicalFile physicalFile = getPhysicalFile(dataSet.getFileName());
			
			QDataStructDef dataStructDef = QIntegratedLanguageDataFactory.eINSTANCE.createDataStructDef();
			
			List<QDataTerm<?>> elements = QDatabaseDataHelper.buildDataTerm(physicalFile.getTable(), dataSet.getName()).getDefinition().getElements();			
			dataStructDef.getElements().addAll(elements);
			
			dataSet.setRecord(dataStructDef);
		}
	}
	
	public QPhysicalFile getPhysicalFile(String name) {

		QFile file = fileManager.getOverridedDatabaseFile(job, name);
		if(file == null)
			file = fileReader.lookup(name);

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

		if(physicalFile == null)
			throw new OperatingSystemRuntimeException("File not found: "+name);

		
		return physicalFile;
	}
}
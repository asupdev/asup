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
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.List;

import org.asup.db.data.QDatabaseDataHelper;
import org.asup.dk.compiler.CaseSensitiveType;
import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.impl.CompilationContextImpl;
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
import org.asup.il.data.QUnaryAtomicBufferedDataDef;
import org.asup.il.flow.QCallableUnit;
import org.asup.il.flow.QEntry;
import org.asup.il.flow.QEntryParameter;
import org.asup.il.flow.QModule;
import org.asup.il.flow.QProcedure;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QRoutine;
import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QKeyListTerm;
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
	private QNamedNode root;
	private QFileManager fileManager;
	private QResourceReader<QFile> fileReader;

	private List<QCompilationContext> contexts;
	private CaseSensitiveType caseSensitive;
	
	private List<QDataTerm<?>> datas;
	private List<QDataSetTerm> dataSets;
	private List<QKeyListTerm> keyLists;
	private List<QRoutine> routines;
	private List<QProcedure> procedures;
	private List<QPrototype<?>> prototypes;
	
	public RPJCompilationContextImpl(QJob job, QContext delegate, QFileManager fileManager,
									 QNamedNode root,
									 List<QCompilationContext> contexts,
									 CaseSensitiveType caseSensitive) {
		
		this.job = job;
		this.delegate = delegate;
		
		this.fileManager = fileManager;
		this.fileReader = fileManager.getResourceReader(job, Scope.LIBRARY_LIST);
		
		this.contexts = contexts;
		this.caseSensitive = caseSensitive;
		this.root = root;
 
		if(root instanceof QCallableUnit) {
			QCallableUnit callableUnit = (QCallableUnit) root;
			
			if(callableUnit.getDataSection() != null)
				datas = callableUnit.getDataSection().getDatas();
			
			if(callableUnit.getFileSection() != null) {
				dataSets = callableUnit.getFileSection().getDataSets();
				keyLists = callableUnit.getFileSection().getKeyLists();
			}
			
			if(callableUnit.getFlowSection() != null) {
				routines = callableUnit.getFlowSection().getRoutines();
				procedures = callableUnit.getFlowSection().getProcedures();
				prototypes = callableUnit.getFlowSection().getPrototypes();
			}
		}

		if(datas == null)
			datas = new ArrayList<QDataTerm<?>>();
		if(dataSets == null)
			dataSets = new ArrayList<QDataSetTerm>();
		if(keyLists == null)
			keyLists = new ArrayList<QKeyListTerm>();
		if(routines == null)
			routines = new ArrayList<QRoutine>();
		if(procedures == null)
			procedures = new ArrayList<QProcedure>();
		if(prototypes == null)
			prototypes = new ArrayList<QPrototype<?>>();

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
		
		QDataSetTerm dataSetTerm = null;
		
		for(QDataSetTerm d: dataSets) {

			if(equalsTermName(d.getFormatName(), name) ||
			   equalsTermName(d.getFileName(), name) ) {
				
				dataSetTerm = d;
				
/*				QPhysicalFile physicalFile = getPhysicalFile(dataSetTerm.getFileName());			
				dataSetTerm = QIntegratedLanguageIsamFactory.eINSTANCE.createDataSetTerm();
				dataSetTerm.setFileName(physicalFile.getName());

				break;*/
			}	
						

		}		
		
		// deep search
		if(dataSetTerm == null && deep) {
			for(QCompilationContext compilationContext: contexts) {				
				dataSetTerm = compilationContext.getDataSet(name, true);
				
				if(dataSetTerm != null)
					break;
			}
		}
		
		return dataSetTerm;
	}	


	@Override
	public QKeyListTerm getKeyList(String name, boolean deep) {
		
		QKeyListTerm keyListTerm = null;
		
		for(QKeyListTerm k: keyLists) {
			if(equalsTermName(k.getName(), name)) {				
				keyListTerm = k;
				break;
			}	
		}		
		
		// deep search
		if(keyListTerm == null && deep) {
			for(QCompilationContext compilationContext: contexts) {				
				keyListTerm = compilationContext.getKeyList(name, true);
				
				if(keyListTerm != null)
					break;
			}
		}
		
		return keyListTerm;

	}

	@Override
	public QDataTerm<?> getData(String name, boolean deep) {

		// search on dataTermContainer
		QDataTerm<?> dataTerm = findData(datas, name);
		
		// search on dataSet
		if(dataTerm == null) {
			for(QDataSetTerm dataSetTerm: dataSets) {

				if(dataSetTerm.getRecord() == null)
					continue;
				
				dataTerm = findData(dataSetTerm.getRecord().getElements(), name);
										
				if(dataTerm != null)
					break;
			}
		}
		
		// deep search
		if(dataTerm == null && deep) {
			for(QCompilationContext compilationContext: contexts) {
				dataTerm = compilationContext.getData(name, true);
				
				if(dataTerm != null)
					break;
			}
		}
		
		return dataTerm;
	}
	
	@Override
	public QProcedure getProcedure(String name, boolean deep) {

		QProcedure procedure = null;

		for(QProcedure p: procedures) {
			if(equalsTermName(p.getName(), name)) {
				procedure = p;
				break;
			}
		}
		
		// deep search
		if(procedure == null && deep) {
			for(QCompilationContext compilationContext: contexts) {
				
				procedure = compilationContext.getProcedure(name, true);
				
				if(procedure != null)
					break;
			}
		}
		
		return procedure;
	}

	@Override
	public QModule getModule(String name, boolean deep) {

		QModule module = null;

		for(QCompilationContext compilationContext: contexts) {
			if(compilationContext.getRoot() instanceof QModule) {
				
				if(equalsTermName(compilationContext.getRoot().getName(), name)) {
					module = (QModule) compilationContext.getRoot();
					break;
				}
			}
		}
		
		// deep search
		if(module == null && deep) {
			for(QCompilationContext compilationContext: contexts) {
				
				module = compilationContext.getModule(name, true);
				
				if(module != null)
					break;
			}
		}
		
		return module;
	}

	@Override
	public QPrototype<?> getPrototype(String name, boolean deep) {

		QPrototype<?> prototype = null;
		
		for(QPrototype<?> p: prototypes) {
			if(equalsTermName(p.getName(), name)) {
				prototype =  p;
				break;
			}
		}

		// deep search
		if(prototype == null && deep) {
			for(QCompilationContext compilationContext: contexts) {
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

		QRoutine routine = null;

		for(QRoutine r: routines) {
			if(equalsTermName(r.getName(), name)) {
				routine = r;
				break;
			}
		}
		
		// deep search
		if(routine == null && deep) {
			for(QCompilationContext compilationContext: contexts) {
				
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
		
		if(getRoot() instanceof QProcedure) {
			QProcedure qProcedure = (QProcedure)getRoot();
			
			for(QEntryParameter<?> entryParameter: qProcedure.getEntry().getParameters()) {
				if(equalsTermName(entryParameter.getName(), name)) {
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

		// keyList
		namedNode = getKeyList(name, deep);
		if(namedNode != null)
			return namedNode;
		
		// module
		namedNode = getModule(name, deep);
		if(namedNode != null)
			return namedNode;
		
		// prototype
		namedNode = getPrototype(name, deep);
		if(namedNode != null)
			return namedNode;
		
		// deep search
		if(deep) {
			for(QCompilationContext compilationContext: contexts) {
				namedNode = compilationContext.getNamedNode(name, true);
				
				if(namedNode != null)
					break;
			}
		}
		
		return namedNode;
	}

	@Override
	public String getQualifiedName(QNamedNode namedNode) {

		String name = normalizeTermName(namedNode.getName());
		
		QNode node = namedNode;
		
		while(node.isChild()) {
			node = node.getParent();

			
			if(node instanceof QDataSetTerm) {
				name = "get()."+name;
			}

			if(node instanceof QEntry) {
				name = "qEN."+name;
			}
			else if(node != getRoot()) {
				QNamedNode namedChildNode = (QNamedNode)node;
				name = normalizeTermName(namedChildNode.getName())+"."+name;	
			}
		}
		
		return name;
	}
	
	
	private QDataTerm<?> findData(List<QDataTerm<?>> dataTerms, String name) {

		
		QDataTerm<?> dataTerm = null;		
		for(QDataTerm<?> child: dataTerms) {

			if(equalsTermName(child.getName(), name)) {
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
					arrayDataDef.setArgument((QUnaryAtomicBufferedDataDef<?>) EcoreUtil.copy((EObject)dataTerm.getDefinition()));
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
	
	@Override
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

	@Override
	public String normalizeTermName(String name) {

		if(name == null)
			return null;
		
		StringBuffer nameBuffer = new StringBuffer();
		
		boolean firstToUpper = false;
		boolean allToUpper = false;
		
		for(char c: name.toCharArray()) {
			
			if(c=='§') {
				nameBuffer.append('ç');
			}
			else if(c=='&') {
//				nameBuffer.append('');
			}
			else if(c=='%') {
				nameBuffer.append('q');
				firstToUpper = true; 
			}
			else if(c=='*') {
				nameBuffer.append('q');
				allToUpper = true;
			}
			else {
				
				if(firstToUpper || allToUpper) 
					nameBuffer.append(Character.toUpperCase(c));
				else {
					switch (getCaseSensitive()) {
					case IGNORE:
						nameBuffer.append(c);
						break;
					case LOWER:
						nameBuffer.append(Character.toLowerCase(c));
						break;
					case UPPER:
						nameBuffer.append(Character.toUpperCase(c));
						break;
					}
				}
				
				firstToUpper = false;
			}
		}
		
		return nameBuffer.toString();
	}

	@Override
	public boolean equalsTermName(String source, String target) {

		if(source == null || target == null)
			return false;
		
		if(normalizeTermName(source).toLowerCase().equals(normalizeTermName(target).toLowerCase()))
			return true;
		else
			return false;

	}

	@Override
	public String normalizeTypeName(String name) {
		
		// specials
		if(name.startsWith("*")) {
			name = name.substring(1).toUpperCase();
		}
		else
			name = firstToUpper(name);

		name = name.replaceAll("§", "ç");
		
		return name;
	}
	
	public String firstToUpper(String str) {
		StringBuffer s = new StringBuffer(str.length());
		CharacterIterator it = new StringCharacterIterator(str);
		for (char ch = it.first(); ch != CharacterIterator.DONE; ch = it.next()) {
			if(it.getIndex()==0) {
				s.append(String.valueOf(ch).toUpperCase());
			} else {
				s.append(ch);
			}
		}
		return s.toString();
	}

	@Override
	public QNamedNode getRoot() {
		return this.root;
	}

	@Override
	public CaseSensitiveType getCaseSensitive() {
		return this.caseSensitive;
	}

}
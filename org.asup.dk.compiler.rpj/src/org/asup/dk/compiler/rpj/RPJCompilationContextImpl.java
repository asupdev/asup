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

import org.asup.dk.compiler.CaseSensitiveType;
import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.impl.CompilationContextImpl;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QContext;
import org.asup.il.core.QNamedNode;
import org.asup.il.core.QNode;
import org.asup.il.data.QCompoundDataTerm;
import org.asup.il.data.QDataTerm;
import org.asup.il.flow.QCallableUnit;
import org.asup.il.flow.QEntry;
import org.asup.il.flow.QEntryParameter;
import org.asup.il.flow.QModule;
import org.asup.il.flow.QProcedure;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QRoutine;
import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QKeyListTerm;

public class RPJCompilationContextImpl extends CompilationContextImpl {

	private QContext delegate;
	private QNamedNode root;

	private List<QCompilationContext> contexts;
	private CaseSensitiveType caseSensitive;
	
	private List<QDataSetTerm> dataSets;
	private List<QKeyListTerm> keyLists;
	private List<QRoutine> routines;
	private List<QProcedure> procedures;
	private List<QPrototype<?>> prototypes;
	
	public RPJCompilationContextImpl(QContext delegate,
									 QNamedNode root,
									 List<QCompilationContext> contexts,
									 CaseSensitiveType caseSensitive) {
		
		this.delegate = delegate;
		this.contexts = contexts;
		this.caseSensitive = caseSensitive;
		this.root = root;
 
		if(root instanceof QCallableUnit) {
			QCallableUnit callableUnit = (QCallableUnit) root;
			
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
	public QDataTerm<?> getDataTerm(String name, boolean deep) {

		QDataTerm<?> dataTerm = null;

		// search on dataTermContainer
		if(dataTerm == null && ((QCallableUnit)getRoot()).getDataSection() != null) 
			dataTerm = findData(((QCallableUnit)getRoot()).getDataSection().getDatas(), name);

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

				dataTerm = compilationContext.getDataTerm(name, true);
				
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
		namedNode = getDataTerm(name, deep);
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
		
/*		if(deep) {
			for(QCompilationContext compilationContext: contexts) {
				namedNode = compilationContext.getNamedNode(name, true);
				
				if(namedNode != null)
					break;
			}
		}*/
		
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

			
//			if(name.equalsIgnoreCase("£UIDDS.£UIBFU") && child.getName().startsWith("£UID"))
			
			if(equalsTermName(child.getName(), name)) {
				dataTerm = child;
			}
			else if(equalsTermName(getQualifiedName(child), name)) {
					dataTerm = child;
			}
			else if(child instanceof QCompoundDataTerm) {
				QCompoundDataTerm<?> compoundDataTerm = (QCompoundDataTerm<?>)child;
				dataTerm = findData(compoundDataTerm.getDefinition().getElements(), name);
			}
			
			if(dataTerm != null)
				break;
		}
		
		return dataTerm;
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

	@Override
	public List<QCompilationContext> getChildContexts() {
		return new ArrayList<QCompilationContext>(contexts);
	}
}
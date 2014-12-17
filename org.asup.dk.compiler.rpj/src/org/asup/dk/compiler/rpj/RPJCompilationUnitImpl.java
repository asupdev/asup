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

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.List;

import org.asup.dk.compiler.CaseSensitiveType;
import org.asup.dk.compiler.QCompilationUnit;
import org.asup.dk.compiler.impl.CompilationUnitImpl;
import org.asup.fw.core.QContext;
import org.asup.il.core.QNamedNode;
import org.asup.il.core.QNode;
import org.asup.il.data.QCompoundDataDef;
import org.asup.il.data.QCompoundDataTerm;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.flow.QCallableUnit;
import org.asup.il.flow.QEntry;
import org.asup.il.flow.QEntryParameter;
import org.asup.il.flow.QModule;
import org.asup.il.flow.QProcedure;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QRoutine;
import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QKeyListTerm;

public class RPJCompilationUnitImpl extends CompilationUnitImpl {

	private QContext context;
	private QNamedNode root;

	private List<QCompilationUnit> compilationUnits;
	private CaseSensitiveType caseSensitive;

	private List<QDataSetTerm> dataSets;
	private List<QKeyListTerm> keyLists;
	private List<QRoutine> routines;
	private List<QProcedure> procedures;
	private List<QPrototype<?>> prototypes;

	public RPJCompilationUnitImpl(QContext context, QNamedNode root, List<QCompilationUnit> compilationUnits, CaseSensitiveType caseSensitive) {

		this.context = context;
		this.compilationUnits = compilationUnits;
		this.caseSensitive = caseSensitive;
		this.root = root;

		if (root instanceof QCallableUnit) {
			QCallableUnit callableUnit = (QCallableUnit) root;

			if (callableUnit.getFileSection() != null) {
				dataSets = callableUnit.getFileSection().getDataSets();
				keyLists = callableUnit.getFileSection().getKeyLists();
			}

			if (callableUnit.getFlowSection() != null) {
				routines = callableUnit.getFlowSection().getRoutines();
				procedures = callableUnit.getFlowSection().getProcedures();
				prototypes = callableUnit.getFlowSection().getPrototypes();
			}
		}

		if (dataSets == null)
			dataSets = new ArrayList<QDataSetTerm>();
		if (keyLists == null)
			keyLists = new ArrayList<QKeyListTerm>();
		if (routines == null)
			routines = new ArrayList<QRoutine>();
		if (procedures == null)
			procedures = new ArrayList<QProcedure>();
		if (prototypes == null)
			prototypes = new ArrayList<QPrototype<?>>();

	}

	@Override
	public QDataSetTerm getDataSet(String name, boolean deep) {

		QDataSetTerm dataSetTerm = null;

		for (QDataSetTerm d : dataSets) {

			if (equalsTermName(d.getFormatName(), name) || equalsTermName(d.getFileName(), name)) {

				dataSetTerm = d;
			}

		}

		// deep search
		if (dataSetTerm == null && deep) {
			for (QCompilationUnit compilationUnit : compilationUnits) {
				dataSetTerm = compilationUnit.getDataSet(name, true);

				if (dataSetTerm != null)
					break;
			}
		}

		return dataSetTerm;
	}

	@Override
	public QKeyListTerm getKeyList(String name, boolean deep) {

		QKeyListTerm keyListTerm = null;

		for (QKeyListTerm k : keyLists) {
			if (equalsTermName(k.getName(), name)) {
				keyListTerm = k;
				break;
			}
		}

		// deep search
		if (keyListTerm == null && deep) {
			for (QCompilationUnit compilationUnit : compilationUnits) {
				keyListTerm = compilationUnit.getKeyList(name, true);

				if (keyListTerm != null)
					break;
			}
		}

		return keyListTerm;

	}

	@Override
	public QDataTerm<?> getDataTerm(String name, boolean deep) {

		QDataTerm<?> dataTerm = null;

		// search on dataTermContainer
		if (dataTerm == null && ((QCallableUnit) getRoot()).getDataSection() != null)
			dataTerm = findData(((QCallableUnit) getRoot()).getDataSection().getDatas(), name, null, 0);

		// search on dataSet
		if (dataTerm == null) {
			for (QDataSetTerm dataSetTerm : dataSets) {

				if (dataSetTerm.getRecord() == null)
					continue;

				dataTerm = findData(dataSetTerm.getRecord().getElements(), name, null, 0);

				if (dataTerm != null)
					break;
			}
		}

		// deep search
		if (dataTerm == null && deep) {
			for (QCompilationUnit compilationUnit : compilationUnits) {

				dataTerm = compilationUnit.getDataTerm(name, true);

				if (dataTerm != null)
					break;
			}
		}

		return dataTerm;
	}

	@Override
	public QProcedure getProcedure(String name, boolean deep) {

		QProcedure procedure = null;

		for (QProcedure p : procedures) {
			if (equalsTermName(p.getName(), name)) {
				procedure = p;
				break;
			}
		}

		// deep search
		if (procedure == null && deep) {
			for (QCompilationUnit compilationUnit : compilationUnits) {

				procedure = compilationUnit.getProcedure(name, true);

				if (procedure != null)
					break;
			}
		}

		return procedure;
	}

	@Override
	public QModule getModule(String name, boolean deep) {

		QModule module = null;

		for (QCompilationUnit compilationUnit : compilationUnits) {
			if (compilationUnit.getRoot() instanceof QModule) {

				if (equalsTermName(compilationUnit.getRoot().getName(), name)) {
					module = (QModule) compilationUnit.getRoot();
					break;
				}
			}
		}

		// deep search
		if (module == null && deep) {
			for (QCompilationUnit compilationUnit : compilationUnits) {

				module = compilationUnit.getModule(name, true);

				if (module != null)
					break;
			}
		}

		return module;
	}

	@Override
	public QPrototype<?> getPrototype(String name, boolean deep) {

		QPrototype<?> prototype = null;

		for (QPrototype<?> p : prototypes) {
			if (equalsTermName(p.getName(), name)) {
				prototype = p;
				break;
			}
		}

		// deep search
		if (prototype == null && deep) {
			for (QCompilationUnit compilationUnit : compilationUnits) {
				prototype = compilationUnit.getPrototype(name, true);

				if (prototype != null)
					break;
			}
		}

		return prototype;
	}

	@Override
	public QRoutine getRoutine(String name, boolean deep) {

		QRoutine routine = null;

		for (QRoutine r : routines) {
			if (equalsTermName(r.getName(), name)) {
				routine = r;
				break;
			}
		}

		// deep search
		if (routine == null && deep) {
			for (QCompilationUnit compilationUnit : compilationUnits) {

				routine = compilationUnit.getRoutine(name, true);

				if (routine != null)
					break;
			}
		}

		return routine;
	}

	@Override
	public QNamedNode getNamedNode(String name, boolean deep) {

		QNamedNode namedNode = null;

		if (getRoot() instanceof QProcedure) {
			QProcedure qProcedure = (QProcedure) getRoot();

			for (QEntryParameter<?> entryParameter : qProcedure.getEntry().getParameters()) {
				if (equalsTermName(entryParameter.getName(), name)) {
					namedNode = entryParameter;
					break;
				}
			}
		}
		if (namedNode != null)
			return namedNode;

		// dataTerms
		namedNode = getDataTerm(name, deep);
		if (namedNode != null)
			return namedNode;

		// prototypes
		namedNode = getPrototype(name, deep);
		if (namedNode != null)
			return namedNode;

		// dataSets
		namedNode = getDataSet(name, deep);
		if (namedNode != null)
			return namedNode;

		// keyList
		namedNode = getKeyList(name, deep);
		if (namedNode != null)
			return namedNode;

		// module
		namedNode = getModule(name, deep);
		if (namedNode != null)
			return namedNode;

		// prototype
		namedNode = getPrototype(name, deep);
		if (namedNode != null)
			return namedNode;

		return namedNode;
	}

	@Override
	public String getQualifiedName(QNamedNode namedNode) {

		String name = normalizeTermName(namedNode.getName());

		QNode node = namedNode;

		while (node.isChild()) {
			node = node.getParent();

			if (node instanceof QMultipleCompoundDataTerm) {
				name = "current()." + name;
			} else if (node instanceof QDataSetTerm) {
				name = "get()." + name;
			} else if (node instanceof QEntry) {
				name = "qEN." + name;
			}

			if (node != getRoot()) {
				QNamedNode namedChildNode = (QNamedNode) node;
				name = normalizeTermName(namedChildNode.getName()) + "." + name;
			}
		}

		return name;
	}

	private QDataTerm<?> findData(List<QDataTerm<?>> dataTerms, String name, String prefix, int position) {

		QDataTerm<?> dataTerm = null;
		for (QDataTerm<?> child : dataTerms) {

			String childName = null;
			if (prefix != null)
				childName = prefix + child.getName().substring(position);
			else
				childName = child.getName();

			if (equalsTermName(childName, name)) {
				dataTerm = child;
			} else if (equalsTermName(getQualifiedName(child), name)) {
				dataTerm = child;
			} else if (child instanceof QCompoundDataTerm) {
				QCompoundDataTerm<?> compoundDataTerm = (QCompoundDataTerm<?>) child;
				QCompoundDataDef<?> compoundDataDef = compoundDataTerm.getDefinition();
				if (compoundDataDef.getPrefix() != null) {
					String[] tokens = compoundDataDef.getPrefix().split("\\:");
					String pfx = tokens[0];
					int pos = 1;
					if (tokens.length > 1)
						pos = Integer.parseInt(tokens[1]);
					else
						pos = pfx.length();

					dataTerm = findData(compoundDataDef.getElements(), name, pfx, pos);
				} else
					dataTerm = findData(compoundDataDef.getElements(), name, null, 0);
			}

			if (dataTerm != null)
				break;
		}

		return dataTerm;
	}

	@Override
	public String normalizeTermName(String name) {

		if (name == null)
			return null;

		StringBuffer nameBuffer = new StringBuffer();

		boolean firstToUpper = false;
		boolean allToUpper = false;

		for (char c : name.toCharArray()) {

			if (c == '§') {
				nameBuffer.append('ç');
			} else if (c == '&') {
				// nameBuffer.append('');
			} else if (c == '%') {
				nameBuffer.append('q');
				firstToUpper = true;
			} else if (c == '*') {
				nameBuffer.append('q');
				allToUpper = true;
			} else {

				if (firstToUpper || allToUpper)
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

		if (source == null || target == null)
			return false;

		if (normalizeTermName(source).toLowerCase().equals(normalizeTermName(target).toLowerCase()))
			return true;
		else
			return false;

	}

	@Override
	public String normalizeTypeName(String name) {

		// special
		if (name.startsWith("*"))
			name = name.substring(1).toUpperCase();

		StringBuffer s = new StringBuffer(name.length());
		CharacterIterator it = new StringCharacterIterator(name);
		for (char ch = it.first(); ch != CharacterIterator.DONE; ch = it.next()) {
			if (it.getIndex() == 0) {
				s.append(String.valueOf(ch).toUpperCase());
			} else {
				if (ch == '§')
					s.append('ç');
				else
					s.append(ch);
			}
		}
		name = s.toString();

		return name.toUpperCase();
	}

	@Override
	public String normalizeTypeName(QDataTerm<?> dataTerm) {

		String name = normalizeTypeName(dataTerm.getName());

		// multiple
		if (dataTerm.getDataTermType().isMultiple() && name.endsWith("s"))
			name = removeLastChar(name);

		return name;
	}

	@Override
	public QNamedNode getRoot() {
		return this.root;
	}

	@Override
	public CaseSensitiveType getCaseSensitive() {
		return this.caseSensitive;
	}

	private String removeLastChar(String str) {
		if (str.length() == 0)
			return str;
		if (str.length() == 1)
			return "";

		return str.substring(0, str.length() - 1);
	}

	@Override
	public QContext getContext() {
		return this.context;
	}

	@Override
	public List<QCompilationUnit> getChildCompilationUnits() {
		return new ArrayList<QCompilationUnit>(compilationUnits);
	}
}
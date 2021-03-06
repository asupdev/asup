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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.asup.dk.compiler.CaseSensitiveType;
import org.asup.dk.compiler.QCompilationUnit;
import org.asup.dk.compiler.QDevelopmentKitCompilerFactory;
import org.asup.dk.compiler.impl.CompilationUnitImpl;
import org.asup.fw.core.QContext;
import org.asup.il.core.QNamedNode;
import org.asup.il.core.QNode;
import org.asup.il.core.QRemap;
import org.asup.il.data.QCompoundDataDef;
import org.asup.il.data.QCompoundDataTerm;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.esql.QCursorTerm;
import org.asup.il.esql.QStatementTerm;
import org.asup.il.flow.QCallableUnit;
import org.asup.il.flow.QEntry;
import org.asup.il.flow.QEntryParameter;
import org.asup.il.flow.QModule;
import org.asup.il.flow.QProcedure;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QRoutine;
import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QDisplayTerm;
import org.asup.il.isam.QFileTerm;
import org.asup.il.isam.QKeyListTerm;
import org.asup.il.isam.QPrintTerm;
import org.asup.os.type.file.QExternalFile;
import org.eclipse.emf.ecore.EObject;

public class RPJCompilationUnitImpl extends CompilationUnitImpl {

	private QContext context;
	private QNamedNode root;

	private List<QCompilationUnit> compilationUnits;
	private CaseSensitiveType caseSensitive;

	private List<QDataSetTerm> dataSets;
	private List<QKeyListTerm> keyLists;
	private List<QCursorTerm> cursors;
	private List<QStatementTerm> statements;
	private List<QDisplayTerm> displays;
	private List<QPrintTerm> printers;
	private List<QRoutine> routines;
	private List<QProcedure> procedures;
	private List<QPrototype<?>> prototypes;

	private Map<String, QDataTerm<?>> cachedTerms = new HashMap<String, QDataTerm<?>>();
	private Map<String, QPrototype<?>> cachedPrototypes = new HashMap<String, QPrototype<?>>();

	public RPJCompilationUnitImpl(QContext context, QNamedNode root, List<QCompilationUnit> compilationUnits, CaseSensitiveType caseSensitive) {

		this.context = context;
		this.compilationUnits = compilationUnits;
		this.caseSensitive = caseSensitive;
		this.root = root;
		this.setTrashcan(QDevelopmentKitCompilerFactory.eINSTANCE.createCompilationTrashcan());

		if (root instanceof QCallableUnit) {
			QCallableUnit callableUnit = (QCallableUnit) root;

			if (callableUnit.getFileSection() != null) {
				dataSets = callableUnit.getFileSection().getDataSets();
				keyLists = callableUnit.getFileSection().getKeyLists();
				cursors = callableUnit.getFileSection().getCursors();
				statements = callableUnit.getFileSection().getStatements();
				displays = callableUnit.getFileSection().getDisplays();
				printers = callableUnit.getFileSection().getPrinters();
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
		if (cursors == null)
			cursors = new ArrayList<QCursorTerm>();
		if (statements == null)
			statements = new ArrayList<QStatementTerm>();
		if (displays == null)
			displays = new ArrayList<QDisplayTerm>();
		if (printers == null)
			printers = new ArrayList<QPrintTerm>();
		if (routines == null)
			routines = new ArrayList<QRoutine>();
		if (procedures == null)
			procedures = new ArrayList<QProcedure>();
		if (prototypes == null)
			prototypes = new ArrayList<QPrototype<?>>();

		refresh();
	}

	@Override
	public void refresh() {

		this.cachedTerms = new HashMap<String, QDataTerm<?>>();
		this.cachedPrototypes = new HashMap<String, QPrototype<?>>();

		for (QCompilationUnit compilationUnit : compilationUnits) {
			if (compilationUnit.getRoot() instanceof QCallableUnit) {
				QCallableUnit callableUnit = (QCallableUnit) compilationUnit.getRoot();
				if (callableUnit.getDataSection() == null)
					continue;

				for (QDataTerm<?> dataTerm : callableUnit.getDataSection().getDatas()) {
					if (!dataTerm.getName().startsWith(callableUnit.getName()))
						continue;

					cachedTerms.put(normalizeTermName(dataTerm.getName()), dataTerm);

					if (dataTerm instanceof QCompoundDataTerm<?>) {
						QCompoundDataTerm<?> compoundDataTerm = (QCompoundDataTerm<?>) dataTerm;

						if (compoundDataTerm.getDefinition().isQualified())
							continue;

						for (QDataTerm<?> element : compoundDataTerm.getDefinition().getElements())
							cachedTerms.put(normalizeTermName(element.getName()), element);
					}
				}
			}
		}

	}

	@Override
	public QDataSetTerm getDataSet(String name, boolean deep) {

		QDataSetTerm dataSetTerm = null;

		for (QDataSetTerm d : dataSets) {

			if (equalsTermName(d.getFormatName(), name) || equalsTermName(d.getFileName(), name)) {
				dataSetTerm = d;
				break;
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

		QDataTerm<?> dataTerm = cachedTerms.get(normalizeTermName(name));
		if (dataTerm != null)
			return dataTerm;

		
		// search on dataTermContainer
		if (dataTerm == null && ((QCallableUnit) getRoot()).getDataSection() != null)
			dataTerm = findData(((QCallableUnit) getRoot()).getDataSection().getDatas(), name, null, 0);

		// deep search on module
		if (dataTerm == null && deep) {

			for (QCompilationUnit compilationUnit : compilationUnits) {
				if (name.toUpperCase().startsWith(compilationUnit.getRoot().getName())) {
					dataTerm = compilationUnit.getDataTerm(name, true);

					if (dataTerm != null)
						break;
				}
			}

			if (dataTerm == null) {
				for (QCompilationUnit compilationUnit : compilationUnits) {
					if (name.toUpperCase().startsWith(compilationUnit.getRoot().getName()))
						continue;

					dataTerm = compilationUnit.getDataTerm(name, true);

					if (dataTerm != null)
						break;
				}
			}
		}

		// search on dataSet
		if (dataTerm == null) {

			List<QDataSetTerm> renamedFiles = new ArrayList<QDataSetTerm>();

			for (QDataSetTerm dataSetTerm : dataSets) {

				QExternalFile externalFile = dataSetTerm.getFacet(QExternalFile.class);

				if (externalFile == null && dataSetTerm.getFormatName() != null && !dataSetTerm.getFormatName().isEmpty()) {
					renamedFiles.add(dataSetTerm);
					continue;
				}

				if (externalFile != null && !externalFile.getFormat().equals(dataSetTerm.getFormatName())) {
					renamedFiles.add(dataSetTerm);
					continue;
				}

				// search on primary dataSet
				dataTerm = findDataTerm(dataSetTerm.getRecord(), name);

				if (dataTerm != null)
					break;
			}

			// search on renamed dataSet
			if (dataTerm == null) {
				for (QDataSetTerm dataSetTerm : renamedFiles) {

					dataTerm = findDataTerm(dataSetTerm.getRecord(), name);
					if (dataTerm != null)
						break;
				}
			}

		}

		// search on display
		if (dataTerm == null) {
			for (QDisplayTerm displayTerm : displays) {

				dataTerm = findDataTerm(displayTerm.getRecord(), name);
				if (dataTerm != null)
					break;
			}
		}

		// search on printers
		if (dataTerm == null) {
			for (QPrintTerm printTerm : printers) {

				dataTerm = findDataTerm(printTerm.getRecord(), name);
				if (dataTerm != null)
					break;
			}
		}

		if (dataTerm != null)
			cachedTerms.put(normalizeTermName(name), dataTerm);

		return dataTerm;
	}

	@Override
	public QDisplayTerm getDisplay(String name, boolean deep) {

		QDisplayTerm displayTerm = null;

		for (QDisplayTerm d : displays) {

			if (equalsTermName(d.getFileName(), name)) {
				displayTerm = d;
				break;
			}

		}

		// deep search
		if (displayTerm == null && deep) {
			for (QCompilationUnit compilationUnit : compilationUnits) {
				displayTerm = compilationUnit.getDisplay(name, true);

				if (displayTerm != null)
					break;
			}
		}

		return displayTerm;
	}

	@Override
	public QPrintTerm getPrinter(String name, boolean deep) {

		QPrintTerm printerTerm = null;

		for (QPrintTerm d : printers) {

			if (equalsTermName(d.getFileName(), name)) {
				printerTerm = d;
				break;
			}

		}

		// deep search
		if (printerTerm == null && deep) {
			for (QCompilationUnit compilationUnit : compilationUnits) {
				printerTerm = compilationUnit.getPrinter(name, true);

				if (printerTerm != null)
					break;
			}
		}

		return printerTerm;
	}

	private QDataTerm<?> findDataTerm(QCompoundDataDef<?> compoundDataDef, String name) {

		if (compoundDataDef == null)
			return null;

		QDataTerm<?> dataTerm = null;

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

		QPrototype<?> prototype = cachedPrototypes.get(name);
		if (prototype != null)
			return prototype;

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

		if (prototype != null)
			cachedPrototypes.put(name, prototype);

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
	public QCursorTerm getCursor(String name, boolean deep) {

		QCursorTerm cursorTerm = null;

		for (QCursorTerm c : cursors) {

			if (equalsTermName(c.getName(), name)) {
				cursorTerm = c;
				break;
			}

		}

		// deep search
		if (cursorTerm == null && deep) {
			for (QCompilationUnit compilationUnit : compilationUnits) {
				cursorTerm = compilationUnit.getCursor(name, true);

				if (cursorTerm != null)
					break;
			}
		}

		return cursorTerm;
	}

	@Override
	public QStatementTerm getStatement(String name, boolean deep) {

		QStatementTerm statementTerm = null;

		for (QStatementTerm s : statements) {

			if (equalsTermName(s.getName(), name)) {
				statementTerm = s;
				break;
			}

		}

		// deep search
		if (statementTerm == null && deep) {
			for (QCompilationUnit compilationUnit : compilationUnits) {
				statementTerm = compilationUnit.getStatement(name, true);

				if (statementTerm != null)
					break;
			}
		}

		return statementTerm;
	}

	@Override
	public QNamedNode getNamedNode(String name, boolean deep) {

		String order = null;

		// search optimization

		// data
		if (name.startsWith("*"))
			order = "EDPMCSFK";
		// prototype
		else if (name.startsWith("%"))
			order = "EPDMCSFK";
		// other
		else
			order = "EMCSFKPD";

		QNamedNode namedNode = getNamedNode(name, deep, order);

		return namedNode;
	}

	private QNamedNode getNamedNode(String name, boolean deep, String order) {

		QNamedNode namedNode = null;

		for (char c : order.toCharArray()) {

			switch (c) {

			// entry
			case 'E':
				if (getRoot() instanceof QProcedure) {
					QProcedure qProcedure = (QProcedure) getRoot();

					for (QEntryParameter<?> entryParameter : qProcedure.getEntry().getParameters()) {
						if (equalsTermName(entryParameter.getName(), name)) {
							namedNode = entryParameter;
							break;
						}
					}
				}

				break;
			// dataTerm
			case 'D':
				namedNode = getDataTerm(name, deep);
				break;
			// prototype
			case 'P':
				namedNode = getPrototype(name, deep);
				break;
			// module
			case 'M':
				namedNode = getModule(name, deep);
				break;
			// cursor
			case 'C':
				namedNode = getCursor(name, deep);
				break;
			// statement
			case 'S':
				namedNode = getStatement(name, deep);
				break;
			// file
			case 'F':
				namedNode = getDataSet(name, deep);
				if (namedNode == null)
					namedNode = getDisplay(name, deep);
				if (namedNode == null)
					namedNode = getPrinter(name, deep);
				break;
			// keyList
			case 'K':
				namedNode = getKeyList(name, deep);
				break;

			}

			if (namedNode != null)
				break;

		}

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
			} else if (node instanceof QFileTerm) {
				name = "get()." + name;
			} else if (node instanceof QEntry) {
				name = "qEN." + name;
			}

			if (node != getRoot()) {
				// no record name
				if (!(((EObject) node).eContainer() instanceof QDataSetTerm)) {
					QNamedNode namedChildNode = (QNamedNode) node;
					name = normalizeTermName(namedChildNode.getName()) + "." + name;
				}
			}
		}

		return name;
	}

	private QDataTerm<?> findData(List<QDataTerm<?>> dataTerms, String name, String prefix, int position) {

		QDataTerm<?> dataTerm = null;
		for (QDataTerm<?> child : dataTerms) {

			String childName = null;

			// remap
			QRemap remap = child.getFacet(QRemap.class);
			if (remap != null) {
				if (remap.getIndex() != null && !remap.getIndex().isEmpty())
					childName = remap.getName();
				else
					childName = remap.getName();
			} else
				childName = child.getName();

			// prefix
			if (prefix != null)
				childName = prefix + childName.substring(position);

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
					int pos = 0;
					if (tokens.length > 1)
						pos = Integer.parseInt(tokens[1]);
					else
						pos = 0;

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

		// reserved keywords
		if (name.equalsIgnoreCase("INT"))
			name = "_INT";

		StringBuffer nameBuffer = new StringBuffer();

		boolean firstToUpper = false;
		boolean allToUpper = false;

		for (char c : name.toCharArray()) {

			if (c == '§') {
				nameBuffer.append('ç');
			} else if (c == '&') {
				// nameBuffer.append('');
			} else if (c == '%') {
//				nameBuffer.append('q');
//				firstToUpper = true;
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
			if (ch == '§')
				s.append('ç');
			else if (it.getIndex() == 0) {
				s.append(String.valueOf(ch).toUpperCase());
			} else {
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

	@Override
	public void close() {
		getContext().close();
	}
}
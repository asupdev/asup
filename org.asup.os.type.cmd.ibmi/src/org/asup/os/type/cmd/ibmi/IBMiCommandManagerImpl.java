/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Dario Foresti - Initial API and implementation
 *   Mattia Rocchi - Implementation
 */
package org.asup.os.type.cmd.ibmi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.asup.dk.parser.ibmi.cl.ParserFactory;
import org.asup.dk.parser.ibmi.cl.ParserInterface;
import org.asup.dk.parser.ibmi.cl.model.parm.CLParmAbstractComponent;
import org.asup.dk.parser.ibmi.cl.model.parm.CLParmComponentType;
import org.asup.dk.parser.ibmi.cl.model.parm.CLParmFunction;
import org.asup.dk.parser.ibmi.cl.model.parm.CLParmList;
import org.asup.dk.parser.ibmi.cl.model.pgm.CLCommand;
import org.asup.dk.parser.ibmi.cl.model.pgm.CLObject;
import org.asup.dk.parser.ibmi.cl.model.pgm.CLParameter;
import org.asup.dk.parser.ibmi.cl.model.pgm.CLPositionalParameter;
import org.asup.dk.parser.ibmi.cl.model.pgm.CLRow;
import org.asup.fw.core.QContextID;
import org.asup.il.core.FormatType;
import org.asup.il.core.QFormat;
import org.asup.il.core.QSpecial;
import org.asup.il.core.QSpecialElement;
import org.asup.il.core.util.FormatHelper;
import org.asup.il.data.QAdapter;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QCompoundDataDef;
import org.asup.il.data.QData;
import org.asup.il.data.QDataContainer;
import org.asup.il.data.QDataWriter;
import org.asup.il.data.QDataManager;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QEnum;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.data.QList;
import org.asup.il.data.QMultipleAtomicDataDef;
import org.asup.il.data.QMultipleAtomicDataTerm;
import org.asup.il.data.QMultipleCompoundDataDef;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QMultipleDataTerm;
import org.asup.il.data.QScroller;
import org.asup.il.data.QString;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataDef;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.asup.il.data.QUnaryDataTerm;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLogManager;
import org.asup.os.core.jobs.QJobManager;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceSetReader;
import org.asup.os.type.cmd.CommandParameterOrder;
import org.asup.os.type.cmd.QCallableCommand;
import org.asup.os.type.cmd.QCommand;
import org.asup.os.type.cmd.QCommandParameter;
import org.asup.os.type.cmd.QOperatingSystemCommandFactory;
import org.asup.os.type.cmd.base.BaseCommandManagerImpl;
import org.asup.os.type.pgm.QProgramManager;

public class IBMiCommandManagerImpl extends BaseCommandManagerImpl {

	protected QJobManager jobManager;
	protected QDataManager dataManager;
	protected ParserInterface<?> clParameterParser;
	protected ParserInterface<?> clParser;

	@Inject
	public IBMiCommandManagerImpl(QResourceFactory resourceFactory, QJobManager jobManager, QJobLogManager jobLogManager, QDataManager dataManager, QProgramManager programManager) {
		super(resourceFactory, jobManager, jobLogManager, programManager);
		this.jobManager = jobManager;
		this.dataManager = dataManager;
		this.clParameterParser = ParserFactory.getInstance().getParser(ParserFactory.ScriptType.CL_PARAMETER);
		this.clParser = ParserFactory.getInstance().getParser(ParserFactory.ScriptType.CL);
	}

	@Override
	public String decodeCommand(QContextID contextID, QCallableCommand callableCommand, boolean defaults) throws OperatingSystemException {

		return IBMiCommandDecoder.decodeCommand(contextID, callableCommand, defaults);

	}

	@Override
	public QCallableCommand prepareCommand(QContextID contextID, String command, Map<String, Object> variables, boolean defaults) throws OperatingSystemException {

		// retrieve job
		QJob job = jobManager.lookup(contextID);
		if (job == null)
			throw new OperatingSystemException("Invalid contextID");

		CLObject result = null;
		try {
			result = (CLObject) clParser.parse(command + "\n");
		} catch (Exception exc) {
			throw new OperatingSystemException(exc);
		}

		CLRow clRow = result.getRows().iterator().next();
		CLCommand clCommand = clRow.getCommand();

		// lookup command
		QResourceSetReader<QCommand> commandResource = resourceFactory.getResourceReader(job, QCommand.class, Scope.LIBRARY_LIST);
		QCommand qCommand = commandResource.lookup(clCommand.getName());

		// unknown command
		if (qCommand == null)
			throw new OperatingSystemException("Unknown command: " + clCommand.getName(), null);

		// build callable command
		QCallableCommand callableCommand = QOperatingSystemCommandFactory.eINSTANCE.createCallableCommand();
		callableCommand.setCommand(qCommand);
		callableCommand.setCommandString(command);
		callableCommand.setVariables(variables);

		// prepare data terms
		Map<String, QDataTerm<?>> dataTerms = new HashMap<String, QDataTerm<?>>();
		List<QDataTerm<?>> arrayTerms = new ArrayList<>();
		for (QCommandParameter commandParameter : qCommand.getParameters(CommandParameterOrder.POSITION)) {

			// data term
			QDataTerm<?> dataTerm = commandParameter.getDataTerm();
			dataTerms.put(commandParameter.getName(), dataTerm);
			arrayTerms.add(dataTerm);
		}

		// data container
		QDataContainer dataContainer = dataManager.createDataContainer(job, arrayTerms);
		callableCommand.setDataContainer(dataContainer);

		QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();

		// assign values
		for (QCommandParameter commandParameter : qCommand.getParameters(CommandParameterOrder.POSITION)) {

			CLParameter clParameter = clCommand.getParm(commandParameter.getName());

			// positional parameters
			if (commandParameter.getPosition() <= clCommand.getPositionalParms().size()) {
				if (clParameter == null) {
					clParameter = new CLParameter();
					clParameter.setName(commandParameter.getName());

				}

				CLPositionalParameter positionalParm = clCommand.getPositionalParm(commandParameter.getPosition() - 1);
				clParameter.setText(positionalParm.getText());
				clParameter.setValue(positionalParm.getValue());
			}

			// Manage value
			String value = null;
			if (clParameter != null) {
				value = clParameter.getValue().getText();
			} else {

				value = "";
			}

			// replace variable with prefix '&'
			// value = replaceVariable(value, variables);

			// Assign value
			QDataTerm<?> dataTerm = dataTerms.get(commandParameter.getName());

			// reset default
			// dataContext.resetData(dataTerm);
			
			QData data = null;
			if (value.isEmpty() == false || value.startsWith("&") || defaults) {
				data = assignValue(dataTerm, dataContainer, dataWriter, value, variables, defaults);
			}

			// required
			if (data != null && data.isEmpty() && commandParameter.isRequired())
				throw new OperatingSystemException("Required parameter: " + commandParameter.getName());
		}
		return callableCommand;
	}

	private QData assignValue(QDataTerm<?> dataTerm, QDataContainer dataContainer, QDataWriter writer, String value, Map<String, Object> variables, boolean defaults)
			throws OperatingSystemException {

		String tokValue = null;

		QData data = dataContainer.getData(dataTerm);

		if(value.startsWith("&")) {
			Object variable = variables.get(value.substring(1).toLowerCase());
			
			if(variable == null)
				return data;
			
			if(!(variable instanceof QBufferedData))
				return data;
						
			if(!(data instanceof QBufferedData))
				return data;
			
			((QBufferedData)variable).assign((QBufferedData)data);
			
			return data;
		}
			
		
		/*
		 * if (value.startsWith("(") && value.endsWith(")")) { value =
		 * value.substring(1, value.length() - 1); }
		 */

		@SuppressWarnings("unused")
		String dbgString = null;
		CLParmAbstractComponent paramComp;

		// Manage default value

		switch (dataTerm.getDataTermType()) {

		case MULTIPLE_ATOMIC:

			if (defaults && useDefault(dataTerm, value)) {
				value = buildDefault(dataTerm);
				defaults = false;
			}

			QMultipleAtomicDataTerm<?> multipleAtomicDataTerm = (QMultipleAtomicDataTerm<?>) dataTerm;

			@SuppressWarnings("unused")
			QMultipleAtomicDataDef<?> mulitpleAtomicDataDef = multipleAtomicDataTerm.getDefinition();
			QList<?> listAtomic = (QList<?>) data;

			if (value.isEmpty() == false) {

				// Expected parms as list
				try {
					paramComp = (CLParmAbstractComponent) clParameterParser.parse(value);
				} catch (Exception exc) {
					throw new OperatingSystemException(exc);
				}

				if (paramComp.getComponentType() == CLParmComponentType.LIST) {

					// Expected parm format as list

					LinkedList<CLParmAbstractComponent> listElements = paramComp.getChilds();

					int counter = 1;
					Iterator<CLParmAbstractComponent> iterator = listElements.iterator();
					while (iterator.hasNext()) {
						// if(listAtomic instanceof QScroller<?>)
						// ((QScroller<?>)listAtomic).absolute(counter);

						tokValue = buildParameterValue(multipleAtomicDataTerm, iterator.next());

						QData listItem = listAtomic.get(counter);

						// tokValue = replaceVariable(tokValue, variables);
						// tokValue =
						// resolveSpecialValue(multipleAtomicDataTerm,
						// tokValue);

						assignValue(writer, listItem, tokValue);

						counter++;
					}
				}
			} else {

				int capacity = listAtomic.capacity();

				for (int i = 1; i < capacity; i++) {
					QData listItem = listAtomic.get(i);
					assignValue(writer, listItem, "");
				}

			}

			dbgString = multipleAtomicDataTerm.toString();

			break;

		case MULTIPLE_COMPOUND:

			if (defaults && useDefault(dataTerm, value)) {
				value = buildDefault(dataTerm);
				defaults = false;
			}

			QMultipleCompoundDataTerm<?> multipleCompoundDataTerm = (QMultipleCompoundDataTerm<?>) dataTerm;
			QMultipleCompoundDataDef<?> multipleCompoundDataDef = multipleCompoundDataTerm.getDefinition();

			// Manage Struct specials
			value = resolveSpecialValue(multipleCompoundDataTerm, value);

			// Parse the compound value ((A B C) (D E F)) --> return (A B C) and
			// (D E F)
			CLParmAbstractComponent multipleParamComp = null;
			try {
				multipleParamComp = (CLParmAbstractComponent) clParameterParser.parse(value);
			} catch (Exception exc) {
				throw new OperatingSystemException(exc);
			}

			Iterator<CLParmAbstractComponent> multipleParmIterator = multipleParamComp.getChilds().iterator();
			// List<QDataTerm<?>> dataTermList =
			// multipleCompoundDataDef.getElements();

			int i = 1;
			while (multipleParmIterator.hasNext()) {
				String tmpValue = multipleParmIterator.next().toString();

				if (data instanceof QScroller<?>)
					((QScroller<?>) data).absolute(i);

				if (isSpecialValue(dataTerm, tmpValue)) {
					assignValue(writer, data, resolveSpecialValue(dataTerm, tmpValue));
				} else
					buildStructValue(multipleCompoundDataDef, dataContainer, writer, tmpValue, variables, defaults);

				i++;
			}

			dbgString = multipleCompoundDataTerm.toString();
			break;

		case UNARY_ATOMIC:

			if (defaults && useDefault(dataTerm, value)) {
				value = buildDefault(dataTerm);
			}

			QUnaryAtomicDataTerm<?> unaryAtomicDataTerm = (QUnaryAtomicDataTerm<?>) dataTerm;

			if (value.isEmpty() == false) {

				if (value.startsWith("(") && value.endsWith(")")) {
					value = value.substring(1, value.length() - 1);
				}
				
				//TODO: uncomment next (or not)?
				/*
				Class<?> javaClass = unaryAtomicDataTerm.getDefinition().getJavaClass();
				
				if (javaClass.isAssignableFrom(String.class)) {
					if (!value.startsWith("'") || ! value.endsWith("'")) {
						value = "'" + value + "'";
					}			
				}
				*/

				try {

					/*
					 * Parser response structure:
					 * 
					 * CLParamList | CLParamValue | (CLParmToken OR
					 * CLPArmVariable OR CLParmSpecial OR CLParmString OR
					 * CLParmFunction)
					 */

					paramComp = (CLParmAbstractComponent) clParameterParser.parse(value);
				} catch (Exception exc) {
					throw new OperatingSystemException(exc);
				}

				Class<?> javaClass = dataTerm.getDefinition().getJavaClass();					
				
				if (javaClass.isAssignableFrom(String.class)) {
					
				}
								
				QFormat format = dataTerm.getFacet(QFormat.class);
				if (format != null && format.getType() == FormatType.COMMAND_STRING) {
					// Manage value without ' delimiters in parameters with COMMAND format (not detected by AntLR parser)
					tokValue = paramComp.getText();					
				} else { 											
					if (paramComp.getChilds().size() == 1 ) {
						tokValue = buildParameterValue(unaryAtomicDataTerm, paramComp.getChilds().getFirst().getChilds().getFirst());
					} else {
						// Error: received a list of values in an unary parameter
						throw new OperatingSystemException("Invalid value for parameter " + unaryAtomicDataTerm.getName().toUpperCase());
					}
				}	
				
			} else {
				tokValue = value;
			}

			assignValue(writer, data, tokValue);

			dbgString = unaryAtomicDataTerm.toString();

			break;
		case UNARY_COMPOUND:

			if (defaults && useDefault(dataTerm, value)) {
				value = buildDefault(dataTerm);
				defaults = false;
			}

			QUnaryCompoundDataTerm<?> unaryCompoundDataTerm = (QUnaryCompoundDataTerm<?>) dataTerm;

			// Manage Struct specials
			value = resolveSpecialValue(unaryCompoundDataTerm, value);

			QUnaryCompoundDataDef<?> unaryCompoundDataDef = unaryCompoundDataTerm.getDefinition();
			// QStruct struct = (QStruct) data;

			// String structValue = buildStructValue(unaryCompoundDataDef,
			// dataContext, value, variables, defaults);
			// assignValue(struct, structValue);

			if (isSpecialValue(dataTerm, value)) {
				assignValue(writer, data, resolveSpecialValue(dataTerm, value));
			} else
				buildStructValue(unaryCompoundDataDef, dataContainer, writer, value, variables, defaults);

			dbgString = unaryCompoundDataTerm.toString();

			break;
		}

		return data;
	}

	private boolean useDefault(QDataTerm<?> dataTerm, String value) {

		boolean useDefault = false;

		if (value == null || value.isEmpty()) {

			String defValue = "";
			if (dataTerm.getDataTermType().isUnary()) {
				defValue = ((QUnaryDataTerm<?>) dataTerm).getDefault();
			} else {
				if (((QMultipleDataTerm<?>) dataTerm).getDefault().size() > 0) {
					defValue = (String) ((QMultipleDataTerm<?>) dataTerm).getDefault().get(0);
				}
			}

			if (defValue != null && defValue.isEmpty() == false) {
				useDefault = true;
			}
		}

		return useDefault;

	}

	private String buildDefault(QDataTerm<?> dataTerm) {

		String defValue = null;

		if (dataTerm.getDataTermType().isUnary()) {
			defValue = ((QUnaryDataTerm<?>) dataTerm).getDefault();

		} else {

			if (((QMultipleDataTerm<?>) dataTerm).getDefault().size() > 0) {
				defValue = (String) ((QMultipleDataTerm<?>) dataTerm).getDefault().get(0);

			}
		}

		return defValue;
	}

	private String buildStructValue(QCompoundDataDef<?> compoundDataDef, QDataContainer dataContext, QDataWriter writer, String parmValue, Map<String, Object> variables, boolean defaults)
			throws OperatingSystemException {

		String structValue = "";
		CLParmAbstractComponent paramComp;

		if (parmValue.startsWith("(") && parmValue.endsWith(")")) {
			parmValue = parmValue.substring(1, parmValue.length() - 1);
		}

		if (compoundDataDef.isQualified()) {

			String[] values = parmValue.split("/");
			for (int j = values.length; j > 0; j--) {

				// Recursive Call
				QData assignValue = assignValue(compoundDataDef.getElements().get(j - 1), dataContext, writer, values[values.length - j], variables, defaults);

				// assignValue(struct.getElement(j), assignValue.toString());
				if (assignValue instanceof QString)
					structValue = ((QString) assignValue).toString() + structValue;
				else
					structValue = assignValue.toString() + structValue;
			}
		} else {

			// Parse the compound value
			try {
				paramComp = (CLParmAbstractComponent) clParameterParser.parse(parmValue);
			} catch (Exception exc) {
				throw new OperatingSystemException(exc);
			}

			Iterator<QDataTerm<?>> elementIterator = compoundDataDef.getElements().iterator();
			Iterator<CLParmAbstractComponent> parmIterator = paramComp.getChilds().iterator();

			while (elementIterator.hasNext()) {

				String tmpValue;
				if (parmIterator.hasNext()) {
					tmpValue = parmIterator.next().toString();
				} else {

					tmpValue = "";
				}

				// Recursive Call
				QData assignValue = assignValue(elementIterator.next(), dataContext, writer, tmpValue, variables, defaults);
				if (assignValue instanceof QString)
					structValue += ((QString) assignValue).toString();
				else
					structValue += assignValue.toString();
			}
		}
		return structValue;
	}

	private String buildParameterValue(QDataTerm<?> dataTerm, CLParmAbstractComponent parmValue) throws OperatingSystemException {

		String value = null;

		switch (parmValue.getComponentType()) {

		case LIST:

			LinkedList<CLParmAbstractComponent> listChilds = parmValue.getChilds();
			Iterator<CLParmAbstractComponent> listIterator = listChilds.iterator();

			while (listIterator.hasNext()) {

				String tmp = buildParameterValue(dataTerm, listIterator.next());

				// All list elements have to match the DataTerm format
				if (matchFormat(dataTerm, tmp)) {
					value += tmp + " ";

				} else {
					throw new OperatingSystemException("Invalid format for parm value: " + value);
				}

				value += tmp + " ";
			}

			if (value.endsWith(" ")) {
				value = value.substring(0, value.length() - 2);
			}

			break;

		case VALUE:

			value = "";

			LinkedList<CLParmAbstractComponent> childs = parmValue.getChilds();
			Iterator<CLParmAbstractComponent> iterator = childs.iterator();

			while (iterator.hasNext()) {
				value = buildParameterValue(dataTerm, iterator.next()) + " ";
			}

			if (value.endsWith(" ")) {
				value = value.substring(0, value.length() - 1);
			}

			// The result value have to match the dataTerm format
			if (!isSpecialValue(dataTerm, value)) {
				if (matchFormat(dataTerm, value) == false) {
					throw new OperatingSystemException("Invalid format for parm value: " + value);
				}
			}

			break;

		case FUNCTION:

			value = "%" + parmValue.getText() + "(";

			CLParmList functionParms = ((CLParmFunction) parmValue).getParms();

			Iterator<CLParmAbstractComponent> funParmIterator = functionParms.getChilds().iterator();

			while (funParmIterator.hasNext()) {
				value += buildParameterValue(dataTerm, funParmIterator.next()) + "";
			}

			if (value.endsWith(" ")) {
				value = value.substring(0, value.length() - 2);
				value += ")";
			}

			break;

		case SPECIAL:

			if (isSpecialValue(dataTerm, parmValue.toString()))
				value = resolveSpecialValue(dataTerm, parmValue.toString());
			else {
				value = parmValue.toString();
				if (matchFormat(dataTerm, value) == false) {
					throw new OperatingSystemException("Invalid format for parm value: " + value);
				}
			}

			break;

		case FILTER:
		case STR_OPERATOR:
		case HEX:

			value = parmValue.toString();

			break;

		case STRING:

			value = parmValue.toString();
			if (matchFormat(dataTerm, value) == false) {
				throw new OperatingSystemException("Invalid format for parm value: " + value);
			}

			break;

		case TOKEN:

			if (isSpecialValue(dataTerm, parmValue.toString()))
				value = resolveSpecialValue(dataTerm, parmValue.toString());
			else {
				value = parmValue.toString();
				if (matchFormat(dataTerm, value) == false) {
					throw new OperatingSystemException("Invalid format for parm value: " + value);
				}
			}
			break;

		case VARIABLE:
			value = parmValue.toString();
			break;

		default:
			value = null;
			break;
		}

		// Manage HEX default values
		if (value != null && value.startsWith("X'") && value.endsWith("'")) {
			value = value.substring(2, value.length() - 1);
			System.out.println("Hexadecimal founded: " + value + " " + dataTerm.getName());
		}

		return value;

	}

	/**
	 * Return true if value is a special value defined in dataTerm
	 * 
	 * @param dataTerm
	 * @param value
	 * @return
	 */
	private boolean isSpecialValue(QDataTerm<?> dataTerm, String value) {

		QSpecial special = dataTerm.getFacet(QSpecial.class);

		if (special != null) {

			for (QSpecialElement specialElem : special.getElements()) {
				if (specialElem.getName().equals(value))
					return true;
			}
		}

		return false;
	}

	/*
	 * Special to value
	 */
	private String resolveSpecialValue(QDataTerm<?> dataTerm, String value) {

		String result = value;

		QSpecial special = dataTerm.getFacet(QSpecial.class);

		if (special != null) {

			for (QSpecialElement specialElem : special.getElements()) {
				if (specialElem.getName().equals(value)) {
					result = specialElem.getValue();
					//TODO: what is the correct assign if special has null value? 
					if (result == null) {
						result = value;
					}
					break;
				}
			}
		}

		return result;
	}

	private boolean matchFormat(QDataTerm<?> dataTerm, Object value) {

		boolean match = false;

		QFormat format = dataTerm.getFacet(QFormat.class);

		if (format != null && value.toString().length() > 0) {

			match = FormatHelper.match(value.toString(), format);
		} else {
			match = true;
		}

		return match;

	}

	private void assignValue(QDataWriter writer, QData data, Object value) {

		if (data instanceof QEnum) {
			QEnum<?, ?> enumerator = (QEnum<?, ?>) data;

			/*
			 * for(QEnumElemDef enumElement: enumerator.getElements()) {
			 * if(enumElement.getName().equals(value)) { value =
			 * enumElement.getValue(); break; } }
			 */
			enumerator.eval(value.toString());
		} else if (data instanceof QAdapter) {
			QAdapter adapter = (QAdapter) data;
			adapter.eval(value);
		} else {
			data.accept(writer.set(value.toString()));
		}
	}

}

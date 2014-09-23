/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation
 */
package org.asup.os.type.cmd.ibmi;

import java.util.ArrayList;
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
import org.asup.il.core.QFormat;
import org.asup.il.core.QSpecial;
import org.asup.il.core.QSpecialElement;
import org.asup.il.core.util.FormatHelper;
import org.asup.il.data.QData;
import org.asup.il.data.QDataContext;
import org.asup.il.data.QDataManager;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QEnum;
import org.asup.il.data.QList;
import org.asup.il.data.QMultipleAtomicDataDef;
import org.asup.il.data.QMultipleAtomicDataTerm;
import org.asup.il.data.QMultipleCompoundDataDef;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QStruct;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataDef;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.OperatingSystemRuntimeException;
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

	@Inject
	public IBMiCommandManagerImpl(QResourceFactory resourceFactory, QJobManager jobManager,
			QJobLogManager jobLogManager, QDataManager dataManager, QProgramManager programManager) {
		super(resourceFactory, jobManager, jobLogManager, programManager);
		this.jobManager = jobManager;
		this.dataManager = dataManager;

	}

	@Override
	public QCallableCommand prepareCommand(QContextID contextID, String command, Map<String, Object> variables)
			throws OperatingSystemException {

		QJob job = jobManager.lookup(contextID);
		if (job == null)
			throw new OperatingSystemException("Invalid contextID");

		@SuppressWarnings("unchecked")
		ParserInterface<CLObject> clParser = ParserFactory.getInstance().getParser(ParserFactory.ScriptType.CL);

		CLObject result = null;
		try {
			result = clParser.parse(" " + command + "\n");
		} catch (Exception exc) {
			throw new OperatingSystemException(exc);
		}

		CLRow clRow = result.getRows().iterator().next();
		CLCommand clCommand = clRow.getCommand();

		// lookup command
		QResourceSetReader<QCommand> commandResource = resourceFactory.getResourceReader(job, QCommand.class,
				Scope.LIBRARY_LIST);
		QCommand qCommand = commandResource.lookup(clCommand.getName());

		// unknown command
		if (qCommand == null)
			throw new OperatingSystemException("Unknown command: " + clCommand.getName(), null);

		// build callable command
		QCallableCommand callableCommand = QOperatingSystemCommandFactory.eINSTANCE.createCallableCommand();
		callableCommand.setCommand(qCommand);
		callableCommand.setCommandString(command);
		callableCommand.setVariables(variables);

		// data context
		List<QDataTerm<?>> dataTerms = new ArrayList<>();
		QDataContext dataContext = dataManager.createContext(contextID, dataTerms);
		callableCommand.setDataContext(dataContext);

		// initialize parameters
		for (QCommandParameter commandParameter : qCommand.getParameters()) {

			// TODO: managestatus?
			switch (commandParameter.getStatus()) {
			default:
				break;
			}

			// TDOD: manage Hidden?

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
				// TODO: manage default value
				value = "";
			}
			
			// data term
			QDataTerm<?> dataTerm = commandParameter.getDataTerm();
			dataTerms.add(dataTerm);

			// replace variable with prefix '&'
			// value = replaceVariable(value, variables);

			// assignment
			QData data = null;
			if (value.isEmpty() == false) {
				data = assignValue(dataTerm, dataContext, value, variables);
			}

			// required
			if (data != null && data.isEmpty() && commandParameter.isRequired())
				throw new OperatingSystemException("Required parameter: " + commandParameter.getName());			
		}

		return callableCommand;
	}

	private String replaceVariable(String value, Map<String, Object> variables) {

		if (value == null)
			value = "";

		// search pointer to caller variable
		if (value.startsWith("&")) {

			// pointer not found
			if (variables == null)
				throw new OperatingSystemRuntimeException("Caller not found for pointer " + value);

			// assign variable store
			Object variable = variables.get(value.substring(1).toLowerCase());
			value = variable.toString();
		}

		return value;
	}

	private QData assignValue(QDataTerm<?> dataTerm, QDataContext dataContext, String value,
			Map<String, Object> variables) throws OperatingSystemException {

		ParserInterface<CLParmAbstractComponent> clParameterParser = ParserFactory.getInstance().getParser(ParserFactory.ScriptType.CL_PARAMETER);
		CLParmAbstractComponent paramComp = null;
		String tokValue = null;

		QData data = dataContext.getData(dataTerm);

		if (value.startsWith("(") && value.endsWith(")")) {
			value = value.substring(1, value.length() - 1);
		}

		@SuppressWarnings("unused")
		String dbgString = null;

		switch (dataTerm.getDataType()) {

		case MULTIPLE_ATOMIC:

			QMultipleAtomicDataTerm<?> multipleAtomicDataTerm = (QMultipleAtomicDataTerm<?>) dataTerm;
			multipleAtomicDataTerm.toString();

			@SuppressWarnings("unused")
			QMultipleAtomicDataDef<?> mulitpleAtomicDataDef = multipleAtomicDataTerm.getDefinition();
			QList<?> listAtomic = (QList<?>) data;
			
			if (value.isEmpty() == false) {

				// Expected parms as list
				try {
					paramComp = clParameterParser.parse(value);
				} catch (Exception exc) {
					throw new OperatingSystemException(exc);
				}
	
				if (paramComp.getComponentType() == CLParmComponentType.LIST) {
	
					// Expected parm format as list
	
					LinkedList<CLParmAbstractComponent> listElements = paramComp.getChilds();
	
					int counter = 1;
					Iterator<CLParmAbstractComponent> iterator = listElements.iterator();
					while (iterator.hasNext()) {
	
						tokValue = buildParameterValue(multipleAtomicDataTerm, iterator.next());
	
						QData listItem = listAtomic.get(counter);
	
						// tokValue = replaceVariable(tokValue, variables);
						// tokValue = resolveSpecialValue(multipleAtomicDataTerm,
						// tokValue);
	
						assignValue(listItem, tokValue);
	
						counter++;
					}
				}
			} else {

				Iterator<?> iterator = listAtomic.iterator();
				
				int counter = 1;
				while(iterator.hasNext()){
					QData listItem = listAtomic.get(counter);
					assignValue(listItem, tokValue);
					counter++;
				}
				
			}
			
			dbgString = multipleAtomicDataTerm.toString();

			break;

		case MULTIPLE_COMPOUND:
			QMultipleCompoundDataTerm<?> multipleCompoundDataTerm = (QMultipleCompoundDataTerm<?>) dataTerm;

			QMultipleCompoundDataDef<?> multipleCompoundDataDef = multipleCompoundDataTerm.getDefinition();
			QList<?> listCompound = (QList<?>) data;
			
			// Parse the compound value
			try {
				paramComp = clParameterParser.parse(value);
			} catch (Exception exc) {
				throw new OperatingSystemException(exc);
			}
			
			Iterator<QDataTerm<?>> listIterator = multipleCompoundDataDef.getElements().iterator();
			
			int i = 0;
			while (listIterator.hasNext()){	
					// Recursive Call
					QData assignValue = assignValue(listIterator.next(), dataContext, paramComp.getChilds().get(i).toString(), variables);
					assignValue(listCompound.get(i), assignValue.toString());
			}

			dbgString = multipleCompoundDataTerm.toString();
			break;

		case UNARY_ATOMIC:
			QUnaryAtomicDataTerm<?> unaryAtomicDataTerm = (QUnaryAtomicDataTerm<?>) dataTerm;
			
			if (value.isEmpty() == false) {

				try {
					
					/*
					 * Parser response structure:
					 * 
					 *   							CLParamList
					 *       							|
					 *   							CLParamValue
					 *     								|
					 *   (CLParmToken OR CLPArmVariable OR CLParmSpecial OR CLParmString OR CLParmFunction)        
					 * 
					 */
					
					paramComp = clParameterParser.parse(value);
				} catch (Exception exc) {
					throw new OperatingSystemException(exc);
				}
	
				tokValue = buildParameterValue(unaryAtomicDataTerm, paramComp.getChilds().getFirst().getChilds().getFirst());
			} else {
				tokValue = value;
			}

			assignValue(data, tokValue);

			dbgString = unaryAtomicDataTerm.toString();

			break;
		case UNARY_COMPOUND:
			
			QUnaryCompoundDataTerm<?> unaryCompoundDataTerm = (QUnaryCompoundDataTerm<?>) dataTerm;

			QUnaryCompoundDataDef<?> unaryCompoundDataDef = unaryCompoundDataTerm.getDefinition();
			QStruct struct = (QStruct) data;

			QData assignValue = null;
			
			if (unaryCompoundDataDef.isQualified()) {
				
				String[] values = value.split("/");
				for (int j = values.length; j > 0; j--) {
					
					// Recursive Call
					assignValue = assignValue(unaryCompoundDataDef.getElements().get(j-1), dataContext, values[values.length - j], variables);
					
					assignValue(struct.getElement(j), assignValue.toString());
				}
			} else {
				
				// Parse the compound value
				try {
					paramComp = clParameterParser.parse(value);
				} catch (Exception exc) {
					throw new OperatingSystemException(exc);
				}	
				
				Iterator<QDataTerm<?>> elementIterator = unaryCompoundDataDef.getElements().iterator();
				
				int k = 0;
				while (elementIterator.hasNext()){	
						// Recursive Call
						assignValue = assignValue(elementIterator.next(), dataContext, paramComp.getChilds().get(k).toString(), variables);
						assignValue(struct.getElement(k+1), assignValue.toString());
						k++;
				}
			}

			dbgString = unaryCompoundDataTerm.toString();

			break;
		}

		return data;
	}

	private String buildDefaultValue(QMultipleAtomicDataTerm<?> multipleAtomicDataTerm) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private String buildParameterValue(QDataTerm<?> dataTerm, CLParmAbstractComponent parmValue)
			throws OperatingSystemException {

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
				value = value.substring(0, value.length()-2);
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
				value = value.substring(0, value.length()-1);
			}
			
			// The result value have to match the dataTerm format
			if (value.startsWith("*") == false) {
				if (matchFormat(dataTerm, value) == false) {
			
					throw new OperatingSystemException("Invalid format for parm value: " + value);
				}
			}
			

			
			break;	
			
		case FUNCTION:
			
			value = "%" + parmValue.getText() + "("; 
			
			CLParmList functionParms = ((CLParmFunction)parmValue).getParms(); 
			
			Iterator<CLParmAbstractComponent> funParmIterator = functionParms.getChilds().iterator();
			
			while(funParmIterator.hasNext()) {
				value += buildParameterValue(dataTerm, funParmIterator.next()) + "";				
			}
			
			if (value.endsWith(" ")) {
				value = value.substring(0, value.length()-2);
				value += ")";
			}

			break;

		case SPECIAL:

			value = resolveSpecialValue(dataTerm, parmValue.toString());
			if (value.startsWith("*") == false) {
				if (matchFormat(dataTerm, value) == false) {
					throw new OperatingSystemException("Invalid format for parm value: " + value);
				}
			}

			break;

		case STR_OPERATOR:

			value = parmValue.toString();

			break;

		case STRING:

			value = parmValue.toString();
			if (matchFormat(dataTerm, value) == false) {
				throw new OperatingSystemException("Invalid format for parm value: " + value);
			}

			break;

		case TOKEN:

			value = parmValue.toString();
			if (matchFormat(dataTerm, value) == false) {
				throw new OperatingSystemException("Invalid format for parm value: " + value);
			}

			break;

		case VARIABLE:
			value = parmValue.toString();
			break;

		default:
			value = null;
			break;
		}

		return value;

	}

	private String resolveSpecialValue(QDataTerm<?> dataTerm, String value) {

		String result = value;

		QSpecial special = dataTerm.getFacet(QSpecial.class);

		if (special != null) {

			for (QSpecialElement specialElem : special.getElements()) {
				if (specialElem.getName().equals(value)) {
					result = specialElem.getValue();
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

	private void assignValue(QData data, Object value) {

		if (data instanceof QEnum) {
			QEnum<?, ?> enumerator = (QEnum<?, ?>) data;

			/*
			 * for(QEnumElemDef enumElement: enumerator.getElements()) {
			 * if(enumElement.getName().equals(value)) { value =
			 * enumElement.getValue(); break; } }
			 */
			enumerator.eval(value);
		} else
			data.eval(value);
	}

}
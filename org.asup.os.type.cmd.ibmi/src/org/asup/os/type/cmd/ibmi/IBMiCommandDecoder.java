package org.asup.os.type.cmd.ibmi;

import java.util.List;
import java.util.ListIterator;

import org.asup.fw.core.QContextID;
import org.asup.il.core.QSpecial;
import org.asup.il.core.QSpecialElement;
import org.asup.il.data.QAtomicDataTerm;
import org.asup.il.data.QCompoundDataTerm;
import org.asup.il.data.QData;
import org.asup.il.data.QDataContainer;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QList;
import org.asup.il.data.QMultipleAtomicDataTerm;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QStroller;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.type.cmd.QCallableCommand;
import org.asup.os.type.cmd.QCommandParameter;

public class IBMiCommandDecoder {


	private static final String SPACE = " ";

	public static String decodeCommand(QContextID contextID, QCallableCommand callableCommand, boolean defaults) throws OperatingSystemException {
		
		String result = callableCommand.getCommand().getName() + SPACE;
		
		QDataContainer dataContainer = callableCommand.getDataContainer();
		
    	List<QCommandParameter> parameterList = callableCommand.getCommand().getParameters();
			
		for (QCommandParameter commandParameter : parameterList) {
			
			QDataTerm<?> dataTerm = commandParameter.getDataTerm();
			
			/*
			int position = commandParameter.getPosition() - 1;			
	
			QDataTerm<?> dataTerm = dataContext.getTerms().get(position);
			*/
			
			if (defaults || dataContainer.isSet(dataTerm)) {
	
				result += commandParameter.getName() + "(";
		
				result = writeDataTermString(result, dataTerm, dataContainer.getData(dataTerm));
				
				result += ")" + SPACE;
			}
		
        } 

		return result.trim();

	}

	private static String writeDataTermString(String result, QDataTerm<?> dataTerm, QData data) {
			
		switch (dataTerm.getDataTermType()) {
			case MULTIPLE_ATOMIC:
				QMultipleAtomicDataTerm<?> multipleAtomicDataTerm = (QMultipleAtomicDataTerm<?>) dataTerm;
				QList<?> list = (QList<?>)data;
				
				int c = 1;
				if (multipleAtomicDataTerm.getCardinality() != null) {
					c = multipleAtomicDataTerm.getCardinality().getMax();				
				}

				for (int i = 0; i < c; i++) {

					result = writeAtomicDataTermString(result, multipleAtomicDataTerm, list.get(i+1));
					
					if (i < c-1) {
						result += SPACE;
					}
				}
				
				result = result.trim();

				break;

			case MULTIPLE_COMPOUND:
				QMultipleCompoundDataTerm<?> multipleCompoundDataTerm = (QMultipleCompoundDataTerm<?>) dataTerm;
				QStroller<?> stroller = (QStroller<?>)data;
				
				c = 1;
				if (multipleCompoundDataTerm.getCardinality() != null) {
					c = multipleCompoundDataTerm.getCardinality().getMax();
				}

				for (int i = 0; i < c; i++) {

					result = writeCompoundDataTermString(result, multipleCompoundDataTerm, stroller.get(i+1), true);
					
					if (i < c-1) {
						result += SPACE;
					}
				}
				
				result = result.trim();
				
				break;

			case UNARY_ATOMIC:
				QAtomicDataTerm<?> unaryAtomicDataTerm = (QAtomicDataTerm<?>) dataTerm;
				
				result = writeAtomicDataTermString(result, unaryAtomicDataTerm, data);

				break;

			case UNARY_COMPOUND:
				QCompoundDataTerm<?> unaryCompoundDataTerm = (QCompoundDataTerm<?>) dataTerm;

				result = writeCompoundDataTermString(result, unaryCompoundDataTerm, data, false);

				break;
		}
		
		return result;
	}
		
	private static String writeCompoundDataTermString(String result, QCompoundDataTerm<?> compoundDataTerm, QData data, boolean parenthesis) {
		
		if (parenthesis) result += "(";
		
		List<QDataTerm<?>> elements = compoundDataTerm.getDefinition().getElements();
		
		int counter;
		ListIterator<QDataTerm<?>> listIterator = null;
		
		if (compoundDataTerm.getDefinition().isQualified()) {
			
			// If qualified, reverse fields
			
			counter = elements.size() -1;
			listIterator = elements.listIterator(elements.size());						 
			
			while(listIterator.hasPrevious()){
				
				QDataTerm<?> element = listIterator.previous();
				
				QData elementData = ((QDataStruct) data).getElement(element.getName());
				result = writeDataTermString(result, element, elementData);
				
				if (counter > 0) {
					result += "/";														
				}
				
				counter--;
			}
			
		} else {
			
			counter = 1;
			listIterator = elements.listIterator();
			
			while(listIterator.hasNext()) {
				
				QDataTerm<?> element = listIterator.next();

				QData elementData = ((QDataStruct) data).getElement(element.getName());
				
				result = writeDataTermString(result, element, elementData);
							
				if (counter != elements.size()) {													
					result += SPACE;					
				}
				
				counter++;
			}
		}
		
		result = result.trim();
		
		if (parenthesis) result += ")";
		
		return result;
	}

	private static String writeAtomicDataTermString(String result, QAtomicDataTerm<?> atomicDataTerm, QData data) {
				
		String value = data.toString().trim();
		
		if (hasSpecialValue(atomicDataTerm, value)) {
			value = encodeSpecialValue(atomicDataTerm, value);
		} else {
		
			// Manage String single values: enclosing string in ' chars and duplicate intermediate ' chars.
			Class<?> javaClass = atomicDataTerm.getDefinition().getJavaClass();					
			
			/*
			if (javaClass.isAssignableFrom(String.class)) {
				//TODO: gestione facets TYPE (vedi esempio DSPJOBLOG)
				
				String tmpValue = null;
				if (value.startsWith("'") && value.endsWith("'")){
					tmpValue = value.substring(1, value.length()-1);
				} else {
					tmpValue = value;
				}
				
				// Duplicate internal ' characters
				tmpValue = tmpValue.replaceAll("'", "''");			
				value = "'" + tmpValue + "'";			
			}
			*/
		}
		
		if (value != null && value.length()>0) {
			result += value.trim();
		}
		
		return result;
		
	}

	/**
	 * Return true if value is a potential special value in dataterm
	 * @param dataTerm
	 * @param value
	 * @return
	 */
	private static boolean hasSpecialValue(QDataTerm<?> dataTerm, String value) {

		QSpecial special = dataTerm.getFacet(QSpecial.class);

		if (special != null) {

			for (QSpecialElement specialElem : special.getElements()) {
				if (specialElem.getValue().equals(value)) 
					return true;
			}
		}

		return false;
	}
	
	/*
	 * value to Special
	 */
	private static String encodeSpecialValue(QDataTerm<?> dataTerm, String value) {

		String result = value;

		QSpecial special = dataTerm.getFacet(QSpecial.class);

		if (special != null) {
 
			for (QSpecialElement specialElem : special.getElements()) {
				if (specialElem.getValue().equals(value)) {
					result = specialElem.getName();
					break;
				}
			}
		}

		return result;
	}

}

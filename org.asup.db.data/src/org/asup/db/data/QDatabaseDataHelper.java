/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.db.data;

import org.asup.db.core.QColumn;
import org.asup.db.core.QTable;
import org.asup.il.data.DatetimeType;
import org.asup.il.data.QCharacterDef;
import org.asup.il.data.QCompoundDataTerm;
import org.asup.il.data.QDataStructDef;
import org.asup.il.data.QDatetimeDef;
import org.asup.il.data.QDecimalDef;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.data.QUnaryAtomicDataDef;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataDef;

public class QDatabaseDataHelper {

	@SuppressWarnings("unchecked")
	public static <DD extends QUnaryCompoundDataDef<?>> QCompoundDataTerm<DD> buildDataTerm(QTable table, String name) {
		
		QCompoundDataTerm<DD> tableDataTerm = QIntegratedLanguageDataFactory.eINSTANCE.createUnaryCompoundDataTerm();
		tableDataTerm.setName(name);
		
		QDataStructDef dataStructureDefinition = QIntegratedLanguageDataFactory.eINSTANCE.createDataStructDef();
		
		for(QColumn field: table.getColumns()) {
			
			QUnaryAtomicDataTerm<QUnaryAtomicDataDef<?>> element = QIntegratedLanguageDataFactory.eINSTANCE.createUnaryAtomicDataTerm();
			element.setName(field.getName());
			element.setDefinition(QDatabaseDataHelper.toBufferedDef(field));			
			// add field to data structure
			dataStructureDefinition.getElements().add(element);
		}

		
		tableDataTerm.setDefinition((DD) dataStructureDefinition);

		return tableDataTerm;
	}
	
	@SuppressWarnings("unchecked")
	public static <DD extends QUnaryAtomicDataDef<?>> DD toBufferedDef(QColumn field) {
		
		DD definition = null;
		QCharacterDef characterDefinition = null;
		QDatetimeDef	dateTimeDefinition = null;
		QDecimalDef decimalDefinition = null;
		
		switch (field.getDataType()) {
		
			case IDENTITY:
				decimalDefinition = QIntegratedLanguageDataFactory.eINSTANCE.createDecimalDef();
				decimalDefinition.setPrecision(9);
				definition = (DD) decimalDefinition;
				break;
			case BOOLEAN:
				characterDefinition = QIntegratedLanguageDataFactory.eINSTANCE.createCharacterDef();
				definition = (DD) characterDefinition;
				break;
			case CHARACTER:
				characterDefinition = QIntegratedLanguageDataFactory.eINSTANCE.createCharacterDef();
				characterDefinition.setLength(field.getPrecision());
				definition = (DD) characterDefinition;
				break;
			case VARCHAR:
				characterDefinition = QIntegratedLanguageDataFactory.eINSTANCE.createCharacterDef();
				characterDefinition.setVarying(true);				
				characterDefinition.setLength(field.getPrecision());
				definition = (DD) characterDefinition;
				break;				
			case DATE:
				dateTimeDefinition = QIntegratedLanguageDataFactory.eINSTANCE.createDatetimeDef();
				dateTimeDefinition.setType(DatetimeType.DATE);
				definition = (DD) dateTimeDefinition;
				break;
			case TIME:
				dateTimeDefinition = QIntegratedLanguageDataFactory.eINSTANCE.createDatetimeDef();
				dateTimeDefinition.setType(DatetimeType.TIME);
				definition = (DD) dateTimeDefinition;
				break;
			case TIME_STAMP:
				dateTimeDefinition = QIntegratedLanguageDataFactory.eINSTANCE.createDatetimeDef();
				dateTimeDefinition.setType(DatetimeType.TIME_STAMP);
				definition = (DD) dateTimeDefinition;
				break;
			case DECIMAL:
				decimalDefinition = QIntegratedLanguageDataFactory.eINSTANCE.createDecimalDef();
				decimalDefinition.setPrecision(field.getPrecision());
				decimalDefinition.setScale(field.getScale());
				definition = (DD) decimalDefinition;				
				break;
			default:
				throw new UnsupportedOperationException("Unsupported cast "+field.getDataType().getName());
		}
		
//		definition.setName(field.getName());
		
		return 	definition;
	}
}

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
package org.asup.os.data;

import java.util.ArrayList;
import java.util.List;

import org.asup.il.core.QCardinality;
import org.asup.il.core.QIntegratedLanguageCoreFactory;
import org.asup.il.core.QIntegratedLanguageCorePackage;
import org.asup.il.data.QAtomicDataDef;
import org.asup.il.data.QCharacterDef;
import org.asup.il.data.QCompoundDataDef;
import org.asup.il.data.QDataDef;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.il.data.QMultipleDataTerm;
import org.asup.il.data.QScrollerDef;
import org.asup.il.data.QStrollerDef;
import org.asup.il.data.QUnaryAtomicBufferedDataDef;
import org.asup.il.data.QUnaryDataTerm;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class QOperatingSystemDataHelper {
	
	@SuppressWarnings("unchecked")
	public static <DD extends QDataDef<?>> List<QDataTerm<?>> buildDataTerms(EClass eClass) {

		List<QDataTerm<?>> dataTerms = new ArrayList<>();
		
		for (EStructuralFeature feature : eClass.getEAllStructuralFeatures()) {

			if (feature.isTransient())
				continue;

			if (feature.isVolatile())
				continue;

			if (feature.isMany())
				continue;

			if (feature.getName().equals("content"))
				continue;

			if (feature.getName().equals("source"))
				continue;

			// dataDef
			DD dataDef = (DD) buildDataDef(feature);
			
			// cardinality
			QCardinality cardinality = null;

			if (feature.getLowerBound() != (int)QIntegratedLanguageCorePackage.eINSTANCE.getCardinality_Min().getDefaultValue() ||
				feature.getUpperBound() != (int)QIntegratedLanguageCorePackage.eINSTANCE.getCardinality_Max().getDefaultValue()) {
				
				cardinality = QIntegratedLanguageCoreFactory.eINSTANCE.createCardinality();
				cardinality.setMin(feature.getLowerBound());
				cardinality.setMax(feature.getUpperBound());
			}

			// dataTerm
			QDataTerm<DD> dataTerm = null;

			// multiple
			if (cardinality != null && cardinality.isMultiple()) {
				
				if(dataDef instanceof QUnaryAtomicBufferedDataDef) {
					QScrollerDef<?> scrollerDef = QIntegratedLanguageDataFactory.eINSTANCE.createScrollerDef();
					scrollerDef.setDimension(cardinality.getMax());
					scrollerDef.setArgument((QUnaryAtomicBufferedDataDef<?>) dataDef);
					dataDef = (DD) scrollerDef;
					
					dataTerm = (QDataTerm<DD>) QIntegratedLanguageDataFactory.eINSTANCE.createMultipleAtomicDataTerm();; 
				}
				else if(dataDef instanceof QCompoundDataDef) {
					QStrollerDef<?> strollerDef = QIntegratedLanguageDataFactory.eINSTANCE.createStrollerDef();
					strollerDef.setDimension(cardinality.getMax());
					dataDef = (DD) strollerDef;
					
					dataTerm = (QDataTerm<DD>) QIntegratedLanguageDataFactory.eINSTANCE.createMultipleCompoundDataTerm();
				}	
				else 
					throw new RuntimeException("Unexpected condition dwe765lkdg87dsfsd0 "+dataDef);
			}
			else {
				QUnaryDataTerm<?> unaryDataTerm = null;
				if(dataDef instanceof QAtomicDataDef) {
					unaryDataTerm = QIntegratedLanguageDataFactory.eINSTANCE.createUnaryAtomicDataTerm();
				}
				else if(dataDef instanceof QCompoundDataDef) {
					unaryDataTerm = QIntegratedLanguageDataFactory.eINSTANCE.createUnaryCompoundDataTerm();				
					
					// TODO build compound object
				}
				else 
					throw new RuntimeException("Unexpected condition e2435adfqqe4klhjj89ert "+dataDef);
				
				unaryDataTerm.setMandatory(feature.isRequired());
				
				dataTerm = (QDataTerm<DD>) unaryDataTerm;
			}

			// name
			dataTerm.setName(feature.getName());

			// definition
			dataTerm.setDefinition(dataDef);

			// default
			if(dataTerm.getDataTermType().isUnary())
				((QUnaryDataTerm<?>)dataTerm).setDefault(feature.getDefaultValueLiteral());
			else {
				((QMultipleDataTerm<?>)dataTerm).getDefault().add(feature.getDefaultValueLiteral());
			}
			
			dataTerms.add(dataTerm);
		}
		
		return dataTerms;
	}
	
	private static QDataDef<?> buildDataDef(EStructuralFeature feature) {

		QDataDef<?> dataDef = null;
		EAnnotation eAnnotation = feature.getEAnnotation(QIntegratedLanguageDataPackage.eNS_PREFIX);

		if (eAnnotation == null) {

			// TODO build dataDef from java primitive
			QCharacterDef characterDefinition = QIntegratedLanguageDataFactory.eINSTANCE.createCharacterDef();
			characterDefinition.setLength(feature.getName().length());
			
			dataDef = characterDefinition;
		} else {

			dataDef = (QDataDef<?>) QIntegratedLanguageDataFactory.eINSTANCE.create((EClass) eAnnotation.getReferences().get(0));;
			
			for(String key: eAnnotation.getDetails().keySet()) {
				EStructuralFeature dataDefFeature = ((EObject)dataDef).eClass().getEStructuralFeature(key) ;
				
				if(dataDefFeature == null)
					continue;
				
				if(dataDefFeature.getDefaultValue() instanceof Number) {
					((EObject)dataDef).eSet(dataDefFeature, Integer.parseInt(eAnnotation.getDetails().get(key)));
				}
				else {
					((EObject)dataDef).eSet(dataDefFeature, eAnnotation.getDetails().get(key));
				}
			}
		}
		
		return dataDef;
	}
}
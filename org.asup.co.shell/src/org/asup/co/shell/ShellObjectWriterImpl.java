/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Dario Foresti - Initial API and implementation 
 */
package org.asup.co.shell;

import java.io.IOException;

import javax.inject.Inject;

import org.asup.fw.util.QStringUtil;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QData;
import org.asup.il.data.QDataContainer;
import org.asup.il.data.QDataWriter;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataManager;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.data.QNumeric;
import org.asup.il.data.QString;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.output.QObjectWriter;
import org.asup.os.data.QOperatingSystemDataHelper;
import org.asup.os.omac.QCreationInfo;
import org.asup.os.omac.QObject;
import org.asup.os.omac.QObjectNameable;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public class ShellObjectWriterImpl implements QObjectWriter {

	
	@Inject
	private QOutputWrapper outputWrapper;
	@Inject
	private QJob job;	
	@Inject
	private QDataManager dataManager;
	@Inject
	private QStringUtil stringUtil;

	private EClass eClass = null;
	private QDataContainer dataContainer = null;
	private QDataFactory dataFactory = null;
	
	private QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();
	
	@Override
	public synchronized void write(QObject object) throws IOException {

		EObject eObject = (EObject) object;
		EClass eClass = eObject.eClass();

		// dataContext changed
		if (this.eClass != eClass) {
			streamWrite("\n");
			
			this.eClass = eClass;			
			dataContainer = dataManager.createDataContainer(job, QOperatingSystemDataHelper.buildDataTerms(eClass));
			dataFactory = dataManager.createFactory(job);
			
			for(QDataTerm<?> dataTerm: dataContainer.getTerms()) {				
				QData data = dataContainer.getData(dataTerm);
				if(data instanceof QString) {
					data.accept(dataWriter.set(stringUtil.firstToUpper(dataTerm.getName())));
					streamWrite(data + "|");
				}
				else if(data instanceof QNumeric) {
					QCharacter character = dataFactory.createCharacter(dataTerm.getName().length(), false, true);
					character.eval(stringUtil.firstToUpper(dataTerm.getName()));
					streamWrite(character + "|");
				}
				else
					streamWrite(stringUtil.firstToUpper(dataTerm.getName()) + "|");
			}
			streamWrite("\n");
		}

		dataContainer.clearData();

		for(QDataTerm<?> dataTerm: dataContainer.getTerms()) {
			QData data = dataContainer.getData(dataTerm);

			Object value = eObject.eGet(eClass.getEStructuralFeature(dataTerm.getName()));
			if(value == null) {
				data.clear();
				streamWrite(data + "|");
			} 
			else if(value instanceof QCreationInfo) {
				QCreationInfo qCreationInfo = (QCreationInfo)value;
				data.accept(dataWriter.set(qCreationInfo.getCreationDate()));
				streamWrite(data + "|");
			}
			else if (value instanceof QObjectNameable) {
				QObjectNameable qValue = (QObjectNameable) value;
				data.accept(dataWriter.set(qValue.getName()));
				streamWrite(data + "|");
			}
			else if (value instanceof QObject) {
				QObject qValue = (QObject) value;
				data.accept(dataWriter.set(qValue.toString()));
				streamWrite(data + "|");				
			}
			else if (value instanceof Enumerator) {
				Enumerator eEnumerator = (Enumerator) value;
				data.accept(dataWriter.set(eEnumerator.getName()));
				streamWrite(data + "|");
			}
			else if (value instanceof Number) {
				QCharacter character = dataFactory.createCharacter(dataTerm.getName().length(), false, true);
				character.accept(dataWriter.set(value.toString()));
				streamWrite(character + "|");
			} 
			else {
				data.accept(dataWriter.set(value.toString()));
				streamWrite(data + "|");
			}
		}

		streamWrite("\n");
		streamFlush();
	}

	@Override
	public void flush() {		
		try {
			streamFlush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void streamWrite(String data) throws IOException {

//		if (outputWrapper.contains(contextID.getID())) {
			outputWrapper.write(job.getJobID(), data);
/*		}
		else {
			System.err.println("Unexpected condition 98sedr2q38sedhrf");
			sysout.write(data);
		}*/
	}
	
	private void streamFlush() throws IOException {

//		if (outputWrapper.contains(contextID.getID())) {
			outputWrapper.flush(job.getJobID());
/*		}
		else{
			System.err.println("Unexpected condition 38sedr2q38se8756hrf");
			sysout.flush();
		}*/
	}

	@Override
	public void initialize() {

		this.eClass = null;
	}	
}
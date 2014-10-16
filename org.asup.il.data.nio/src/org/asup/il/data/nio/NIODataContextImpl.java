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
package org.asup.il.data.nio;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.asup.fw.core.QContextID;
import org.asup.il.core.QNode;
import org.asup.il.data.QCompoundDataTerm;
import org.asup.il.data.QData;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QStruct;
import org.asup.il.data.impl.DataContextImpl;
import org.asup.il.data.nio.visitor.NIODataResetter;

public class NIODataContextImpl extends DataContextImpl implements Serializable {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	private QContextID contextID;
	
	private transient QDataFactory dataFactory;

	private List<QDataTerm<?>> dataTerms;
	
	private Map<String, QData> datas;
	
	protected NIODataContextImpl(QContextID contextID, QDataFactory dataFactory, List<QDataTerm<?>> dataTerms) {
		this.contextID = contextID;
		this.dataFactory = dataFactory;
		this.dataTerms = dataTerms;
		this.datas = new HashMap<String, QData>();
	}

	@Override
	public QData getData(String name) {

		QData data = datas.get(name);
		if(data == null) {
			QDataTerm<?> dataTerm = _getDataTerm(name);
			
			if(dataTerm == null)
				return null;

			data = dataFactory.createData(dataTerm, true);
			datas.put(name, data);
		}
				
		return data;
	}

	@Override
	public QData getData(QDataTerm<?> dataTerm) {
		
		QNode parent = dataTerm.getParent();
		if(parent == null) {
			return getData(dataTerm.getName());
		}
		else {
			if(parent instanceof QCompoundDataTerm) {
				QCompoundDataTerm<?> compoundDataTerm = (QCompoundDataTerm<?>)parent;
				QStruct dataParent = (QStruct) getData(compoundDataTerm);
				return dataParent.getElement(dataTerm.getName());
			}
			else
				return null;
		}
	}

	@Override
	public List<QDataTerm<?>> getTerms() {
		return dataTerms;
	}

	@Override
	public void clearData() {
		
		for(QDataTerm<?> dataTerm: dataTerms) {
			
			QData data = datas.get(dataTerm.getName());
			if(data == null) {
				data = dataFactory.createData(dataTerm, true);
				datas.put(dataTerm.getName(), data);
			}
			data.clear();
		}		
	}
	@Override
	public void resetData() {

		for(QDataTerm<?> dataTerm: dataTerms) 
			resetData(dataTerm.getName());	
		
	}

	@Override
	public void resetData(QDataTerm<?> dataTerm) {
		
		QData data = datas.get(dataTerm.getName());
		if(data == null) {
			data = dataFactory.createData(dataTerm, true);
			datas.put(dataTerm.getName(), data);
		}

		NIODataResetter resetter = new NIODataResetter(data);
		dataTerm.accept(resetter);

	}

	@Override
	public void resetData(String name) {
		
		QDataTerm<?> dataTerm = _getDataTerm(name);
			
		if(dataTerm == null)
			return;
		
		resetData(dataTerm);
	}
	
	private QDataTerm<?> _getDataTerm(String name) {
		QDataTerm<?> dataTerm = null;
		
		for(QDataTerm<?> dt: dataTerms) {
			if(dt.getName().equals(name)) {
				dataTerm = dt;
				break;
			}
		}
			
		return dataTerm;
	}

}	
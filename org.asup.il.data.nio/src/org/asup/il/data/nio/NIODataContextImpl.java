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
import org.asup.il.data.QData;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.impl.DataContextImpl;

public class NIODataContextImpl extends DataContextImpl implements Serializable {

	/**
	 * 
	 */
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

			for(QDataTerm<?> dataTerm: dataTerms) {
				if(dataTerm.getName().equals(name)) {
					data = dataFactory.createData(dataTerm);
					datas.put(name, data);
					break;
				}
			}

		}
				
		return data;
	}

	@Override
	public QData getData(QDataTerm<?> dataTerm) {
		return getData(dataTerm.getName());
	}

	@Override
	public List<QDataTerm<?>> getTerms() {
		return dataTerms;
	}

	@Override
	public void clearData() {
		
		for(QDataTerm<?> dataTerm: dataTerms) {
			
//			System.out.println(dataTerm);
			
			// map update
			QData data = datas.get(dataTerm.getName());
			if(data == null) {
				data = dataFactory.createData(dataTerm);
				datas.put(dataTerm.getName(), data);
			}
			data.clear();
		}		
	}
/*
	@Override
	public List<QData> getDatas() {
		
		if(datas.values().size() != dataTerms.size()) {
			for(QDataTerm<?> dataTerm: getTerms()) 
				getData(dataTerm);
		}
			
		return new ArrayList<>(datas.values());
	}*/
}
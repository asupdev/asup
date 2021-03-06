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
package org.asup.os.type.pgm.rpj;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.asup.il.data.QData;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.type.cmd.QCallableCommand;
import org.asup.os.type.cmd.QCommandManager;

public class RPJCommandSupport {

	@Inject
	private QCommandManager commandManager;
	
	@Inject
	private QJob job;
	
	
	public void qExecute(Object caller, String command) {

		if(caller == null)
			return;
		
		
		Map<String, Object> variables = new HashMap<String, Object>();
		
		for(Field field: caller.getClass().getFields()) {


			Type type = field.getGenericType();

			Class<?> fieldKlass = null;

			if (type instanceof ParameterizedType) {
				fieldKlass = (Class<?>) ((ParameterizedType) type).getRawType();
			} else
				fieldKlass = (Class<?>) type;

			if(QData.class.isAssignableFrom(fieldKlass)) {
				Object variable;
				try {
					variable = field.get(caller);
					variables.put(field.getName(), variable);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

		try {
			QCallableCommand callableCommand = commandManager.prepareCommand(job, command, variables, false);
			
			commandManager.executeCommand(job, callableCommand);
			
		} catch (OperatingSystemException e) {
			System.err.println("Command API error: "+command+"\t"+e.getMessage());
		}
		
	}

}

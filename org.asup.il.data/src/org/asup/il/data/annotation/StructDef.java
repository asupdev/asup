/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@DataType
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface StructDef {
	
	int dimension() default 1;
	boolean external() default false;
	String externalName() default NULL;
	String externalFormat() default NULL;
	String initialize() default NULL;
	int length() default 0;	
	
	public static final String NULL = "*NULL";
}
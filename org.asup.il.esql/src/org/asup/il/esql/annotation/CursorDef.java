/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.esql.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.asup.il.data.annotation.DataType;
import org.asup.il.esql.CursorType;

@DataType
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface CursorDef {
	
	boolean hold() default false;
	
	CursorType type() default CursorType.SCROLLABLE;
}

/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.asup.il.data.BinaryType;
import org.asup.il.data.DatetimeType;

@DataType
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface DataDef {
	
	// array
	String dimension() default "";
	
	// stroller
	String occurrences() default "";
	
	// character
	int length() default 0;
	boolean varying() default false;
	
	// decimal
	int precision() default 0;
	int scale() default 0;	
	boolean packed() default false;
	
	// datetime
	DatetimeType datetime() default DatetimeType.DATE;
	
	// binary
	BinaryType binary() default BinaryType.BYTE;
	
	// compound
	boolean qualified() default false;	
	
	String value() default "";
	
	String[] values() default {};
}
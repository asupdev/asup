/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Dario Foresti - Initial API and implementation
 */
package org.asup.dk.parser.ibmi.cl;

public class ParserFactory {

    public enum ScriptType {
        CL,
        CL_COMMAND,
        CL_EXPRESSION,
        CL_PARAMETER
    }

    private static ParserFactory instance;

    private ParserFactory() {
    }

    public static ParserFactory getInstance() {
        if (instance == null) {
            instance = new ParserFactory();
        }
        return instance;
    }

    @SuppressWarnings("rawtypes")
	public ParserInterface getParser(ScriptType type) {
        switch (type) {
            case CL: {
                return new CLParserWrapper();
            }
            
            case CL_COMMAND: {
            	return new CLCommandParserWrapper();
            }

            case CL_EXPRESSION: {
                return new CLExpressionParserWrapper();
            }
            
            case CL_PARAMETER: {
                return new CLParameterParserWrapper();
            }

            default: {
                return null;
            }
        }
    }
}

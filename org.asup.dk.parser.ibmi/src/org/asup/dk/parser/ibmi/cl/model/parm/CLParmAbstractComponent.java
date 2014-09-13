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
package org.asup.dk.parser.ibmi.cl.model.parm;

import java.util.LinkedList;

import org.asup.dk.parser.ibmi.cl.model.Node;


public abstract class CLParmAbstractComponent implements Node {
	
	private String text;	
	private Node father;
	private LinkedList<Node> childs = new LinkedList<Node>();
	
	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}	
	    
    /* (non-Javadoc)
	 * @see org.asup.dk.parser.ibmi.cl.model.Node#setFather(org.asup.dk.parser.ibmi.cl.model.Node)
	 */
    @Override
	public void setFather(Node father){
    	this.father = father;
    }
    
    /* (non-Javadoc)
	 * @see org.asup.dk.parser.ibmi.cl.model.Node#getFather()
	 */
    @Override
	public Node getFather(){
    	return father;
    }
    
    /* (non-Javadoc)
	 * @see org.asup.dk.parser.ibmi.cl.model.Node#addChild(org.asup.dk.parser.ibmi.cl.model.CLAbstractComponent)
	 */
    @Override
	public void addChild(Node child) {
    	childs.add(child);
    }
    
    /* (non-Javadoc)
	 * @see org.asup.dk.parser.ibmi.cl.model.Node#getChilds()
	 */
    @Override
	public LinkedList<Node> getChilds(){
    	return childs;
    }

    public abstract CLParmComponentType getComponentType();
    

}

package org.asup.dk.compiler.rpj;

import java.io.IOException;
import java.util.List;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QCompilationSetup;
import org.asup.il.data.QCompoundDataDef;
import org.asup.il.data.QDataTerm;
import org.eclipse.jdt.core.dom.Modifier;

public class RPJDataStructureWriter extends RPJNamedNodeWriter {

	@SuppressWarnings("unchecked")
	public RPJDataStructureWriter(RPJNamedNodeWriter root, QCompilationContext compilationContext, QCompilationSetup compilationSetup, String name, boolean statik) {
		super(root, compilationContext, compilationSetup, name);
		
		if(statik)
			getTarget().modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
	}

	public void writeStructure(QCompoundDataDef<?> dataPart) throws IOException {

		writeStructure(dataPart.getElements());
		
	}

	public void writeStructure(List<QDataTerm<?>> elements) throws IOException {
		
		// fields
		for (QDataTerm<?> element : elements) {
			writePublicField(element, false);
		}

		// elements
		for(QDataTerm<?> element: elements) {
			writeInnerTerm(element);
		} 
	}

}

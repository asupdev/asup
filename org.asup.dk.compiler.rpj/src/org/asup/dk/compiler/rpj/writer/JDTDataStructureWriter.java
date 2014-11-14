package org.asup.dk.compiler.rpj.writer;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QCompilationSetup;
import org.asup.il.data.QCompoundDataDef;
import org.asup.il.data.QDataTerm;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Type;

public class JDTDataStructureWriter extends JDTNamedNodeWriter {

	@SuppressWarnings("unchecked")
	public JDTDataStructureWriter(JDTNamedNodeWriter root, QCompilationContext compilationContext, QCompilationSetup compilationSetup, String name, Class<?> superClass, boolean statik) {
		super(root, compilationContext, compilationSetup, name);
		
		
		if(superClass != null) {
			writeImport(superClass);
			
			// super type
			Type superType = getAST().newSimpleType(getAST().newName(superClass.getSimpleName()));
			getTarget().setSuperclassType(superType);
			
			// serializable
			if(Serializable.class.isAssignableFrom(superClass))
				writeFieldSerializer();
			
		}

		if(statik)
			getTarget().modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
	}

	public void writeDataStructure(QCompoundDataDef<?> dataPart) throws IOException {

		writeElements(dataPart.getElements());
		
	}

	public void writeElements(List<QDataTerm<?>> elements) throws IOException {
		
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

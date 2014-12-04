package org.asup.dk.compiler.rpj.writer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QCompilationSetup;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QDataTerm;
import org.asup.os.type.file.QDisplayFile;
import org.asup.os.type.file.QDisplayFileFormat;
import org.eclipse.jdt.core.dom.Modifier;

public class JDTDisplayFileWriter extends JDTNamedNodeWriter {

	@SuppressWarnings("unchecked")
	public JDTDisplayFileWriter(JDTNamedNodeWriter root, QCompilationContext compilationContext, QCompilationSetup compilationSetup, String name) {
		super(root, compilationContext, compilationSetup, name);
			
//		writeFieldSerializer();

		if(root != null)
			getTarget().modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
	}

	public void writeDisplayFile(QDisplayFile displayFile) throws IOException {

		for(QDisplayFileFormat displayFileFormat: displayFile.getDisplayFormats()) {

			List<QDataTerm<?>> elements = new ArrayList<QDataTerm<?>>();
			elements.addAll(displayFileFormat.getFields());
					
			JDTDataStructureWriter dataStructureWriter = new JDTDataStructureWriter(this, getCompilationContext(), getCompilationSetup(), displayFileFormat.getName(), QDataStructDelegator.class, true);			
			dataStructureWriter.writeElements(elements);
		}
		
	}
}

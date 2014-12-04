package org.asup.dk.compiler.rpj.writer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QCompilationSetup;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QDataTerm;
import org.asup.os.type.file.QPrinterFile;
import org.asup.os.type.file.QPrinterFileFormat;
import org.eclipse.jdt.core.dom.Modifier;

public class JDTPrinterFileWriter extends JDTNamedNodeWriter {

	@SuppressWarnings("unchecked")
	public JDTPrinterFileWriter(JDTNamedNodeWriter root, QCompilationContext compilationContext, QCompilationSetup compilationSetup, String name) {
		super(root, compilationContext, compilationSetup, name);
			
//		writeFieldSerializer();

		if(root != null)
			getTarget().modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
	}

	public void writerPrinterFile(QPrinterFile printerFile) throws IOException {

		for(QPrinterFileFormat printerFileFormat: printerFile.getPrinterFormats()) {

			List<QDataTerm<?>> elements = new ArrayList<QDataTerm<?>>();
			elements.addAll(printerFileFormat.getFields());
					
			JDTDataStructureWriter dataStructureWriter = new JDTDataStructureWriter(this, getCompilationContext(), getCompilationSetup(), printerFileFormat.getName(), QDataStructDelegator.class, true);			
			dataStructureWriter.writeElements(elements);
		}
		
	}
}

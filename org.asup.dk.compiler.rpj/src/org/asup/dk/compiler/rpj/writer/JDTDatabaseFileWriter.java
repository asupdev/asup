package org.asup.dk.compiler.rpj.writer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QCompilationSetup;
import org.asup.il.data.QDataTerm;
import org.asup.os.type.file.QDatabaseFile;
import org.asup.os.type.file.QDatabaseFileHandler;
import org.eclipse.jdt.core.dom.Modifier;

public class JDTDatabaseFileWriter extends JDTDataStructureWriter {

	@SuppressWarnings("unchecked")
	public JDTDatabaseFileWriter(JDTNamedNodeWriter root, QCompilationContext compilationContext, QCompilationSetup compilationSetup, String name) {
		super(root, compilationContext, compilationSetup, name, QDatabaseFileHandler.class, false);

		if(root != null)
			getTarget().modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
	}

	public void writeDatabaseFile(QDatabaseFile databaseFile) throws IOException {
		
		List<QDataTerm<?>> elements = new ArrayList<QDataTerm<?>>();
		elements.addAll(databaseFile.getDatabaseFormat().getFields());
		
		writeElements(elements);
	}
}

package org.asup.dk.compiler.rpj.writer;

import java.util.List;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QCompilationSetup;
import org.asup.os.type.msgf.QMessageDescription;
import org.asup.os.type.msgf.QMessageFile;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.Modifier;

public class JDTMessageFileWriter extends JDTNamedNodeWriter {

	public JDTMessageFileWriter(JDTNamedNodeWriter root,
			QCompilationContext compilationContext,
			QCompilationSetup compilationSetup, String name) {
		super(root, compilationContext, compilationSetup, name);
	}

	@SuppressWarnings("unchecked")
	public void writeMessageFile(QMessageFile messageFile) {
		EnumDeclaration enumDeclaration = buildEnumDeclaration(getAST(), messageFile.getName(), messageFile.getMessages());
		getCompilationUnit().types().add(enumDeclaration);	
	}
	
	
	@SuppressWarnings("unchecked")
	private EnumDeclaration buildEnumDeclaration(AST ast, String name, List<QMessageDescription> messageDescriptions) {

		// write AST
		EnumDeclaration enumDeclaration = ast.newEnumDeclaration();
		enumDeclaration.setName(ast.newSimpleName(name));

		enumDeclaration.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
		
		for (QMessageDescription messageDescription : messageDescriptions) {
			EnumConstantDeclaration constantDeclaration = ast.newEnumConstantDeclaration();
			constantDeclaration.setName(ast.newSimpleName(messageDescription.getName()));
			enumDeclaration.enumConstants().add(constantDeclaration);			
			
/*			Javadoc javadoc = ast.newJavadoc();
			TagElement tag = javadoc.getAST().newTagElement();
			TextElement textElement = javadoc.getAST().newTextElement();
			textElement.setText(messageDescription.getMessageText());
			tag.fragments().add(textElement);
			javadoc.tags().add(tag);
			
			constantDeclaration.setJavadoc(javadoc);*/
		}
		
		return enumDeclaration;
	}
}

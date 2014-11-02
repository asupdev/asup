package org.asup.dk.compiler.rpj.writer;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QCompilationSetup;
import org.asup.il.data.QDataTerm;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.PackageDeclaration;

public class JDTNodeWriter {

	private AST ast;
	private CompilationUnit compilationUnit;
	private List<String> imports;

	private QCompilationContext compilationContext;
	private QCompilationSetup compilationSetup;
	
	public JDTNodeWriter(JDTNodeWriter root, QCompilationContext compilationContext, QCompilationSetup compilationSetup) {
		
		this.compilationContext = compilationContext;
		this.compilationSetup = compilationSetup;
		
		if(root != null) {
			this.ast = root.getAST();
			this.compilationUnit = root.getCompilationUnit();
			this.imports = root.imports;
		}
		else {
			this.ast = AST.newAST(AST.JLS8);
			this.compilationUnit = ast.newCompilationUnit();
			this.imports = new ArrayList<String>();
			
			// package
			PackageDeclaration packageDeclaration = ast.newPackageDeclaration();
			packageDeclaration.setName(ast.newName(compilationSetup.getBasePackage().split("\\.")));
			this.compilationUnit.setPackage(packageDeclaration);
		}
	}

	protected String normalizeInnerName(QDataTerm<?> term) {

		String name = getCompilationContext().normalizeTypeName(term.getName());
		
		// multiple
		if(term.getDataType().isMultiple() && name.endsWith("s"))
			name = removeLastChar(name);
		
		return name;
	}
	
	private String removeLastChar(String str) {
		if(str.length() == 0)
			return str;
		if(str.length() == 1)
			return "";
		
		return str.substring(0, str.length() - 1);
	}
	
	public void writeImport(Class<?> klass) {
		writeImport(klass.getCanonicalName());
	}

	@SuppressWarnings("unchecked")
	public void writeImport(String klassName) {

		if(imports.contains(klassName))
			return;
		
		ImportDeclaration importDeclaration = getAST().newImportDeclaration();
		importDeclaration.setName(getAST().newName(klassName.split("\\.")));
		getCompilationUnit().imports().add(importDeclaration);
		
		imports.add(klassName);
	}

	public QCompilationSetup getCompilationSetup() {
		return this.compilationSetup;
	}

	public QCompilationContext getCompilationContext() {
		return this.compilationContext;
	}
	
	public AST getAST() {
		return this.ast;
	}
	
	public CompilationUnit getCompilationUnit() {
		return this.compilationUnit;
	}
	
	public void writeOutputStream(OutputStream outputStream) throws IOException {
		// write file output
		byte[] contentInBytes = compilationUnit.toString().getBytes();

		outputStream.write(contentInBytes);
		outputStream.flush();
		outputStream.close();
	}
}
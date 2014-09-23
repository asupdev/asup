package org.asup.dk.compiler.rpj;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QCompilationSetup;
import org.asup.il.core.QSpecial;
import org.asup.il.data.QDataDef;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QEnum;
import org.asup.il.data.QMultipleAtomicDataDef;
import org.asup.il.data.QStrollerDef;
import org.asup.il.data.QUnaryAtomicDataDef;
import org.asup.os.data.QExternalFileName;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.Type;

public class RPJNodeWriter {

	private AST ast;
	private CompilationUnit compilationUnit;
	private List<String> imports;

	private QCompilationContext compilationContext;
	private QCompilationSetup compilationSetup;
	
	public RPJNodeWriter(RPJNodeWriter root, QCompilationContext compilationContext, QCompilationSetup compilationSetup) {
		
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
	
	@SuppressWarnings({ "unchecked"})
	public Type prepareJavaType(QDataTerm<?> dataTerm) {
		
		QDataDef<?> dataDef = dataTerm.getDefinition();
		
		Type type = null;
	
		switch (dataTerm.getDataType()) {
			case MULTIPLE_ATOMIC//		field.fragments().add(variable);
:
				QMultipleAtomicDataDef<?> multipleAtomicDataDef = (QMultipleAtomicDataDef<?>) dataDef;
				writeImport(multipleAtomicDataDef.getDataClass());
				
				QUnaryAtomicDataDef<?> innerDataDefinition = multipleAtomicDataDef.getArgument();		
				writeImport(innerDataDefinition.getDataClass());
				
				Type array = getAST().newSimpleType(getAST().newSimpleName(multipleAtomicDataDef.getDataClass().getSimpleName()));
				ParameterizedType parType = getAST().newParameterizedType(array);
				
				QSpecial special = dataTerm.getFacet(QSpecial.class);				
				if(special == null) {					
					String argument = "Q"+innerDataDefinition.getClass().getSimpleName().replaceAll("DefImpl", "");
					parType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(argument)));
					type = parType;
				}
				else {
					writeImport(QEnum.class);
					Type enumerator = getAST().newSimpleType(getAST().newSimpleName(QEnum.class.getSimpleName()));
					ParameterizedType parEnumType = getAST().newParameterizedType(enumerator);
					
					// E
					parEnumType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(normalizeInnerName(dataTerm))));
					
					// D
					String argument = "Q"+innerDataDefinition.getClass().getSimpleName().replaceAll("DefImpl", "");
					parEnumType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(argument)));
					
					parType.typeArguments().add(parEnumType);
					type = parType;
				}			
	
				break;
			case MULTIPLE_COMPOUND:
				QStrollerDef<?> strollerDef = (QStrollerDef<?>) dataDef;				
				writeImport(strollerDef.getDataClass());
				
				array = getAST().newSimpleType(getAST().newSimpleName(strollerDef.getDataClass().getSimpleName()));
				parType = getAST().newParameterizedType(array);
				parType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(normalizeInnerName(dataTerm))));
				
				type = parType;
				
				break;
			case UNARY_ATOMIC:
				
				special = dataTerm.getFacet(QSpecial.class);				
				if(special == null || dataTerm.getName() == null) {
					String argument = dataDef.getDataClass().getSimpleName();
					writeImport(dataDef.getDataClass());
					type = getAST().newSimpleType(getAST().newSimpleName(argument));
				} else {
					writeImport(QEnum.class);
					Type enumerator = getAST().newSimpleType(getAST().newSimpleName(QEnum.class.getSimpleName()));
					ParameterizedType parEnumType = getAST().newParameterizedType(enumerator);
					
					// E
					parEnumType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(normalizeInnerName(dataTerm))));
					
					// D
//					String argument = "Q"+klassDef.getSimpleName().replaceAll("DefImpl", "");
					String argument = dataDef.getDataClass().getSimpleName();
					writeImport(dataDef.getDataClass());
					parEnumType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(argument)));
					
					type = parEnumType;
				}
				
				break;
			case UNARY_COMPOUND:
				
				if(dataTerm.getFacet(QExternalFileName.class) != null) {
					QExternalFileName externalFileName = dataTerm.getFacet(QExternalFileName.class);
					
					if(externalFileName.getName().equals("*PGM_STATUS"))
						type = getAST().newSimpleType(getAST().newSimpleName(getCompilationContext().normalizeTypeName(dataTerm.getName())));
					else
						type = getAST().newSimpleType(getAST().newSimpleName(getCompilationContext().normalizeTypeName(externalFileName.getName())));					
				}
				else
					type = getAST().newSimpleType(getAST().newSimpleName(normalizeInnerName(dataTerm)));
	
				break;
		}
		
		return type;
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
		writeImport(klass.getName());
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
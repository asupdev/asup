package org.asup.dk.compiler.rpj.writer;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QCompilationSetup;
import org.asup.dk.compiler.QCompilerFactory;
import org.asup.dk.compiler.QCompilerLinker;
import org.asup.dk.compiler.rpj.helper.EnumHelper;
import org.asup.il.core.QDerived;
import org.asup.il.core.QOverlay;
import org.asup.il.core.QSpecial;
import org.asup.il.core.annotation.Overlay;
import org.asup.il.data.BinaryType;
import org.asup.il.data.DatetimeType;
import org.asup.il.data.QArrayDef;
import org.asup.il.data.QBinaryDef;
import org.asup.il.data.QCharacterDef;
import org.asup.il.data.QCompoundDataTerm;
import org.asup.il.data.QDataDef;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QDataStructDef;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QDatetimeDef;
import org.asup.il.data.QDecimalDef;
import org.asup.il.data.QEnum;
import org.asup.il.data.QFloatingDef;
import org.asup.il.data.QHexadecimalDef;
import org.asup.il.data.QIndicatorDef;
import org.asup.il.data.QMultipleAtomicDataDef;
import org.asup.il.data.QMultipleCompoundDataDef;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QMultipleDataTerm;
import org.asup.il.data.QPointerDef;
import org.asup.il.data.QScrollerDef;
import org.asup.il.data.QStrollerDef;
import org.asup.il.data.QUnaryAtomicDataDef;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.asup.il.data.QUnaryDataTerm;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Special;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

public class JDTNamedNodeWriter extends JDTNodeWriter {

	private TypeDeclaration target;
	
	@SuppressWarnings("unchecked")
	public JDTNamedNodeWriter(JDTNamedNodeWriter root, QCompilationContext compilationContext, QCompilationSetup compilationSetup, String name) {
			
		super(root, compilationContext, compilationSetup);

		// Type declaration
		target= getAST().newTypeDeclaration();
		target.setName(getAST().newSimpleName(getCompilationContext().normalizeTypeName(name)));
		target.modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));

		if(root == null)
			getCompilationUnit().types().add(target);
		else
			root.getTarget().bodyDeclarations().add(target);
		
		if(compilationSetup.getSuperClass() != null) {
			writeImport(compilationSetup.getSuperClass());
			
			// super type
			Type superType = getAST().newSimpleType(getAST().newName(compilationSetup.getSuperClass().getSimpleName()));
			target.setSuperclassType(superType);
			
			// serializable
			if(Serializable.class.isAssignableFrom(compilationSetup.getSuperClass()))
				writeFieldSerializer();
			
		}

	}
	
	@SuppressWarnings("unchecked")
	public void writeFieldSerializer() {
		
		VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
		variable.setName(getAST().newSimpleName("serialVersionUID"));
		variable.setInitializer(getAST().newNumberLiteral("1L"));

		FieldDeclaration field = getAST().newFieldDeclaration(variable);
		field.setType(getAST().newPrimitiveType(PrimitiveType.LONG));
		field.modifiers().add(getAST().newModifier(ModifierKeyword.PRIVATE_KEYWORD));
		field.modifiers().add(getAST().newModifier(ModifierKeyword.STATIC_KEYWORD));
		field.modifiers().add(getAST().newModifier(ModifierKeyword.FINAL_KEYWORD));
		
		target.bodyDeclarations().add(field);
	}

	@SuppressWarnings("unchecked")
	public void writePublicField(QDataTerm<?> dataTerm, boolean nullInitialization) {

		VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
		variable.setName(getAST().newSimpleName(getCompilationContext().normalizeTermName(dataTerm.getName())));
		FieldDeclaration field = getAST().newFieldDeclaration(variable);		
		
		// @DataDef
		writeDataDefAnnotation(field, dataTerm.getDefinition());
		
		// default
		if(dataTerm.getDataType().isUnary()) {
			QUnaryDataTerm<?> unaryDataTerm = (QUnaryDataTerm<?>)dataTerm;
			if(unaryDataTerm.getDefault() != null && !unaryDataTerm.getDefault().isEmpty())
				writeAnnotation(field, DataDef.class, "value", unaryDataTerm.getDefault());
		}
		else {
			QMultipleDataTerm<?> multipleDataTerm = (QMultipleDataTerm<?>)dataTerm;
			if(multipleDataTerm.getDefault() != null && !multipleDataTerm.getDefault().isEmpty())
				writeAnnotation(field, DataDef.class, "values", multipleDataTerm.getDefault());
		}			

		// @Overlay
		if(dataTerm.getFacet(QOverlay.class) != null) {
			QOverlay overlay = dataTerm.getFacet(QOverlay.class); 
			
			if(dataTerm.getParent() instanceof QCompoundDataTerm) {
				QCompoundDataTerm<?> compoundTerm = (QCompoundDataTerm<?>)dataTerm.getParent();
				if(!getCompilationContext().equalsTermName(compoundTerm.getName(), overlay.getName())) 
					writeAnnotation(field, Overlay.class, "name", overlay.getName());

				if(overlay.getPosition() != null && !overlay.getPosition().equals(Overlay.NEXT)) 
					writeAnnotation(field, Overlay.class, "position", overlay.getPosition());

			}
			else {
				writeAnnotation(field, Overlay.class, "name", overlay.getName());

				if(overlay.getPosition() != null)
					if(overlay.getPosition().equals(Overlay.NEXT))
						throw new RuntimeException("Unexpected runtime exception: nc707256c76045");
					else
						writeAnnotation(field, Overlay.class, "position", overlay.getPosition());
			}

		}

		field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));
		Type type = getJavaType(dataTerm);
		field.setType(type);

		if (nullInitialization)
			variable.setInitializer(getAST().newNullLiteral());
		
		getTarget().bodyDeclarations().add(field);
	}

	@SuppressWarnings("unchecked")
	public void writeInnerTerm(QDataTerm<?> dataTerm) throws IOException {
		
		switch (dataTerm.getDataType()) {
		
			case UNARY_ATOMIC:
				
				break;

			case UNARY_COMPOUND:
				QUnaryCompoundDataTerm<?> unaryCompoundDataTerm = (QUnaryCompoundDataTerm<?>)dataTerm;
				
				QCompilerLinker compilerLinker = unaryCompoundDataTerm.getFacet(QCompilerLinker.class); 
				if(compilerLinker == null) {
					
					QCompilationSetup compilationSetup = QCompilerFactory.eINSTANCE.createCompilationSetup();
					compilationSetup.setSuperClass(QDataStructDelegator.class);

					JDTDataStructureWriter dataStructureWriter = new JDTDataStructureWriter(this, getCompilationContext(), compilationSetup, getCompilationContext().normalizeTypeName(unaryCompoundDataTerm), true);
					dataStructureWriter.writeStructure(unaryCompoundDataTerm.getDefinition());
				}
				else {

					if(isOverridden(unaryCompoundDataTerm)) {
						Class<QDataStruct> linkedClass = (Class<QDataStruct>) compilerLinker.getLinkedClass();
						QCompilationSetup compilationSetup = QCompilerFactory.eINSTANCE.createCompilationSetup();
						compilationSetup.setSuperClass(linkedClass);
	
						JDTDataStructureWriter dataStructureWriter = new JDTDataStructureWriter(this, getCompilationContext(), compilationSetup, getCompilationContext().normalizeTypeName(unaryCompoundDataTerm), true);
						List<QDataTerm<?>> elements = new ArrayList<QDataTerm<?>>();
						for(QDataTerm<?> element: unaryCompoundDataTerm.getDefinition().getElements()) {
							if(element.getFacet(QDerived.class) != null)
								continue;
							
							elements.add(element);
						}
						dataStructureWriter.writeStructure(elements);
					}
				}
				
				break;
				
			case MULTIPLE_ATOMIC:
				
				break;
			
			case MULTIPLE_COMPOUND:
				QMultipleCompoundDataTerm<?> multipleCompoundDataTerm = (QMultipleCompoundDataTerm<?>) dataTerm;
				
				compilerLinker = multipleCompoundDataTerm.getFacet(QCompilerLinker.class); 
				if(compilerLinker == null) {
					
					QCompilationSetup compilationSetup = QCompilerFactory.eINSTANCE.createCompilationSetup();
					compilationSetup.setSuperClass(QDataStructDelegator.class);

					JDTDataStructureWriter dataStructureWriter = new JDTDataStructureWriter(this, getCompilationContext(), compilationSetup, getCompilationContext().normalizeTypeName(multipleCompoundDataTerm), true);
					dataStructureWriter.writeStructure(multipleCompoundDataTerm.getDefinition());
				}
				else {
					if(isOverridden(multipleCompoundDataTerm)) {
						Class<QDataStruct> linkedClass = (Class<QDataStruct>) compilerLinker.getLinkedClass();
						QCompilationSetup compilationSetup = QCompilerFactory.eINSTANCE.createCompilationSetup();
						compilationSetup.setSuperClass(linkedClass);
	
						JDTDataStructureWriter dataStructureWriter = new JDTDataStructureWriter(this, getCompilationContext(), compilationSetup, getCompilationContext().normalizeTypeName(multipleCompoundDataTerm), true);
						List<QDataTerm<?>> elements = new ArrayList<QDataTerm<?>>();
						for(QDataTerm<?> element: multipleCompoundDataTerm.getDefinition().getElements()) {
							if(element.getFacet(QDerived.class) != null)
								continue;
							
							elements.add(element);
						}
						dataStructureWriter.writeStructure(elements);
					}
				}
				
				
				break;
		}
		
		QSpecial special = dataTerm.getFacet(QSpecial.class);
		if(special != null) {
			EnumDeclaration enumType = getAST().newEnumDeclaration();
			enumType.setName(getAST().newSimpleName(getCompilationContext().normalizeTypeName(dataTerm)+"Enum"));
			EnumHelper.writeEnum(enumType, dataTerm);
			
			writeImport(Special.class);
			
			target.bodyDeclarations().add(enumType);
		}

	}

	public Type getJavaPrimitive(QDataTerm<?> dataTerm) {
		
		QDataDef<?> dataDef = dataTerm.getDefinition();
		
		Class<?> klass = dataDef.getJavaClass();
		Type type = getAST().newSimpleType(getAST().newSimpleName(klass.getSimpleName()));
		
		return type;

	}
	
	public TypeDeclaration getTarget() {
		return this.target;
	}
	
	public void writeDataDefAnnotation(ASTNode node, QDataDef<?> dataDef) {
		
		@SuppressWarnings("unchecked")
		Class<? extends QDataDef<?>> klassDef = (Class<? extends QDataDef<?>>) dataDef.getClass();
		
		if(QArrayDef.class.isAssignableFrom(klassDef)) {
			QArrayDef<?> arrayDef = (QArrayDef<?>)dataDef;
			
			if (arrayDef.getDimension() != 0) 
				writeAnnotation(node, DataDef.class, "dimension", arrayDef.getDimension());

			writeDataDefAnnotation(node, arrayDef.getArgument());
		}
		else if(QScrollerDef.class.isAssignableFrom(klassDef)) {
			QScrollerDef<?> scrollerDef = (QScrollerDef<?>)dataDef;
			
			if (scrollerDef.getDimension() != 0) 
				writeAnnotation(node, DataDef.class, "dimension", scrollerDef.getDimension());

			writeDataDefAnnotation(node, scrollerDef.getArgument());			
		}
		else if(QStrollerDef.class.isAssignableFrom(klassDef)) {
			QStrollerDef<?> strollerDef = (QStrollerDef<?>) dataDef;
			if (strollerDef.getDimension() != 0) 
				writeAnnotation(node, DataDef.class, "dimension", strollerDef.getDimension());
			
		}
		else if(QBinaryDef.class.isAssignableFrom(klassDef)) {
			QBinaryDef binaryDef = (QBinaryDef) dataDef;
			writeImport(BinaryType.class);
			writeAnnotation(node, DataDef.class, "binaryType", binaryDef.getType());			
		}
/*		else if(QEnumeratedDataDef.class.isAssignableFrom(klassDef)) {
			QEnumeratedDataDef<?> dataDefinition = (QEnumeratedDataDef<?>) dataDef;
			
			QBufferedDataDef<?> innerDataDefinition = dataDefinition.getArgument();
			writeImport(unit, innerDataDefinition.getClass().getName().split("\\."));
			setElementAnnotation(unit, target, innerDataDefinition);
			
		}*/
		else if(QDataStructDef.class.isAssignableFrom(klassDef)) {
			QDataStructDef dataStructureDef = (QDataStructDef) dataDef;
			
			if (dataStructureDef.isQualified()) 
				writeAnnotation(node, DataDef.class, "qualified", dataStructureDef.isQualified());
			
		}
		else if(QCharacterDef.class.isAssignableFrom(klassDef)) {
			QCharacterDef charDef = (QCharacterDef) dataDef;

			if (charDef.getLength() > 0)
				writeAnnotation(node, DataDef.class, "length", charDef.getLength());
			
			if (charDef.isVarying()) 
				writeAnnotation(node, DataDef.class, "varying", charDef.isVarying());

		}
		else if(QIndicatorDef.class.isAssignableFrom(klassDef)) {
			QIndicatorDef indicatorDef = (QIndicatorDef) dataDef;
			indicatorDef.toString();
		}
		else if(QPointerDef.class.isAssignableFrom(klassDef)) {
			QPointerDef pointerDef = (QPointerDef) dataDef;
			pointerDef.toString();
		}
		else if(QDatetimeDef.class.isAssignableFrom(klassDef)) {
			QDatetimeDef datetimeDef = (QDatetimeDef)dataDef;
			writeImport(DatetimeType.class);
			writeAnnotation(node, DataDef.class, "datetimeType", datetimeDef.getType());
			if(datetimeDef.getFormat() != null)
				writeAnnotation(node, DataDef.class, "datetimeFormat", datetimeDef.getFormat());
		}
		else if(QDecimalDef.class.isAssignableFrom(klassDef)) {
			QDecimalDef decimalDef = (QDecimalDef) dataDef;
			
			if (decimalDef.getPrecision() > 0)
				writeAnnotation(node, DataDef.class, "precision", decimalDef.getPrecision());
			
			if (decimalDef.getScale() > 0) 
				writeAnnotation(node, DataDef.class, "scale", decimalDef.getScale());
			
		}
		else if(QHexadecimalDef.class.isAssignableFrom(klassDef)) {
			QHexadecimalDef hexadecimalDef = (QHexadecimalDef)dataDef;
			if (hexadecimalDef.getLength() > 0)
				writeAnnotation(node, DataDef.class, "length", hexadecimalDef.getLength());			
		}
		else if(QFloatingDef.class.isAssignableFrom(klassDef)) {
//			QFloatingDef floatDef = (QFloatingDef) dataDef;
//			if (floatDef.getLength() > 0) 
//				writeAnnotation(target, annotationName, "length", floatDef.getLength());
		
		}
		else
			System.err.println("Unknown field type "+dataDef);
		
		if(!dataDef.getFormulas().isEmpty())
			writeAnnotation(node, DataDef.class, "formulas", dataDef.getFormulas());
	}
	
	@SuppressWarnings("unchecked")
	public void writeAnnotation(ASTNode node, Class<?> annotationKlass, String key, Object value) {
		
		writeImport(annotationKlass);
		
		NormalAnnotation annotation = null;

		if (node instanceof FieldDeclaration) {
			FieldDeclaration field = (FieldDeclaration) node;
			annotation = findAnnotation(field.modifiers(), annotationKlass);

			if(annotation == null) {
				annotation = getAST().newNormalAnnotation();
				annotation.setTypeName(getAST().newName(annotationKlass.getSimpleName()));
				field.modifiers().add(annotation);
			}			
		}
		else if (node instanceof SingleVariableDeclaration) {
			SingleVariableDeclaration field = (SingleVariableDeclaration) node;
			annotation = findAnnotation(field.modifiers(), annotationKlass);
			
			if(annotation == null) {
				annotation = getAST().newNormalAnnotation();
				annotation.setTypeName(getAST().newName(annotationKlass.getSimpleName()));
				field.modifiers().add(annotation);
			}
		}
		else
			throw new RuntimeException("Unexpected runtime exception 5k43jwh45j8srkf");		
			
		MemberValuePair memberValuePair = getAST().newMemberValuePair();
		memberValuePair.setName(getAST().newSimpleName(key));
		if(value instanceof Number) {
			memberValuePair.setValue(getAST().newNumberLiteral(value.toString()));
			annotation.values().add(memberValuePair);
		}
		else if(value instanceof Boolean) {
			memberValuePair.setValue(getAST().newBooleanLiteral((boolean) value));
			annotation.values().add(memberValuePair);
		}
		else if(value instanceof String) {
			StringLiteral stringLiteral = getAST().newStringLiteral();
			stringLiteral.setLiteralValue((String)value);
			memberValuePair.setValue(stringLiteral);
			annotation.values().add(memberValuePair);
		}
		else if(value instanceof Enum) {
			Enum<?> enumValue = (Enum<?>)value;
			String enumName = enumValue.getClass().getSimpleName()+"."+((Enum<?>) value).name();
			memberValuePair.setValue(getAST().newName(enumName.split("\\.")));
			annotation.values().add(memberValuePair);
		}
		else if(value instanceof List) {
			List<String> listValues = (List<String>)value;
			
			ArrayInitializer arrayInitializer = getAST().newArrayInitializer();
			for(String listValue: listValues) {
				StringLiteral stringLiteral = getAST().newStringLiteral();
				stringLiteral.setLiteralValue(listValue);
				arrayInitializer.expressions().add(stringLiteral);
			}
			
			memberValuePair.setValue(arrayInitializer);
			annotation.values().add(memberValuePair);
		}
		else
			throw new RuntimeException("Unexpected runtime exception k7548j4s67vo4kk");	
	}

	private NormalAnnotation findAnnotation(List<?> modifiers, Class<?> annotationKlass) {
		for(Object modifier: modifiers) {
			if(modifier instanceof NormalAnnotation) {
				NormalAnnotation annotation = (NormalAnnotation)modifier;
				if(annotation.getTypeName().getFullyQualifiedName().equals(annotationKlass.getSimpleName()))
					return annotation;
			}
		}
		
		return null;
	}
	
	
	@SuppressWarnings({ "unchecked"})
	public Type getJavaType(QDataTerm<?> dataTerm) {
		
		QDataDef<?> dataDef = dataTerm.getDefinition();
		writeImport(dataDef.getDataClass());
		
		Type type = null;
	
		switch (dataTerm.getDataType()) {
			case MULTIPLE_ATOMIC:
				QMultipleAtomicDataDef<?> multipleAtomicDataDef = (QMultipleAtomicDataDef<?>) dataDef;
				
				QUnaryAtomicDataDef<?> innerDataDefinition = multipleAtomicDataDef.getArgument();		
				writeImport(innerDataDefinition.getDataClass());
				
				Type array = getAST().newSimpleType(getAST().newSimpleName(multipleAtomicDataDef.getDataClass().getSimpleName()));
				ParameterizedType parType = getAST().newParameterizedType(array);
				
				String argument = innerDataDefinition.getDataClass().getSimpleName();
				parType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(argument)));
				type = parType;

				break;
				
			case UNARY_ATOMIC:				

				type = getAST().newSimpleType(getAST().newSimpleName(dataDef.getDataClass().getSimpleName()));

				break;
				
			case MULTIPLE_COMPOUND:
				QMultipleCompoundDataTerm<?> multipleCompoundDataTerm = (QMultipleCompoundDataTerm<?>)dataTerm;
				
				QMultipleCompoundDataDef<?> multipleCompoundDataDef = multipleCompoundDataTerm.getDefinition();
				writeImport(multipleCompoundDataDef.getDataClass());
				
/*				array = getAST().newSimpleType(getAST().newSimpleName(multipleCompoundDataDef.getDataClass().getSimpleName()));
				parType = getAST().newParameterizedType(array);

				argument = multipleCompoundDataDef.getDataClass().getSimpleName();
				parType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(normalizeInnerName(dataTerm))));				
				type = parType;*/
				
				break;
			case UNARY_COMPOUND:
				QUnaryCompoundDataTerm<?> unaryCompoundDataTerm = (QUnaryCompoundDataTerm<?>)dataTerm;
				
				QCompilerLinker compilerLinker = dataTerm.getFacet(QCompilerLinker.class);
				if(compilerLinker != null) {
					
					Class<QDataStruct> linkedClass = (Class<QDataStruct>) compilerLinker.getLinkedClass(); 
					
					if(isOverridden(unaryCompoundDataTerm)) {
						String qualifiedName = getCompilationContext().getQualifiedName(dataTerm);
						// TODO setup
						type = getAST().newSimpleType(getAST().newName(getCompilationContext().normalizeTypeName(qualifiedName).split("\\.")));
					}
					else
						type = getAST().newSimpleType(getAST().newName(linkedClass.getName().split("\\.")));
										
				}
				else {
					String qualifiedName = getCompilationContext().getQualifiedName(dataTerm);
					// TODO setup
					type = getAST().newSimpleType(getAST().newName(getCompilationContext().normalizeTypeName(qualifiedName).split("\\.")));
				}
	
				break;
		}

		QSpecial special = dataTerm.getFacet(QSpecial.class);				
		if(special != null) {
			writeImport(QEnum.class);
			Type enumerator = getAST().newSimpleType(getAST().newSimpleName(QEnum.class.getSimpleName()));
			ParameterizedType parEnumType = getAST().newParameterizedType(enumerator);			
			// E
			parEnumType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(getCompilationContext().normalizeTypeName(dataTerm)+"Enum")));			
			// D
			parEnumType.typeArguments().add(type);
			
			type = parEnumType;
		}
	
		return type;
	}
	
	public boolean isOverridden(QCompoundDataTerm<?> compoundDataTerm) {
		
		for(QDataTerm<?> element: compoundDataTerm.getDefinition().getElements())
			if(element.getFacet(QDerived.class) == null)
				return true;
		
		return false;
	}
}

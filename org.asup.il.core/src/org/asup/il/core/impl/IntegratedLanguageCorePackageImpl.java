/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.core.impl;

import org.asup.fw.java.QFrameworkJavaPackage;
import org.asup.il.core.ConversionStatus;
import org.asup.il.core.FormatType;
import org.asup.il.core.QAtomicTerm;
import org.asup.il.core.QCardinality;
import org.asup.il.core.QCompoundTerm;
import org.asup.il.core.QConversion;
import org.asup.il.core.QDerived;
import org.asup.il.core.QDictionary;
import org.asup.il.core.QDomain;
import org.asup.il.core.QFacet;
import org.asup.il.core.QFormat;
import org.asup.il.core.QIntegratedLanguageCoreFactory;
import org.asup.il.core.QIntegratedLanguageCorePackage;
import org.asup.il.core.QMultipleTerm;
import org.asup.il.core.QNameable;
import org.asup.il.core.QNamedNode;
import org.asup.il.core.QNode;
import org.asup.il.core.QOverlay;
import org.asup.il.core.QRange;
import org.asup.il.core.QRemap;
import org.asup.il.core.QSpecial;
import org.asup.il.core.QSpecialElement;
import org.asup.il.core.QSubject;
import org.asup.il.core.QTerm;
import org.asup.il.core.QTermContainer;
import org.asup.il.core.QUnaryTerm;
import org.asup.il.core.QVerb;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegratedLanguageCorePackageImpl extends EPackageImpl implements QIntegratedLanguageCorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dictionaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overlayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conversionStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formatTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.asup.il.core.QIntegratedLanguageCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegratedLanguageCorePackageImpl() {
		super(eNS_URI, QIntegratedLanguageCoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QIntegratedLanguageCorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QIntegratedLanguageCorePackage init() {
		if (isInited) return (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);

		// Obtain or create and register package
		IntegratedLanguageCorePackageImpl theIntegratedLanguageCorePackage = (IntegratedLanguageCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegratedLanguageCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntegratedLanguageCorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QFrameworkJavaPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIntegratedLanguageCorePackage.createPackageContents();

		// Initialize created meta-data
		theIntegratedLanguageCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegratedLanguageCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QIntegratedLanguageCorePackage.eNS_URI, theIntegratedLanguageCorePackage);
		return theIntegratedLanguageCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicTerm() {
		return atomicTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinality() {
		return cardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_Min() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundTerm() {
		return compoundTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversion() {
		return conversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversion_Status() {
		return (EAttribute)conversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerived() {
		return derivedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_Max() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDictionary() {
		return dictionaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionary_Name() {
		return (EAttribute)dictionaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionary_Text() {
		return (EAttribute)dictionaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionary_Vendor() {
		return (EAttribute)dictionaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionary_Uri() {
		return (EAttribute)dictionaryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Name() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Text() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacet() {
		return facetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormat() {
		return formatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormat_Type() {
		return (EAttribute)formatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormat_Expression() {
		return (EAttribute)formatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverlay() {
		return overlayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverlay_Name() {
		return (EAttribute)overlayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverlay_Position() {
		return (EAttribute)overlayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleTerm() {
		return multipleTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedNode() {
		return namedNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedNode_Facets() {
		return (EReference)namedNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRange() {
		return rangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRange_Min() {
		return (EAttribute)rangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemap() {
		return remapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemap_Name() {
		return (EAttribute)remapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemap_Index() {
		return (EAttribute)remapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRange_Max() {
		return (EAttribute)rangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecial() {
		return specialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecial_ClassDelegate() {
		return (EAttribute)specialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecial_Elements() {
		return (EReference)specialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialElement() {
		return specialElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialElement_Name() {
		return (EAttribute)specialElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialElement_Text() {
		return (EAttribute)specialElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialElement_Unary() {
		return (EAttribute)specialElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialElement_Value() {
		return (EAttribute)specialElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubject() {
		return subjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubject_Name() {
		return (EAttribute)subjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubject_Text() {
		return (EAttribute)subjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermContainer() {
		return termContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerb() {
		return verbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerb_Name() {
		return (EAttribute)verbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerb_Text() {
		return (EAttribute)verbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryTerm() {
		return unaryTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameable() {
		return nameableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConversionStatus() {
		return conversionStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFormatType() {
		return formatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIntegratedLanguageCoreFactory getIntegratedLanguageCoreFactory() {
		return (QIntegratedLanguageCoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		atomicTermEClass = createEClass(ATOMIC_TERM);

		cardinalityEClass = createEClass(CARDINALITY);
		createEAttribute(cardinalityEClass, CARDINALITY__MAX);
		createEAttribute(cardinalityEClass, CARDINALITY__MIN);

		compoundTermEClass = createEClass(COMPOUND_TERM);

		conversionEClass = createEClass(CONVERSION);
		createEAttribute(conversionEClass, CONVERSION__STATUS);

		derivedEClass = createEClass(DERIVED);

		dictionaryEClass = createEClass(DICTIONARY);
		createEAttribute(dictionaryEClass, DICTIONARY__NAME);
		createEAttribute(dictionaryEClass, DICTIONARY__TEXT);
		createEAttribute(dictionaryEClass, DICTIONARY__VENDOR);
		createEAttribute(dictionaryEClass, DICTIONARY__URI);

		domainEClass = createEClass(DOMAIN);
		createEAttribute(domainEClass, DOMAIN__NAME);
		createEAttribute(domainEClass, DOMAIN__TEXT);

		facetEClass = createEClass(FACET);

		formatEClass = createEClass(FORMAT);
		createEAttribute(formatEClass, FORMAT__EXPRESSION);
		createEAttribute(formatEClass, FORMAT__TYPE);

		overlayEClass = createEClass(OVERLAY);
		createEAttribute(overlayEClass, OVERLAY__NAME);
		createEAttribute(overlayEClass, OVERLAY__POSITION);

		multipleTermEClass = createEClass(MULTIPLE_TERM);

		namedNodeEClass = createEClass(NAMED_NODE);
		createEReference(namedNodeEClass, NAMED_NODE__FACETS);

		nodeEClass = createEClass(NODE);

		rangeEClass = createEClass(RANGE);
		createEAttribute(rangeEClass, RANGE__MAX);
		createEAttribute(rangeEClass, RANGE__MIN);

		remapEClass = createEClass(REMAP);
		createEAttribute(remapEClass, REMAP__NAME);
		createEAttribute(remapEClass, REMAP__INDEX);

		specialEClass = createEClass(SPECIAL);
		createEAttribute(specialEClass, SPECIAL__CLASS_DELEGATE);
		createEReference(specialEClass, SPECIAL__ELEMENTS);

		specialElementEClass = createEClass(SPECIAL_ELEMENT);
		createEAttribute(specialElementEClass, SPECIAL_ELEMENT__NAME);
		createEAttribute(specialElementEClass, SPECIAL_ELEMENT__TEXT);
		createEAttribute(specialElementEClass, SPECIAL_ELEMENT__UNARY);
		createEAttribute(specialElementEClass, SPECIAL_ELEMENT__VALUE);

		subjectEClass = createEClass(SUBJECT);
		createEAttribute(subjectEClass, SUBJECT__NAME);
		createEAttribute(subjectEClass, SUBJECT__TEXT);

		termEClass = createEClass(TERM);

		termContainerEClass = createEClass(TERM_CONTAINER);

		verbEClass = createEClass(VERB);
		createEAttribute(verbEClass, VERB__NAME);
		createEAttribute(verbEClass, VERB__TEXT);

		unaryTermEClass = createEClass(UNARY_TERM);

		nameableEClass = createEClass(NAMEABLE);

		// Create enums
		conversionStatusEEnum = createEEnum(CONVERSION_STATUS);
		formatTypeEEnum = createEEnum(FORMAT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		QFrameworkJavaPackage theFrameworkJavaPackage = (QFrameworkJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkJavaPackage.eNS_URI);

		// Create type parameters
		ETypeParameter dictionaryEClass_T = addETypeParameter(dictionaryEClass, "T");
		ETypeParameter termContainerEClass_T = addETypeParameter(termContainerEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getTerm());
		dictionaryEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getTerm());
		termContainerEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		atomicTermEClass.getESuperTypes().add(this.getTerm());
		cardinalityEClass.getESuperTypes().add(this.getFacet());
		compoundTermEClass.getESuperTypes().add(this.getTerm());
		conversionEClass.getESuperTypes().add(this.getFacet());
		derivedEClass.getESuperTypes().add(this.getFacet());
		g1 = createEGenericType(this.getTermContainer());
		EGenericType g2 = createEGenericType(dictionaryEClass_T);
		g1.getETypeArguments().add(g2);
		dictionaryEClass.getEGenericSuperTypes().add(g1);
		domainEClass.getESuperTypes().add(this.getFacet());
		facetEClass.getESuperTypes().add(this.getNode());
		formatEClass.getESuperTypes().add(this.getFacet());
		overlayEClass.getESuperTypes().add(this.getFacet());
		multipleTermEClass.getESuperTypes().add(this.getTerm());
		namedNodeEClass.getESuperTypes().add(this.getNode());
		namedNodeEClass.getESuperTypes().add(this.getNameable());
		rangeEClass.getESuperTypes().add(this.getFacet());
		remapEClass.getESuperTypes().add(this.getFacet());
		specialEClass.getESuperTypes().add(this.getFacet());
		specialElementEClass.getESuperTypes().add(this.getNamedNode());
		subjectEClass.getESuperTypes().add(this.getTerm());
		termEClass.getESuperTypes().add(this.getNamedNode());
		verbEClass.getESuperTypes().add(this.getTerm());
		unaryTermEClass.getESuperTypes().add(this.getTerm());

		// Initialize classes and features; add operations and parameters
		initEClass(atomicTermEClass, QAtomicTerm.class, "AtomicTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cardinalityEClass, QCardinality.class, "Cardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinality_Max(), ecorePackage.getEInt(), "max", "1", 1, 1, QCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinality_Min(), ecorePackage.getEInt(), "min", null, 1, 1, QCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(cardinalityEClass, ecorePackage.getEBoolean(), "isMandatory", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cardinalityEClass, ecorePackage.getEBoolean(), "isMultiple", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compoundTermEClass, QCompoundTerm.class, "CompoundTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conversionEClass, QConversion.class, "Conversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConversion_Status(), this.getConversionStatus(), "status", null, 1, 1, QConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedEClass, QDerived.class, "Derived", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dictionaryEClass, QDictionary.class, "Dictionary", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDictionary_Name(), ecorePackage.getEString(), "name", null, 0, 1, QDictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDictionary_Text(), ecorePackage.getEString(), "text", null, 0, 1, QDictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDictionary_Vendor(), ecorePackage.getEString(), "vendor", null, 0, 1, QDictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDictionary_Uri(), theFrameworkJavaPackage.getJavaURI(), "uri", null, 0, 1, QDictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainEClass, QDomain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomain_Name(), ecorePackage.getEString(), "name", null, 0, 1, QDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_Text(), ecorePackage.getEString(), "text", null, 0, 1, QDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facetEClass, QFacet.class, "Facet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formatEClass, QFormat.class, "Format", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormat_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, QFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormat_Type(), this.getFormatType(), "type", null, 1, 1, QFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overlayEClass, QOverlay.class, "Overlay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOverlay_Name(), ecorePackage.getEString(), "name", null, 1, 1, QOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOverlay_Position(), ecorePackage.getEString(), "position", null, 1, 1, QOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleTermEClass, QMultipleTerm.class, "MultipleTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedNodeEClass, QNamedNode.class, "NamedNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedNode_Facets(), this.getFacet(), null, "facets", null, 0, -1, QNamedNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(namedNodeEClass, null, "getFacet", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "F");
		g1 = createEGenericType(this.getFacet());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(nodeEClass, QNode.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(nodeEClass, this.getNode(), "getParent", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(nodeEClass, ecorePackage.getEBoolean(), "isChild", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rangeEClass, QRange.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRange_Max(), ecorePackage.getEString(), "max", "1", 1, 1, QRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRange_Min(), ecorePackage.getEString(), "min", null, 1, 1, QRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remapEClass, QRemap.class, "Remap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemap_Name(), ecorePackage.getEString(), "name", null, 1, 1, QRemap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemap_Index(), ecorePackage.getEString(), "index", null, 1, 1, QRemap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specialEClass, QSpecial.class, "Special", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecial_ClassDelegate(), ecorePackage.getEString(), "classDelegate", null, 0, 1, QSpecial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecial_Elements(), this.getSpecialElement(), null, "elements", null, 0, -1, QSpecial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specialElementEClass, QSpecialElement.class, "SpecialElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecialElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, QSpecialElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecialElement_Text(), ecorePackage.getEString(), "text", null, 0, 1, QSpecialElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecialElement_Unary(), ecorePackage.getEBoolean(), "unary", null, 0, 1, QSpecialElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecialElement_Value(), ecorePackage.getEString(), "value", null, 0, 1, QSpecialElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subjectEClass, QSubject.class, "Subject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubject_Name(), ecorePackage.getEString(), "name", null, 0, 1, QSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubject_Text(), ecorePackage.getEString(), "text", null, 0, 1, QSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termEClass, QTerm.class, "Term", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(termEClass, ecorePackage.getEString(), "getText", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(termEClass, theFrameworkJavaPackage.getJavaURI(), "getURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(termContainerEClass, QTermContainer.class, "TermContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(termContainerEClass, null, "getTerms", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(termContainerEClass_T);
		initEOperation(op, g1);

		initEClass(verbEClass, QVerb.class, "Verb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerb_Name(), ecorePackage.getEString(), "name", null, 0, 1, QVerb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerb_Text(), ecorePackage.getEString(), "text", null, 0, 1, QVerb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryTermEClass, QUnaryTerm.class, "UnaryTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nameableEClass, QNameable.class, "Nameable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(nameableEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(conversionStatusEEnum, ConversionStatus.class, "ConversionStatus");
		addEEnumLiteral(conversionStatusEEnum, ConversionStatus.POSSIBLE);
		addEEnumLiteral(conversionStatusEEnum, ConversionStatus.SUPPORTED);
		addEEnumLiteral(conversionStatusEEnum, ConversionStatus.UNSUPPORTED);
		addEEnumLiteral(conversionStatusEEnum, ConversionStatus.TODO);

		initEEnum(formatTypeEEnum, FormatType.class, "FormatType");
		addEEnumLiteral(formatTypeEEnum, FormatType.COMMUNICATIONS_NAME);
		addEEnumLiteral(formatTypeEEnum, FormatType.COMMAND_STRING);
		addEEnumLiteral(formatTypeEEnum, FormatType.GENERIC);
		addEEnumLiteral(formatTypeEEnum, FormatType.NAME);
		addEEnumLiteral(formatTypeEEnum, FormatType.PATH_NAME);
		addEEnumLiteral(formatTypeEEnum, FormatType.REGULAR_EXPRESSION);
		addEEnumLiteral(formatTypeEEnum, FormatType.SIMPLE_NAME);

		// Create resource
		createResource(eNS_URI);
	}

} //IntegratedLanguageCorePackageImpl

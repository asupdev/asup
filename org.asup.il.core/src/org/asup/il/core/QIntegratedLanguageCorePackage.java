/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.core;

import org.asup.fw.core.QFrameworkCorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asup.il.core.QIntegratedLanguageCoreFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/il/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageCorePackage eINSTANCE = org.asup.il.core.impl.IntegratedLanguageCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.il.core.QNameable <em>Nameable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.QNameable
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getNameable()
	 * @generated
	 */
	int NAMEABLE = 15;

	/**
	 * The number of structural features of the '<em>Nameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.FacetImpl <em>Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.FacetImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getFacet()
	 * @generated
	 */
	int FACET = 10;

	/**
	 * The number of structural features of the '<em>Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.AnnotationImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = FACET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.AnnotationTestImpl <em>Annotation Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.AnnotationTestImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getAnnotationTest()
	 * @generated
	 */
	int ANNOTATION_TEST = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TEST__EXPRESSION = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TEST__MESSAGE = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotation Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TEST_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.NodeImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 17;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FACETS = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.NamedNodeImpl <em>Named Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.NamedNodeImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getNamedNode()
	 * @generated
	 */
	int NAMED_NODE = 16;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NODE__FACETS = NODE__FACETS;

	/**
	 * The number of structural features of the '<em>Named Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.TermImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 26;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__FACETS = NAMED_NODE__FACETS;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = NAMED_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.AtomicTermImpl <em>Atomic Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.AtomicTermImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getAtomicTerm()
	 * @generated
	 */
	int ATOMIC_TERM = 2;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TERM__FACETS = TERM__FACETS;

	/**
	 * The number of structural features of the '<em>Atomic Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.CardinalityImpl <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.CardinalityImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 3;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__MAX = FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__MIN = FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_FEATURE_COUNT = FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.CompoundTermImpl <em>Compound Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.CompoundTermImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getCompoundTerm()
	 * @generated
	 */
	int COMPOUND_TERM = 4;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TERM__FACETS = TERM__FACETS;

	/**
	 * The number of structural features of the '<em>Compound Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.core.QConstraint <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.QConstraint
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 5;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.ConversionImpl <em>Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.ConversionImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getConversion()
	 * @generated
	 */
	int CONVERSION = 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION__STATUS = FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_FEATURE_COUNT = FACET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.DerivedImpl <em>Derived</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.DerivedImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getDerived()
	 * @generated
	 */
	int DERIVED = 7;

	/**
	 * The number of structural features of the '<em>Derived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURE_COUNT = FACET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.TermContainerImpl <em>Term Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.TermContainerImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getTermContainer()
	 * @generated
	 */
	int TERM_CONTAINER = 27;

	/**
	 * The number of structural features of the '<em>Term Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_CONTAINER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.DictionaryImpl <em>Dictionary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.DictionaryImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getDictionary()
	 * @generated
	 */
	int DICTIONARY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__NAME = TERM_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__TEXT = TERM_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__VENDOR = TERM_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__URI = TERM_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_FEATURE_COUNT = TERM_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.DomainImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__TEXT = FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.FormatImpl <em>Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.FormatImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getFormat()
	 * @generated
	 */
	int FORMAT = 11;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT__EXPRESSION = FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT__TYPE = FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_FEATURE_COUNT = FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.il.core.QFrame <em>Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.QFrame
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getFrame()
	 * @generated
	 */
	int FRAME = 12;

	/**
	 * The number of structural features of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.core.QFrameManager <em>Frame Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.QFrameManager
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getFrameManager()
	 * @generated
	 */
	int FRAME_MANAGER = 13;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_MANAGER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Frame Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_MANAGER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.MultipleTermImpl <em>Multiple Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.MultipleTermImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getMultipleTerm()
	 * @generated
	 */
	int MULTIPLE_TERM = 14;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_TERM__FACETS = TERM__FACETS;

	/**
	 * The number of structural features of the '<em>Multiple Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.OverlayImpl <em>Overlay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.OverlayImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getOverlay()
	 * @generated
	 */
	int OVERLAY = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__NAME = FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__POSITION = FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_FEATURE_COUNT = FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.RangeImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 19;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__MAX = FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__MIN = FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.RemapImpl <em>Remap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.RemapImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getRemap()
	 * @generated
	 */
	int REMAP = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP__NAME = FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP__INDEX = FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_FEATURE_COUNT = FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.il.core.QRule <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.QRule
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getRule()
	 * @generated
	 */
	int RULE = 21;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.il.core.QSlot <em>Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.QSlot
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getSlot()
	 * @generated
	 */
	int SLOT = 22;

	/**
	 * The number of structural features of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.SpecialImpl <em>Special</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.SpecialImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getSpecial()
	 * @generated
	 */
	int SPECIAL = 23;

	/**
	 * The feature id for the '<em><b>Class Delegate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL__CLASS_DELEGATE = FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL__ELEMENTS = FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Special</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_FEATURE_COUNT = FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.SpecialElementImpl <em>Special Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.SpecialElementImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getSpecialElement()
	 * @generated
	 */
	int SPECIAL_ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ELEMENT__FACETS = NAMED_NODE__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ELEMENT__NAME = NAMED_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ELEMENT__TEXT = NAMED_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ELEMENT__UNARY = NAMED_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ELEMENT__VALUE = NAMED_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Special Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ELEMENT_FEATURE_COUNT = NAMED_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.SubjectImpl <em>Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.SubjectImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getSubject()
	 * @generated
	 */
	int SUBJECT = 25;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__FACETS = TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__NAME = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__TEXT = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.il.core.QTrigger <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.QTrigger
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 28;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.UnaryTermImpl <em>Unary Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.UnaryTermImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getUnaryTerm()
	 * @generated
	 */
	int UNARY_TERM = 29;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_TERM__FACETS = TERM__FACETS;

	/**
	 * The number of structural features of the '<em>Unary Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.core.impl.VerbImpl <em>Verb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.impl.VerbImpl
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getVerb()
	 * @generated
	 */
	int VERB = 30;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB__FACETS = TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB__NAME = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB__TEXT = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Verb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.il.core.ConversionStatus <em>Conversion Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.ConversionStatus
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getConversionStatus()
	 * @generated
	 */
	int CONVERSION_STATUS = 31;

	/**
	 * The meta object id for the '{@link org.asup.il.core.FormatType <em>Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.core.FormatType
	 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getFormatType()
	 * @generated
	 */
	int FORMAT_TYPE = 32;


	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.asup.il.core.QAnnotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QAnnotationTest <em>Annotation Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Test</em>'.
	 * @see org.asup.il.core.QAnnotationTest
	 * @generated
	 */
	EClass getAnnotationTest();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QAnnotationTest#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.asup.il.core.QAnnotationTest#getExpression()
	 * @see #getAnnotationTest()
	 * @generated
	 */
	EAttribute getAnnotationTest_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QAnnotationTest#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.asup.il.core.QAnnotationTest#getMessage()
	 * @see #getAnnotationTest()
	 * @generated
	 */
	EAttribute getAnnotationTest_Message();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QAtomicTerm <em>Atomic Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Term</em>'.
	 * @see org.asup.il.core.QAtomicTerm
	 * @generated
	 */
	EClass getAtomicTerm();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see org.asup.il.core.QCardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QCardinality#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.asup.il.core.QCardinality#getMax()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QCardinality#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.asup.il.core.QCardinality#getMin()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_Min();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QCompoundTerm <em>Compound Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Term</em>'.
	 * @see org.asup.il.core.QCompoundTerm
	 * @generated
	 */
	EClass getCompoundTerm();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.asup.il.core.QConstraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QConversion <em>Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion</em>'.
	 * @see org.asup.il.core.QConversion
	 * @generated
	 */
	EClass getConversion();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QConversion#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.asup.il.core.QConversion#getStatus()
	 * @see #getConversion()
	 * @generated
	 */
	EAttribute getConversion_Status();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived</em>'.
	 * @see org.asup.il.core.QDerived
	 * @generated
	 */
	EClass getDerived();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QDictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary</em>'.
	 * @see org.asup.il.core.QDictionary
	 * @generated
	 */
	EClass getDictionary();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QDictionary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.il.core.QDictionary#getName()
	 * @see #getDictionary()
	 * @generated
	 */
	EAttribute getDictionary_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QDictionary#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.asup.il.core.QDictionary#getText()
	 * @see #getDictionary()
	 * @generated
	 */
	EAttribute getDictionary_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QDictionary#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.asup.il.core.QDictionary#getVendor()
	 * @see #getDictionary()
	 * @generated
	 */
	EAttribute getDictionary_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QDictionary#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.asup.il.core.QDictionary#getUri()
	 * @see #getDictionary()
	 * @generated
	 */
	EAttribute getDictionary_Uri();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see org.asup.il.core.QDomain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QDomain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.il.core.QDomain#getName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QDomain#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.asup.il.core.QDomain#getText()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Text();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QFacet <em>Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet</em>'.
	 * @see org.asup.il.core.QFacet
	 * @generated
	 */
	EClass getFacet();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Format</em>'.
	 * @see org.asup.il.core.QFormat
	 * @generated
	 */
	EClass getFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QFormat#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.asup.il.core.QFormat#getExpression()
	 * @see #getFormat()
	 * @generated
	 */
	EAttribute getFormat_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QFormat#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.asup.il.core.QFormat#getType()
	 * @see #getFormat()
	 * @generated
	 */
	EAttribute getFormat_Type();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame</em>'.
	 * @see org.asup.il.core.QFrame
	 * @generated
	 */
	EClass getFrame();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QFrameManager <em>Frame Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame Manager</em>'.
	 * @see org.asup.il.core.QFrameManager
	 * @generated
	 */
	EClass getFrameManager();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QMultipleTerm <em>Multiple Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Term</em>'.
	 * @see org.asup.il.core.QMultipleTerm
	 * @generated
	 */
	EClass getMultipleTerm();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QNameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nameable</em>'.
	 * @see org.asup.il.core.QNameable
	 * @generated
	 */
	EClass getNameable();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QNamedNode <em>Named Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Node</em>'.
	 * @see org.asup.il.core.QNamedNode
	 * @generated
	 */
	EClass getNamedNode();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.asup.il.core.QNode
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.il.core.QNode#getFacets <em>Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facets</em>'.
	 * @see org.asup.il.core.QNode#getFacets()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Facets();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QOverlay <em>Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overlay</em>'.
	 * @see org.asup.il.core.QOverlay
	 * @generated
	 */
	EClass getOverlay();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QOverlay#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.il.core.QOverlay#getName()
	 * @see #getOverlay()
	 * @generated
	 */
	EAttribute getOverlay_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QOverlay#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.asup.il.core.QOverlay#getPosition()
	 * @see #getOverlay()
	 * @generated
	 */
	EAttribute getOverlay_Position();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see org.asup.il.core.QRange
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QRange#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.asup.il.core.QRange#getMax()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QRange#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.asup.il.core.QRange#getMin()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Min();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QRemap <em>Remap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remap</em>'.
	 * @see org.asup.il.core.QRemap
	 * @generated
	 */
	EClass getRemap();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QRemap#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.il.core.QRemap#getName()
	 * @see #getRemap()
	 * @generated
	 */
	EAttribute getRemap_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QRemap#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.asup.il.core.QRemap#getIndex()
	 * @see #getRemap()
	 * @generated
	 */
	EAttribute getRemap_Index();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see org.asup.il.core.QRule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot</em>'.
	 * @see org.asup.il.core.QSlot
	 * @generated
	 */
	EClass getSlot();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QSpecial <em>Special</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special</em>'.
	 * @see org.asup.il.core.QSpecial
	 * @generated
	 */
	EClass getSpecial();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QSpecial#getClassDelegate <em>Class Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Delegate</em>'.
	 * @see org.asup.il.core.QSpecial#getClassDelegate()
	 * @see #getSpecial()
	 * @generated
	 */
	EAttribute getSpecial_ClassDelegate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.il.core.QSpecial#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.asup.il.core.QSpecial#getElements()
	 * @see #getSpecial()
	 * @generated
	 */
	EReference getSpecial_Elements();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QSpecialElement <em>Special Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Element</em>'.
	 * @see org.asup.il.core.QSpecialElement
	 * @generated
	 */
	EClass getSpecialElement();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QSpecialElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.il.core.QSpecialElement#getName()
	 * @see #getSpecialElement()
	 * @generated
	 */
	EAttribute getSpecialElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QSpecialElement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.asup.il.core.QSpecialElement#getText()
	 * @see #getSpecialElement()
	 * @generated
	 */
	EAttribute getSpecialElement_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QSpecialElement#isUnary <em>Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unary</em>'.
	 * @see org.asup.il.core.QSpecialElement#isUnary()
	 * @see #getSpecialElement()
	 * @generated
	 */
	EAttribute getSpecialElement_Unary();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QSpecialElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.asup.il.core.QSpecialElement#getValue()
	 * @see #getSpecialElement()
	 * @generated
	 */
	EAttribute getSpecialElement_Value();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject</em>'.
	 * @see org.asup.il.core.QSubject
	 * @generated
	 */
	EClass getSubject();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QSubject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.il.core.QSubject#getName()
	 * @see #getSubject()
	 * @generated
	 */
	EAttribute getSubject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QSubject#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.asup.il.core.QSubject#getText()
	 * @see #getSubject()
	 * @generated
	 */
	EAttribute getSubject_Text();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see org.asup.il.core.QTerm
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QTermContainer <em>Term Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Container</em>'.
	 * @see org.asup.il.core.QTermContainer
	 * @generated
	 */
	EClass getTermContainer();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see org.asup.il.core.QTrigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QUnaryTerm <em>Unary Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Term</em>'.
	 * @see org.asup.il.core.QUnaryTerm
	 * @generated
	 */
	EClass getUnaryTerm();

	/**
	 * Returns the meta object for class '{@link org.asup.il.core.QVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verb</em>'.
	 * @see org.asup.il.core.QVerb
	 * @generated
	 */
	EClass getVerb();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QVerb#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.il.core.QVerb#getName()
	 * @see #getVerb()
	 * @generated
	 */
	EAttribute getVerb_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.core.QVerb#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.asup.il.core.QVerb#getText()
	 * @see #getVerb()
	 * @generated
	 */
	EAttribute getVerb_Text();

	/**
	 * Returns the meta object for enum '{@link org.asup.il.core.ConversionStatus <em>Conversion Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conversion Status</em>'.
	 * @see org.asup.il.core.ConversionStatus
	 * @generated
	 */
	EEnum getConversionStatus();

	/**
	 * Returns the meta object for enum '{@link org.asup.il.core.FormatType <em>Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Format Type</em>'.
	 * @see org.asup.il.core.FormatType
	 * @generated
	 */
	EEnum getFormatType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QIntegratedLanguageCoreFactory getIntegratedLanguageCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.AnnotationImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.AnnotationTestImpl <em>Annotation Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.AnnotationTestImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getAnnotationTest()
		 * @generated
		 */
		EClass ANNOTATION_TEST = eINSTANCE.getAnnotationTest();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TEST__EXPRESSION = eINSTANCE.getAnnotationTest_Expression();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TEST__MESSAGE = eINSTANCE.getAnnotationTest_Message();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.AtomicTermImpl <em>Atomic Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.AtomicTermImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getAtomicTerm()
		 * @generated
		 */
		EClass ATOMIC_TERM = eINSTANCE.getAtomicTerm();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.CardinalityImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getCardinality()
		 * @generated
		 */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__MAX = eINSTANCE.getCardinality_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__MIN = eINSTANCE.getCardinality_Min();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.CompoundTermImpl <em>Compound Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.CompoundTermImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getCompoundTerm()
		 * @generated
		 */
		EClass COMPOUND_TERM = eINSTANCE.getCompoundTerm();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.QConstraint <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.QConstraint
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.ConversionImpl <em>Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.ConversionImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getConversion()
		 * @generated
		 */
		EClass CONVERSION = eINSTANCE.getConversion();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION__STATUS = eINSTANCE.getConversion_Status();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.DerivedImpl <em>Derived</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.DerivedImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getDerived()
		 * @generated
		 */
		EClass DERIVED = eINSTANCE.getDerived();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.DictionaryImpl <em>Dictionary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.DictionaryImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getDictionary()
		 * @generated
		 */
		EClass DICTIONARY = eINSTANCE.getDictionary();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICTIONARY__NAME = eINSTANCE.getDictionary_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICTIONARY__TEXT = eINSTANCE.getDictionary_Text();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICTIONARY__VENDOR = eINSTANCE.getDictionary_Vendor();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICTIONARY__URI = eINSTANCE.getDictionary_Uri();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.DomainImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__TEXT = eINSTANCE.getDomain_Text();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.FacetImpl <em>Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.FacetImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getFacet()
		 * @generated
		 */
		EClass FACET = eINSTANCE.getFacet();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.FormatImpl <em>Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.FormatImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getFormat()
		 * @generated
		 */
		EClass FORMAT = eINSTANCE.getFormat();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAT__EXPRESSION = eINSTANCE.getFormat_Expression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAT__TYPE = eINSTANCE.getFormat_Type();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.QFrame <em>Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.QFrame
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getFrame()
		 * @generated
		 */
		EClass FRAME = eINSTANCE.getFrame();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.QFrameManager <em>Frame Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.QFrameManager
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getFrameManager()
		 * @generated
		 */
		EClass FRAME_MANAGER = eINSTANCE.getFrameManager();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.MultipleTermImpl <em>Multiple Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.MultipleTermImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getMultipleTerm()
		 * @generated
		 */
		EClass MULTIPLE_TERM = eINSTANCE.getMultipleTerm();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.QNameable <em>Nameable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.QNameable
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getNameable()
		 * @generated
		 */
		EClass NAMEABLE = eINSTANCE.getNameable();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.NamedNodeImpl <em>Named Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.NamedNodeImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getNamedNode()
		 * @generated
		 */
		EClass NAMED_NODE = eINSTANCE.getNamedNode();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.NodeImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Facets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FACETS = eINSTANCE.getNode_Facets();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.OverlayImpl <em>Overlay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.OverlayImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getOverlay()
		 * @generated
		 */
		EClass OVERLAY = eINSTANCE.getOverlay();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERLAY__NAME = eINSTANCE.getOverlay_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERLAY__POSITION = eINSTANCE.getOverlay_Position();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.RangeImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__MAX = eINSTANCE.getRange_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__MIN = eINSTANCE.getRange_Min();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.RemapImpl <em>Remap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.RemapImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getRemap()
		 * @generated
		 */
		EClass REMAP = eINSTANCE.getRemap();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMAP__NAME = eINSTANCE.getRemap_Name();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMAP__INDEX = eINSTANCE.getRemap_Index();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.QRule <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.QRule
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.QSlot <em>Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.QSlot
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getSlot()
		 * @generated
		 */
		EClass SLOT = eINSTANCE.getSlot();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.SpecialImpl <em>Special</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.SpecialImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getSpecial()
		 * @generated
		 */
		EClass SPECIAL = eINSTANCE.getSpecial();

		/**
		 * The meta object literal for the '<em><b>Class Delegate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL__CLASS_DELEGATE = eINSTANCE.getSpecial_ClassDelegate();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIAL__ELEMENTS = eINSTANCE.getSpecial_Elements();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.SpecialElementImpl <em>Special Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.SpecialElementImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getSpecialElement()
		 * @generated
		 */
		EClass SPECIAL_ELEMENT = eINSTANCE.getSpecialElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_ELEMENT__NAME = eINSTANCE.getSpecialElement_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_ELEMENT__TEXT = eINSTANCE.getSpecialElement_Text();

		/**
		 * The meta object literal for the '<em><b>Unary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_ELEMENT__UNARY = eINSTANCE.getSpecialElement_Unary();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_ELEMENT__VALUE = eINSTANCE.getSpecialElement_Value();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.SubjectImpl <em>Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.SubjectImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getSubject()
		 * @generated
		 */
		EClass SUBJECT = eINSTANCE.getSubject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECT__NAME = eINSTANCE.getSubject_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECT__TEXT = eINSTANCE.getSubject_Text();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.TermImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.TermContainerImpl <em>Term Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.TermContainerImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getTermContainer()
		 * @generated
		 */
		EClass TERM_CONTAINER = eINSTANCE.getTermContainer();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.QTrigger <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.QTrigger
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.UnaryTermImpl <em>Unary Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.UnaryTermImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getUnaryTerm()
		 * @generated
		 */
		EClass UNARY_TERM = eINSTANCE.getUnaryTerm();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.impl.VerbImpl <em>Verb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.impl.VerbImpl
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getVerb()
		 * @generated
		 */
		EClass VERB = eINSTANCE.getVerb();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERB__NAME = eINSTANCE.getVerb_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERB__TEXT = eINSTANCE.getVerb_Text();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.ConversionStatus <em>Conversion Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.ConversionStatus
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getConversionStatus()
		 * @generated
		 */
		EEnum CONVERSION_STATUS = eINSTANCE.getConversionStatus();

		/**
		 * The meta object literal for the '{@link org.asup.il.core.FormatType <em>Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.core.FormatType
		 * @see org.asup.il.core.impl.IntegratedLanguageCorePackageImpl#getFormatType()
		 * @generated
		 */
		EEnum FORMAT_TYPE = eINSTANCE.getFormatType();

	}

} //QIntegratedLanguageCorePackage

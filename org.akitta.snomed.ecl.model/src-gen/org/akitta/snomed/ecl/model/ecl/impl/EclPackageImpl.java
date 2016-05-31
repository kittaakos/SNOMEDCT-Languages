/**
 */
package org.akitta.snomed.ecl.model.ecl.impl;

import org.akitta.snomed.ecl.model.ecl.AstElement;
import org.akitta.snomed.ecl.model.ecl.Attribute;
import org.akitta.snomed.ecl.model.ecl.AttributeGroup;
import org.akitta.snomed.ecl.model.ecl.AttributeGroupRefinement;
import org.akitta.snomed.ecl.model.ecl.AttributeOperator;
import org.akitta.snomed.ecl.model.ecl.AttributeSet;
import org.akitta.snomed.ecl.model.ecl.AttributeSetRefinement;
import org.akitta.snomed.ecl.model.ecl.AttributeValue;
import org.akitta.snomed.ecl.model.ecl.BinaryOperator;
import org.akitta.snomed.ecl.model.ecl.Cardinality;
import org.akitta.snomed.ecl.model.ecl.ComparisonOperator;
import org.akitta.snomed.ecl.model.ecl.CompoundAttributeSet;
import org.akitta.snomed.ecl.model.ecl.CompoundElement;
import org.akitta.snomed.ecl.model.ecl.CompoundExpressionConstraint;
import org.akitta.snomed.ecl.model.ecl.CompoundRefinement;
import org.akitta.snomed.ecl.model.ecl.ConceptReference;
import org.akitta.snomed.ecl.model.ecl.ConjunctionAttributeSet;
import org.akitta.snomed.ecl.model.ecl.ConjunctionExpressionConstraint;
import org.akitta.snomed.ecl.model.ecl.ConjunctionRefinementSet;
import org.akitta.snomed.ecl.model.ecl.ConstraintOperator;
import org.akitta.snomed.ecl.model.ecl.DisjunctionAttributeSet;
import org.akitta.snomed.ecl.model.ecl.DisjunctionExpressionConstraint;
import org.akitta.snomed.ecl.model.ecl.DisjunctionRefinementSet;
import org.akitta.snomed.ecl.model.ecl.EclFactory;
import org.akitta.snomed.ecl.model.ecl.EclPackage;
import org.akitta.snomed.ecl.model.ecl.ExclusionExpressionConstraint;
import org.akitta.snomed.ecl.model.ecl.ExpressionConstraint;
import org.akitta.snomed.ecl.model.ecl.ExpressionValue;
import org.akitta.snomed.ecl.model.ecl.FocusConcept;
import org.akitta.snomed.ecl.model.ecl.NumericValue;
import org.akitta.snomed.ecl.model.ecl.ParenthesizedExpressionConstraint;
import org.akitta.snomed.ecl.model.ecl.RefinedExpressionConstraint;
import org.akitta.snomed.ecl.model.ecl.Refinement;
import org.akitta.snomed.ecl.model.ecl.Script;
import org.akitta.snomed.ecl.model.ecl.SimpleExpressionConstraint;
import org.akitta.snomed.ecl.model.ecl.StringValue;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EclPackageImpl extends EPackageImpl implements EclPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parenthesizedExpressionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundExpressionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conjunctionExpressionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjunctionExpressionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusionExpressionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinedExpressionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleExpressionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundRefinementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conjunctionRefinementSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjunctionRefinementSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeGroupRefinementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeSetRefinementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundAttributeSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conjunctionAttributeSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjunctionAttributeSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass focusConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeGroupEClass = null;

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
	private EEnum binaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonOperatorEEnum = null;

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
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EclPackageImpl() {
		super(eNS_URI, EclFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EclPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EclPackage init() {
		if (isInited) return (EclPackage)EPackage.Registry.INSTANCE.getEPackage(EclPackage.eNS_URI);

		// Obtain or create and register package
		EclPackageImpl theEclPackage = (EclPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EclPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EclPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEclPackage.createPackageContents();

		// Initialize created meta-data
		theEclPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEclPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EclPackage.eNS_URI, theEclPackage);
		return theEclPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScript() {
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScript_Constraint() {
		return (EReference)scriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAstElement() {
		return astElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionConstraint() {
		return expressionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParenthesizedExpressionConstraint() {
		return parenthesizedExpressionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParenthesizedExpressionConstraint_Current() {
		return (EReference)parenthesizedExpressionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundElement() {
		return compoundElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundElement_Op() {
		return (EAttribute)compoundElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundElement_Left() {
		return (EReference)compoundElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundElement_Right() {
		return (EReference)compoundElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundExpressionConstraint() {
		return compoundExpressionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConjunctionExpressionConstraint() {
		return conjunctionExpressionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjunctionExpressionConstraint() {
		return disjunctionExpressionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusionExpressionConstraint() {
		return exclusionExpressionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefinedExpressionConstraint() {
		return refinedExpressionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinedExpressionConstraint_Target() {
		return (EReference)refinedExpressionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinedExpressionConstraint_Refinement() {
		return (EReference)refinedExpressionConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleExpressionConstraint() {
		return simpleExpressionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleExpressionConstraint_Op() {
		return (EAttribute)simpleExpressionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleExpressionConstraint_Concept() {
		return (EReference)simpleExpressionConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefinement() {
		return refinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundRefinement() {
		return compoundRefinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConjunctionRefinementSet() {
		return conjunctionRefinementSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjunctionRefinementSet() {
		return disjunctionRefinementSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeGroupRefinement() {
		return attributeGroupRefinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeGroupRefinement_AttributeGroup() {
		return (EReference)attributeGroupRefinementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeSetRefinement() {
		return attributeSetRefinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeSetRefinement_AttributeSet() {
		return (EReference)attributeSetRefinementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeSet() {
		return attributeSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundAttributeSet() {
		return compoundAttributeSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConjunctionAttributeSet() {
		return conjunctionAttributeSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjunctionAttributeSet() {
		return disjunctionAttributeSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Reversed() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Wildcard() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Op() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Cardinality() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_ConceptRef() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Value() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValue() {
		return attributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValue_Op() {
		return (EAttribute)attributeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionValue() {
		return expressionValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionValue_Value() {
		return (EReference)expressionValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericValue() {
		return numericValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericValue_Value() {
		return (EAttribute)numericValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValue() {
		return stringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValue_Value() {
		return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptReference() {
		return conceptReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptReference_Id() {
		return (EAttribute)conceptReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptReference_Term() {
		return (EAttribute)conceptReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFocusConcept() {
		return focusConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFocusConcept_MemberOf() {
		return (EAttribute)focusConceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFocusConcept_Wildcard() {
		return (EAttribute)focusConceptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFocusConcept_ConceptRef() {
		return (EReference)focusConceptEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeGroup() {
		return attributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeGroup_AttributeSet() {
		return (EReference)attributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeGroup_Cardinality() {
		return (EReference)attributeGroupEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getCardinality_From() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_To() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_Many() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryOperator() {
		return binaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributeOperator() {
		return attributeOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraintOperator() {
		return constraintOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisonOperator() {
		return comparisonOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclFactory getEclFactory() {
		return (EclFactory)getEFactoryInstance();
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
		scriptEClass = createEClass(SCRIPT);
		createEReference(scriptEClass, SCRIPT__CONSTRAINT);

		astElementEClass = createEClass(AST_ELEMENT);

		expressionConstraintEClass = createEClass(EXPRESSION_CONSTRAINT);

		parenthesizedExpressionConstraintEClass = createEClass(PARENTHESIZED_EXPRESSION_CONSTRAINT);
		createEReference(parenthesizedExpressionConstraintEClass, PARENTHESIZED_EXPRESSION_CONSTRAINT__CURRENT);

		compoundElementEClass = createEClass(COMPOUND_ELEMENT);
		createEAttribute(compoundElementEClass, COMPOUND_ELEMENT__OP);
		createEReference(compoundElementEClass, COMPOUND_ELEMENT__LEFT);
		createEReference(compoundElementEClass, COMPOUND_ELEMENT__RIGHT);

		compoundExpressionConstraintEClass = createEClass(COMPOUND_EXPRESSION_CONSTRAINT);

		conjunctionExpressionConstraintEClass = createEClass(CONJUNCTION_EXPRESSION_CONSTRAINT);

		disjunctionExpressionConstraintEClass = createEClass(DISJUNCTION_EXPRESSION_CONSTRAINT);

		exclusionExpressionConstraintEClass = createEClass(EXCLUSION_EXPRESSION_CONSTRAINT);

		refinedExpressionConstraintEClass = createEClass(REFINED_EXPRESSION_CONSTRAINT);
		createEReference(refinedExpressionConstraintEClass, REFINED_EXPRESSION_CONSTRAINT__TARGET);
		createEReference(refinedExpressionConstraintEClass, REFINED_EXPRESSION_CONSTRAINT__REFINEMENT);

		simpleExpressionConstraintEClass = createEClass(SIMPLE_EXPRESSION_CONSTRAINT);
		createEAttribute(simpleExpressionConstraintEClass, SIMPLE_EXPRESSION_CONSTRAINT__OP);
		createEReference(simpleExpressionConstraintEClass, SIMPLE_EXPRESSION_CONSTRAINT__CONCEPT);

		refinementEClass = createEClass(REFINEMENT);

		compoundRefinementEClass = createEClass(COMPOUND_REFINEMENT);

		conjunctionRefinementSetEClass = createEClass(CONJUNCTION_REFINEMENT_SET);

		disjunctionRefinementSetEClass = createEClass(DISJUNCTION_REFINEMENT_SET);

		attributeGroupRefinementEClass = createEClass(ATTRIBUTE_GROUP_REFINEMENT);
		createEReference(attributeGroupRefinementEClass, ATTRIBUTE_GROUP_REFINEMENT__ATTRIBUTE_GROUP);

		attributeSetRefinementEClass = createEClass(ATTRIBUTE_SET_REFINEMENT);
		createEReference(attributeSetRefinementEClass, ATTRIBUTE_SET_REFINEMENT__ATTRIBUTE_SET);

		attributeSetEClass = createEClass(ATTRIBUTE_SET);

		compoundAttributeSetEClass = createEClass(COMPOUND_ATTRIBUTE_SET);

		conjunctionAttributeSetEClass = createEClass(CONJUNCTION_ATTRIBUTE_SET);

		disjunctionAttributeSetEClass = createEClass(DISJUNCTION_ATTRIBUTE_SET);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__REVERSED);
		createEAttribute(attributeEClass, ATTRIBUTE__WILDCARD);
		createEAttribute(attributeEClass, ATTRIBUTE__OP);
		createEReference(attributeEClass, ATTRIBUTE__CARDINALITY);
		createEReference(attributeEClass, ATTRIBUTE__CONCEPT_REF);
		createEReference(attributeEClass, ATTRIBUTE__VALUE);

		attributeValueEClass = createEClass(ATTRIBUTE_VALUE);
		createEAttribute(attributeValueEClass, ATTRIBUTE_VALUE__OP);

		expressionValueEClass = createEClass(EXPRESSION_VALUE);
		createEReference(expressionValueEClass, EXPRESSION_VALUE__VALUE);

		numericValueEClass = createEClass(NUMERIC_VALUE);
		createEAttribute(numericValueEClass, NUMERIC_VALUE__VALUE);

		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

		conceptReferenceEClass = createEClass(CONCEPT_REFERENCE);
		createEAttribute(conceptReferenceEClass, CONCEPT_REFERENCE__ID);
		createEAttribute(conceptReferenceEClass, CONCEPT_REFERENCE__TERM);

		focusConceptEClass = createEClass(FOCUS_CONCEPT);
		createEAttribute(focusConceptEClass, FOCUS_CONCEPT__MEMBER_OF);
		createEAttribute(focusConceptEClass, FOCUS_CONCEPT__WILDCARD);
		createEReference(focusConceptEClass, FOCUS_CONCEPT__CONCEPT_REF);

		attributeGroupEClass = createEClass(ATTRIBUTE_GROUP);
		createEReference(attributeGroupEClass, ATTRIBUTE_GROUP__ATTRIBUTE_SET);
		createEReference(attributeGroupEClass, ATTRIBUTE_GROUP__CARDINALITY);

		cardinalityEClass = createEClass(CARDINALITY);
		createEAttribute(cardinalityEClass, CARDINALITY__FROM);
		createEAttribute(cardinalityEClass, CARDINALITY__TO);
		createEAttribute(cardinalityEClass, CARDINALITY__MANY);

		// Create enums
		binaryOperatorEEnum = createEEnum(BINARY_OPERATOR);
		attributeOperatorEEnum = createEEnum(ATTRIBUTE_OPERATOR);
		constraintOperatorEEnum = createEEnum(CONSTRAINT_OPERATOR);
		comparisonOperatorEEnum = createEEnum(COMPARISON_OPERATOR);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter compoundElementEClass_T = addETypeParameter(compoundElementEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getAstElement());
		compoundElementEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		expressionConstraintEClass.getESuperTypes().add(this.getAstElement());
		parenthesizedExpressionConstraintEClass.getESuperTypes().add(this.getExpressionConstraint());
		compoundElementEClass.getESuperTypes().add(this.getAstElement());
		g1 = createEGenericType(this.getCompoundElement());
		EGenericType g2 = createEGenericType(this.getExpressionConstraint());
		g1.getETypeArguments().add(g2);
		compoundExpressionConstraintEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getExpressionConstraint());
		compoundExpressionConstraintEClass.getEGenericSuperTypes().add(g1);
		conjunctionExpressionConstraintEClass.getESuperTypes().add(this.getCompoundExpressionConstraint());
		disjunctionExpressionConstraintEClass.getESuperTypes().add(this.getCompoundExpressionConstraint());
		exclusionExpressionConstraintEClass.getESuperTypes().add(this.getCompoundExpressionConstraint());
		refinedExpressionConstraintEClass.getESuperTypes().add(this.getExpressionConstraint());
		simpleExpressionConstraintEClass.getESuperTypes().add(this.getExpressionConstraint());
		refinementEClass.getESuperTypes().add(this.getAstElement());
		g1 = createEGenericType(this.getCompoundElement());
		g2 = createEGenericType(this.getRefinement());
		g1.getETypeArguments().add(g2);
		compoundRefinementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getRefinement());
		compoundRefinementEClass.getEGenericSuperTypes().add(g1);
		conjunctionRefinementSetEClass.getESuperTypes().add(this.getCompoundRefinement());
		disjunctionRefinementSetEClass.getESuperTypes().add(this.getCompoundRefinement());
		attributeGroupRefinementEClass.getESuperTypes().add(this.getRefinement());
		attributeSetRefinementEClass.getESuperTypes().add(this.getRefinement());
		attributeSetEClass.getESuperTypes().add(this.getAstElement());
		g1 = createEGenericType(this.getCompoundElement());
		g2 = createEGenericType(this.getAttributeSet());
		g1.getETypeArguments().add(g2);
		compoundAttributeSetEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAttributeSet());
		compoundAttributeSetEClass.getEGenericSuperTypes().add(g1);
		conjunctionAttributeSetEClass.getESuperTypes().add(this.getCompoundAttributeSet());
		disjunctionAttributeSetEClass.getESuperTypes().add(this.getCompoundAttributeSet());
		attributeEClass.getESuperTypes().add(this.getAttributeSet());
		expressionValueEClass.getESuperTypes().add(this.getAttributeValue());
		numericValueEClass.getESuperTypes().add(this.getAttributeValue());
		stringValueEClass.getESuperTypes().add(this.getAttributeValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScript_Constraint(), this.getExpressionConstraint(), null, "constraint", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(astElementEClass, AstElement.class, "AstElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionConstraintEClass, ExpressionConstraint.class, "ExpressionConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parenthesizedExpressionConstraintEClass, ParenthesizedExpressionConstraint.class, "ParenthesizedExpressionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParenthesizedExpressionConstraint_Current(), this.getExpressionConstraint(), null, "current", null, 0, 1, ParenthesizedExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundElementEClass, CompoundElement.class, "CompoundElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompoundElement_Op(), this.getBinaryOperator(), "op", null, 0, 1, CompoundElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(compoundElementEClass_T);
		initEReference(getCompoundElement_Left(), g1, null, "left", null, 0, 1, CompoundElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(compoundElementEClass_T);
		initEReference(getCompoundElement_Right(), g1, null, "right", null, 0, 1, CompoundElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundExpressionConstraintEClass, CompoundExpressionConstraint.class, "CompoundExpressionConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conjunctionExpressionConstraintEClass, ConjunctionExpressionConstraint.class, "ConjunctionExpressionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disjunctionExpressionConstraintEClass, DisjunctionExpressionConstraint.class, "DisjunctionExpressionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exclusionExpressionConstraintEClass, ExclusionExpressionConstraint.class, "ExclusionExpressionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(refinedExpressionConstraintEClass, RefinedExpressionConstraint.class, "RefinedExpressionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefinedExpressionConstraint_Target(), this.getExpressionConstraint(), null, "target", null, 0, 1, RefinedExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefinedExpressionConstraint_Refinement(), this.getRefinement(), null, "refinement", null, 0, 1, RefinedExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleExpressionConstraintEClass, SimpleExpressionConstraint.class, "SimpleExpressionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleExpressionConstraint_Op(), this.getConstraintOperator(), "op", null, 0, 1, SimpleExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleExpressionConstraint_Concept(), this.getFocusConcept(), null, "concept", null, 0, 1, SimpleExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refinementEClass, Refinement.class, "Refinement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compoundRefinementEClass, CompoundRefinement.class, "CompoundRefinement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conjunctionRefinementSetEClass, ConjunctionRefinementSet.class, "ConjunctionRefinementSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disjunctionRefinementSetEClass, DisjunctionRefinementSet.class, "DisjunctionRefinementSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeGroupRefinementEClass, AttributeGroupRefinement.class, "AttributeGroupRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeGroupRefinement_AttributeGroup(), this.getAttributeGroup(), null, "attributeGroup", null, 0, 1, AttributeGroupRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeSetRefinementEClass, AttributeSetRefinement.class, "AttributeSetRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeSetRefinement_AttributeSet(), this.getAttributeSet(), null, "attributeSet", null, 0, 1, AttributeSetRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeSetEClass, AttributeSet.class, "AttributeSet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compoundAttributeSetEClass, CompoundAttributeSet.class, "CompoundAttributeSet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conjunctionAttributeSetEClass, ConjunctionAttributeSet.class, "ConjunctionAttributeSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disjunctionAttributeSetEClass, DisjunctionAttributeSet.class, "DisjunctionAttributeSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Reversed(), theEcorePackage.getEBoolean(), "reversed", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Wildcard(), theEcorePackage.getEBoolean(), "wildcard", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Op(), this.getAttributeOperator(), "op", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Cardinality(), this.getCardinality(), null, "cardinality", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_ConceptRef(), this.getConceptReference(), null, "conceptRef", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Value(), this.getAttributeValue(), null, "value", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeValueEClass, AttributeValue.class, "AttributeValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeValue_Op(), this.getComparisonOperator(), "op", null, 0, 1, AttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionValueEClass, ExpressionValue.class, "ExpressionValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionValue_Value(), this.getExpressionConstraint(), null, "value", null, 0, 1, ExpressionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericValueEClass, NumericValue.class, "NumericValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericValue_Value(), theEcorePackage.getEBigDecimal(), "value", null, 0, 1, NumericValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_Value(), theEcorePackage.getEString(), "value", null, 0, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptReferenceEClass, ConceptReference.class, "ConceptReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConceptReference_Id(), theEcorePackage.getEString(), "id", null, 0, 1, ConceptReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConceptReference_Term(), theEcorePackage.getEString(), "term", null, 0, 1, ConceptReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(focusConceptEClass, FocusConcept.class, "FocusConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFocusConcept_MemberOf(), theEcorePackage.getEBoolean(), "memberOf", null, 0, 1, FocusConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFocusConcept_Wildcard(), theEcorePackage.getEBoolean(), "wildcard", null, 0, 1, FocusConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFocusConcept_ConceptRef(), this.getConceptReference(), null, "conceptRef", null, 0, 1, FocusConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeGroupEClass, AttributeGroup.class, "AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeGroup_AttributeSet(), this.getAttributeSet(), null, "attributeSet", null, 0, 1, AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeGroup_Cardinality(), this.getCardinality(), null, "cardinality", null, 0, 1, AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalityEClass, Cardinality.class, "Cardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinality_From(), theEcorePackage.getEInt(), "from", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinality_To(), theEcorePackage.getEInt(), "to", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinality_Many(), theEcorePackage.getEBoolean(), "many", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(binaryOperatorEEnum, BinaryOperator.class, "BinaryOperator");
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.EXCLUSION);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.CONJUNCTION);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.DISJUNCTION);

		initEEnum(attributeOperatorEEnum, AttributeOperator.class, "AttributeOperator");
		addEEnumLiteral(attributeOperatorEEnum, AttributeOperator.SELF);
		addEEnumLiteral(attributeOperatorEEnum, AttributeOperator.DESCENDANT);
		addEEnumLiteral(attributeOperatorEEnum, AttributeOperator.DESCENDANT_OR_SELF);

		initEEnum(constraintOperatorEEnum, ConstraintOperator.class, "ConstraintOperator");
		addEEnumLiteral(constraintOperatorEEnum, ConstraintOperator.SELF);
		addEEnumLiteral(constraintOperatorEEnum, ConstraintOperator.DESCENDANT);
		addEEnumLiteral(constraintOperatorEEnum, ConstraintOperator.DESCENDANT_OR_SELF);
		addEEnumLiteral(constraintOperatorEEnum, ConstraintOperator.ANCESTOR);
		addEEnumLiteral(constraintOperatorEEnum, ConstraintOperator.ANCESTOR_OR_SELF);

		initEEnum(comparisonOperatorEEnum, ComparisonOperator.class, "ComparisonOperator");
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.EQUALS);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.NOT_EQUALS);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LESS_THAN);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LESS_THAN_EQUALS);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER_THAN);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER_THAN_EQUALS);

		// Create resource
		createResource(eNS_URI);
	}

} //EclPackageImpl

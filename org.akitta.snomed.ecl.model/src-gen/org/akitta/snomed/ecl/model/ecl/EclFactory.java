/**
 */
package org.akitta.snomed.ecl.model.ecl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.akitta.snomed.ecl.model.ecl.EclPackage
 * @generated
 */
public interface EclFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EclFactory eINSTANCE = org.akitta.snomed.ecl.model.ecl.impl.EclFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script</em>'.
	 * @generated
	 */
	Script createScript();

	/**
	 * Returns a new object of class '<em>Parenthesized Expression Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parenthesized Expression Constraint</em>'.
	 * @generated
	 */
	ParenthesizedExpressionConstraint createParenthesizedExpressionConstraint();

	/**
	 * Returns a new object of class '<em>Conjunction Expression Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjunction Expression Constraint</em>'.
	 * @generated
	 */
	ConjunctionExpressionConstraint createConjunctionExpressionConstraint();

	/**
	 * Returns a new object of class '<em>Disjunction Expression Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disjunction Expression Constraint</em>'.
	 * @generated
	 */
	DisjunctionExpressionConstraint createDisjunctionExpressionConstraint();

	/**
	 * Returns a new object of class '<em>Exclusion Expression Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusion Expression Constraint</em>'.
	 * @generated
	 */
	ExclusionExpressionConstraint createExclusionExpressionConstraint();

	/**
	 * Returns a new object of class '<em>Refined Expression Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refined Expression Constraint</em>'.
	 * @generated
	 */
	RefinedExpressionConstraint createRefinedExpressionConstraint();

	/**
	 * Returns a new object of class '<em>Simple Expression Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Expression Constraint</em>'.
	 * @generated
	 */
	SimpleExpressionConstraint createSimpleExpressionConstraint();

	/**
	 * Returns a new object of class '<em>Conjunction Refinement Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjunction Refinement Set</em>'.
	 * @generated
	 */
	ConjunctionRefinementSet createConjunctionRefinementSet();

	/**
	 * Returns a new object of class '<em>Disjunction Refinement Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disjunction Refinement Set</em>'.
	 * @generated
	 */
	DisjunctionRefinementSet createDisjunctionRefinementSet();

	/**
	 * Returns a new object of class '<em>Attribute Group Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Group Refinement</em>'.
	 * @generated
	 */
	AttributeGroupRefinement createAttributeGroupRefinement();

	/**
	 * Returns a new object of class '<em>Attribute Set Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Set Refinement</em>'.
	 * @generated
	 */
	AttributeSetRefinement createAttributeSetRefinement();

	/**
	 * Returns a new object of class '<em>Conjunction Attribute Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjunction Attribute Set</em>'.
	 * @generated
	 */
	ConjunctionAttributeSet createConjunctionAttributeSet();

	/**
	 * Returns a new object of class '<em>Disjunction Attribute Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disjunction Attribute Set</em>'.
	 * @generated
	 */
	DisjunctionAttributeSet createDisjunctionAttributeSet();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Expression Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Value</em>'.
	 * @generated
	 */
	ExpressionValue createExpressionValue();

	/**
	 * Returns a new object of class '<em>Numeric Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Value</em>'.
	 * @generated
	 */
	NumericValue createNumericValue();

	/**
	 * Returns a new object of class '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value</em>'.
	 * @generated
	 */
	StringValue createStringValue();

	/**
	 * Returns a new object of class '<em>Concept Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Reference</em>'.
	 * @generated
	 */
	ConceptReference createConceptReference();

	/**
	 * Returns a new object of class '<em>Focus Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Focus Concept</em>'.
	 * @generated
	 */
	FocusConcept createFocusConcept();

	/**
	 * Returns a new object of class '<em>Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Group</em>'.
	 * @generated
	 */
	AttributeGroup createAttributeGroup();

	/**
	 * Returns a new object of class '<em>Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardinality</em>'.
	 * @generated
	 */
	Cardinality createCardinality();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EclPackage getEclPackage();

} //EclFactory

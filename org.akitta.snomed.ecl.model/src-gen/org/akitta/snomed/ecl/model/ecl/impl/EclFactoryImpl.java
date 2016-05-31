/**
 */
package org.akitta.snomed.ecl.model.ecl.impl;

import org.akitta.snomed.ecl.model.ecl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EclFactoryImpl extends EFactoryImpl implements EclFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EclFactory init() {
		try {
			EclFactory theEclFactory = (EclFactory)EPackage.Registry.INSTANCE.getEFactory(EclPackage.eNS_URI);
			if (theEclFactory != null) {
				return theEclFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EclFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EclPackage.SCRIPT: return createScript();
			case EclPackage.PARENTHESIZED_EXPRESSION_CONSTRAINT: return createParenthesizedExpressionConstraint();
			case EclPackage.CONJUNCTION_EXPRESSION_CONSTRAINT: return createConjunctionExpressionConstraint();
			case EclPackage.DISJUNCTION_EXPRESSION_CONSTRAINT: return createDisjunctionExpressionConstraint();
			case EclPackage.EXCLUSION_EXPRESSION_CONSTRAINT: return createExclusionExpressionConstraint();
			case EclPackage.REFINED_EXPRESSION_CONSTRAINT: return createRefinedExpressionConstraint();
			case EclPackage.SIMPLE_EXPRESSION_CONSTRAINT: return createSimpleExpressionConstraint();
			case EclPackage.CONJUNCTION_REFINEMENT_SET: return createConjunctionRefinementSet();
			case EclPackage.DISJUNCTION_REFINEMENT_SET: return createDisjunctionRefinementSet();
			case EclPackage.ATTRIBUTE_GROUP_REFINEMENT: return createAttributeGroupRefinement();
			case EclPackage.ATTRIBUTE_SET_REFINEMENT: return createAttributeSetRefinement();
			case EclPackage.CONJUNCTION_ATTRIBUTE_SET: return createConjunctionAttributeSet();
			case EclPackage.DISJUNCTION_ATTRIBUTE_SET: return createDisjunctionAttributeSet();
			case EclPackage.ATTRIBUTE: return createAttribute();
			case EclPackage.EXPRESSION_VALUE: return createExpressionValue();
			case EclPackage.NUMERIC_VALUE: return createNumericValue();
			case EclPackage.STRING_VALUE: return createStringValue();
			case EclPackage.CONCEPT_REFERENCE: return createConceptReference();
			case EclPackage.FOCUS_CONCEPT: return createFocusConcept();
			case EclPackage.ATTRIBUTE_GROUP: return createAttributeGroup();
			case EclPackage.CARDINALITY: return createCardinality();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EclPackage.BINARY_OPERATOR:
				return createBinaryOperatorFromString(eDataType, initialValue);
			case EclPackage.ATTRIBUTE_OPERATOR:
				return createAttributeOperatorFromString(eDataType, initialValue);
			case EclPackage.CONSTRAINT_OPERATOR:
				return createConstraintOperatorFromString(eDataType, initialValue);
			case EclPackage.COMPARISON_OPERATOR:
				return createComparisonOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EclPackage.BINARY_OPERATOR:
				return convertBinaryOperatorToString(eDataType, instanceValue);
			case EclPackage.ATTRIBUTE_OPERATOR:
				return convertAttributeOperatorToString(eDataType, instanceValue);
			case EclPackage.CONSTRAINT_OPERATOR:
				return convertConstraintOperatorToString(eDataType, instanceValue);
			case EclPackage.COMPARISON_OPERATOR:
				return convertComparisonOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script createScript() {
		ScriptImpl script = new ScriptImpl();
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParenthesizedExpressionConstraint createParenthesizedExpressionConstraint() {
		ParenthesizedExpressionConstraintImpl parenthesizedExpressionConstraint = new ParenthesizedExpressionConstraintImpl();
		return parenthesizedExpressionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConjunctionExpressionConstraint createConjunctionExpressionConstraint() {
		ConjunctionExpressionConstraintImpl conjunctionExpressionConstraint = new ConjunctionExpressionConstraintImpl();
		return conjunctionExpressionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjunctionExpressionConstraint createDisjunctionExpressionConstraint() {
		DisjunctionExpressionConstraintImpl disjunctionExpressionConstraint = new DisjunctionExpressionConstraintImpl();
		return disjunctionExpressionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusionExpressionConstraint createExclusionExpressionConstraint() {
		ExclusionExpressionConstraintImpl exclusionExpressionConstraint = new ExclusionExpressionConstraintImpl();
		return exclusionExpressionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinedExpressionConstraint createRefinedExpressionConstraint() {
		RefinedExpressionConstraintImpl refinedExpressionConstraint = new RefinedExpressionConstraintImpl();
		return refinedExpressionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleExpressionConstraint createSimpleExpressionConstraint() {
		SimpleExpressionConstraintImpl simpleExpressionConstraint = new SimpleExpressionConstraintImpl();
		return simpleExpressionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConjunctionRefinementSet createConjunctionRefinementSet() {
		ConjunctionRefinementSetImpl conjunctionRefinementSet = new ConjunctionRefinementSetImpl();
		return conjunctionRefinementSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjunctionRefinementSet createDisjunctionRefinementSet() {
		DisjunctionRefinementSetImpl disjunctionRefinementSet = new DisjunctionRefinementSetImpl();
		return disjunctionRefinementSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeGroupRefinement createAttributeGroupRefinement() {
		AttributeGroupRefinementImpl attributeGroupRefinement = new AttributeGroupRefinementImpl();
		return attributeGroupRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeSetRefinement createAttributeSetRefinement() {
		AttributeSetRefinementImpl attributeSetRefinement = new AttributeSetRefinementImpl();
		return attributeSetRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConjunctionAttributeSet createConjunctionAttributeSet() {
		ConjunctionAttributeSetImpl conjunctionAttributeSet = new ConjunctionAttributeSetImpl();
		return conjunctionAttributeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjunctionAttributeSet createDisjunctionAttributeSet() {
		DisjunctionAttributeSetImpl disjunctionAttributeSet = new DisjunctionAttributeSetImpl();
		return disjunctionAttributeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionValue createExpressionValue() {
		ExpressionValueImpl expressionValue = new ExpressionValueImpl();
		return expressionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericValue createNumericValue() {
		NumericValueImpl numericValue = new NumericValueImpl();
		return numericValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptReference createConceptReference() {
		ConceptReferenceImpl conceptReference = new ConceptReferenceImpl();
		return conceptReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FocusConcept createFocusConcept() {
		FocusConceptImpl focusConcept = new FocusConceptImpl();
		return focusConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeGroup createAttributeGroup() {
		AttributeGroupImpl attributeGroup = new AttributeGroupImpl();
		return attributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality createCardinality() {
		CardinalityImpl cardinality = new CardinalityImpl();
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator createBinaryOperatorFromString(EDataType eDataType, String initialValue) {
		BinaryOperator result = BinaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOperator createAttributeOperatorFromString(EDataType eDataType, String initialValue) {
		AttributeOperator result = AttributeOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintOperator createConstraintOperatorFromString(EDataType eDataType, String initialValue) {
		ConstraintOperator result = ConstraintOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperator createComparisonOperatorFromString(EDataType eDataType, String initialValue) {
		ComparisonOperator result = ComparisonOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclPackage getEclPackage() {
		return (EclPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EclPackage getPackage() {
		return EclPackage.eINSTANCE;
	}

} //EclFactoryImpl

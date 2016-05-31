/**
 */
package org.akitta.snomed.ecl.model.ecl.util;

import org.akitta.snomed.ecl.model.ecl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.akitta.snomed.ecl.model.ecl.EclPackage
 * @generated
 */
public class EclAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EclPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EclPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EclSwitch<Adapter> modelSwitch =
		new EclSwitch<Adapter>() {
			@Override
			public Adapter caseScript(Script object) {
				return createScriptAdapter();
			}
			@Override
			public Adapter caseAstElement(AstElement object) {
				return createAstElementAdapter();
			}
			@Override
			public Adapter caseExpressionConstraint(ExpressionConstraint object) {
				return createExpressionConstraintAdapter();
			}
			@Override
			public Adapter caseParenthesizedExpressionConstraint(ParenthesizedExpressionConstraint object) {
				return createParenthesizedExpressionConstraintAdapter();
			}
			@Override
			public <T extends AstElement> Adapter caseCompoundElement(CompoundElement<T> object) {
				return createCompoundElementAdapter();
			}
			@Override
			public Adapter caseCompoundExpressionConstraint(CompoundExpressionConstraint object) {
				return createCompoundExpressionConstraintAdapter();
			}
			@Override
			public Adapter caseConjunctionExpressionConstraint(ConjunctionExpressionConstraint object) {
				return createConjunctionExpressionConstraintAdapter();
			}
			@Override
			public Adapter caseDisjunctionExpressionConstraint(DisjunctionExpressionConstraint object) {
				return createDisjunctionExpressionConstraintAdapter();
			}
			@Override
			public Adapter caseExclusionExpressionConstraint(ExclusionExpressionConstraint object) {
				return createExclusionExpressionConstraintAdapter();
			}
			@Override
			public Adapter caseRefinedExpressionConstraint(RefinedExpressionConstraint object) {
				return createRefinedExpressionConstraintAdapter();
			}
			@Override
			public Adapter caseSimpleExpressionConstraint(SimpleExpressionConstraint object) {
				return createSimpleExpressionConstraintAdapter();
			}
			@Override
			public Adapter caseRefinement(Refinement object) {
				return createRefinementAdapter();
			}
			@Override
			public Adapter caseCompoundRefinement(CompoundRefinement object) {
				return createCompoundRefinementAdapter();
			}
			@Override
			public Adapter caseConjunctionRefinementSet(ConjunctionRefinementSet object) {
				return createConjunctionRefinementSetAdapter();
			}
			@Override
			public Adapter caseDisjunctionRefinementSet(DisjunctionRefinementSet object) {
				return createDisjunctionRefinementSetAdapter();
			}
			@Override
			public Adapter caseAttributeGroupRefinement(AttributeGroupRefinement object) {
				return createAttributeGroupRefinementAdapter();
			}
			@Override
			public Adapter caseAttributeSetRefinement(AttributeSetRefinement object) {
				return createAttributeSetRefinementAdapter();
			}
			@Override
			public Adapter caseAttributeSet(AttributeSet object) {
				return createAttributeSetAdapter();
			}
			@Override
			public Adapter caseCompoundAttributeSet(CompoundAttributeSet object) {
				return createCompoundAttributeSetAdapter();
			}
			@Override
			public Adapter caseConjunctionAttributeSet(ConjunctionAttributeSet object) {
				return createConjunctionAttributeSetAdapter();
			}
			@Override
			public Adapter caseDisjunctionAttributeSet(DisjunctionAttributeSet object) {
				return createDisjunctionAttributeSetAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseAttributeValue(AttributeValue object) {
				return createAttributeValueAdapter();
			}
			@Override
			public Adapter caseExpressionValue(ExpressionValue object) {
				return createExpressionValueAdapter();
			}
			@Override
			public Adapter caseNumericValue(NumericValue object) {
				return createNumericValueAdapter();
			}
			@Override
			public Adapter caseStringValue(StringValue object) {
				return createStringValueAdapter();
			}
			@Override
			public Adapter caseConceptReference(ConceptReference object) {
				return createConceptReferenceAdapter();
			}
			@Override
			public Adapter caseFocusConcept(FocusConcept object) {
				return createFocusConceptAdapter();
			}
			@Override
			public Adapter caseAttributeGroup(AttributeGroup object) {
				return createAttributeGroupAdapter();
			}
			@Override
			public Adapter caseCardinality(Cardinality object) {
				return createCardinalityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.Script
	 * @generated
	 */
	public Adapter createScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.AstElement <em>Ast Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.AstElement
	 * @generated
	 */
	public Adapter createAstElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.ExpressionConstraint <em>Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.ExpressionConstraint
	 * @generated
	 */
	public Adapter createExpressionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.ParenthesizedExpressionConstraint <em>Parenthesized Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.ParenthesizedExpressionConstraint
	 * @generated
	 */
	public Adapter createParenthesizedExpressionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.CompoundElement <em>Compound Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.CompoundElement
	 * @generated
	 */
	public Adapter createCompoundElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.CompoundExpressionConstraint <em>Compound Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.CompoundExpressionConstraint
	 * @generated
	 */
	public Adapter createCompoundExpressionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.ConjunctionExpressionConstraint <em>Conjunction Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.ConjunctionExpressionConstraint
	 * @generated
	 */
	public Adapter createConjunctionExpressionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.DisjunctionExpressionConstraint <em>Disjunction Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.DisjunctionExpressionConstraint
	 * @generated
	 */
	public Adapter createDisjunctionExpressionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.ExclusionExpressionConstraint <em>Exclusion Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.ExclusionExpressionConstraint
	 * @generated
	 */
	public Adapter createExclusionExpressionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.RefinedExpressionConstraint <em>Refined Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.RefinedExpressionConstraint
	 * @generated
	 */
	public Adapter createRefinedExpressionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.SimpleExpressionConstraint <em>Simple Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.SimpleExpressionConstraint
	 * @generated
	 */
	public Adapter createSimpleExpressionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.Refinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.Refinement
	 * @generated
	 */
	public Adapter createRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.CompoundRefinement <em>Compound Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.CompoundRefinement
	 * @generated
	 */
	public Adapter createCompoundRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.ConjunctionRefinementSet <em>Conjunction Refinement Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.ConjunctionRefinementSet
	 * @generated
	 */
	public Adapter createConjunctionRefinementSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.DisjunctionRefinementSet <em>Disjunction Refinement Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.DisjunctionRefinementSet
	 * @generated
	 */
	public Adapter createDisjunctionRefinementSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.AttributeGroupRefinement <em>Attribute Group Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.AttributeGroupRefinement
	 * @generated
	 */
	public Adapter createAttributeGroupRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.AttributeSetRefinement <em>Attribute Set Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.AttributeSetRefinement
	 * @generated
	 */
	public Adapter createAttributeSetRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.AttributeSet <em>Attribute Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.AttributeSet
	 * @generated
	 */
	public Adapter createAttributeSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.CompoundAttributeSet <em>Compound Attribute Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.CompoundAttributeSet
	 * @generated
	 */
	public Adapter createCompoundAttributeSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.ConjunctionAttributeSet <em>Conjunction Attribute Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.ConjunctionAttributeSet
	 * @generated
	 */
	public Adapter createConjunctionAttributeSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.DisjunctionAttributeSet <em>Disjunction Attribute Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.DisjunctionAttributeSet
	 * @generated
	 */
	public Adapter createDisjunctionAttributeSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.AttributeValue
	 * @generated
	 */
	public Adapter createAttributeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.ExpressionValue <em>Expression Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.ExpressionValue
	 * @generated
	 */
	public Adapter createExpressionValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.NumericValue <em>Numeric Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.NumericValue
	 * @generated
	 */
	public Adapter createNumericValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.StringValue
	 * @generated
	 */
	public Adapter createStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.ConceptReference <em>Concept Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.ConceptReference
	 * @generated
	 */
	public Adapter createConceptReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.FocusConcept <em>Focus Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.FocusConcept
	 * @generated
	 */
	public Adapter createFocusConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.AttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.AttributeGroup
	 * @generated
	 */
	public Adapter createAttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.akitta.snomed.ecl.model.ecl.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.akitta.snomed.ecl.model.ecl.Cardinality
	 * @generated
	 */
	public Adapter createCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EclAdapterFactory

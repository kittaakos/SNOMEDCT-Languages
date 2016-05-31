/**
 */
package org.akitta.snomed.ecl.model.ecl.util;

import org.akitta.snomed.ecl.model.ecl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.akitta.snomed.ecl.model.ecl.EclPackage
 * @generated
 */
public class EclSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EclPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclSwitch() {
		if (modelPackage == null) {
			modelPackage = EclPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EclPackage.SCRIPT: {
				Script script = (Script)theEObject;
				T1 result = caseScript(script);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.AST_ELEMENT: {
				AstElement astElement = (AstElement)theEObject;
				T1 result = caseAstElement(astElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.EXPRESSION_CONSTRAINT: {
				ExpressionConstraint expressionConstraint = (ExpressionConstraint)theEObject;
				T1 result = caseExpressionConstraint(expressionConstraint);
				if (result == null) result = caseAstElement(expressionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.PARENTHESIZED_EXPRESSION_CONSTRAINT: {
				ParenthesizedExpressionConstraint parenthesizedExpressionConstraint = (ParenthesizedExpressionConstraint)theEObject;
				T1 result = caseParenthesizedExpressionConstraint(parenthesizedExpressionConstraint);
				if (result == null) result = caseExpressionConstraint(parenthesizedExpressionConstraint);
				if (result == null) result = caseAstElement(parenthesizedExpressionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.COMPOUND_ELEMENT: {
				CompoundElement<?> compoundElement = (CompoundElement<?>)theEObject;
				T1 result = caseCompoundElement(compoundElement);
				if (result == null) result = caseAstElement(compoundElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.COMPOUND_EXPRESSION_CONSTRAINT: {
				CompoundExpressionConstraint compoundExpressionConstraint = (CompoundExpressionConstraint)theEObject;
				T1 result = caseCompoundExpressionConstraint(compoundExpressionConstraint);
				if (result == null) result = caseCompoundElement(compoundExpressionConstraint);
				if (result == null) result = caseExpressionConstraint(compoundExpressionConstraint);
				if (result == null) result = caseAstElement(compoundExpressionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.CONJUNCTION_EXPRESSION_CONSTRAINT: {
				ConjunctionExpressionConstraint conjunctionExpressionConstraint = (ConjunctionExpressionConstraint)theEObject;
				T1 result = caseConjunctionExpressionConstraint(conjunctionExpressionConstraint);
				if (result == null) result = caseCompoundExpressionConstraint(conjunctionExpressionConstraint);
				if (result == null) result = caseCompoundElement(conjunctionExpressionConstraint);
				if (result == null) result = caseExpressionConstraint(conjunctionExpressionConstraint);
				if (result == null) result = caseAstElement(conjunctionExpressionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.DISJUNCTION_EXPRESSION_CONSTRAINT: {
				DisjunctionExpressionConstraint disjunctionExpressionConstraint = (DisjunctionExpressionConstraint)theEObject;
				T1 result = caseDisjunctionExpressionConstraint(disjunctionExpressionConstraint);
				if (result == null) result = caseCompoundExpressionConstraint(disjunctionExpressionConstraint);
				if (result == null) result = caseCompoundElement(disjunctionExpressionConstraint);
				if (result == null) result = caseExpressionConstraint(disjunctionExpressionConstraint);
				if (result == null) result = caseAstElement(disjunctionExpressionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.EXCLUSION_EXPRESSION_CONSTRAINT: {
				ExclusionExpressionConstraint exclusionExpressionConstraint = (ExclusionExpressionConstraint)theEObject;
				T1 result = caseExclusionExpressionConstraint(exclusionExpressionConstraint);
				if (result == null) result = caseCompoundExpressionConstraint(exclusionExpressionConstraint);
				if (result == null) result = caseCompoundElement(exclusionExpressionConstraint);
				if (result == null) result = caseExpressionConstraint(exclusionExpressionConstraint);
				if (result == null) result = caseAstElement(exclusionExpressionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.REFINED_EXPRESSION_CONSTRAINT: {
				RefinedExpressionConstraint refinedExpressionConstraint = (RefinedExpressionConstraint)theEObject;
				T1 result = caseRefinedExpressionConstraint(refinedExpressionConstraint);
				if (result == null) result = caseExpressionConstraint(refinedExpressionConstraint);
				if (result == null) result = caseAstElement(refinedExpressionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.SIMPLE_EXPRESSION_CONSTRAINT: {
				SimpleExpressionConstraint simpleExpressionConstraint = (SimpleExpressionConstraint)theEObject;
				T1 result = caseSimpleExpressionConstraint(simpleExpressionConstraint);
				if (result == null) result = caseExpressionConstraint(simpleExpressionConstraint);
				if (result == null) result = caseAstElement(simpleExpressionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.REFINEMENT: {
				Refinement refinement = (Refinement)theEObject;
				T1 result = caseRefinement(refinement);
				if (result == null) result = caseAstElement(refinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.COMPOUND_REFINEMENT: {
				CompoundRefinement compoundRefinement = (CompoundRefinement)theEObject;
				T1 result = caseCompoundRefinement(compoundRefinement);
				if (result == null) result = caseCompoundElement(compoundRefinement);
				if (result == null) result = caseRefinement(compoundRefinement);
				if (result == null) result = caseAstElement(compoundRefinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.CONJUNCTION_REFINEMENT_SET: {
				ConjunctionRefinementSet conjunctionRefinementSet = (ConjunctionRefinementSet)theEObject;
				T1 result = caseConjunctionRefinementSet(conjunctionRefinementSet);
				if (result == null) result = caseCompoundRefinement(conjunctionRefinementSet);
				if (result == null) result = caseCompoundElement(conjunctionRefinementSet);
				if (result == null) result = caseRefinement(conjunctionRefinementSet);
				if (result == null) result = caseAstElement(conjunctionRefinementSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.DISJUNCTION_REFINEMENT_SET: {
				DisjunctionRefinementSet disjunctionRefinementSet = (DisjunctionRefinementSet)theEObject;
				T1 result = caseDisjunctionRefinementSet(disjunctionRefinementSet);
				if (result == null) result = caseCompoundRefinement(disjunctionRefinementSet);
				if (result == null) result = caseCompoundElement(disjunctionRefinementSet);
				if (result == null) result = caseRefinement(disjunctionRefinementSet);
				if (result == null) result = caseAstElement(disjunctionRefinementSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.ATTRIBUTE_GROUP_REFINEMENT: {
				AttributeGroupRefinement attributeGroupRefinement = (AttributeGroupRefinement)theEObject;
				T1 result = caseAttributeGroupRefinement(attributeGroupRefinement);
				if (result == null) result = caseRefinement(attributeGroupRefinement);
				if (result == null) result = caseAstElement(attributeGroupRefinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.ATTRIBUTE_SET_REFINEMENT: {
				AttributeSetRefinement attributeSetRefinement = (AttributeSetRefinement)theEObject;
				T1 result = caseAttributeSetRefinement(attributeSetRefinement);
				if (result == null) result = caseRefinement(attributeSetRefinement);
				if (result == null) result = caseAstElement(attributeSetRefinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.ATTRIBUTE_SET: {
				AttributeSet attributeSet = (AttributeSet)theEObject;
				T1 result = caseAttributeSet(attributeSet);
				if (result == null) result = caseAstElement(attributeSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.COMPOUND_ATTRIBUTE_SET: {
				CompoundAttributeSet compoundAttributeSet = (CompoundAttributeSet)theEObject;
				T1 result = caseCompoundAttributeSet(compoundAttributeSet);
				if (result == null) result = caseCompoundElement(compoundAttributeSet);
				if (result == null) result = caseAttributeSet(compoundAttributeSet);
				if (result == null) result = caseAstElement(compoundAttributeSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.CONJUNCTION_ATTRIBUTE_SET: {
				ConjunctionAttributeSet conjunctionAttributeSet = (ConjunctionAttributeSet)theEObject;
				T1 result = caseConjunctionAttributeSet(conjunctionAttributeSet);
				if (result == null) result = caseCompoundAttributeSet(conjunctionAttributeSet);
				if (result == null) result = caseCompoundElement(conjunctionAttributeSet);
				if (result == null) result = caseAttributeSet(conjunctionAttributeSet);
				if (result == null) result = caseAstElement(conjunctionAttributeSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.DISJUNCTION_ATTRIBUTE_SET: {
				DisjunctionAttributeSet disjunctionAttributeSet = (DisjunctionAttributeSet)theEObject;
				T1 result = caseDisjunctionAttributeSet(disjunctionAttributeSet);
				if (result == null) result = caseCompoundAttributeSet(disjunctionAttributeSet);
				if (result == null) result = caseCompoundElement(disjunctionAttributeSet);
				if (result == null) result = caseAttributeSet(disjunctionAttributeSet);
				if (result == null) result = caseAstElement(disjunctionAttributeSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T1 result = caseAttribute(attribute);
				if (result == null) result = caseAttributeSet(attribute);
				if (result == null) result = caseAstElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.ATTRIBUTE_VALUE: {
				AttributeValue attributeValue = (AttributeValue)theEObject;
				T1 result = caseAttributeValue(attributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.EXPRESSION_VALUE: {
				ExpressionValue expressionValue = (ExpressionValue)theEObject;
				T1 result = caseExpressionValue(expressionValue);
				if (result == null) result = caseAttributeValue(expressionValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.NUMERIC_VALUE: {
				NumericValue numericValue = (NumericValue)theEObject;
				T1 result = caseNumericValue(numericValue);
				if (result == null) result = caseAttributeValue(numericValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.STRING_VALUE: {
				StringValue stringValue = (StringValue)theEObject;
				T1 result = caseStringValue(stringValue);
				if (result == null) result = caseAttributeValue(stringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.CONCEPT_REFERENCE: {
				ConceptReference conceptReference = (ConceptReference)theEObject;
				T1 result = caseConceptReference(conceptReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.FOCUS_CONCEPT: {
				FocusConcept focusConcept = (FocusConcept)theEObject;
				T1 result = caseFocusConcept(focusConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.ATTRIBUTE_GROUP: {
				AttributeGroup attributeGroup = (AttributeGroup)theEObject;
				T1 result = caseAttributeGroup(attributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclPackage.CARDINALITY: {
				Cardinality cardinality = (Cardinality)theEObject;
				T1 result = caseCardinality(cardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseScript(Script object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ast Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ast Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAstElement(AstElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExpressionConstraint(ExpressionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parenthesized Expression Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parenthesized Expression Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParenthesizedExpressionConstraint(ParenthesizedExpressionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends AstElement> T1 caseCompoundElement(CompoundElement<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Expression Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Expression Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCompoundExpressionConstraint(CompoundExpressionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conjunction Expression Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conjunction Expression Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConjunctionExpressionConstraint(ConjunctionExpressionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjunction Expression Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjunction Expression Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDisjunctionExpressionConstraint(DisjunctionExpressionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusion Expression Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusion Expression Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExclusionExpressionConstraint(ExclusionExpressionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refined Expression Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refined Expression Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRefinedExpressionConstraint(RefinedExpressionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Expression Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Expression Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSimpleExpressionConstraint(SimpleExpressionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRefinement(Refinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Refinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCompoundRefinement(CompoundRefinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conjunction Refinement Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conjunction Refinement Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConjunctionRefinementSet(ConjunctionRefinementSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjunction Refinement Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjunction Refinement Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDisjunctionRefinementSet(DisjunctionRefinementSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Group Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Group Refinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAttributeGroupRefinement(AttributeGroupRefinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Set Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Set Refinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAttributeSetRefinement(AttributeSetRefinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAttributeSet(AttributeSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Attribute Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Attribute Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCompoundAttributeSet(CompoundAttributeSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conjunction Attribute Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conjunction Attribute Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConjunctionAttributeSet(ConjunctionAttributeSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjunction Attribute Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjunction Attribute Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDisjunctionAttributeSet(DisjunctionAttributeSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAttributeValue(AttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExpressionValue(ExpressionValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNumericValue(NumericValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringValue(StringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConceptReference(ConceptReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Focus Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Focus Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFocusConcept(FocusConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAttributeGroup(AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCardinality(Cardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //EclSwitch

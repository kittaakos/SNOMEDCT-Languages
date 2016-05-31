/**
 */
package org.akitta.snomed.ecl.model.ecl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refined Expression Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Represents a refined expression constraint. Consists of a simple expression constraint,
 * followed by a {@link Refinement refinement}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.RefinedExpressionConstraint#getTarget <em>Target</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.RefinedExpressionConstraint#getRefinement <em>Refinement</em>}</li>
 * </ul>
 *
 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getRefinedExpressionConstraint()
 * @model
 * @generated
 */
public interface RefinedExpressionConstraint extends ExpressionConstraint {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The expression constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(ExpressionConstraint)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getRefinedExpressionConstraint_Target()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionConstraint getTarget();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.RefinedExpressionConstraint#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ExpressionConstraint value);

	/**
	 * Returns the value of the '<em><b>Refinement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The refinement following the expression constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refinement</em>' containment reference.
	 * @see #setRefinement(Refinement)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getRefinedExpressionConstraint_Refinement()
	 * @model containment="true"
	 * @generated
	 */
	Refinement getRefinement();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.RefinedExpressionConstraint#getRefinement <em>Refinement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refinement</em>' containment reference.
	 * @see #getRefinement()
	 * @generated
	 */
	void setRefinement(Refinement value);

} // RefinedExpressionConstraint

/**
 */
package org.akitta.snomed.ecl.model.ecl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parenthesized Expression Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Represents a parenthesized expression constraint. <br>
 * This type is used to group expression constraints and clearly disambiguate the order
 * in which the binary operators are applied.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.ParenthesizedExpressionConstraint#getCurrent <em>Current</em>}</li>
 * </ul>
 *
 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getParenthesizedExpressionConstraint()
 * @model
 * @generated
 */
public interface ParenthesizedExpressionConstraint extends ExpressionConstraint {
	/**
	 * Returns the value of the '<em><b>Current</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The wrapped expression constraint element that is grouped by the parenthesis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current</em>' containment reference.
	 * @see #setCurrent(ExpressionConstraint)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getParenthesizedExpressionConstraint_Current()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionConstraint getCurrent();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.ParenthesizedExpressionConstraint#getCurrent <em>Current</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' containment reference.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(ExpressionConstraint value);

} // ParenthesizedExpressionConstraint

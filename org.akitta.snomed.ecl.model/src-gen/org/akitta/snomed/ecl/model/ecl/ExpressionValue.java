/**
 */
package org.akitta.snomed.ecl.model.ecl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Type representing an expression attribute value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.ExpressionValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getExpressionValue()
 * @model
 * @generated
 */
public interface ExpressionValue extends AttributeValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The wrapped expression constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ExpressionConstraint)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getExpressionValue_Value()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionConstraint getValue();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.ExpressionValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ExpressionConstraint value);

} // ExpressionValue

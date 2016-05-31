/**
 */
package org.akitta.snomed.ecl.model.ecl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Expression Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A simple expression constraint wrapping exactly one focus concept, preceded by a
 * constraint  operator. The constraint operator could be referencing to self, in such
 * cases the operator itself is missing from the grammar.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.SimpleExpressionConstraint#getOp <em>Op</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.SimpleExpressionConstraint#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getSimpleExpressionConstraint()
 * @model
 * @generated
 */
public interface SimpleExpressionConstraint extends ExpressionConstraint {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link org.akitta.snomed.ecl.model.ecl.ConstraintOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The constraint operator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see org.akitta.snomed.ecl.model.ecl.ConstraintOperator
	 * @see #setOp(ConstraintOperator)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getSimpleExpressionConstraint_Op()
	 * @model unique="false"
	 * @generated
	 */
	ConstraintOperator getOp();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.SimpleExpressionConstraint#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see org.akitta.snomed.ecl.model.ecl.ConstraintOperator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ConstraintOperator value);

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The focus concept of the simple expression constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference.
	 * @see #setConcept(FocusConcept)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getSimpleExpressionConstraint_Concept()
	 * @model containment="true"
	 * @generated
	 */
	FocusConcept getConcept();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.SimpleExpressionConstraint#getConcept <em>Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' containment reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(FocusConcept value);

} // SimpleExpressionConstraint

/**
 */
package org.akitta.snomed.ecl.model.ecl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Logical representation of a compound element. Compound elements consists of
 * two arbitrary {@link AstElement AST element}s.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.CompoundElement#getOp <em>Op</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.CompoundElement#getLeft <em>Left</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.CompoundElement#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getCompoundElement()
 * @model abstract="true"
 * @generated
 */
public interface CompoundElement<T extends AstElement> extends AstElement {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link org.akitta.snomed.ecl.model.ecl.BinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The binary operator between the compound elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see org.akitta.snomed.ecl.model.ecl.BinaryOperator
	 * @see #setOp(BinaryOperator)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getCompoundElement_Op()
	 * @model unique="false"
	 * @generated
	 */
	BinaryOperator getOp();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.CompoundElement#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see org.akitta.snomed.ecl.model.ecl.BinaryOperator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(BinaryOperator value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The left AST element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(AstElement)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getCompoundElement_Left()
	 * @model containment="true"
	 * @generated
	 */
	T getLeft();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.CompoundElement#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(T value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The right hand side element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(AstElement)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getCompoundElement_Right()
	 * @model containment="true"
	 * @generated
	 */
	T getRight();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.CompoundElement#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(T value);

} // CompoundElement

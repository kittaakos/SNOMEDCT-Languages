/**
 */
package org.akitta.snomed.ecl.model.ecl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Set Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Refinement wrapping an attribute set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.AttributeSetRefinement#getAttributeSet <em>Attribute Set</em>}</li>
 * </ul>
 *
 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getAttributeSetRefinement()
 * @model
 * @generated
 */
public interface AttributeSetRefinement extends Refinement {
	/**
	 * Returns the value of the '<em><b>Attribute Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The wrapped attribute set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Set</em>' containment reference.
	 * @see #setAttributeSet(AttributeSet)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getAttributeSetRefinement_AttributeSet()
	 * @model containment="true"
	 * @generated
	 */
	AttributeSet getAttributeSet();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.AttributeSetRefinement#getAttributeSet <em>Attribute Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Set</em>' containment reference.
	 * @see #getAttributeSet()
	 * @generated
	 */
	void setAttributeSet(AttributeSet value);

} // AttributeSetRefinement

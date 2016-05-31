/**
 */
package org.akitta.snomed.ecl.model.ecl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Group Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Refinement wrapping and attribute group.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.AttributeGroupRefinement#getAttributeGroup <em>Attribute Group</em>}</li>
 * </ul>
 *
 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getAttributeGroupRefinement()
 * @model
 * @generated
 */
public interface AttributeGroupRefinement extends Refinement {
	/**
	 * Returns the value of the '<em><b>Attribute Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The wrapped attribute group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Group</em>' containment reference.
	 * @see #setAttributeGroup(AttributeGroup)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getAttributeGroupRefinement_AttributeGroup()
	 * @model containment="true"
	 * @generated
	 */
	AttributeGroup getAttributeGroup();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.AttributeGroupRefinement#getAttributeGroup <em>Attribute Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Group</em>' containment reference.
	 * @see #getAttributeGroup()
	 * @generated
	 */
	void setAttributeGroup(AttributeGroup value);

} // AttributeGroupRefinement

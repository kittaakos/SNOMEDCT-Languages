/**
 */
package org.akitta.snomed.ecl.model.ecl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Represents an attribute group by wrapping an attribute set and an optional cardinality.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.AttributeGroup#getAttributeSet <em>Attribute Set</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.AttributeGroup#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getAttributeGroup()
 * @model
 * @generated
 */
public interface AttributeGroup extends EObject {
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
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getAttributeGroup_AttributeSet()
	 * @model containment="true"
	 * @generated
	 */
	AttributeSet getAttributeSet();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.AttributeGroup#getAttributeSet <em>Attribute Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Set</em>' containment reference.
	 * @see #getAttributeSet()
	 * @generated
	 */
	void setAttributeSet(AttributeSet value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The optional cardinality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getAttributeGroup_Cardinality()
	 * @model containment="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.AttributeGroup#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

} // AttributeGroup

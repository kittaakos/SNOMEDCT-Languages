/**
 */
package org.akitta.snomed.ecl.model.ecl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Base representation of the attribute value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.AttributeValue#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getAttributeValue()
 * @model abstract="true"
 * @generated
 */
public interface AttributeValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link org.akitta.snomed.ecl.model.ecl.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The comparison operator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see org.akitta.snomed.ecl.model.ecl.ComparisonOperator
	 * @see #setOp(ComparisonOperator)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getAttributeValue_Op()
	 * @model unique="false"
	 * @generated
	 */
	ComparisonOperator getOp();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.AttributeValue#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see org.akitta.snomed.ecl.model.ecl.ComparisonOperator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ComparisonOperator value);

} // AttributeValue

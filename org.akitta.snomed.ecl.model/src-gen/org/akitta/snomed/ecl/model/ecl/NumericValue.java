/**
 */
package org.akitta.snomed.ecl.model.ecl;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Representation of a numeric value. Could be decimal or integer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.NumericValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getNumericValue()
 * @model
 * @generated
 */
public interface NumericValue extends AttributeValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The wrapped numeric value. Could be integer or decimal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getNumericValue_Value()
	 * @model unique="false"
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.NumericValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

} // NumericValue

/**
 */
package org.akitta.snomed.ecl.model.ecl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Simple type for representing a cardinality.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.Cardinality#getFrom <em>From</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.Cardinality#getTo <em>To</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.Cardinality#isMany <em>Many</em>}</li>
 * </ul>
 *
 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getCardinality()
 * @model
 * @generated
 */
public interface Cardinality extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The form non-negative integer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(int)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getCardinality_From()
	 * @model unique="false"
	 * @generated
	 */
	int getFrom();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.Cardinality#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(int value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The to non-negative integer. Could be {@code 0} if {@code many} is {@code true}.
	 * <TODO consider registering value converter instead and do the -1 conversion there in case of many true.>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(int)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getCardinality_To()
	 * @model unique="false"
	 * @generated
	 */
	int getTo();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.Cardinality#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(int value);

	/**
	 * Returns the value of the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * {@code true} if un-bounded cardinality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Many</em>' attribute.
	 * @see #setMany(boolean)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getCardinality_Many()
	 * @model unique="false"
	 * @generated
	 */
	boolean isMany();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.Cardinality#isMany <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Many</em>' attribute.
	 * @see #isMany()
	 * @generated
	 */
	void setMany(boolean value);

} // Cardinality

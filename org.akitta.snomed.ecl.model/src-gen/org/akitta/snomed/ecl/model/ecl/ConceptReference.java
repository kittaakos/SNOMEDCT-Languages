/**
 */
package org.akitta.snomed.ecl.model.ecl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Representation of a concept reference.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.ConceptReference#getId <em>Id</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.ConceptReference#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getConceptReference()
 * @model
 * @generated
 */
public interface ConceptReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The unique SNOEMD&nbsp;CT ID of the concept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getConceptReference_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.ConceptReference#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The term of the concept which is wrapped between a leading and trailing pipe (&#x7c;) characters. <br>
	 * Also could contain leading and trailing whitespaces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term</em>' attribute.
	 * @see #setTerm(String)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getConceptReference_Term()
	 * @model unique="false"
	 * @generated
	 */
	String getTerm();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.ConceptReference#getTerm <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' attribute.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(String value);

} // ConceptReference

/**
 */
package org.akitta.snomed.ecl.model.ecl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Focus Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Representation of a focus concept. Could be wild-card (any) concept, or
 * can point to a reference set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.FocusConcept#isMemberOf <em>Member Of</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.FocusConcept#isWildcard <em>Wildcard</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.FocusConcept#getConceptRef <em>Concept Ref</em>}</li>
 * </ul>
 *
 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getFocusConcept()
 * @model
 * @generated
 */
public interface FocusConcept extends EObject {
	/**
	 * Returns the value of the '<em><b>Member Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * {@code true} if points to a reference set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member Of</em>' attribute.
	 * @see #setMemberOf(boolean)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getFocusConcept_MemberOf()
	 * @model unique="false"
	 * @generated
	 */
	boolean isMemberOf();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.FocusConcept#isMemberOf <em>Member Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Of</em>' attribute.
	 * @see #isMemberOf()
	 * @generated
	 */
	void setMemberOf(boolean value);

	/**
	 * Returns the value of the '<em><b>Wildcard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * {@code true} if means any active concepts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wildcard</em>' attribute.
	 * @see #setWildcard(boolean)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getFocusConcept_Wildcard()
	 * @model unique="false"
	 * @generated
	 */
	boolean isWildcard();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.FocusConcept#isWildcard <em>Wildcard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wildcard</em>' attribute.
	 * @see #isWildcard()
	 * @generated
	 */
	void setWildcard(boolean value);

	/**
	 * Returns the value of the '<em><b>Concept Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The concept reference. Could be absent, if {@code wildcard} is {@code true}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept Ref</em>' containment reference.
	 * @see #setConceptRef(ConceptReference)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getFocusConcept_ConceptRef()
	 * @model containment="true"
	 * @generated
	 */
	ConceptReference getConceptRef();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.FocusConcept#getConceptRef <em>Concept Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Ref</em>' containment reference.
	 * @see #getConceptRef()
	 * @generated
	 */
	void setConceptRef(ConceptReference value);

} // FocusConcept

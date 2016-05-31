/**
 */
package org.akitta.snomed.ecl.model.ecl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * An attribute is a name-value pair expressing a single refinement of the containing expression constraint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.Attribute#isReversed <em>Reversed</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.Attribute#isWildcard <em>Wildcard</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.Attribute#getOp <em>Op</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.Attribute#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.Attribute#getConceptRef <em>Concept Ref</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.Attribute#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends AttributeSet {
	/**
	 * Returns the value of the '<em><b>Reversed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * {@code true} if the attribute should be reversed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reversed</em>' attribute.
	 * @see #setReversed(boolean)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getAttribute_Reversed()
	 * @model unique="false"
	 * @generated
	 */
	boolean isReversed();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.Attribute#isReversed <em>Reversed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reversed</em>' attribute.
	 * @see #isReversed()
	 * @generated
	 */
	void setReversed(boolean value);

	/**
	 * Returns the value of the '<em><b>Wildcard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * {@code true} if wild-card, otherwise {@code false}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wildcard</em>' attribute.
	 * @see #setWildcard(boolean)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getAttribute_Wildcard()
	 * @model unique="false"
	 * @generated
	 */
	boolean isWildcard();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.Attribute#isWildcard <em>Wildcard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wildcard</em>' attribute.
	 * @see #isWildcard()
	 * @generated
	 */
	void setWildcard(boolean value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link org.akitta.snomed.ecl.model.ecl.AttributeOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The attribute operator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see org.akitta.snomed.ecl.model.ecl.AttributeOperator
	 * @see #setOp(AttributeOperator)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getAttribute_Op()
	 * @model unique="false"
	 * @generated
	 */
	AttributeOperator getOp();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.Attribute#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see org.akitta.snomed.ecl.model.ecl.AttributeOperator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(AttributeOperator value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The cardinality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getAttribute_Cardinality()
	 * @model containment="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.Attribute#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Concept Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The reference to the SNOMED&nbsp;CT concept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept Ref</em>' containment reference.
	 * @see #setConceptRef(ConceptReference)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getAttribute_ConceptRef()
	 * @model containment="true"
	 * @generated
	 */
	ConceptReference getConceptRef();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.Attribute#getConceptRef <em>Concept Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Ref</em>' containment reference.
	 * @see #getConceptRef()
	 * @generated
	 */
	void setConceptRef(ConceptReference value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The value of the attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(AttributeValue)
	 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getAttribute_Value()
	 * @model containment="true"
	 * @generated
	 */
	AttributeValue getValue();

	/**
	 * Sets the value of the '{@link org.akitta.snomed.ecl.model.ecl.Attribute#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(AttributeValue value);

} // Attribute

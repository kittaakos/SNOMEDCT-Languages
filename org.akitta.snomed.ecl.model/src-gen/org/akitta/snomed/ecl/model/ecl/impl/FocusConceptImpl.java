/**
 */
package org.akitta.snomed.ecl.model.ecl.impl;

import org.akitta.snomed.ecl.model.ecl.ConceptReference;
import org.akitta.snomed.ecl.model.ecl.EclPackage;
import org.akitta.snomed.ecl.model.ecl.FocusConcept;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Focus Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.impl.FocusConceptImpl#isMemberOf <em>Member Of</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.impl.FocusConceptImpl#isWildcard <em>Wildcard</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.impl.FocusConceptImpl#getConceptRef <em>Concept Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FocusConceptImpl extends MinimalEObjectImpl.Container implements FocusConcept {
	/**
	 * The default value of the '{@link #isMemberOf() <em>Member Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMemberOf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MEMBER_OF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMemberOf() <em>Member Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMemberOf()
	 * @generated
	 * @ordered
	 */
	protected boolean memberOf = MEMBER_OF_EDEFAULT;

	/**
	 * The default value of the '{@link #isWildcard() <em>Wildcard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWildcard()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WILDCARD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWildcard() <em>Wildcard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWildcard()
	 * @generated
	 * @ordered
	 */
	protected boolean wildcard = WILDCARD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConceptRef() <em>Concept Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptRef()
	 * @generated
	 * @ordered
	 */
	protected ConceptReference conceptRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FocusConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclPackage.Literals.FOCUS_CONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMemberOf() {
		return memberOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberOf(boolean newMemberOf) {
		boolean oldMemberOf = memberOf;
		memberOf = newMemberOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.FOCUS_CONCEPT__MEMBER_OF, oldMemberOf, memberOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWildcard() {
		return wildcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWildcard(boolean newWildcard) {
		boolean oldWildcard = wildcard;
		wildcard = newWildcard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.FOCUS_CONCEPT__WILDCARD, oldWildcard, wildcard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptReference getConceptRef() {
		return conceptRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConceptRef(ConceptReference newConceptRef, NotificationChain msgs) {
		ConceptReference oldConceptRef = conceptRef;
		conceptRef = newConceptRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclPackage.FOCUS_CONCEPT__CONCEPT_REF, oldConceptRef, newConceptRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConceptRef(ConceptReference newConceptRef) {
		if (newConceptRef != conceptRef) {
			NotificationChain msgs = null;
			if (conceptRef != null)
				msgs = ((InternalEObject)conceptRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclPackage.FOCUS_CONCEPT__CONCEPT_REF, null, msgs);
			if (newConceptRef != null)
				msgs = ((InternalEObject)newConceptRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclPackage.FOCUS_CONCEPT__CONCEPT_REF, null, msgs);
			msgs = basicSetConceptRef(newConceptRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.FOCUS_CONCEPT__CONCEPT_REF, newConceptRef, newConceptRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclPackage.FOCUS_CONCEPT__CONCEPT_REF:
				return basicSetConceptRef(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EclPackage.FOCUS_CONCEPT__MEMBER_OF:
				return isMemberOf();
			case EclPackage.FOCUS_CONCEPT__WILDCARD:
				return isWildcard();
			case EclPackage.FOCUS_CONCEPT__CONCEPT_REF:
				return getConceptRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EclPackage.FOCUS_CONCEPT__MEMBER_OF:
				setMemberOf((Boolean)newValue);
				return;
			case EclPackage.FOCUS_CONCEPT__WILDCARD:
				setWildcard((Boolean)newValue);
				return;
			case EclPackage.FOCUS_CONCEPT__CONCEPT_REF:
				setConceptRef((ConceptReference)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EclPackage.FOCUS_CONCEPT__MEMBER_OF:
				setMemberOf(MEMBER_OF_EDEFAULT);
				return;
			case EclPackage.FOCUS_CONCEPT__WILDCARD:
				setWildcard(WILDCARD_EDEFAULT);
				return;
			case EclPackage.FOCUS_CONCEPT__CONCEPT_REF:
				setConceptRef((ConceptReference)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EclPackage.FOCUS_CONCEPT__MEMBER_OF:
				return memberOf != MEMBER_OF_EDEFAULT;
			case EclPackage.FOCUS_CONCEPT__WILDCARD:
				return wildcard != WILDCARD_EDEFAULT;
			case EclPackage.FOCUS_CONCEPT__CONCEPT_REF:
				return conceptRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (memberOf: ");
		result.append(memberOf);
		result.append(", wildcard: ");
		result.append(wildcard);
		result.append(')');
		return result.toString();
	}

} //FocusConceptImpl

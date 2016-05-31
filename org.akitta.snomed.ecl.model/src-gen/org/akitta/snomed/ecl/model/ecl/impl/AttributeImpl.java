/**
 */
package org.akitta.snomed.ecl.model.ecl.impl;

import org.akitta.snomed.ecl.model.ecl.Attribute;
import org.akitta.snomed.ecl.model.ecl.AttributeOperator;
import org.akitta.snomed.ecl.model.ecl.AttributeValue;
import org.akitta.snomed.ecl.model.ecl.Cardinality;
import org.akitta.snomed.ecl.model.ecl.ConceptReference;
import org.akitta.snomed.ecl.model.ecl.EclPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeImpl#isReversed <em>Reversed</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeImpl#isWildcard <em>Wildcard</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeImpl#getConceptRef <em>Concept Ref</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends AttributeSetImpl implements Attribute {
	/**
	 * The default value of the '{@link #isReversed() <em>Reversed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReversed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REVERSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReversed() <em>Reversed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReversed()
	 * @generated
	 * @ordered
	 */
	protected boolean reversed = REVERSED_EDEFAULT;

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
	 * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected static final AttributeOperator OP_EDEFAULT = AttributeOperator.SELF;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected AttributeOperator op = OP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality;

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
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected AttributeValue value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReversed() {
		return reversed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReversed(boolean newReversed) {
		boolean oldReversed = reversed;
		reversed = newReversed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.ATTRIBUTE__REVERSED, oldReversed, reversed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.ATTRIBUTE__WILDCARD, oldWildcard, wildcard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOperator getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(AttributeOperator newOp) {
		AttributeOperator oldOp = op;
		op = newOp == null ? OP_EDEFAULT : newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.ATTRIBUTE__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(Cardinality newCardinality, NotificationChain msgs) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclPackage.ATTRIBUTE__CARDINALITY, oldCardinality, newCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		if (newCardinality != cardinality) {
			NotificationChain msgs = null;
			if (cardinality != null)
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclPackage.ATTRIBUTE__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclPackage.ATTRIBUTE__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.ATTRIBUTE__CARDINALITY, newCardinality, newCardinality));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclPackage.ATTRIBUTE__CONCEPT_REF, oldConceptRef, newConceptRef);
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
				msgs = ((InternalEObject)conceptRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclPackage.ATTRIBUTE__CONCEPT_REF, null, msgs);
			if (newConceptRef != null)
				msgs = ((InternalEObject)newConceptRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclPackage.ATTRIBUTE__CONCEPT_REF, null, msgs);
			msgs = basicSetConceptRef(newConceptRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.ATTRIBUTE__CONCEPT_REF, newConceptRef, newConceptRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValue getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(AttributeValue newValue, NotificationChain msgs) {
		AttributeValue oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclPackage.ATTRIBUTE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(AttributeValue newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclPackage.ATTRIBUTE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclPackage.ATTRIBUTE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.ATTRIBUTE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclPackage.ATTRIBUTE__CARDINALITY:
				return basicSetCardinality(null, msgs);
			case EclPackage.ATTRIBUTE__CONCEPT_REF:
				return basicSetConceptRef(null, msgs);
			case EclPackage.ATTRIBUTE__VALUE:
				return basicSetValue(null, msgs);
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
			case EclPackage.ATTRIBUTE__REVERSED:
				return isReversed();
			case EclPackage.ATTRIBUTE__WILDCARD:
				return isWildcard();
			case EclPackage.ATTRIBUTE__OP:
				return getOp();
			case EclPackage.ATTRIBUTE__CARDINALITY:
				return getCardinality();
			case EclPackage.ATTRIBUTE__CONCEPT_REF:
				return getConceptRef();
			case EclPackage.ATTRIBUTE__VALUE:
				return getValue();
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
			case EclPackage.ATTRIBUTE__REVERSED:
				setReversed((Boolean)newValue);
				return;
			case EclPackage.ATTRIBUTE__WILDCARD:
				setWildcard((Boolean)newValue);
				return;
			case EclPackage.ATTRIBUTE__OP:
				setOp((AttributeOperator)newValue);
				return;
			case EclPackage.ATTRIBUTE__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case EclPackage.ATTRIBUTE__CONCEPT_REF:
				setConceptRef((ConceptReference)newValue);
				return;
			case EclPackage.ATTRIBUTE__VALUE:
				setValue((AttributeValue)newValue);
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
			case EclPackage.ATTRIBUTE__REVERSED:
				setReversed(REVERSED_EDEFAULT);
				return;
			case EclPackage.ATTRIBUTE__WILDCARD:
				setWildcard(WILDCARD_EDEFAULT);
				return;
			case EclPackage.ATTRIBUTE__OP:
				setOp(OP_EDEFAULT);
				return;
			case EclPackage.ATTRIBUTE__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case EclPackage.ATTRIBUTE__CONCEPT_REF:
				setConceptRef((ConceptReference)null);
				return;
			case EclPackage.ATTRIBUTE__VALUE:
				setValue((AttributeValue)null);
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
			case EclPackage.ATTRIBUTE__REVERSED:
				return reversed != REVERSED_EDEFAULT;
			case EclPackage.ATTRIBUTE__WILDCARD:
				return wildcard != WILDCARD_EDEFAULT;
			case EclPackage.ATTRIBUTE__OP:
				return op != OP_EDEFAULT;
			case EclPackage.ATTRIBUTE__CARDINALITY:
				return cardinality != null;
			case EclPackage.ATTRIBUTE__CONCEPT_REF:
				return conceptRef != null;
			case EclPackage.ATTRIBUTE__VALUE:
				return value != null;
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
		result.append(" (reversed: ");
		result.append(reversed);
		result.append(", wildcard: ");
		result.append(wildcard);
		result.append(", op: ");
		result.append(op);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl

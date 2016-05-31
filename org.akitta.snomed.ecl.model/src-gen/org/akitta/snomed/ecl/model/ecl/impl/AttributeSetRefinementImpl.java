/**
 */
package org.akitta.snomed.ecl.model.ecl.impl;

import org.akitta.snomed.ecl.model.ecl.AttributeSet;
import org.akitta.snomed.ecl.model.ecl.AttributeSetRefinement;
import org.akitta.snomed.ecl.model.ecl.EclPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Set Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeSetRefinementImpl#getAttributeSet <em>Attribute Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeSetRefinementImpl extends RefinementImpl implements AttributeSetRefinement {
	/**
	 * The cached value of the '{@link #getAttributeSet() <em>Attribute Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeSet()
	 * @generated
	 * @ordered
	 */
	protected AttributeSet attributeSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeSetRefinementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclPackage.Literals.ATTRIBUTE_SET_REFINEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeSet getAttributeSet() {
		return attributeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeSet(AttributeSet newAttributeSet, NotificationChain msgs) {
		AttributeSet oldAttributeSet = attributeSet;
		attributeSet = newAttributeSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclPackage.ATTRIBUTE_SET_REFINEMENT__ATTRIBUTE_SET, oldAttributeSet, newAttributeSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeSet(AttributeSet newAttributeSet) {
		if (newAttributeSet != attributeSet) {
			NotificationChain msgs = null;
			if (attributeSet != null)
				msgs = ((InternalEObject)attributeSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclPackage.ATTRIBUTE_SET_REFINEMENT__ATTRIBUTE_SET, null, msgs);
			if (newAttributeSet != null)
				msgs = ((InternalEObject)newAttributeSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclPackage.ATTRIBUTE_SET_REFINEMENT__ATTRIBUTE_SET, null, msgs);
			msgs = basicSetAttributeSet(newAttributeSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.ATTRIBUTE_SET_REFINEMENT__ATTRIBUTE_SET, newAttributeSet, newAttributeSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclPackage.ATTRIBUTE_SET_REFINEMENT__ATTRIBUTE_SET:
				return basicSetAttributeSet(null, msgs);
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
			case EclPackage.ATTRIBUTE_SET_REFINEMENT__ATTRIBUTE_SET:
				return getAttributeSet();
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
			case EclPackage.ATTRIBUTE_SET_REFINEMENT__ATTRIBUTE_SET:
				setAttributeSet((AttributeSet)newValue);
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
			case EclPackage.ATTRIBUTE_SET_REFINEMENT__ATTRIBUTE_SET:
				setAttributeSet((AttributeSet)null);
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
			case EclPackage.ATTRIBUTE_SET_REFINEMENT__ATTRIBUTE_SET:
				return attributeSet != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeSetRefinementImpl

/**
 */
package org.akitta.snomed.ecl.model.ecl.impl;

import org.akitta.snomed.ecl.model.ecl.AttributeGroup;
import org.akitta.snomed.ecl.model.ecl.AttributeSet;
import org.akitta.snomed.ecl.model.ecl.Cardinality;
import org.akitta.snomed.ecl.model.ecl.EclPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeGroupImpl#getAttributeSet <em>Attribute Set</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeGroupImpl#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeGroupImpl extends MinimalEObjectImpl.Container implements AttributeGroup {
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
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclPackage.Literals.ATTRIBUTE_GROUP;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclPackage.ATTRIBUTE_GROUP__ATTRIBUTE_SET, oldAttributeSet, newAttributeSet);
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
				msgs = ((InternalEObject)attributeSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclPackage.ATTRIBUTE_GROUP__ATTRIBUTE_SET, null, msgs);
			if (newAttributeSet != null)
				msgs = ((InternalEObject)newAttributeSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclPackage.ATTRIBUTE_GROUP__ATTRIBUTE_SET, null, msgs);
			msgs = basicSetAttributeSet(newAttributeSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.ATTRIBUTE_GROUP__ATTRIBUTE_SET, newAttributeSet, newAttributeSet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclPackage.ATTRIBUTE_GROUP__CARDINALITY, oldCardinality, newCardinality);
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
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclPackage.ATTRIBUTE_GROUP__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclPackage.ATTRIBUTE_GROUP__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.ATTRIBUTE_GROUP__CARDINALITY, newCardinality, newCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclPackage.ATTRIBUTE_GROUP__ATTRIBUTE_SET:
				return basicSetAttributeSet(null, msgs);
			case EclPackage.ATTRIBUTE_GROUP__CARDINALITY:
				return basicSetCardinality(null, msgs);
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
			case EclPackage.ATTRIBUTE_GROUP__ATTRIBUTE_SET:
				return getAttributeSet();
			case EclPackage.ATTRIBUTE_GROUP__CARDINALITY:
				return getCardinality();
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
			case EclPackage.ATTRIBUTE_GROUP__ATTRIBUTE_SET:
				setAttributeSet((AttributeSet)newValue);
				return;
			case EclPackage.ATTRIBUTE_GROUP__CARDINALITY:
				setCardinality((Cardinality)newValue);
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
			case EclPackage.ATTRIBUTE_GROUP__ATTRIBUTE_SET:
				setAttributeSet((AttributeSet)null);
				return;
			case EclPackage.ATTRIBUTE_GROUP__CARDINALITY:
				setCardinality((Cardinality)null);
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
			case EclPackage.ATTRIBUTE_GROUP__ATTRIBUTE_SET:
				return attributeSet != null;
			case EclPackage.ATTRIBUTE_GROUP__CARDINALITY:
				return cardinality != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeGroupImpl

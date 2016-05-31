/**
 */
package org.akitta.snomed.ecl.model.ecl.impl;

import org.akitta.snomed.ecl.model.ecl.AttributeGroup;
import org.akitta.snomed.ecl.model.ecl.AttributeGroupRefinement;
import org.akitta.snomed.ecl.model.ecl.EclPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Group Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeGroupRefinementImpl#getAttributeGroup <em>Attribute Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeGroupRefinementImpl extends RefinementImpl implements AttributeGroupRefinement {
	/**
	 * The cached value of the '{@link #getAttributeGroup() <em>Attribute Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeGroup()
	 * @generated
	 * @ordered
	 */
	protected AttributeGroup attributeGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeGroupRefinementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclPackage.Literals.ATTRIBUTE_GROUP_REFINEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeGroup getAttributeGroup() {
		return attributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeGroup(AttributeGroup newAttributeGroup, NotificationChain msgs) {
		AttributeGroup oldAttributeGroup = attributeGroup;
		attributeGroup = newAttributeGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclPackage.ATTRIBUTE_GROUP_REFINEMENT__ATTRIBUTE_GROUP, oldAttributeGroup, newAttributeGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeGroup(AttributeGroup newAttributeGroup) {
		if (newAttributeGroup != attributeGroup) {
			NotificationChain msgs = null;
			if (attributeGroup != null)
				msgs = ((InternalEObject)attributeGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclPackage.ATTRIBUTE_GROUP_REFINEMENT__ATTRIBUTE_GROUP, null, msgs);
			if (newAttributeGroup != null)
				msgs = ((InternalEObject)newAttributeGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclPackage.ATTRIBUTE_GROUP_REFINEMENT__ATTRIBUTE_GROUP, null, msgs);
			msgs = basicSetAttributeGroup(newAttributeGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.ATTRIBUTE_GROUP_REFINEMENT__ATTRIBUTE_GROUP, newAttributeGroup, newAttributeGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclPackage.ATTRIBUTE_GROUP_REFINEMENT__ATTRIBUTE_GROUP:
				return basicSetAttributeGroup(null, msgs);
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
			case EclPackage.ATTRIBUTE_GROUP_REFINEMENT__ATTRIBUTE_GROUP:
				return getAttributeGroup();
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
			case EclPackage.ATTRIBUTE_GROUP_REFINEMENT__ATTRIBUTE_GROUP:
				setAttributeGroup((AttributeGroup)newValue);
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
			case EclPackage.ATTRIBUTE_GROUP_REFINEMENT__ATTRIBUTE_GROUP:
				setAttributeGroup((AttributeGroup)null);
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
			case EclPackage.ATTRIBUTE_GROUP_REFINEMENT__ATTRIBUTE_GROUP:
				return attributeGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeGroupRefinementImpl

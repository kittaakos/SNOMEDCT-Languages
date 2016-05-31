/**
 */
package org.akitta.snomed.ecl.model.ecl.impl;

import org.akitta.snomed.ecl.model.ecl.EclPackage;
import org.akitta.snomed.ecl.model.ecl.ExpressionConstraint;
import org.akitta.snomed.ecl.model.ecl.ParenthesizedExpressionConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parenthesized Expression Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.impl.ParenthesizedExpressionConstraintImpl#getCurrent <em>Current</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParenthesizedExpressionConstraintImpl extends ExpressionConstraintImpl implements ParenthesizedExpressionConstraint {
	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected ExpressionConstraint current;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParenthesizedExpressionConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclPackage.Literals.PARENTHESIZED_EXPRESSION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionConstraint getCurrent() {
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrent(ExpressionConstraint newCurrent, NotificationChain msgs) {
		ExpressionConstraint oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclPackage.PARENTHESIZED_EXPRESSION_CONSTRAINT__CURRENT, oldCurrent, newCurrent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent(ExpressionConstraint newCurrent) {
		if (newCurrent != current) {
			NotificationChain msgs = null;
			if (current != null)
				msgs = ((InternalEObject)current).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclPackage.PARENTHESIZED_EXPRESSION_CONSTRAINT__CURRENT, null, msgs);
			if (newCurrent != null)
				msgs = ((InternalEObject)newCurrent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclPackage.PARENTHESIZED_EXPRESSION_CONSTRAINT__CURRENT, null, msgs);
			msgs = basicSetCurrent(newCurrent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.PARENTHESIZED_EXPRESSION_CONSTRAINT__CURRENT, newCurrent, newCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclPackage.PARENTHESIZED_EXPRESSION_CONSTRAINT__CURRENT:
				return basicSetCurrent(null, msgs);
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
			case EclPackage.PARENTHESIZED_EXPRESSION_CONSTRAINT__CURRENT:
				return getCurrent();
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
			case EclPackage.PARENTHESIZED_EXPRESSION_CONSTRAINT__CURRENT:
				setCurrent((ExpressionConstraint)newValue);
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
			case EclPackage.PARENTHESIZED_EXPRESSION_CONSTRAINT__CURRENT:
				setCurrent((ExpressionConstraint)null);
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
			case EclPackage.PARENTHESIZED_EXPRESSION_CONSTRAINT__CURRENT:
				return current != null;
		}
		return super.eIsSet(featureID);
	}

} //ParenthesizedExpressionConstraintImpl

/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.resources.impl;

import org.asup.il.expr.LogicalOperator;
import org.asup.il.expr.QLogicalExpression;
import org.asup.il.expr.QPredicateExpression;
import org.asup.il.expr.QRelationalExpression;
import org.asup.il.expr.QTermExpression;
import org.asup.il.expr.impl.ExpressionVisitorImpl;
import org.asup.os.core.QLocker;
import org.asup.os.core.resources.QOperatingSystemResourcesPackage;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.omac.QObjectNameable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QResource</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.os.core.resources.impl.ResourceReaderImpl#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ResourceReaderImpl<T extends QObjectNameable> extends ResourceImpl<T> implements QResourceReader<T> {
	/**
	 * The default value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected String container = CONTAINER_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceReaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemResourcesPackage.Literals.RESOURCE_READER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(String newContainer) {
		String oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemResourcesPackage.RESOURCE_READER__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean exists(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QObjectIterator<T> find(String nameFilter) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public QObjectIterator<T> findByExpression(QPredicateExpression filter) {
		return new ObjectIterator(find(null), filter);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public T lookup(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QLocker<T> getLocker() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemResourcesPackage.RESOURCE_READER__CONTAINER:
				return getContainer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QOperatingSystemResourcesPackage.RESOURCE_READER__CONTAINER:
				setContainer((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QOperatingSystemResourcesPackage.RESOURCE_READER__CONTAINER:
				setContainer(CONTAINER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QOperatingSystemResourcesPackage.RESOURCE_READER__CONTAINER:
				return CONTAINER_EDEFAULT == null ? container != null : !CONTAINER_EDEFAULT.equals(container);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (container: ");
		result.append(container);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	private class ObjectIterator implements QObjectIterator<T> {

		private QObjectIterator<T> iterator;
		private QPredicateExpression filter;

		private T nextObject;

		public ObjectIterator(QObjectIterator<T> delegate, QPredicateExpression filter) {
			this.iterator = delegate;
			this.filter = filter;

			doNext();
		}

		@Override
		public void close() {
			this.iterator.close();
		}

		@Override
		public boolean hasNext() {
			return this.nextObject != null;
		}

		@Override
		public T next() {

			T object = nextObject;
			doNext();

			return object;

		}

		@Override
		public void remove() {
			this.iterator.remove();
		}

		private void doNext() {

			nextObject = null;
			while (iterator.hasNext()) {
				T object = iterator.next();
				ExpressionVisitor expressionVisitor = new ExpressionVisitor((EObject) object);
				filter.accept(expressionVisitor);

				if (!expressionVisitor.isValid())
					continue;

				nextObject = object;
				break;
			}
		}
	}

	private class ExpressionVisitor extends ExpressionVisitorImpl {

		boolean result = true;

		private EObject eObject;

		public ExpressionVisitor(EObject eObject) {
			this.eObject = eObject;
		}

		public boolean isValid() {
			return result;
		}

		@Override
		public boolean visit(QLogicalExpression expression) {

			expression.getLeftOperand().accept(this);
			if(isValid() || expression.getExpressionType().equals(LogicalOperator.OR))
				expression.getRightOperand().accept(this);
			
			return isValid();
		}

		@Override
		public boolean visit(QRelationalExpression expression) {

			// TODO
			QTermExpression leftOperand = (QTermExpression) expression.getLeftOperand();			
			String feature = leftOperand.getValue();			
			EStructuralFeature eFeature = eObject.eClass().getEStructuralFeature(feature);
			Object object = eObject.eGet(eFeature);
			String eValue = null;
			if(object == null)
				eValue = eFeature.getDefaultValueLiteral();
			else
				eValue = object.toString();
			
			// TODO
			QTermExpression rightOperand = (QTermExpression) expression.getRightOperand();
			String value = rightOperand.getValue();
			
			switch (expression.getOperator()) {
			case EQUAL:
				this.result = value.equalsIgnoreCase(eValue);
				break;
			case GREATER_THAN:
				this.result = value.compareTo(eValue) > 0;
				break;
			case GREATER_THAN_EQUAL:
				this.result = value.compareTo(eValue) >= 0;
				break;
			case LESS_THAN:
				this.result = value.compareTo(eValue) < 0;
				break;
			case LESS_THAN_EQUAL:
				this.result = value.compareTo(eValue) <= 0;
				break;
			case NOT_EQUAL:
				this.result = !value.equalsIgnoreCase(eValue); 
				break;
			}
			
			return result;
		}

	}
} // QResourceImpl
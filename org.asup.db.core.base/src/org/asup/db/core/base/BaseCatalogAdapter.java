package org.asup.db.core.base;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;

import org.eclipse.datatools.connectivity.sqm.core.rte.ICatalogObject;
import org.eclipse.datatools.modelbase.sql.schema.Catalog;
import org.eclipse.datatools.modelbase.sql.schema.Database;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("rawtypes")
public class BaseCatalogAdapter implements Catalog, ICatalogObject {

	private Catalog catalog;
	private Connection connection;
	
	public BaseCatalogAdapter(Connection connection, Catalog catalog) {
		this.connection = connection;
		this.catalog = catalog;
	}

	public EList<Adapter> eAdapters() {
		return catalog.eAdapters();
	}

	public Database getDatabase() {
		return catalog.getDatabase();
	}

	public boolean eDeliver() {
		return catalog.eDeliver();
	}

	public EList<EAnnotation> getEAnnotations() {
		return catalog.getEAnnotations();
	}

	public String getName() {
		return catalog.getName();
	}

	public void eSetDeliver(boolean deliver) {
		catalog.eSetDeliver(deliver);
	}

	public void eNotify(Notification notification) {
		catalog.eNotify(notification);
	}

	public void setName(String value) {
		catalog.setName(value);
	}

	public void setDatabase(Database value) {
		catalog.setDatabase(value);
	}

	public EList getSchemas() {
		return catalog.getSchemas();
	}

	public EList getDependencies() {
		return catalog.getDependencies();
	}

	public EClass eClass() {
		return catalog.eClass();
	}

	public String getDescription() {
		return catalog.getDescription();
	}

	public Resource eResource() {
		return catalog.eResource();
	}

	public void setDescription(String value) {
		catalog.setDescription(value);
	}

	public String getLabel() {
		return catalog.getLabel();
	}

	public EObject eContainer() {
		return catalog.eContainer();
	}

	public void setLabel(String value) {
		catalog.setLabel(value);
	}

	public EList getComments() {
		return catalog.getComments();
	}

	public EStructuralFeature eContainingFeature() {
		return catalog.eContainingFeature();
	}

	public EList getExtensions() {
		return catalog.getExtensions();
	}

	public EReference eContainmentFeature() {
		return catalog.eContainmentFeature();
	}

	public EList getPrivileges() {
		return catalog.getPrivileges();
	}

	public EList<EObject> eContents() {
		return catalog.eContents();
	}

	public EAnnotation addEAnnotation(String source) {
		return catalog.addEAnnotation(source);
	}

	public void addEAnnotationDetail(EAnnotation eAnnotation, String key, String value) {
		catalog.addEAnnotationDetail(eAnnotation, key, value);
	}

	public TreeIterator<EObject> eAllContents() {
		return catalog.eAllContents();
	}

	public String getEAnnotationDetail(EAnnotation eAnnotation, String key) {
		return catalog.getEAnnotationDetail(eAnnotation, key);
	}

	public void setAnnotationDetail(EAnnotation eAnnotation, String key, String value) {
		catalog.setAnnotationDetail(eAnnotation, key, value);
	}

	public void removeEAnnotationDetail(EAnnotation eAnnotation, String key) {
		catalog.removeEAnnotationDetail(eAnnotation, key);
	}

	public boolean eIsProxy() {
		return catalog.eIsProxy();
	}

	public EAnnotation getEAnnotation(String source) {
		return catalog.getEAnnotation(source);
	}

	public EList<EObject> eCrossReferences() {
		return catalog.eCrossReferences();
	}

	public Object eGet(EStructuralFeature feature) {
		return catalog.eGet(feature);
	}

	public Object eGet(EStructuralFeature feature, boolean resolve) {
		return catalog.eGet(feature, resolve);
	}

	public void eSet(EStructuralFeature feature, Object newValue) {
		catalog.eSet(feature, newValue);
	}

	public boolean eIsSet(EStructuralFeature feature) {
		return catalog.eIsSet(feature);
	}

	public void eUnset(EStructuralFeature feature) {
		catalog.eUnset(feature);
	}

	public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		return catalog.eInvoke(operation, arguments);
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		"".toCharArray();
	}

	@Override
	public Connection getConnection() {
		return connection;
	}

	@Override
	public Database getCatalogDatabase() {
		return catalog.getDatabase();
	}
}

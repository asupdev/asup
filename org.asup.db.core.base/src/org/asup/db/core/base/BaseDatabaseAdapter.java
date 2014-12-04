package org.asup.db.core.base;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.util.List;

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
public class BaseDatabaseAdapter implements Catalog, ICatalogObject {

	private Connection connection;
	private Database database;
	
	public BaseDatabaseAdapter(Connection connection, Database database) {
		this.connection = connection;
		this.database = database;
	}
	
	@Override
	public void refresh() {
		"".toCharArray();
	}

	@Override
	public Connection getConnection() {
		return connection;
	}

	@Override
	public Database getCatalogDatabase() {
		return database;
	}

	public EList<Adapter> eAdapters() {
		return database.eAdapters();
	}

	public boolean eDeliver() {
		return database.eDeliver();
	}

	public EList<EAnnotation> getEAnnotations() {
		return database.getEAnnotations();
	}

	public String getName() {
		return "";
	}

	public void eSetDeliver(boolean deliver) {
		database.eSetDeliver(deliver);
	}

	public void eNotify(Notification notification) {
		database.eNotify(notification);
	}

	public void setName(String value) {
		database.setName(value);
	}

	public String getVendor() {
		return database.getVendor();
	}

	public void setVendor(String value) {
		database.setVendor(value);
	}

	public EList getDependencies() {
		return database.getDependencies();
	}

	public String getVersion() {
		return database.getVersion();
	}

	public EClass eClass() {
		return database.eClass();
	}

	public String getDescription() {
		return database.getDescription();
	}

	public void setVersion(String value) {
		database.setVersion(value);
	}

	public Resource eResource() {
		return database.eResource();
	}

	public EList getSchemas() {
		return database.getSchemas();
	}

	public void setDescription(String value) {
		database.setDescription(value);
	}

	public String getLabel() {
		return database.getLabel();
	}

	public EObject eContainer() {
		return database.eContainer();
	}

	public EList getEvents() {
		return database.getEvents();
	}

	public void setLabel(String value) {
		database.setLabel(value);
	}

	public EList getComments() {
		return database.getComments();
	}

	public EStructuralFeature eContainingFeature() {
		return database.eContainingFeature();
	}

	public EList getCatalogs() {
		return database.getCatalogs();
	}

	public EList getExtensions() {
		return database.getExtensions();
	}

	public EReference eContainmentFeature() {
		return database.eContainmentFeature();
	}

	public EList getAuthorizationIds() {
		return database.getAuthorizationIds();
	}

	public EList getPrivileges() {
		return database.getPrivileges();
	}

	public EList<EObject> eContents() {
		return database.eContents();
	}

	public List getUserDefinedTypes() {
		return database.getUserDefinedTypes();
	}

	public EAnnotation addEAnnotation(String source) {
		return database.addEAnnotation(source);
	}

	public void addEAnnotationDetail(EAnnotation eAnnotation, String key, String value) {
		database.addEAnnotationDetail(eAnnotation, key, value);
	}

	public TreeIterator<EObject> eAllContents() {
		return database.eAllContents();
	}

	public String getEAnnotationDetail(EAnnotation eAnnotation, String key) {
		return database.getEAnnotationDetail(eAnnotation, key);
	}

	public void setAnnotationDetail(EAnnotation eAnnotation, String key, String value) {
		database.setAnnotationDetail(eAnnotation, key, value);
	}

	public void removeEAnnotationDetail(EAnnotation eAnnotation, String key) {
		database.removeEAnnotationDetail(eAnnotation, key);
	}

	public boolean eIsProxy() {
		return database.eIsProxy();
	}

	public EAnnotation getEAnnotation(String source) {
		return database.getEAnnotation(source);
	}

	public EList<EObject> eCrossReferences() {
		return database.eCrossReferences();
	}

	public Object eGet(EStructuralFeature feature) {
		return database.eGet(feature);
	}

	public Object eGet(EStructuralFeature feature, boolean resolve) {
		return database.eGet(feature, resolve);
	}

	public void eSet(EStructuralFeature feature, Object newValue) {
		database.eSet(feature, newValue);
	}

	public boolean eIsSet(EStructuralFeature feature) {
		return database.eIsSet(feature);
	}

	public void eUnset(EStructuralFeature feature) {
		database.eUnset(feature);
	}

	public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		return database.eInvoke(operation, arguments);
	}

	@Override
	public Database getDatabase() {
		return database;
	}

	@Override
	public void setDatabase(Database value) {
		this.database = value;
	}

}

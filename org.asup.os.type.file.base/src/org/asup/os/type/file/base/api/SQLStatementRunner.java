/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.os.type.file.base.api;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.syntax.QQueryConverter;
import org.asup.db.syntax.QQueryConverterRegistry;
import org.asup.db.syntax.QQueryParser;
import org.asup.db.syntax.QQueryParserRegistry;
import org.asup.il.data.QCharacter;
import org.asup.il.data.annotation.Command;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.QOperatingSystemCorePackage;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.output.QObjectWriter;
import org.asup.os.core.output.QOutputManager;
import org.asup.os.omac.QObject;
import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.asup.os.type.file.QFileManager;
import org.asup.os.type.pgm.OperatingSystemRuntimeProgramException;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

@Command(name = "RUNSQL")
@Program(name = "QASSQLSTMR")
public class SQLStatementRunner {

	@Inject
	private QFileManager fileManager;
	@Inject
	private QOutputManager outputManager;

	@Inject
	private QQueryParserRegistry queryParserRegistry;
	@Inject
	private QQueryConverterRegistry queryConverterRegistry;

	@Inject
	private QJob job;

	@Entry
	public void main(@DataDef(varying = true) QCharacter statement) {

		QObjectWriter objectWriter = outputManager.getDefaultWriter(job);
		objectWriter.initialize();

		QConnection databaseConnection = fileManager.getDatabaseConnection(job);

		Statement stm = null;
		try {

			QQueryParser queryParser = queryParserRegistry.lookup("ibmi");
			SQLQueryParseResult query = queryParser
					.parseQuery(new ByteArrayInputStream(statement.asBytes()));

			QQueryConverter queryConverter = queryConverterRegistry
					.lookup(databaseConnection.getConnectionConfig()
							.getPluginName());
			String statementString = queryConverter.convertQuery(query);

			statementString = statementString.replaceAll("\\[ ", "[");
			statementString = statementString.replaceAll(" \\]", "]");

			stm = databaseConnection.getConnection().createStatement();

			ResultSet resultSet = stm.executeQuery(statementString);

			EClass eClass = createEClass(resultSet);

			while (resultSet.next()) {

				QObject qObject = (QObject) eClass.getEPackage()
						.getEFactoryInstance().create(eClass);

				for (EStructuralFeature eStructuralFeature : eClass
						.getEStructuralFeatures()) {
					String value = resultSet.getString(eStructuralFeature
							.getName());
					((EObject) qObject).eSet(eStructuralFeature, value);
				}

				try {
					objectWriter.write(qObject);
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

		} catch (Exception e) {
			throw new OperatingSystemRuntimeProgramException(null, e);
		} finally {

			objectWriter.flush();

			if (statement != null) {
				try {
					stm.close();
				} catch (SQLException e) {
					throw new OperatingSystemRuntimeProgramException(null, e);
				}
			}
		}

	}

	private EClass createEClass(ResultSet resultSet) throws SQLException {

		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;

		EPackage ePackage = ecoreFactory.createEPackage();
		ePackage.setName("PIPPO");
		ePackage.setNsPrefix("asup");
		ePackage.setNsURI("http://asup");

		EClass eClass = ecoreFactory.createEClass();
		eClass.setName(this.getClass().getSimpleName());
		eClass.getESuperTypes().add(
				QOperatingSystemOmacPackage.eINSTANCE.getObject());

		ePackage.getEClassifiers().add(eClass);

		ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

		for (int c = 1; c <= resultSetMetaData.getColumnCount(); c++) {

			String columnName = resultSetMetaData.getColumnName(c);
			int columnLength = resultSetMetaData.getPrecision(c);

			EAttribute eAttribute = ecoreFactory.createEAttribute();
			eAttribute.setName(columnName);
			eAttribute.setEType(EcorePackage.eINSTANCE.getEString());

			EAnnotation eAnnotation = ecoreFactory.createEAnnotation();
			eAnnotation.setSource(QOperatingSystemCorePackage.eNS_URI);
			eAnnotation.getDetails().put("columnLength",
					Integer.toString(columnLength));
			eAttribute.getEAnnotations().add(eAnnotation);

			eClass.getEStructuralFeatures().add(eAttribute);

		}

		return eClass;
	}
}
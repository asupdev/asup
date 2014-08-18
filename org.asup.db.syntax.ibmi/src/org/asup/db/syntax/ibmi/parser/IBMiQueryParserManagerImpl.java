package org.asup.db.syntax.ibmi.parser;

import java.util.List;

import org.eclipse.datatools.modelbase.sql.query.util.SQLQuerySourceFormat;
import org.eclipse.datatools.sqltools.parsers.sql.SQLParser;
import org.eclipse.datatools.sqltools.parsers.sql.SQLParserFactory;
import org.eclipse.datatools.sqltools.parsers.sql.SQLParserInternalException;
import org.eclipse.datatools.sqltools.parsers.sql.lexer.AbstractSQLLexer;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParserManager;

/**
 * @author dforesti
 *
 */
@SuppressWarnings("rawtypes")
public class IBMiQueryParserManagerImpl extends SQLQueryParserManager {

    /**
     *
     */
    public IBMiQueryParserManagerImpl() {
        super();
    }

    /**
     * @param sourceFormat
     * @param postParseProcessors
     */
    public IBMiQueryParserManagerImpl(SQLQuerySourceFormat sourceFormat, List postParseProcessors) {
        super(sourceFormat, postParseProcessors);
    }



    @Override
	protected SQLParser createParser(AbstractSQLLexer lexer,
			boolean syntaxCheckOnly) throws SQLParserInternalException {
    	return new IBMiQueryParser(lexer,(IBMiQueryParserFactory)getParserFactory(), getSourceFormat(), syntaxCheckOnly);
	}

	/**
     * Returns this <code>SQLXMLQueryParserManager</code>'s
     * <code>SQLXMLQueryParserFactory</code>. If this
     * <code>SQLXMLQueryParserManager</code>'s <code>parserFactory</code> is
     * <code>null</code>, a new <code>SQLXMLQueryParserFactory</code> will be
     * created for this <code>SQLXMLQueryParserManager</code> and returned.
     * That is, this method never returns <code>null</code>!
     *
     * @return <code>SQLXMLQueryParserFactory</code>
     */
    public SQLParserFactory createParserFactory()
    {
        return new IBMiQueryParserFactory(getSourceFormat());
    }

}

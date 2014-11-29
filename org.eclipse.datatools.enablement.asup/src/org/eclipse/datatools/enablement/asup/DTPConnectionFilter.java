package org.eclipse.datatools.enablement.asup;

import java.util.ArrayList;

import org.eclipse.datatools.connectivity.sqm.internal.core.connection.ConnectionFilter;


@SuppressWarnings("rawtypes")
public class DTPConnectionFilter implements ConnectionFilter {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Override
	public String getPredicate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList getPredicatesCollection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValid(String predicate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getPattern() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getPatternElements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isOperatorInclusive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isOperatorExclusive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getOperator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isMeetsAllConditions() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFiltered(String name) {
		return true;
	}

	@Override
	public void setPredicate(String predicate) {
		// TODO Auto-generated method stub
		predicate.toCharArray();
	}

}

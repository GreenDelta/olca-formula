package org.openlca.expressions.functions;

import org.openlca.expressions.AbstractExpression;
import org.openlca.expressions.Expression;
import org.openlca.expressions.ExpressionException;
import org.openlca.expressions.Scope;

import java.util.Iterator;

public class And extends AbstractExpression {

	@Override
	public Object evaluate(Scope context) throws ExpressionException {
		boolean result = true;
		Iterator<Expression> it = arguments.iterator();
		while (result && it.hasNext()) {
			Boolean next = (Boolean) it.next().evaluate(context);
			result = result & next;
		}
		return result;
	}

	@Override
	public void check() throws ExpressionException {
		checkArgument(0, Boolean.class);
		checkArgumentsOfSameType(Boolean.class);
	}

	@Override
	public String getName() {
		return "and";
	}

	@Override
	public Class<?> getResultType() {
		return Boolean.class;
	}

}

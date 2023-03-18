package com.interpreter.grammer.rule.expression;

import com.interpreter.grammer.symbol.Expression;

public class IdentifierExpression extends Expression {
    private final String identifier;

    public IdentifierExpression(final String identifier) {
        this.identifier = identifier;
    }
}

package com.compiler.grammer.rule.expression;

import com.compiler.grammer.symbol.Expression;

public class IdentifierExpression extends Expression {
    private final String identifier;

    public IdentifierExpression(final String identifier) {
        this.identifier = identifier;
    }
}

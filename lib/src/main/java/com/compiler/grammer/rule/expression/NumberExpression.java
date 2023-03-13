package com.compiler.grammer.rule.expression;

import com.compiler.grammer.symbol.Expression;

public class NumberExpression extends Expression {
    private final int number;

    public NumberExpression(final int number) {
        this.number = number;
    }
}

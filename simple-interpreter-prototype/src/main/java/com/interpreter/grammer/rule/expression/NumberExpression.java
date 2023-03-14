package com.interpreter.grammer.rule.expression;

import com.interpreter.grammer.symbol.Expression;

public class NumberExpression extends Expression {
    private final int number;

    public NumberExpression(final int number) {
        this.number = number;
    }
}

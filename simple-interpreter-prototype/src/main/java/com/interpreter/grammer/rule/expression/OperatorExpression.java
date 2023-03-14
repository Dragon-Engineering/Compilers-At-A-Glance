package com.interpreter.grammer.rule.expression;

import com.interpreter.grammer.symbol.Expression;

public class OperatorExpression extends Expression {
    
    private final Expression left;
    private final int operator;
    private final Expression right;

    public OperatorExpression(final Expression left, final int operator, final Expression right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }
}

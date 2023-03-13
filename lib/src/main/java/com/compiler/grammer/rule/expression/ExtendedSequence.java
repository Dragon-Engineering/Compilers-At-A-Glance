package com.compiler.grammer.rule.expression;

import com.compiler.grammer.symbol.Expression;
import com.compiler.grammer.symbol.Statement;

public class ExtendedSequence extends Expression {

    private final Statement statement;
    private final Expression expression;

    public ExtendedSequence(final Statement statement, final Expression expression) {
        this.statement = statement;
        this.expression = expression;
    }
}
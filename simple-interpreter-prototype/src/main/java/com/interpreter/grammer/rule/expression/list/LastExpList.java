package com.interpreter.grammer.rule.expression.list;

import com.interpreter.grammer.symbol.Expression;
import com.interpreter.grammer.symbol.ExpressionList;

public class LastExpList extends ExpressionList {
    private final Expression head;

    public LastExpList(final Expression head) {
        this.head = head;
    }
}

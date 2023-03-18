package com.interpreter.grammer.rule.expression.list;

import com.interpreter.grammer.symbol.Expression;
import com.interpreter.grammer.symbol.ExpressionList;

public class PairExpList extends ExpressionList {
    private final Expression head;
    private final ExpressionList tail;

    public PairExpList(final Expression head, final ExpressionList tail) {
        this.head = head;
        this.tail = tail;
    }
}

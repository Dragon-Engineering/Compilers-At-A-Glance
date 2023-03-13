package com.compiler.grammer.rule.expression.list;

import com.compiler.grammer.symbol.Expression;
import com.compiler.grammer.symbol.ExpressionList;

public class PairExpList extends ExpressionList {
    private final Expression head;
    private final ExpressionList tail;

    public PairExpList(final Expression head, final ExpressionList tail) {
        this.head = head;
        this.tail = tail;
    }
}

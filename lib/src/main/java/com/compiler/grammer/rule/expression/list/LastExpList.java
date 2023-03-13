package com.compiler.grammer.rule.expression.list;

import com.compiler.grammer.symbol.Expression;
import com.compiler.grammer.symbol.ExpressionList;

public class LastExpList extends ExpressionList {
    private final Expression head;

    public LastExpList(final Expression head) {
        this.head = head;
    }
}

package com.compiler.grammer.rule.statement;

import com.compiler.grammer.symbol.ExpressionList;
import com.compiler.grammer.symbol.Statement;

public class PrintStatement extends Statement {
    
    private final ExpressionList expressionList;

    public PrintStatement(final ExpressionList expressionList) {
        this.expressionList = expressionList;
    }
}

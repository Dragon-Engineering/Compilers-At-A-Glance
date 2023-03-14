package com.interpreter.grammer.rule.statement;

import com.interpreter.grammer.symbol.ExpressionList;
import com.interpreter.grammer.symbol.Statement;

public class PrintStatement extends Statement {
    
    private final ExpressionList expressionList;

    public PrintStatement(final ExpressionList expressionList) {
        this.expressionList = expressionList;
    }
}

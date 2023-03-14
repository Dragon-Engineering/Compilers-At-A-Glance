package com.interpreter.grammer.rule.statement;

import com.interpreter.grammer.symbol.Expression;
import com.interpreter.grammer.symbol.Statement;

public class AssignmentStatement extends Statement {
    
    private final String identifier;
    private final Expression expression;

    public AssignmentStatement(final String identifier, final Expression expression) {
        this.identifier = identifier;
        this.expression = expression;
    }
}

package com.compiler.grammer.rule.statement;

import com.compiler.grammer.symbol.Expression;
import com.compiler.grammer.symbol.Statement;

public class AssignmentStatement extends Statement {
    
    private final String identifier;
    private final Expression expression;

    public AssignmentStatement(final String identifier, final Expression expression) {
        this.identifier = identifier;
        this.expression = expression;
    }
}

package com.interpreter.grammer.rule.statement;

import com.interpreter.grammer.symbol.Statement;

/**
 * A compound statement contains 2 {@link Statement}s. 
 * 
 * @author pavl_g
 */
public class CompoundStatement extends Statement {

    private final Statement statement0;
    private final Statement statement1;

    public CompoundStatement(final Statement statement0, final Statement statement1) {
        this.statement0 = statement0;
        this.statement1 = statement1;
    }
}

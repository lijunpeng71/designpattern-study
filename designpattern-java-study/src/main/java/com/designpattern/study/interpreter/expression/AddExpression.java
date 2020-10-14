package com.designpattern.study.interpreter.expression;

import java.util.Map;

public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> varMap) {
        return super.getLeft().interpreter(varMap) + super.getRight().interpreter(varMap);
    }
}

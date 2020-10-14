package com.designpattern.study.interpreter.expression;

import java.util.Map;

public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(Map<String, Integer> varMap) {
        return varMap.get(this.key);
    }
}

package com.designpattern.study.interpreter.expression;

import java.util.Map;

public abstract class Expression {

    public abstract int interpreter(Map<String, Integer> varMap);
}

package com.designpattern.study.visitor.audience;

import com.designpattern.study.visitor.action.Action;

public abstract class Person {
    public abstract void accept(Action action);
}

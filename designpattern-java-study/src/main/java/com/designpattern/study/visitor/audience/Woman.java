package com.designpattern.study.visitor.audience;

import com.designpattern.study.visitor.action.Action;

public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}

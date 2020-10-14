package com.designpattern.study.visitor.action;

import com.designpattern.study.visitor.audience.Man;
import com.designpattern.study.visitor.audience.Woman;

public abstract class Action {

    public abstract void getManResult(Man man);

    public abstract void getWomanResult(Woman woman);
}

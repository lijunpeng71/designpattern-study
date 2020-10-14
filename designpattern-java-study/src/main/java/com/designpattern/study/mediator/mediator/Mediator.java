package com.designpattern.study.mediator.mediator;

import com.designpattern.study.mediator.colleague.Colleague;

public abstract class Mediator {

    public abstract void register(String colleagueName, Colleague colleague);

    public abstract void getMessage(int stateChange, String colleagueName);

    public abstract void sendMessage();

}

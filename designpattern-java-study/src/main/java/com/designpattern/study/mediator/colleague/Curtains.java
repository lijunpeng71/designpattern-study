package com.designpattern.study.mediator.colleague;

import com.designpattern.study.mediator.mediator.Mediator;

public class Curtains extends Colleague {

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        // TODO Auto-generated constructor stub
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        // TODO Auto-generated method stub
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void upCurtains() {
        System.out.println("I am holding Up Curtains!");
    }

}
package com.designpattern.study.mediator.colleague;

import com.designpattern.study.mediator.mediator.Mediator;

public class Tv extends Colleague {
    public Tv(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    public void startTv() {
        System.out.println("It`s time to start TV");
    }

    public void stopTv() {
        System.out.println("It`s time to stop TV");
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
}

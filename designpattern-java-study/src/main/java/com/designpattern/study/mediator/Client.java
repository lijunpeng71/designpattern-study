package com.designpattern.study.mediator;

import com.designpattern.study.mediator.colleague.Alarm;
import com.designpattern.study.mediator.colleague.CoffeeMachine;
import com.designpattern.study.mediator.colleague.Curtains;
import com.designpattern.study.mediator.colleague.Tv;
import com.designpattern.study.mediator.mediator.ConcreteMediator;
import com.designpattern.study.mediator.mediator.Mediator;

public class Client {
    public static void main(String[] args) {
        //创建一个中介者对象
        Mediator mediator = new ConcreteMediator();

        //创建Alarm 并且加入到  ConcreteMediator 对象的HashMap
        Alarm alarm = new Alarm(mediator, "alarm");

        //创建了CoffeeMachine 对象，并  且加入到  ConcreteMediator 对象的HashMap
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,
                "coffeeMachine");

        //创建 Curtains , 并  且加入到  ConcreteMediator 对象的HashMap
        Curtains curtains = new Curtains(mediator, "curtains");
        Tv tV = new Tv(mediator, "TV");

        //让闹钟发出消息
        alarm.sendAlarm(0);
        coffeeMachine.FinishCoffee();
        alarm.sendAlarm(1);
    }
}

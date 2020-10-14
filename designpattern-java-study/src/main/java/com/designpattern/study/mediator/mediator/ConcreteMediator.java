package com.designpattern.study.mediator.mediator;

import com.designpattern.study.mediator.colleague.*;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator extends Mediator {

    private Map<String, Colleague> colleagueMap;
    private Map<String, String> interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);
        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof Tv) {
            interMap.put("TV", colleagueName);
        }
    }

    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) colleagueMap.get(interMap.get("CoffeeMachine"))).StartCoffee();
                ((Tv) (colleagueMap.get(interMap.get("TV")))).startTv();
            } else if (stateChange == 1) {
                ((Tv) (colleagueMap.get(interMap.get("TV")))).stopTv();
            } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
                ((Curtains) (colleagueMap.get(interMap.get("Curtains"))))
                        .upCurtains();

            } else if (colleagueMap.get(colleagueName) instanceof Tv) {//如果TV发现消息

            } else if (colleagueMap.get(colleagueName) instanceof Curtains) {
                //如果是以窗帘发出的消息，这里处理...
            }
        }
    }

    @Override
    public void sendMessage() {

    }
}

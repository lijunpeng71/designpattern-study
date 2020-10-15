package com.designpattern.study.strategy.common;

public class PekingDuck extends Duck {
    @Override
    public void display() {
        System.out.println("北京鸭……");
    }

    @Override
    public void fly() {
        System.out.println("北京鸭子不能飞……");
    }
}

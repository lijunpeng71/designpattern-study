package com.designpattern.study.factory.abstractfactory.factory;

import com.designpattern.study.factory.abstractfactory.pizza.Pizza;

//一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {
    //让下面的工厂子类来 具体实现
    public Pizza createPizza(String orderType);
}
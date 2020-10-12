package com.designpattern.study.decorator;

public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        // TODO Auto-generated constructor stub
        setDesc(" 牛奶 ");
        setPrice(2.0f);
    }

}
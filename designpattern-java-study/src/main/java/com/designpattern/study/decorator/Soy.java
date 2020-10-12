package com.designpattern.study.decorator;

public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        // TODO Auto-generated constructor stub
        setDesc(" 豆浆  ");
        setPrice(1.5f);
    }

}
package com.designpattern.study.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        //1.点一份longBlack
        Drink drink = new LongBlack();
        System.out.println("费用1=" + drink.cost());
        System.out.println("描述=" + drink.getDesc());
        //2.加一份牛奶
        drink = new Milk(drink);
        System.out.println("加一份牛奶 费用=" + drink.cost());
        System.out.println("加一份牛奶 描述=" + drink.getDesc());

        //3.加一份巧克力
        drink = new Chocolate(drink);
        System.out.println("加一份牛奶 加一份巧克力 费用=" + drink.cost());
        System.out.println("加一份牛奶 加一份巧克力 描述=" + drink.getDesc());
    }
}

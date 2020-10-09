package com.designpattern.study.factory.factorymethod.order;

import com.designpattern.study.factory.factorymethod.pizza.LDCheesePizza;
import com.designpattern.study.factory.factorymethod.pizza.LDPepperPizza;
import com.designpattern.study.factory.factorymethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }

}
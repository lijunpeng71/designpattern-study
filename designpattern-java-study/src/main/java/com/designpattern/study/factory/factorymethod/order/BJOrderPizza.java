package com.designpattern.study.factory.factorymethod.order;

import com.designpattern.study.factory.factorymethod.pizza.BJCheesePizza;
import com.designpattern.study.factory.factorymethod.pizza.BJPepperPizza;
import com.designpattern.study.factory.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }

}
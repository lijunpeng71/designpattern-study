package com.designpattern.study.factory.simplefactory.pizzastore.order;

import com.designpattern.study.factory.simplefactory.pizzastore.factory.SimpleFactory;
import com.designpattern.study.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    /**
     * 简单工厂
     */
    SimpleFactory simpleFactory;
    /**
     * 披萨
     */
    Pizza pizza = null;


    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }


    public void setFactory(SimpleFactory simpleFactory) {
        /**
         * 披萨类型
         */
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do {
            orderType = getOrderType();
            pizza = this.simpleFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购pizza失败");
            }
        } while (true);
    }

    /**
     * 获取pizza种类
     *
     * @return
     */
    private String getOrderType() {
        BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza 种类：");
        String orderType = null;
        try {
            orderType = strIn.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
        return orderType;
    }

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        OrderPizza orderPizza = new OrderPizza(simpleFactory);
    }
}

package com.designpattern.study.common.pizzastore.order;

import com.designpattern.study.common.pizzastore.pizza.CheesePizza;
import com.designpattern.study.common.pizzastore.pizza.GreekPizza;
import com.designpattern.study.common.pizzastore.pizza.PepperPizza;
import com.designpattern.study.common.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    /**
     * 披萨
     */
    Pizza pizza = null;
    /**
     * 订购披萨的类型
     */
    String orderType;


    public OrderPizza() {
        do {
            orderType = getOrderType();
            switch (orderType) {
                case "greek":
                    pizza = new GreekPizza();
                    pizza.setName(" 希腊披萨 ");
                    break;
                case "cheese":
                    pizza = new CheesePizza();
                    pizza.setName(" 奶酪披萨 ");
                    break;
                case "pepper":
                    pizza = new PepperPizza();
                    pizza.setName(" 胡椒披萨 ");
                    break;
                default:
                    System.out.println("请输入正确的披萨名称");
                    pizza=null;
                    break;
            }
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
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
        System.out.println("--------------------------------------------------");
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
        OrderPizza orderPizza=new OrderPizza();
    }
}

package com.designpattern.study.factory.abstractfactory.order;

import com.designpattern.study.factory.abstractfactory.factory.LDFactory;

public class PizzaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new OrderPizza(new BJFactory());
		new OrderPizza(new LDFactory());
	}

}
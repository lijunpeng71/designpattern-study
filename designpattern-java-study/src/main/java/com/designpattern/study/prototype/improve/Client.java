package com.designpattern.study.prototype.improve;


public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep1 = sheep.clone();
        Sheep sheep2 = sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
    }
}

package com.designpattern.study.principle.singleresponsibility;

/**
 * 违反了单一职责原则
 * 例如: 飞机在公路上跑
 */
public class SingleResponsibility01 {
    public static void main(String[] args) {
        Vehicle01 vehicle = new Vehicle01();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

//交通工具类

/**
 * 方式1
 * 1.在方式1的run方法中，违反了单一职责原则
 * 2.解决的方案非常的简单，根据交通工具运行方法不同，分解成不同的类即可
 */
class Vehicle01 {

    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上跑...");
    }
}

package com.designpattern.study.principle;

public class SingleResponsibility01 {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

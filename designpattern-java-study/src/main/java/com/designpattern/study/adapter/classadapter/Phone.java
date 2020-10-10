package com.designpattern.study.adapter.classadapter;

public class Phone {

    public void charging(IVoltage5V voltage5V) {
        if (voltage5V.output5V() == 5) {
            System.out.println("电压5V,可以充电~~");
        } else if (voltage5V.output5V() > 5) {
            System.out.println("电压大于5V,不能充电~~");
        }
    }
}

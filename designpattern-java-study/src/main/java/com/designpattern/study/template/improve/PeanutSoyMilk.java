package com.designpattern.study.template.improve;

public class PeanutSoyMilk extends SoyMilk {
    @Override
    void addCondiments() {
        System.out.println("第二步：加入上好的花生");
    }
}

package com.designpattern.study.template.improve;

public class PureSoyMilk extends SoyMilk {
    @Override
    void addCondiments() {
        System.out.println("第二步：不需要添加材料");
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}

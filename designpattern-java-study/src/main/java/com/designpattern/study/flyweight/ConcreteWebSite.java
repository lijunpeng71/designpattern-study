package com.designpattern.study.flyweight;

public class ConcreteWebSite extends WebSite {

    private String code = "";

    public ConcreteWebSite(String code) {
        this.code = code;
    }

    @Override
    public void use(User user) {
        System.out.println("网站发布形式为：" + code + " 在使用中，使用中是：" + user.getName());
    }
}

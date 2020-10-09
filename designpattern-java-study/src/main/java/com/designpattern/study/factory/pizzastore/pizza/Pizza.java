package com.designpattern.study.factory.pizzastore.pizza;

/**
 * pizza抽象类
 */
public abstract class Pizza {
    /**
     * 名字
     */
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 准备
     */
    public abstract void prepare();

    /**
     * 烘培
     */
    public void bake() {
        System.out.println(name + " baking");
    }

    /**
     * 切割
     */
    public void cut() {
        System.out.println(name + " cutting");
    }

    /**
     * 打包
     */
    public void box() {
        System.out.println(name + " boxing");
    }
}

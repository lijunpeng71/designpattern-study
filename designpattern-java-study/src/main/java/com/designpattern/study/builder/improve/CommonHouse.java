package com.designpattern.study.builder.improve;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println(" 普通房子打地基5m ");
    }

    @Override
    public void buildWall() {
        System.out.println(" 普通房子砌墙5cm ");
    }

    @Override
    public void roofed() {
        System.out.println(" 普通房子屋顶 ");
    }
}

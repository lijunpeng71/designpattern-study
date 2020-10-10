package com.designpattern.study.builder.improve;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println(" 高楼房子打地基50m ");
    }

    @Override
    public void buildWall() {
        System.out.println(" 高楼房子砌墙50cm ");
    }

    @Override
    public void roofed() {
        System.out.println(" 高楼房子屋顶 ");
    }
}

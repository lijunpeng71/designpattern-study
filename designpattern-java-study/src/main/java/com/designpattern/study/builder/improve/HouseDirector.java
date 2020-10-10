package com.designpattern.study.builder.improve;

public class HouseDirector {

    HouseBuilder houseBuilder = null;

    /**
     * 通过构造器传入houseBuilder
     *
     * @param houseBuilder
     */
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 通过setter传入houseBuilder
     *
     * @param houseBuilder
     */
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}

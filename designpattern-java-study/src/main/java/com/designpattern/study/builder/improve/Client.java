package com.designpattern.study.builder.improve;

public class Client {

    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备建造房子的指挥者
        HouseDirector commonHouseDirector = new HouseDirector(commonHouse);
        //完成盖房子，返回产品(普通房子)
        House house = commonHouseDirector.constructHouse();
        System.out.println("---------------------------------");
        //盖高楼
        HighBuilding highBuilding = new HighBuilding();
        //准备建造房子的指挥者
        HouseDirector highHouseDirector = new HouseDirector(highBuilding);
        //完成盖房子，返回产品(高楼)
        house = highHouseDirector.constructHouse();
    }
}

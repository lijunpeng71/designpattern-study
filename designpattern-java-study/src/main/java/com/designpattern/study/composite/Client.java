package com.designpattern.study.composite;

public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        Organization university = new University("清华大学", " 中国顶级大学 ");
        //创建学院
        Organization computerCollege = new College("计算机学院", " 计算机学院 ");
        Organization infoEngineCollege = new College("信息工程学院", "信息工程学院");
        //创建学院下面的系
        computerCollege.add(new Department("软件工程", "软件工程"));
        computerCollege.add(new Department("网络工程", "网络工程"));
        computerCollege.add(new Department("计算机科学与技术", "计算机科学与技术"));

        infoEngineCollege.add(new Department("通信工程", "通信工程"));
        infoEngineCollege.add(new Department("信息工程", "信息工程"));

        //将学院加到学校
        university.add(computerCollege);
        university.add(infoEngineCollege);

        university.print();
    }
}

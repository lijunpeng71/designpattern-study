package com.designpattern.study.principle.segregation;

public class Segregation01 {
    public static void main(String[] args) {

    }
}

//接口
interface GlobalInterface {
    void operator01();

    void operator02();

    void operator03();

    void operator04();

    void operator05();
}

class A {
    //A 类通过接口Interface1 依赖(使用) B类，但是只会用到1,2,3方法
    public void depend1(GlobalInterface globalInterface) {
        globalInterface.operator01();
    }

    public void depend2(GlobalInterface globalInterface) {
        globalInterface.operator02();
    }

    public void depend3(GlobalInterface globalInterface) {
        globalInterface.operator03();
    }
}


class B implements GlobalInterface {

    public void operator01() {
        System.out.println("B 实现了 operator1");
    }

    public void operator02() {
        System.out.println("B 实现了 operator2");
    }

    public void operator03() {
        System.out.println("B 实现了 operator3");
    }

    public void operator04() {
        System.out.println("B 实现了 operator4");
    }

    public void operator05() {
        System.out.println("B 实现了 operator5");
    }
}


class C { //C 类通过接口Interface1 依赖(使用) D类，但是只会用到1,4,5方法
    public void depend1(GlobalInterface globalInterface) {
        globalInterface.operator01();
    }

    public void depend4(GlobalInterface globalInterface) {
        globalInterface.operator04();
    }

    public void depend5(GlobalInterface globalInterface) {
        globalInterface.operator05();
    }
}


class D implements GlobalInterface {
    public void operator01() {
        System.out.println("D 实现了 operator01");
    }

    public void operator02() {
        System.out.println("D 实现了 operator02");
    }

    public void operator03() {
        System.out.println("D 实现了 operator03");
    }

    public void operator04() {
        System.out.println("D 实现了 operator04");
    }

    public void operator05() {
        System.out.println("D 实现了 operator05");
    }
}
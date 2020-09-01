package com.designpattern.study.singleton.type03;

public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println("懒汉式1，线程不安全~");
        Singleton instance01 = Singleton.getInstance();
        Singleton instance02 = Singleton.getInstance();
        System.out.println(instance01 = instance02);
        System.out.println("instance01.hashCode=" + instance01.hashCode());
        System.out.println("instance02.hashCode=" + instance02.hashCode());
    }
}

class Singleton {

    private static Singleton instance;

    public Singleton() {
    }

    //提供一个静态的共有方法，当使用到该方法时，才能去创建instance
    //即懒汉式
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

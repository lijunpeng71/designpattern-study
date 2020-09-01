package com.designpattern.study.singleton.type02;

public class SingletonTest02 {
    public static void main(String[] args) {
//测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance01.hashCode=" + instance.hashCode());
        System.out.println("instance02.hashCode=" + instance2.hashCode());
    }
}

//饿汉式（静态代码库）
class Singleton {

    //1.构造器私有，外部不能new
    private Singleton() {

    }

    //2.本类内部创建对象实例
    private static Singleton instance;

    //在静态代码块中，创建单例对象
    static {
        instance = new Singleton();
    }

    //3.提供一个共有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
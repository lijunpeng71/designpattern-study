package com.designpattern.study.singleton.type05;

public class SingletonTest05 {

    public static void main(String[] args) {
        System.out.println("懒汉式2 ， 线程安全~");
        Singleton instance01 = Singleton.getInstance();
        Singleton instance02 = Singleton.getInstance();
        System.out.println(instance01 == instance02); // true
        System.out.println("instance01.hashCode=" + instance01.hashCode());
        System.out.println("instance02.hashCode=" + instance02.hashCode());
    }
}

// 懒汉式(线程安全，同步方法)
class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    //提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
    //即懒汉式
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
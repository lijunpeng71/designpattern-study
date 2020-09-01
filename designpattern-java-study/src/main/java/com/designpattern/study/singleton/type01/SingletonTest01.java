package com.designpattern.study.singleton.type01;

public class SingletonTest01 {
    public static void main(String[] args) {
        //测试
        Singleton singleton01 = Singleton.getInstance();
        Singleton singleton02 = Singleton.getInstance();
        System.out.println("instance01.hashCode:" + singleton01.hashCode());
        System.out.println("instance02.hashCode:" + singleton02.hashCode());
    }
}

//俄汉式(静态变量)
class Singleton {

    //1.构造函数私有化，外部不能new
    private Singleton() {

    }

    //2.本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3.提供一个共有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}

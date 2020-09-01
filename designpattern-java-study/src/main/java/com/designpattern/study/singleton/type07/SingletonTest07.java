package com.designpattern.study.singleton.type07;

public class SingletonTest07 {

    public static void main(String[] args) {

    }
}

class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
    }

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
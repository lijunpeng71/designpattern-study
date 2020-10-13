package com.designpattern.study.proxy.dynamic;

public class Client {
    public static void main(String[] args) {
        ITeacherDao target = new TeacherDaoImpl();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        System.out.println("proxyInstance=" + proxyInstance.getClass());
        proxyInstance.sayHello(" tom ");
    }
}

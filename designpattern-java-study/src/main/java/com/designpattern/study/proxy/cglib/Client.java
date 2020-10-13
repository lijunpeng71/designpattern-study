package com.designpattern.study.proxy.cglib;

public class Client {
    public static void main(String[] args) {
        TeacherDaoImpl target = new TeacherDaoImpl();
        TeacherDaoImpl proxyInstance = (TeacherDaoImpl) new ProxyFactory(target).getProxyInstance();
        String res = proxyInstance.teach();
        System.out.println("res=" + res);
    }
}

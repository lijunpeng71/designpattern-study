package com.designpattern.study.proxy.dynamic;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (Object proxy, Method method, Object[] args) -> {
                    System.out.println("Jdk代理开始……");
                    Object returnVal = method.invoke(target, args);
                    System.out.println("Jdk代理提交……");
                    return returnVal;
                });
    }
}

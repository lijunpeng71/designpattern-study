package com.designpattern.study.principle.inversion.improve;

public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receice(new Email());
        person.receice(new WeiXin());
    }
}

//定义接口
interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver {

    @Override
    public String getInfo() {
        return "电子邮件： hello,world";
    }
}

class WeiXin implements IReceiver {

    @Override
    public String getInfo() {
        return "微信信息： hello,world";
    }
}

class Person {
    public void receice(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}

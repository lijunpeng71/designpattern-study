package com.designpattern.study.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDaoImpl();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teach();
    }
}

package com.designpattern.study.proxy.staticproxy;

public class TeacherDaoImpl implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中……");
    }
}

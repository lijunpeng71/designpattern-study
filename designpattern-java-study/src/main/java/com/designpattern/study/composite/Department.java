package com.designpattern.study.composite;

public class Department extends Organization {

    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void print() {
        System.out.println(super.getName());
    }
}

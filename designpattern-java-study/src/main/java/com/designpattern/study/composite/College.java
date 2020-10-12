package com.designpattern.study.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends Organization {

    List<Organization> componentList = new ArrayList<>();

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(Organization organization) {
        componentList.add(organization);
    }

    @Override
    protected void remove(Organization organization) {
        componentList.remove(organization);
    }

    @Override
    protected void print() {
        System.out.println("------------"+getName()+"----------------");
        componentList.forEach(component -> System.out.println(component.getName() + "\t" + component.getDesc()));
    }
}

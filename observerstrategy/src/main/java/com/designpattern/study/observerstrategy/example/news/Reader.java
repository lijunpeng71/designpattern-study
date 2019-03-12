package com.designpattern.study.observerstrategy.example.news;

import com.designpattern.study.observerstrategy.example.base.Observer;
import com.designpattern.study.observerstrategy.example.base.Subject;

/**
 * @author junpeng li
 * @date 2019/3/12 12:16
 */
public class Reader implements Observer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override

    public void update(Subject subject) {
        System.out.println(name + "收到报纸了,报纸的内容是:" + ((NewsPaper) subject).getContent());
    }
}

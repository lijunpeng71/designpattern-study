package com.designpattern.study.observerstrategy.example.java;

import java.util.Observable;

/**
 * @author junpeng li
 * @date 2019/3/13 9:46
 */
public class NewsPaper extends Observable {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

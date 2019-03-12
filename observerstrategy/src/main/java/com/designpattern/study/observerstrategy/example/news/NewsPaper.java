package com.designpattern.study.observerstrategy.example.news;

import com.designpattern.study.observerstrategy.example.base.Subject;

/**
 * @author junpeng li
 * @date 2019/3/12 12:14
 */
public class NewsPaper extends Subject {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.notifyObserverList();
    }
}

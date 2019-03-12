package com.designpattern.study.observerstrategy.example.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @author junpeng li
 * @date 2019/3/12 12:01
 */
public class Subject {
    /**
     * 用来保存注册的观察者对象,也就是报纸的订阅者
     */
    private List<Observer> observerList = new ArrayList<>();

    /**
     * 报纸的读者需要向报社订阅，先要注册
     * @param observer
     */
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 报纸的读者可以取消订阅
     * @param observer
     */
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 当每期报纸印刷出来后，就要迅速主动地被送到读者的手中
     * 相当于通知读者，让他们知道
     */
    protected void notifyObserverList() {
        observerList.forEach(observer -> observer.update(this));
    }
}

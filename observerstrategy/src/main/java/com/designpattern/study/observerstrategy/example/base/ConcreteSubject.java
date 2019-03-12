package com.designpattern.study.observerstrategy.example.base;

/**
 * @author junpeng li
 * @date 2019/3/12 12:01
 */
public class ConcreteSubject extends Subject {
    /**
     * 示意，目标对象的状态
     */
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        /**
         * 状态发生了改表，通知各个观察者
         */
        this.notifyObserverList();
    }
}

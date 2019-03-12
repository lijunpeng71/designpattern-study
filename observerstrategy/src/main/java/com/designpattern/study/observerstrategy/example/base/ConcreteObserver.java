package com.designpattern.study.observerstrategy.example.base;

/**
 * @author junpeng li
 * @date 2019/3/12 12:01
 */
public class ConcreteObserver implements Observer {
    /**
     * 示意，观察者的状态
     */
    private String observerState;

    @Override
    public void update(Subject subject) {
        /**
         * 具体的更新实现
         * 这里可能需要更新观察者状态，使其与目标的状态保持一致
         */
        observerState = ((ConcreteSubject) subject).getSubjectState();
    }
}

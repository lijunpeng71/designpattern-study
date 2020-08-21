package com.designpattern.study.observe;

/**
 * @author administrator
 * @description:
 * @date:2020/8/21 14:51
 **/
public interface Subject {

    /**
     * 附加
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 删除
     *
     * @param observer
     */
    void unRegisterObserver(Observer observer);

    /**
     * 通知变更
     */
    void notifyObservers();
}

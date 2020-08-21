package com.designpattern.study.observe;

/**
 * @author administrator
 * @description:
 * @date:2020/8/21 14:58
 **/
public interface Observer {

    /**
     * 在通知数据更新的时候，更新数据
     *
     * @param temperature
     * @param pressure
     * @param humidity
     */
    void update(float temperature, float pressure, float humidity);
}

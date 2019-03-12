package com.designpattern.study.observerstrategy.example.base;

/**
 * @author junpeng li
 * @date 2019/3/12 12:01
 */
public interface Observer {
    /**
     * 更新接口
     * @param subject
     */
    public void update(Subject subject);
}

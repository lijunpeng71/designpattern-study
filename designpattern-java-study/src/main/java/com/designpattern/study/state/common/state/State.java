package com.designpattern.study.state.common.state;

public abstract class State {

    /**
     * 扣除积分
     */
    public abstract void deductMoney();

    /**
     * 是否中奖
     *
     * @return
     */
    public abstract boolean raffle();

    /**
     * 发放奖品
     */
    public abstract void dispensePrise();
}

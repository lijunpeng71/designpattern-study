package com.designpattern.study.state.common.state;

import com.designpattern.study.state.common.RaffleActivity;

public class NoRaffleState extends State {

    private RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("扣除积分成功，您可以抽奖了");
        activity.setState(activity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖喔！");
        return false;
    }

    @Override
    public void dispensePrise() {
        System.out.println("不能发放奖品");
    }
}

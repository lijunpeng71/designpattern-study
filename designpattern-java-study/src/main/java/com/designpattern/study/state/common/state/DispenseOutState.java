package com.designpattern.study.state.common.state;

import com.designpattern.study.state.common.RaffleActivity;

public class DispenseOutState extends State {

    private RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrise() {
        System.out.println("奖品发送完了，请下次再参加");
    }
}

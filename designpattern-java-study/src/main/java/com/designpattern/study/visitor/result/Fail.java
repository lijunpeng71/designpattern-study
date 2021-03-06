package com.designpattern.study.visitor.result;

import com.designpattern.study.visitor.action.Action;
import com.designpattern.study.visitor.audience.Man;
import com.designpattern.study.visitor.audience.Woman;

public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println(" 男人给的评价该歌手失败");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价该歌手失败");
    }
}

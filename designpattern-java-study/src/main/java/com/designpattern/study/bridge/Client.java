package com.designpattern.study.bridge;

import com.designpattern.study.bridge.brand.XiaoMi;
import com.designpattern.study.bridge.phone.FoldedPhone;
import com.designpattern.study.bridge.phone.Phone;

public class Client {
    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new XiaoMi());
        phone.open();
        phone.call();
        phone.close();
        System.out.println("------------------------");
    }
}

package com.designpattern.study.visitor;

import com.designpattern.study.visitor.audience.Man;
import com.designpattern.study.visitor.audience.Woman;
import com.designpattern.study.visitor.result.Fail;
import com.designpattern.study.visitor.result.Success;
import com.designpattern.study.visitor.result.Wait;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        Man man = new Man();
        objectStructure.attach(man);
        Woman woman = new Woman();
        objectStructure.attach(woman);

        //成功
        Success success = new Success();
        objectStructure.display(success);
        //失败
        Fail fail = new Fail();
        objectStructure.display(fail);
        //待定
        Wait wait = new Wait();
        objectStructure.display(wait);
    }
}

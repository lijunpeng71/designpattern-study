package com.designpattern.study.visitor;

import com.designpattern.study.visitor.action.Action;
import com.designpattern.study.visitor.audience.Person;

import java.util.LinkedList;
import java.util.List;

/**
 * 数据结构，管理很多人
 */
public class ObjectStructure {

    private List<Person> personList = new LinkedList<>();


    public void attach(Person person) {
        personList.add(person);
    }

    public void detach(Person person) {
        personList.remove(person);
    }

    /**
     * 显示评测结果
     *
     * @param action
     */
    public void display(Action action) {
        for (Person person : personList) {
            person.accept(action);
        }
    }
}

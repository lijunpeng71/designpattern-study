package com.designpattern.study.observerstrategy.example.news;

/**
 * @author junpeng li
 * @date 2019/3/12 12:20
 */
public class NewsPaperClient {
    public static void main(String[] args) {
        NewsPaper newsPaper = new NewsPaper();
        Reader reader01 = new Reader();
        reader01.setName("张三");
        Reader reader02 = new Reader();
        reader02.setName("李四");
        newsPaper.attach(reader01);
        newsPaper.attach(reader02);
        newsPaper.setContent("123");
    }
}

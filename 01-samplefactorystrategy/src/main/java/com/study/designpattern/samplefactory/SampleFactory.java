package com.study.designpattern.samplefactory;

import java.util.Scanner;

public class SampleFactory {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        System.out.println("请输入数字A:");
        String a = inScanner.next();
        System.out.println("请输入运算符(+ - * /):");
        String b = inScanner.next();
        System.out.println("请输入数字B:");
        String c = inScanner.next();
        String d = "";
        if ("+".equals(b)) {
            d = String.valueOf(Double.parseDouble(a) + Double.parseDouble(c));
        }
        System.out.println("输入结果:" + d);
    }
}

package com.designpattern.study.interpreter;

import com.designpattern.study.interpreter.calculate.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        Map<String, Integer> varMap = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果：" + expStr + "=" + calculator.run(varMap));
    }

    public static String getExpStr() throws IOException {
        System.out.println("--------------请输入表达式：------------");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static Map<String, Integer> getValue(String expStr) throws IOException {
        Map<String, Integer> varMap = new HashMap<>();
        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                System.out.println("请输入" + String.valueOf(ch) + "的值：");
                String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                varMap.put(String.valueOf(ch), Integer.valueOf(in));
            }
        }
        return varMap;
    }
}

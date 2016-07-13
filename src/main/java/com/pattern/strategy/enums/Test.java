package com.pattern.strategy.enums;

public class Test {

    public static void main(String[] args) {

        int a = Calculator.ADD.exec(2, 3);

        System.out.println(a);
    }
}

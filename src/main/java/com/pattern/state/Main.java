package com.pattern.state;

/**
 * User: shijingui
 * Date: 2016/9/18
 */
public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(100);
        gumballMachine.ejectQuarter();
    }
}

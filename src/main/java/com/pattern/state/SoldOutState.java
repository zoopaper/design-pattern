package com.pattern.state;

/**
 * User: krisjin
 * Date: 2016/9/18
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("请等待，糖果已经准备好！");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("抱歉，您已经转动了曲柄！");
    }

    @Override
    public void turnCrank() {
        System.out.println("转动两次曲柄不能再得到一个糖果！");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
    }
}

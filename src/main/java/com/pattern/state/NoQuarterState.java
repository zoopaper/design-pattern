package com.pattern.state;

/**
 * 没有投入25分钱状态
 * User: shijingui
 * Date: 2016/9/18
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你投入了25分钱！");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("没有投入25分钱，不能退回！");
    }

    @Override
    public void turnCrank() {
        System.out.println("如果没有给钱，就不能要求糖果！");
    }

    @Override
    public void dispense() {
        System.out.println("如果没有得到钱，我们不能发放糖果！");
    }
}

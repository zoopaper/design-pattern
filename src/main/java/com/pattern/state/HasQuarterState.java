package com.pattern.state;

/**
 * User: krisjin
 * Date: 2016/9/18
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("糖果机已经投入25分钱了，不能再投入了！");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("糖果机退回25分钱！");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("你已经转动曲柄！");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("没有糖果分配！");
    }
}

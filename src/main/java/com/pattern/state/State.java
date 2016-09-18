package com.pattern.state;

/**
 * User: shijingui
 * Date: 2016/9/18
 */
public interface State {

    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}

package com.pattern.state;

/**
 * User: krisjin
 * Date: 2016/9/18
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}

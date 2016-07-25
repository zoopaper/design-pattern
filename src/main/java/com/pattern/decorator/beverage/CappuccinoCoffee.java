package com.pattern.decorator.beverage;

/**
 * 卡布奇诺
 * User: shijingui
 * Date: 16-7-26
 * Time: 上午6:38
 */
public class CappuccinoCoffee extends Beverage {

    public String getDescription() {
        return "CappuccinoCoffee";
    }

    @Override
    public double cost() {
        return 3.12;
    }
}

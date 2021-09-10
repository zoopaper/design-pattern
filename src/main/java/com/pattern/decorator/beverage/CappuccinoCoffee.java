package com.pattern.decorator.beverage;

/**
 * 卡布奇诺
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

package com.pattern.decorator.beverage;

/**
 * 浓缩咖啡
 * <p>
 * Time: 上午6:33
 */
public class Espresso extends Beverage {
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 2.12;
    }
}

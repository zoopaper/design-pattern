package com.pattern.decorator.beverage;

/**
 * 摩卡装饰者
 * User: krisjin
 * Date: 16-7-26
 * Time: 上午6:40
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }
}

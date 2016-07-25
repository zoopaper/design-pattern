package com.pattern.decorator.beverage;

/**
 * 摩卡装饰者
 * User: shijingui
 * Date: 16-7-26
 * Time: 上午6:40
 */
public class Mocha extends CondimentDecorator {
    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double cost() {
        return 0;
    }
}

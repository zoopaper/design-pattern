package com.pattern.decorator.beverage;

/**
 * 饮料超类
 * User: shijingui
 * Date: 16-7-26
 * Time: 上午6:24
 */
public abstract class Beverage {
    String description = "UnKnow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
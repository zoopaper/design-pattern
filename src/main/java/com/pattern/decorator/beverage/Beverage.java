package com.pattern.decorator.beverage;

/**
 * 饮料超类
 */
public abstract class Beverage {
    String description = "UnKnow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
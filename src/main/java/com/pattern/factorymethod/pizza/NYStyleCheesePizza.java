package com.pattern.factorymethod.pizza;

/**
 * 纽约风味芝士披萨
 * User: shijingui
 * Date: 2016/7/27
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "New York style and cheese pizza";
        dough = "This Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}

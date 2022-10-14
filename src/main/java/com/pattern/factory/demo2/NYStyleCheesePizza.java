package com.pattern.factory.demo2;

/**
 * 纽约风味芝士披萨
 * User: krisjin
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

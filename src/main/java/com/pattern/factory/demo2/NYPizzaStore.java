package com.pattern.factory.demo2;

/**
 * User: krisjin
 * Date: 2016/7/27
 */
public class NYPizzaStore extends PizzaStore {
    /**
     * 抽象的工厂方法，创建披萨
     *
     * @param type
     * @return
     */
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else return null;
    }
}
